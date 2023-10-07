package my.services;

import my.models.Person;
import my.models.PersonItem;
import my.repo.PersonItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class PersonItemService {

    private final PersonItemRepository personItemRepository;

    @Autowired
    public PersonItemService(PersonItemRepository personItemRepository) {
        this.personItemRepository = personItemRepository;
    }

    public List<PersonItem> findByItemName(String itemName) {
        return personItemRepository.findByItemName(itemName);
    }

    public List<PersonItem> findByOwner(Person owner) {
        return personItemRepository.findByOwner(owner);
    }

}
