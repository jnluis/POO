package Aula02;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira as horas em segundos ");
        int t = sc.nextInt();
        int h = t / 3600;
        t = t % 3600;
        int m = t/60;
        t = t%60;
        System.out.printf("O tempo no formato hh:mm:ss é %02d:%02d:%02d %n ", h,m,t);
        sc.close();
    }
}
