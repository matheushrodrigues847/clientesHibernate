package br.com.gerenciaClientes.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAutil {
    private static final
    EntityManagerFactory emf = Persistence
            .createEntityManagerFactory("gerenciaClientes");

    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

}
