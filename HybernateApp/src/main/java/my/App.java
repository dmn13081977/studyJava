package my;


import my.entities.Buyer;
import my.entities.Item;
import my.entities.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Configuration configuration = new Configuration().addAnnotatedClass(Person.class)
                .addAnnotatedClass(Buyer.class).addAnnotatedClass(Item.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try (sessionFactory) {
            Session session = sessionFactory.getCurrentSession();

            session.getTransaction().begin();

//            Buyer buyer = session.get(Buyer.class, 4);
//            Item item = session.get(Item.class, 1);
//            //item.getOwner().getItems().remove(item);//удаление товара у бывшего владельца (если такой есть)
              //на стороне объектов Hibernate
//            item.setOwner(buyer);// добавляем покупателю товар
//            buyer.getItems().add(item);// добавляем покупателю товар на стороне объектов Hibernate

//            Buyer buyer = session.get(Buyer.class, 1);
//            session.remove(buyer);//удаление покупателя
//            buyer.getItems().forEach(i -> i.setOwner(null));//удаление покупателя на стороне объектов Hibernate
//
//            Buyer buyer = session.get(Buyer.class, 3);
//            List<Item> items = buyer.getItems();
//            for (Item x : items) session.remove(x);// удаляем все товары у покупателя
//            buyer.getItems().clear();//удаляем все товары у покупателя на стороне объектов Hibernate

//            Buyer buyer = new Buyer("Anatoliy", 28);// создали нового покупателя
//            Item item = new Item("Microwave", buyer);// создали новый товар и поместили новому покупателю
//            buyer.setItems(new ArrayList<>(Collections.singletonList(item)));//создали новый товар и поместили
//            // новому покупателю на стороне объектов Hibernate
//            session.persist(buyer);//сохраняем покупателя
//            session.persist(item);//сохраняем товар, т.к. пока не настроено каскадирование нужно сохранять и то и то


//            Buyer buyer = session.get(Buyer.class, 2);
//            Item newItem = new Item("Item from Hibernate", buyer);// добавляем товар покупателю на стороне б.д.
//            buyer.getItems().add(newItem); //добавляем товар покупателю на стороне объектов Hibernate
//            session.persist(newItem);

//            Buyer buyer1 = session.get(Buyer.class, 3); //получаем покупателя
//            System.out.println(buyer1);
//            List<Item> items = buyer1.getItems(); //получаем его товары
//            System.out.println(items);

//            Item item = session.get(Item.class, 5); //получаем товар
//            System.out.println(item);
//            Buyer buyer = item.getOwner(); //получаем покупателя этого товара
//            System.out.println(buyer);

//            List<Person> people = session.createQuery
//                    ("FROM Person where age > 30 and age < 40 and name LIKE 'V%'").getResultList();//запрос HQL

//            session.createQuery("update Person set name='XXX' where age < 33").executeUpdate();//запрос HQL

//            session.createQuery("delete Person where age > 32 and age < 41").executeUpdate();//запрос HQL

//            for (Person x : people) System.out.println(x);

//            Person person1 = new Person("Tom", 33);
//            Person person2 = new Person("Ivan", 25);
//            Person person3 = new Person("Bill", 41);
//            session.persist(person1);// добавление в базу
//            session.persist(person2);
//            session.persist(person3);
//
//            Person person = session.get(Person.class, 29); // получение из базы
//            person.setName("Valentin"); // обновление в базе
//            person.setAge(33);
//            System.out.println(person.getName() + " " + person.getAge());

//            Person person4 = session.get(Person.class, 25);
//            session.remove(person4); // удаление из базы

            session.getTransaction().commit();

//            System.out.println(person2.getId());// получение id сохранённого человека
        }
    }
}
