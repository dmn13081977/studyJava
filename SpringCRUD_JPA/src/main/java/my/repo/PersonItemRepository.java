package my.repo;

import my.models.Person;
import my.models.PersonItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonItemRepository extends JpaRepository<PersonItem, Integer> {
    //кастомные методы
    List<PersonItem> findByOwner(Person owner);
    List<PersonItem> findByItemName(String itemName);
}
