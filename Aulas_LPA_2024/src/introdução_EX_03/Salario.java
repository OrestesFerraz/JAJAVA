
package introdução_EX_03;



public class Salario {
    private double sal, sal_f, aumento;
    
    double calcularSalario (double sal, double aumento) {
        this.sal = sal;
        this.aumento = aumento;
        this.sal_f  = this.sal + (this.sal*this.aumento/100);
        
        return sal_f;
    }
}
