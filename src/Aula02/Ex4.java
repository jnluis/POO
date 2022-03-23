package Aula02;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        double j,m, jm;
        /* int meses = 3; */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza o seu montante investido e a taxa de juro mensal ");
        m = sc.nextDouble();
        j = sc.nextDouble();
        for (int i = 0; i<=2;i++){
        jm = m * (j/100);
        m +=  (jm);
        System.out.println(i);
    }
        sc.close();
        System.out.print("O valor final do seu investimento ao final de 3 meses é "+m);
    }
}
