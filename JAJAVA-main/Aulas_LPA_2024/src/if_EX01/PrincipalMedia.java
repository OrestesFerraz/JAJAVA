/*
 
 */
package if_EX01;

import javax.swing.JOptionPane;

public class PrincipalMedia {
    
    public static void main (String args[]) {
        
        Media media = new Media();
        
        JOptionPane.showMessageDialog(null, "a situação do aluno é " +
                media.calcular(
                        Double.parseDouble(JOptionPane.showInputDialog("nota1")),
                        Double.parseDouble(JOptionPane.showInputDialog("nota2"))
                ));
             
        
    }//principal
    
}//classe
