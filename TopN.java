import java.io.IOException;
import java.util.Scanner;
public class Problem {
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    int[] TOPS = {1, 3, 5, 10, 25, 50, 100};
    int x = leitor.nextInt();
    if (x<=1){
      System.out.println("Top "+TOPS[0]);
    } else if (x<=3){
      System.out.println("Top "+TOPS[1]);
    } else if (x<=5){
      System.out.println("Top "+TOPS[2]);
    } else if(x<=10){
      System.out.println("Top "+TOPS[3]);
    } else if (x<=25){
      System.out.println("Top "+TOPS[4]);
    } else if (x<=50){
      System.out.println("Top "+TOPS[5]);
    } else if (x<=100){
      System.out.println("Top "+TOPS[6]);
    }
  }
}