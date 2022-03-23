package Aula03;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, np;
        int div = 0;
        do{
            System.out.println("Insira um valor inteiro positivo ");
            n = sc.nextInt();
            if (n<0){
                System.out.println("Insira um número válido! (Inteiro positivo)");
            }
        }while (n<0);
        np = n;
        while(n>0){
            if (np%n == 0){
                div++;
            } 
            n--;
        }
        if (div == 2){
            System.out.println("É primo!");
        }else{
            System.out.println("Não é primo!");
        }
        sc.close();
    } 
}

