package my.dao;

import jakarta.persistence.EntityManager;
import my.models.Person;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class PersonDao {
    //решение проблемы N + 1, через объединение таблиц person и person_item

    private final EntityManager entityManager;

    @Autowired
    public PersonDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(readOnly = true)
    public void testNPlus1() {
        Session session = entityManager.unwrap(Session.class);

        //Проблема
//        //Один запрос к БД получим людей
//        List<Person> people = session.createQuery("select p from Person p", Person.class).getResultList();
//        // N запросов к БД получим товары этих людей
//        for (Person x : people) {
//            System.out.println("Person " + x.getName() + " has: " + x.getPersonItemList());
//        }

        //Решение
//        Set<Person> people = new HashSet<Person>(session.createQuery("select p from Person p Left Join Fetch p.personItemList")
//                .getResultList());


        List<Person> people = session.createQuery("select p from Person p Left Join Fetch p.personItemList")
                .getResultList();

        for (Person x : people) System.out.println("Person " + x.getName() + " has: " + x.getPersonItemList());

    }
}
