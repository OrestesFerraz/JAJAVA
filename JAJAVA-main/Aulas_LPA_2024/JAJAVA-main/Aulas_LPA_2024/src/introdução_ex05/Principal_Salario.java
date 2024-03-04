/*
faça um programa que receba o salario baese em um funcionário 
calcule o slario para receber sabendo que esse funcionário tem gratificação 
de 50 reais e paga imposto de 10% sobre o salario base
*/

package introdução_ex05;

import javax.swing.JOptionPane;

public class Principal_Salario {
    
    public static void main (String[] args) {
        double sal;
        Salario salario = new Salario();
        
      sal = Double.parseDouble(
      JOptionPane.showInputDialog("informe o salario do funcionário"));
      
      JOptionPane.showMessageDialog(null, 
              "o novo salario é " + salario.CalculoSalario(sal));
    }
}
