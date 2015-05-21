/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;
import oracle.net.aso.e;
import static oracle.sql.NUMBER.e;

/**
 *
 * @author carlos
 */
public class Ficheiro {
    
   Map<String, String> map = new HashMap<String, String>();
    
    public void criarFicheiro(String nome) throws IOException{

        File f = new File(nome);    
        if (!f.exists()){    
            f.createNewFile();    
        } 
        else
        {
            System.out.println("Ficheiro já existe");
        }
    }    
    
    public  void escreverFicheiro(String user,String pass,String nome) throws IOException{
      
          if(lerFicheiro(user,pass,nome) == true)
          {
 JOptionPane.showMessageDialog(null,"Registo já existente\nTente novamente");
          }
          
          else
          {
                 File f = new File(nome);  
BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));   
if(f.canWrite()){ 
bw.newLine(); 
bw.write(user + "\n" + pass); 
JOptionPane.showMessageDialog(null,"Novo utilizador introduzido com sucesso");
bw.flush(); 
bw.close(); 
} 
          }
    }
  private  Boolean verificarUser(String user,String nome) throws IOException{
      
      Boolean vU = false;
      
     FileReader f = new FileReader(nome);
            BufferedReader br = new BufferedReader(f);

            //equanto houver mais linhas
            while(br.ready() ){

                //lê a proxima linha
                String linha = br.readLine();

                if(user.equals(linha))
                {
                    vU=true;
                    return vU;
                }
            }
            return vU;
  }
  
  private  Boolean verificarPass(String pass,String nome) throws IOException{
      
      Boolean vP = false;
     FileReader f = new FileReader(nome);
            BufferedReader br = new BufferedReader(f);

            //equanto houver mais linhas
            while(br.ready() ){

                //lê a proxima linha
                String linha = br.readLine();

                if(pass.equals(linha))
                {
                    vP=true;
                    return vP;
                }
            }
            
            return vP;
  }
  
     public Boolean lerFicheiro(String user, String pass,String nome) throws IOException{
       Boolean v = false;
         if((verificarUser(user,nome) == true) && (verificarPass(pass,nome) == true))
                 {
                     
                     v = true;
                    return v;
                 }

              return v;

  }
}