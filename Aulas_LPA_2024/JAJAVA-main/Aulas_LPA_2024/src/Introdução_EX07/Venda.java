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

public class Venda {
   
    private double preco_fabrica, lucro, imposto, preco_final;
    
    String Calculo_Preco (double preco_fabrica, double lucro, double imposto) {
        
       this.preco_fabrica = preco_fabrica;
       this.lucro = this.lucro / 100;
       this.imposto = this.imposto / 100;
        
        return "o preço final é de R$" + preco_final;
    }//metodo
    
}//classe
