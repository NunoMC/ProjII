/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Cliente;
import model.Funcionario;
import model.Marcacao;
import model.Venda;
import model.VendaMarc;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NunoM
 */
public class VendaMarcBLLTest {
    
    private Marcacao mar;
    private Venda venda;
    private Funcionario func;
    private Cliente cli;
    private VendaMarc vd;
    private List<VendaMarc> vds;
    
    public VendaMarcBLLTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
          func = new Funcionario();
        func.setNome("Fuasdasnc");
        
        funcionarioBLL.create(func);
        
        
        cli = new Cliente();
        cli.setMorada("sad");
        cli.setNome("asasdasd");
        
        ClienteBLL.create(cli);
        
        
        venda = new Venda();
        java.sql.Date  JavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        Calendar calendar = new GregorianCalendar();	
	calendar.set(Calendar.YEAR, 2014);
	calendar.set(Calendar.MONTH, 10 - 1 );
	calendar.set(Calendar.DAY_OF_MONTH, 3);
        venda.setDataVenda(calendar.getTime());
        venda.setIdCliente(cli);
        venda.setIdFuncionario(func);
        venda.setPrcramo(20.4);
        venda.setPrecoTotal(12.2);
        venda.setValorServico(34.8);
     
        
        VendaBLL.create(venda);
        
          mar = new Marcacao();
        java.sql.Date  JavaDateObject2 = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        Calendar calendar2 = new GregorianCalendar();	
	calendar2.set(Calendar.YEAR, 2014);
	calendar2.set(Calendar.MONTH, 10 - 1 );
	calendar2.set(Calendar.DAY_OF_MONTH, 3);
        mar.setDataMarcacao(calendar2.getTime());
        java.sql.Date  JavaDateObject3 = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        Calendar calendar3 = new GregorianCalendar();	
	calendar3.set(Calendar.YEAR, 2014);
	calendar3.set(Calendar.MONTH, 10 - 1 );
	calendar3.set(Calendar.DAY_OF_MONTH, 4);
        mar.setDataServico(calendar3.getTime());
        mar.setDescricao("Casamento");
        mar.setLocal("Braga");
        mar.setIdCliente(cli);
        mar.setIdFuncionario(func);
        
        MarcacaoBLL.create(mar);
        
        vd = new VendaMarc();
        vd.setIdMarcacao(mar);
        vd.setIdVenda(venda);
        
        VendaMarcBLL.create(vd);
        
    }
    
    @After
    public void tearDown() {
        
          if(vd!=null){
        VendaMarcBLL.delete(vd);
        }
            if(mar!=null){
        MarcacaoBLL.delete(mar);
        }
             if(venda!=null){
        VendaBLL.delete(venda);
        }
            if(func!=null){
            funcionarioBLL.delete(func);
        } 
             if(cli!=null){
            ClienteBLL.delete(cli);
        }
        
    }

    /**
     * Test of create method, of class VendaMarcBLL.
     */
    @Test
    public void testCreate() {
      System.out.println("Test Create Venda marcação");
        
        VendaMarc marcAux = VendaMarcBLL.retrieve(vd.getIdVendamarc());
        assertEquals(vd, marcAux);   
    }

    /**
     * Test of retrieve method, of class VendaMarcBLL.
     */
    @Test
    public void testRetrieve() {
       System.out.println("Test Retrieve Venda Marcação");
        
        assertEquals(vd, VendaMarcBLL.retrieve(vd.getIdVendamarc()));
    }
    
     /**
     * Test of retrieveAll method, of class VendaBLL.
     */
    @Test
    public void testRetrieveAll() {
        System.out.println("Test RetrieveAll Venda Marcação");
        
        EntityManager em = BLLEntityManager.getEntityManager();
        Query q = em.createNativeQuery("Select * from VendaMarc",VendaMarc.class); 
        List<VendaMarc> marcAux  = q.getResultList();
        
        vds = VendaMarcBLL.retrieveAll();
        assertEquals(marcAux, vds);
    }

    /**
     * Test of delete method, of class VendaMarcBLL.
     */
    @Test
    public void testDelete() {
        System.out.println("Test Delete Venda Marcação");
        
        VendaMarcBLL.delete(vd);
        
        VendaMarc result = VendaMarcBLL.retrieve(vd.getIdVendamarc());
        assertEquals(null, result);
    }

  
    
}
