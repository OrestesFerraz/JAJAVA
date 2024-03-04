/*
 voce esta fazendo um trabalho de clasificação de solo
apos colher uma amostra e verificar a pontuação de
agua presente nela, classificou a amostra em 
rochosa se menos ou igual a 16 pontos
firme se mais de 10 pontos e menos que 40
caso tenha mais que 80 pontos 
escrever a mensagem
quantidade de agua inválida
 */
package if_EX02;

import javax.swing.JOptionPane;

public class PrincipalSolo {
    
    public static void main (String args[]) {
        
        Solo solo = new Solo();
        
        JOptionPane.showMessageDialog(null ,"" +
                solo.calculo(
                        Double.parseDouble(JOptionPane.showInputDialog("informe o tanto de agua do solo"))
                ));
    }
    
}
