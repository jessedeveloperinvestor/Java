import java.io.IOException;
import java.util.Scanner;

public class Desafio {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int X = leitor.nextInt();
        double Y = leitor.nextDouble();

        double media = X/Y ;
        System.out.println(String.format("%.3f km/l", media));   
    }
	
}