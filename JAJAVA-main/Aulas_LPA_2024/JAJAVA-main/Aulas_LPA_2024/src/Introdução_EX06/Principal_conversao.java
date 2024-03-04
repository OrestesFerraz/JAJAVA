/*
faça um programa que receba as medidas em pés
faça as conversoes a seguir e mostre o resultado
a)polegadas
b)jardas
c)milhas
sabese que
1 pé = 1 polegada
1 jarda = 3 pés 
1 milha = 1760 jardas
*/
package Introdução_EX06;

import javax.swing.JOptionPane;


public class Principal_conversao {
    
     
    
    public static void main (String[] args) {
        
        double pes;
        
        Conversao conversao = new Conversao();
        
        pes = Double.parseDouble(
        JOptionPane.showInputDialog(
        "informe o numero de pes"));
        
        JOptionPane.showMessageDialog(null, 
                conversao.Conversao_Medidas(pes));
    }//main
    
}//classe
