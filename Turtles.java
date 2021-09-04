import java.io.*;
import java.util.Scanner;

public class Desafio {
    public static void main(String args[]) throws IOException {
        Scanner input = new Scanner(System.in);
        int nivel; 
        
        for (int i = 0; i < 3; i++) {
            int[] velocidade  = new int[3];
            velocidade [i] = input.nextInt();
            
            if (velocidade [i] < 10) {
                nivel=1;
            }if (velocidade [i] >= 10 && velocidade [i] <20 ) {
                nivel=2;
            }else{
                nivel=3;
            }
             System.out.println(nivel);
        }
       
    }
}