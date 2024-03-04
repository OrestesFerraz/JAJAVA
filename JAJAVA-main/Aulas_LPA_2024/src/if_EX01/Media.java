/*

 */
package if_EX01;


public class Media {
    private double nota1, nota2, media_f;
    private String resp;
    public String calcular (double nota1, double nota2) {
        
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media_f = (this.nota1 + this.nota2) / 2;
        
        if (this.media_f >= 6) {
            this.resp = "aprovado";
        } else if ((this.media_f >= 4) && (this.media_f < 6)) {
            this.resp = "recuperação";
        } else {
            this.resp = "reprovado";
        }//if
        return this.resp;
    }//método
                
}//classe
