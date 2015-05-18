/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.VendaMarc;


/**
 *
 * @author NunoM
 */
public class VendaMarcBLL {
    
 public static void create(VendaMarc ve)
    {
        EntityManager em = BLLEntityManager.getEntityManager();
        
        em.getTransaction().begin();
        em.persist(ve);
        em.getTransaction().commit();
        
        em.clear(); 
    }
    
    public static VendaMarc retrieve(int id)
    {
        EntityManager em = BLLEntityManager.getEntityManager();
        Query q = em.createNamedQuery("VendaMarc.findByIdVendamarc")
                      .setParameter("idVendamarc", id);
        VendaMarc ve = (VendaMarc)q.getResultList().get(0);
        return ve;
    }

   

     
    public static void delete(VendaMarc ve)
    {
        EntityManager em = BLLEntityManager.getEntityManager();
        em.getTransaction().begin();
        em.remove(ve);
        em.getTransaction().commit();
        em.clear();    
    }
    
    public static void refreshEntity(VendaMarc ve)
    {
        EntityManager em = BLLEntityManager.getEntityManager();
        em.refresh(ve);
    }
}
