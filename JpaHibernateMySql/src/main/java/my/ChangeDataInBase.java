package my;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import my.persistence.CustomPersistenceUnitInfo;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;

public class ChangeDataInBase {
   public static void main(String[] args) {

       //EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");// для xsml файла


       EntityManagerFactory emf = new HibernatePersistenceProvider()
               .createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(),
                       new HashMap<>());// для java code класса

       EntityManager em = emf.createEntityManager();

       try {
           em.getTransaction().begin();

//           Employee empl = em.find(Employee.class, 1);
//           empl.setSalary(500);

           em.createQuery("update Employee set salary = 1000 where department = 'HR'").executeUpdate();

           System.out.println("Done");

           em.getTransaction().commit();

       } finally {
           em.close();
       }

   }

}