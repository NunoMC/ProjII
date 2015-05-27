/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoii;

import UI.Login;
import UI.registo;
import bll.ClienteBLL;
import bll.ProdutoBLL;
import bll.VendaBLL;
import bll.funcionarioBLL;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import model.Cliente;
import model.Funcionario;
import model.Lote;
import model.Produto;
import model.Venda;



/**
 *
 * @author NunoM
 */
public class ProjectoII {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        Produto prod = new Produto();
        prod.setDescricao("rosas");
        prod.setPreco(new BigDecimal(1.1));
        ProdutoBLL.create(prod);
      
        Login v = new Login();
        v.setVisible(true);
        
        
            }

        
    }
    

