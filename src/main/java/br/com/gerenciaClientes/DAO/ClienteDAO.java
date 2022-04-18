package br.com.gerenciaClientes.DAO;

import br.com.gerenciaClientes.modelo.Cliente;

import javax.persistence.EntityManager;
import java.util.List;

public class ClienteDAO {
    private EntityManager em;

    public ClienteDAO(EntityManager em){
        this.em = em;
    }

    public void cadastrar(Cliente cliente){
        em.persist(cliente);
    }

    public void delete(Cliente cliente){
        em.remove(cliente);
    }

    public Cliente getCliente(int id){
        return em.find(Cliente.class, id);
    }

    public List listar(){
        String sql = "select c from Cliente c";
        return em.createQuery(sql).getResultList();
    }
}
