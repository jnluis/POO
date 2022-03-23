package Aula02;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a velocidade (v1) em m/s e a distâcia (d1) em m ");
        double v1 = sc.nextDouble();
        double d1 = sc.nextDouble();
        System.out.println("Insira a velocidade (v2) em m/s e a distâcia (d2) em m ");
        double v2 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double t1 = d1/v1;
        double t2 = d2/v2;
        double vm = (d1 +d2) / (t2 + t1);
        System.out.printf("A velocidade média é %.3f m/s %n ", vm);
        sc.close();
    }
}
