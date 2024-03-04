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


public class Solo {
    private double agua;
    private String resp;
    public String calculo (double agua) {
        this.agua = agua;
        if (this.agua <= 16) {
            this.resp = "o solo é rochoso";
        } else if ((this.agua > 10) && (this.agua < 40)) {
            this.resp = "o solo é firme";
        } else {
            this.resp = "quantidade inválida de agua";
        }
        return resp;
    }
    
}
