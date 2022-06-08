package jpabook.jpashop.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        System.out.println("hello jpa");

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("hello");

        EntityManager em =null;//emf.createEntityManager();
        EntityTransaction tx = null;//em.getTransaction();
        //tx.begin();

        try{
            em = emf.createEntityManager();
            tx = em.getTransaction();

            tx.commit();


        }catch(Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }

}
