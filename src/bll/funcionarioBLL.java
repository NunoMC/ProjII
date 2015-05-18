/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Funcionario;

/**
 *
 * @author NunoM
 */
public class funcionarioBLL {
    
public static void create(Funcionario func)
    {
        EntityManager em = BLLEntityManager.getEntityManager();
        
        em.getTransaction().begin();
        em.persist(func);
        em.getTransaction().commit();
        
        em.clear(); 
    }
    
    public static Funcionario retrieve(int id)
    {
        EntityManager em = BLLEntityManager.getEntityManager();
        Query q = em.createNamedQuery("Funcionario.findByIdFuncionario")
                      .setParameter("idFuncionario", id);
        Funcionario func = (Funcionario)q.getResultList().get(0);
        return func;
    }

    public static void delete(Funcionario func)
    {
        EntityManager em = BLLEntityManager.getEntityManager();
        em.getTransaction().begin();
        em.remove(func);
        em.getTransaction().commit();
        em.clear();    
    }
    
    public static void refreshEntity(Funcionario func)
    {
        EntityManager em = BLLEntityManager.getEntityManager();
        em.refresh(func);
    }
}
