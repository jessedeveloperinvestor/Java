import java.io.IOException;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	int A = leitor.nextInt();
    	int B = leitor.nextInt();

    	if (A + B <= N)
    		System.out.println("Farei hoje!");
    	else
    		System.out.println("Deixa para amanha!");
    }
	
}