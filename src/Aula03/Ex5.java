package Aula03;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double Minv, tx;
        do {
            System.out.println("Introduza o montante investido (positivo e múltiplo de 1000)");
            Minv = sc.nextDouble();
        } while ((Minv<0) || (Minv% 1000 !=0));
        do {
            System.out.println("Introduza a taxa de juro mensal(entre 0 e 5%)");
            tx = sc.nextDouble();
            } while ((tx<0) || (tx>5));
        for (int i=0; i<=12;i++){
            Minv += (Minv*(tx/100));
            System.out.printf("Montante do "+i+"º mês: %.2f %n",Minv);
        }
            
        sc.close();
}
}