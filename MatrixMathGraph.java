import java.io.IOException;
import java.util.Scanner;

public class Jesse {
    
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }
        
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (i==1 && j==11) soma += M[i][j];
                if (i==2 && j==10) soma += M[i][j];
                if (i==2 && j==11) soma += M[i][j];
                if (i==3 && j==9) soma += M[i][j];
                if (i==3 && j==10) soma += M[i][j];
                if (i==3 && j==11) soma += M[i][j];
                if (i==4 && j==8) soma += M[i][j];
                if (i==4 && j==9) soma += M[i][j];
                if (i==4 && j==10) soma += M[i][j];
                if (i==4 && j==11) soma += M[i][j];
                if (i==5 && j==7) soma += M[i][j];
                if (i==5 && j==8) soma += M[i][j];
                if (i==5 && j==9) soma += M[i][j];
                if (i==5 && j==10) soma += M[i][j];
                if (i==5 && j==11) soma += M[i][j];
                if (i==6 && j==7) soma += M[i][j];
                if (i==6 && j==8) soma += M[i][j];
                if (i==6 && j==9) soma += M[i][j];
                if (i==6 && j==10) soma += M[i][j];
                if (i==6 && j==11) soma += M[i][j];
                if (i==7 && j==8) soma += M[i][j];
                if (i==7 && j==9) soma += M[i][j];
                if (i==7 && j==10) soma += M[i][j];
                if (i==7 && j==11) soma += M[i][j];
                if (i==8 && j==9) soma += M[i][j];
                if (i==8 && j==10) soma += M[i][j];
                if (i==8 && j==11) soma += M[i][j];
                if (i==9 && j==10) soma += M[i][j];
                if (i==9 && j==11) soma += M[i][j];
                if (i==10 && j==11) soma += M[i][j];
            }
        }

        if (O == 'M') soma /= 30;
        System.out.println(String.format("%.1f", soma));
    }
    
}