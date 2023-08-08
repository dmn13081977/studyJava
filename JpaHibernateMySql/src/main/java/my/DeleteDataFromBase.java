package my;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import my.entities.Employee;
import my.persistence.CustomPersistenceUnitInfo;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;

public class DeleteDataFromBase {
   public static void main(String[] args) {

       //EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");// для xsml файла


       EntityManagerFactory emf = new HibernatePersistenceProvider()
               .createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(),
                       new HashMap<>());// для java code класса

       EntityManager em = emf.createEntityManager();

       try {
           em.getTransaction().begin();

           Employee empl = em.find(Employee.class, 11);
           em.remove(empl);

//           em.createQuery("delete Employee WHERE department = 'IT' and salary >= 1000").executeUpdate();

           System.out.println("Done");

           em.getTransaction().commit();

       } finally {
           em.close();
       }

   }

}