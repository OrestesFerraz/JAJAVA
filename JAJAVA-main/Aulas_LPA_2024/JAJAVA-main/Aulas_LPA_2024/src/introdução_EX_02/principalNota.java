/*
faça um programa que receba três notas e seus respectivos pesos
calcule e mostre a média ponderada dessas notas 
esseexercício de ser desenvolvido utilizando os conceitos passados no primeiro exercício*/
package introdução_EX_02;

import javax.swing.JOptionPane;

public class principalNota {
    
  public static void main (String[] args) {
      Nota nota = new Nota();
      
      double n1 = Double.parseDouble(JOptionPane.showInputDialog("informe a nota 1:"));
      double n2 = Double.parseDouble(JOptionPane.showInputDialog("informe a nota 2:"));
      double n3 = Double.parseDouble(JOptionPane.showInputDialog("informe a nota 3:"));
      double p1 = Double.parseDouble(JOptionPane.showInputDialog("informe o peso 1:"));
      double p2 = Double.parseDouble(JOptionPane.showInputDialog("informe o peso 3:"));
      double p3 = Double.parseDouble(JOptionPane.showInputDialog("informe o peso 3:"));
      JOptionPane.showMessageDialog(null, nota.calculoMedia(n1, n2, n3, p1, p2, p3));
  }//principal
    
}//classe
