/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoii;

import bll.ClienteBLL;
import bll.funcionarioBLL;
import java.util.List;
import model.Cliente;
import model.Funcionario;



/**
 *
 * @author NunoM
 */
public class ProjectoII {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Cliente b1 = new Cliente();
     
        
   
                 
        ClienteBLL.refreshEntity(b1);
        
    }
    
}
