import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));
        
        int MEDIA=0, l, c;
        char O = sc.next().charAt(0);
        double SOMA=0.0;
        double[][] n = new double[12][12];

        for(l=0; l<12; l++)
            for(c=0; c<12; c++)
                n[l][c] = sc.nextDouble();

        //MATRIZ[LINHA][COLUNA]

        for(l=0; l<12; l++)
            for(c=0; c<12; c++){
                if (c > l){
                    SOMA += n[l][c];
                    //if (n[l][c] != 0)
                    MEDIA++;
                }
            }
        double xy = MEDIA;
        double y = SOMA/xy;
        if (O == 'S') {
            System.out.printf("%.1f\n",SOMA);
        } else {
            System.out.printf("%.1f\n",y);
        }

        sc.close();
    }
}