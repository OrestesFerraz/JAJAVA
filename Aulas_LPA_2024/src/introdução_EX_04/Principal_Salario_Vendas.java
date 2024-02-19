/*
um funcionário recebe salario fixo + 4% de comissão
sobre vendas
faça um programa que receba o salario fixo de um funcionário 
e o valor de suas vendas
calcule e mostre a comissão e o salário final do funcionário
*/
package introdução_EX_04;

import javax.swing.JOptionPane;

public class Principal_Salario_Vendas {
    Comissao comissao = new Comissao;
    public static void main (String[] args) {
        JOptionPane.showMessageDialog(null, salario.calcularSalario(
        Double.parseDouble(JOptionPane.showInputDialog("informe o salario do cara")),
        Double.parseDouble(JOptionPane.showInputDialog("informe as venda do cara")),
        );
    }
    
}
