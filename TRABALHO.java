package trabalho;

import java.util.Scanner;

public class TRABALHO {
    public static void main(String[] args) {
        TURING MAQ = new TURING();
           Scanner ENTRADA = new Scanner(System.in);
           String PALAVRA;
           System.out.println("ENTRE COM A PALAVRA :");
           PALAVRA = ENTRADA.nextLine();
           MAQ.Iniciar(PALAVRA);
    
    }
    
}
