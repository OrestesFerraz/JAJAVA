/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introdução_EX_01;
import javax.swing.JOptionPane;
public class Cliente {
    private String nome, rg;
    
     public void mostrar(String nome, String rg){
         this.nome = nome;
         this.rg = rg;
         
         JOptionPane.showMessageDialog(null, "O nome informado foi: " + this.nome +
                                             "\nO rg informado foi: " + this.rg);
         
         
         System.out.println("O nome informado foi: " + this.nome +
                            " O rg informado foi: " + this.rg);   
    
}

public void mostrarNome(String nome){
    this.nome = nome;
    
    JOptionPane.showMessageDialog(null, "O nome informado foi: " + this.nome);
    
    System.out.println("O nome informado foi: " + this.nome);
}
}



