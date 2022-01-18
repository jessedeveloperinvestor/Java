import java.io.IOException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws IOException {
      Scanner leitor = new Scanner(System.in);
      Integer y = 0;
      Integer P;
      while (y==0) {
        P = leitor.nextInt();
        if (P == 2002) {
          System.out.println("Acesso Permitido");
          y = 1;
        }
        else {
          System.out.println("Senha Invalida");
        }
          
        }
      }
}