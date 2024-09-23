package com.fernandocurso.aulajpamaven.aplicacao;

import com.fernandocurso.aulajpamaven.dominio.Pessoa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.remove(em.find(Pessoa.class, 2));
        em.getTransaction().commit();
        
        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}
