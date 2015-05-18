/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Linhaproduto;


/**
 *
 * @author NunoM
 */
public class LinhaProdutoBLL {
    
public static void create(Linhaproduto lt)
    {
        EntityManager em = BLLEntityManager.getEntityManager();
        
        em.getTransaction().begin();
        em.persist(lt);
        em.getTransaction().commit();
        
        em.clear(); 
    }
    
    public static Linhaproduto retrieve(int id)
    {
        EntityManager em = BLLEntityManager.getEntityManager();
        Query q = em.createNamedQuery("Linhaproduto.findByIdLinhaproduto")
                      .setParameter("idLinhaproduto", id);
        Linhaproduto lt = (Linhaproduto)q.getResultList().get(0);
        return lt;
    }

   
     
    public static void delete(Linhaproduto lt)
    {
        EntityManager em = BLLEntityManager.getEntityManager();
        em.getTransaction().begin();
        em.remove(lt);
        em.getTransaction().commit();
        em.clear();    
    }
    
    public static void refreshEntity(Linhaproduto lt)
    {
        EntityManager em = BLLEntityManager.getEntityManager();
        em.refresh(lt);
    }
}

