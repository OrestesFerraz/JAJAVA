/*
o custo ao consumidor de um carro novo é a soma do preço de fabrica
com o percentual de lucro do distribuidor e dos impostos ao preço de fabrica
faça um programa que receba o preço de fabrica 
faça um programa que4 receba o preço de fabrica de um veiculo e o 
percentual de lucro do distribuidor e o percentual de impostos
calcule e mostre 
a)o valor correspondente ao lucro do distribuidor
b)o valor correspondente ao imposto
c)o preço final do veículo
 */
package Introdução_EX07;

import javax.swing.JOptionPane;

public class Principal_Venda {
    
    public static void main (String[] args) {
        
        double preco_final, lucro, imposto;
        
        Venda venda = new Venda();
        
        preco_final = Double.parseDouble(
            JOptionPane.showInputDialog("informe o preco "));
        
        lucro = Double.parseDouble(
            JOptionPane.showInputDialog("informe o lucro"));
        
        imposto = Double.parseDouble(
            JOptionPane.showInputDialog("informe o imposto"));
        
        JOptionPane.showMessageDialog(null, venda.Calculo_Preco(preco_final, lucro, imposto));
    }//main
    
 }//classe
