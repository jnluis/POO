package Aula02;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        double km, miles;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a distância em km, que vai ser convetida para milhas ");
        km = sc.nextDouble();
        miles = km / 1.609;
        System.out.print("A distâcnia em milhas é " + miles);
        sc.close();
    }
}
