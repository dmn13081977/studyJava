package my;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import my.entities.Employee;
import my.persistence.CustomPersistenceUnitInfo;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.List;

 public class GetFromBase {
    public static void main(String[] args) {

        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");// для xsml файла


        EntityManagerFactory emf = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(),
                        new HashMap<>());// для java code класса

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            //List<Employee> empl = em.createQuery("FROM Employee ").getResultList();// Здесь Employee название класса

            //List<Employee> empl = em.createQuery(" FROM Employee" + " WHERE id = 7 ").getResultList();

            //List<Employee> empl = em.createQuery(" FROM Employee" + " WHERE name = 'Olga' ").getResultList();

            //List<Employee> empl = em.createQuery(" FROM Employee" + " WHERE department = 'Road' ").getResultList();

            List<Employee> empl = em.createQuery("FROM Employee WHERE department = 'Road' and salary > 150").getResultList();


            for (Employee e : empl) {
                System.out.println(e);
            }

            em.getTransaction().commit();

        } finally {
            em.close();
        }

    }

 }