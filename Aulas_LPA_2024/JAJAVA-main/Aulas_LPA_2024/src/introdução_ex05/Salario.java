/*
faça um programa que receba o salario baese em um funcionário 
calcule o slario para receber sabendo que esse funcionário tem gratificação 
de 50 reais e paga imposto de 10% sobre o salario base
*/
package introdução_ex05;



public class Salario {
    private double sal, sal_f, desc;
    
    public double CalculoSalario (double sal) {
        this.sal = sal;
        this.desc = this.sal * 0.1;
        this.sal_f = this.sal - this.desc + 50;
        
        return sal_f;       
    }
}
