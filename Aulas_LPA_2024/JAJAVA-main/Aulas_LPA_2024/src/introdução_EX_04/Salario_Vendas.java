/*
um funcionário recebe salario fixo + 4% de comissão
sobre vendas
faça um programa que receba o salario fixo de um funcionário 
e o valor de suas vendas
calcule e mostre a comissão e o salário final do funcionário
*/
package introdução_EX_04;



public class Salario_Vendas {
    private double sal, ven, com,total;
    double CalcularComissao(double sal, double ven) {
        
        this.sal = sal;
        this.ven = ven;
        this.com = ven / 100;
        this.total = sal + com;
        
        return total;
    }
    
}
