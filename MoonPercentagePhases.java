import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int inicio = leitor.nextInt();
        int fim = leitor.nextInt();
        
        if (inicio >= 0 && fim <= 2) {
            System.out.println("nova");
        }
        if (inicio >= 3 && fim <= 96 && inicio<0 && fim>2) {
            System.out.println("crescente");
        }
        if (inicio >= 95 && fim <= 100) {
            System.out.println("cheia");
        }
        if (inicio <= 96 && fim >= 3 && fim <97) {
            System.out.println("minguante");
        }
    }

}