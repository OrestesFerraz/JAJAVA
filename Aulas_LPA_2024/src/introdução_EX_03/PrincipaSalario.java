/*
 faça um programa que receba o slario de um funcionário
e a porcentagem de aumento 
calcule e mostre o salario final
 */
package introdução_EX_03;

import javax.swing.JOptionPane;

public class PrincipaSalario {
    
    public static void main (String[] args) {
        Salario salario = new Salario();
        
        JOptionPane.showMessageDialog(null, salario.calcularSalario(
                Double.parseDouble(JOptionPane.showInputDialog("informe o salario do funcionário")),
                Double.parseDouble(JOptionPane.showInputDialog("informe a porcentagem de aumento"))
                
        ) +
                "o salario e´");
        }
    
    }
