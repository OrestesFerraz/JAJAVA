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

public class Conversao {
    
    private double pes, yrds, mi, pol;
    
    String Conversao_Medidas (double pes) {
        this.pes = pes;
        this.pol = this.pes * 12;
        this.yrds = this.pes / 3;
        this.mi = yrds / 1760;
        
        
        
        return "a quantidade de jardas é" + this.yrds +
         "\n a quntidade de milhas é" + this.mi +
         "\n a quntidade de polegadas é" + this.pol;
    }//conversao
    
}//classe
