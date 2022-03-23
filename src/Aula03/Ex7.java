package Aula03;
import java.util.Scanner;
import java.lang.Math;

public class Ex7 {
    public static void main(String[] args) {
        int n, num, i;
        String c;
        i=0;
        Scanner sc = new Scanner(System.in);
        do {
            n= (int) Math.floor(Math.random()*101); /* arranjar um número entre 0 e 100. Arredonda o nº para baixo */
            do {
                System.out.println("Introduza o seu palpite ");
                num = sc.nextInt();
                if (num >n){
                    System.out.println("Palpite demasiado alto!! ");  
                } else if (num < n){
                    System.out.println("Palpite demasiado baixo!! ");  
                } else{
                    System.out.println("Certaaa!!!");
                }
                i++;
            } while(num !=n);
            System.out.println("Fez "+i+" tentativas");
            c= sc.next();
        } while (c.equals("S") || c.equals("Sim"));
            sc.close();
        }
    }
