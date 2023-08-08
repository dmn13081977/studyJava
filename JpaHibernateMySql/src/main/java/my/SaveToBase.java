package my;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import my.entities.Employee;
import my.persistence.CustomPersistenceUnitInfo;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;

public class SaveToBase {
    public static void main(String[] args) {

        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");// для xsml файла


        // подключение к базе вариант 1
        EntityManagerFactory emf = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(),
                        new HashMap <> ());// для java code класса

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            Employee p = new Employee("Olga", "Rodionova", "IT",550);

            em.persist(p);

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}