package my;


import my.entities.*;
import org.hibernate.Hibernate;
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
                .addAnnotatedClass(Buyer.class).addAnnotatedClass(Item.class)
                .addAnnotatedClass(Passport.class).addAnnotatedClass(ForeignPassport.class)
                .addAnnotatedClass(Actor.class).addAnnotatedClass(Movie.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try (sessionFactory) {
            Session session = sessionFactory.getCurrentSession();

            session.getTransaction().begin();//открываем транзакцию





//            Actor actor = session.get(Actor.class, 1);
//            //System.out.println(actor.getMovies());//получаем связанные сущности
//            Hibernate.initialize(actor.getMovies());//получаем связанные сущности, без вывода в консоль
//            Movie movieToRemove = actor.getMovies().get(1);
//            System.out.println(movieToRemove);
//            actor.getMovies().remove(1);
//            movieToRemove.getActors().remove(actor);



//            Movie movie= new Movie("Aviator", 2004);
//            Actor actor = session.get(Actor.class, 1);
//            movie.setActors(new ArrayList<>(Collections.singletonList(actor)));
//            actor.getMovies().add(movie);//добавляем фильм, т.к. у этого актёра уже есть список фильмов
//            session.persist(movie);
//            session.persist(actor);


//            Movie movie = session.get(Movie.class, 1);
//            System.out.println(movie.getActors());
//            Actor actor = session.get(Actor.class, 2);
//            System.out.println(actor.getMovies());


//            Movie movie = new Movie("Titanic", 1997);
//            Actor actor1 = new Actor("DiCaprio", 48);
//            Actor actor2 = new Actor(" Winslet", 47);
//            movie.setActors(new ArrayList<>(List.of(actor1, actor2)));//создаём новый ArrayList, т.к. список актёров
//            // пока пустой, там null
//            actor1.setMovies(new ArrayList<>(Collections.singletonList(movie)));
//            actor2.setMovies(new ArrayList<>(Collections.singletonList(movie)));
//            session.persist(movie);
//            session.persist(actor1);
//            session.persist(actor2);


//            //добавим человеку с паспортом иностранный паспорт
//            Person person = session.get(Person.class, 58);
//            ForeignPassport foreignPassport = new  ForeignPassport(222333);
//            person.setForeignPassport(foreignPassport);
//            session.persist(person);

//            //добавляем человека и иностр. паспорт в бд
//            Person person = new Person("Olga", 24);
//            ForeignPassport foreignPassport = new  ForeignPassport(999444, person);
//            person.setForeignPassport(foreignPassport);
//            session.persist(person);


//            //удалим человека
//            Person person = session.get(Person.class, 59);
//            session.remove(person);


//            //изменим номер паспорта человека
//            Person person = session.get(Person.class, 59);
//            person.getPassport().setPassportNumber(222333);


//            //прочитаем из бд паспорт и получим по нему человека
//            Passport passport = session.get(Passport.class, 49);
//            System.out.println(passport.getPerson().getName());


//            //прочитаем из бд человека и получим его паспорт
//            Person person = session.get(Person.class, 58);
//            System.out.println(person.getPassport().getPassportNumber());


             //добавляем человека и паспорт в бд
//            Person person = new Person("Ivan", 44);
//            Passport passport = new Passport(person, 123456);
//            person.setPassport(passport);
//            session.persist(person);

//            Person person = new Person("Roman", 33);
//            Passport passport = new Passport(387681);
//            person.setPassport(passport);
//            session.persist(person);


//            //добавление товара с использованием метода addItem()
//            Buyer buyer = new Buyer("Bob", 31);
//            buyer.addItem(new Item("Smartphone"));
//            buyer.addItem(new Item("LadTV"));
//            buyer.addItem(new Item("Pad"));
//            session.persist(buyer);


//            // Каскадирование
//            Buyer buyer = new Buyer("Jon", 35);
//            Item item = new Item("Notebook", buyer);
//            buyer.setItems(new ArrayList<>(Collections.singletonList(item)));
//            session.persist(buyer);


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
//            session.persist(person1);// добавление в Hibernate Persistence Context
//            session.persist(person2);
//            session.persist(person3);
//
//            Person person = session.get(Person.class, 29); // получение из базы
//            person.setName("Valentin"); // обновление в базе
//            person.setAge(33);
//            System.out.println(person.getName() + " " + person.getAge());

//            Person person4 = session.get(Person.class, 25);
//            session.remove(person4); // удаление из базы

            session.getTransaction().commit();//сохраняем в базу и закрываем автоматически сессию

//            // открываем сессию ещё раз
//            session = sessionFactory.getCurrentSession();
//            session.getTransaction().begin();
//            buyer = (Buyer) session.merge(buyer);//прикрепляем покупателя к новой сессии
//            Hibernate.initialize(buyer.getItems());//получаем связанные товары (сущности)
            //то же получение сущностей, через HQL запрос, здесь нам не нужно прикреплять покупателя к новой сессии
            //List<Item> itemList = session.createQuery("select i from Item i where i.owner.id=:buyerTd", Item.class)
            //        .setParameter("buyerId", buyer.getId()).getResultList();

//            session.getTransaction().commit();
//
//            System.out.println("Вне второй сессии");
//            System.out.println(buyer.getItems());//выводим в консоль товары уже загруженные в объект "buyer"
        }
    }
}
