package my.services;

import my.models.Mood;
import my.models.Person;
import my.repo.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)//распространяется на все методы, дополнительно не отмеченные "@Transactional"
public class PeopleService {
   //бизнес логика
    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<Person> findAll() {
        return peopleRepository.findAll();
    }

    public Person findOne(int id) {
        Optional<Person> foundPerson = peopleRepository.findById(id);
        return foundPerson.orElse(null);
    }

    @Transactional
    public void save(Person person) {
        person.setCreatedAt(new Date());
        person.setMood(Mood.HAPPY);
        peopleRepository.save(person);
    }

    @Transactional
    public void update(int id, Person updatedPerson) {
        updatedPerson.setId(id);
        peopleRepository.save(updatedPerson);
    }

    @Transactional
    public void delete(int id) {
        peopleRepository.deleteById(id);
    }


    List<Person> findByName(String name) {
        return peopleRepository.findByName(name);
    }
    List<Person> findByNameOrderByAge(String name) {
        return peopleRepository.findByNameOrderByAge(name);
    }
    List<Person> findByEmail(String email) {
        return peopleRepository.findByEmail(email);
    }
    List<Person> findByNameStartingWith(String startingWith) {
        return peopleRepository.findByNameStartingWith(startingWith);
    }
    List<Person> findByNameOrEmail(String name, String email) {
        return peopleRepository.findByNameOrEmail(name, email);
    }



    public void test() {
        System.out.println("Test");
    }
}
