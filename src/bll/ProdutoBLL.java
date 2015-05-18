/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Produto;


/**
 *
 * @author NunoM
 */
public class ProdutoBLL {
    
 public static void create(Produto prod)
    {
        EntityManager em = BLLEntityManager.getEntityManager();
        
        em.getTransaction().begin();
        em.persist(prod);
        em.getTransaction().commit();
        
        em.clear(); 
    }
    
    public static Produto retrieve(int id)
    {
        EntityManager em = BLLEntityManager.getEntityManager();
        Query q = em.createNamedQuery("Produto.findByIdProduto")
                      .setParameter("idProduto", id);
        Produto prod = (Produto)q.getResultList().get(0);
        return prod;
    }

   

     
    public static void delete(Produto prod)
    {
        EntityManager em = BLLEntityManager.getEntityManager();
        em.getTransaction().begin();
        em.remove(prod);
        em.getTransaction().commit();
        em.clear();    
    }
    
    public static void refreshEntity(Produto prod)
    {
        EntityManager em = BLLEntityManager.getEntityManager();
        em.refresh(prod);
    }
}
