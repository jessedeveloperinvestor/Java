import java.io.IOException;
import java.util.Scanner;

public class JessePercentageIncrease {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	double A = leitor.nextDouble();
    	double B = leitor.nextDouble();
    	double mn = B-A;
    	double rslt = 100*mn/A;
    	System.out.println(String.format("%.2f", rslt)+"%");
    }
	
}