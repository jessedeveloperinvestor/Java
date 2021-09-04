import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Desafio{

    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);
        double n1,n2,n3,n4,media,emexame,emexamefinal;
        
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        media = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
                
        System.out.printf("Media: %.1f\n",media);

        //continue a solucao de acordo com o enunciado
      if (media > 7.0) {
          System.out.println("Aluno aprovado.");
      } else if(media > 6.9 && media < 7.0) {
          // caso não especificado
      } else if (media >= 5.0) {
          System.out.println("Aluno em exame.");

          emexame = sc.nextFloat();
          System.out.printf("Nota do exame: %.1f\n", emexame);

          emexamefinal = (media + emexame) / 2;

          if (emexamefinal >= 5.0)
              System.out.println("Aluno aprovado.");
          else
              System.out.println("Aluno reprovado");

          System.out.printf("Media final: %.1f\n", emexamefinal);
      } else {
          System.out.println("Aluno reprovado.");
      }
        sc.close();
    }
}