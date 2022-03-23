package Aula03;
import java.util.Scanner;
import java.lang.Math;

public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a nota da Componente prática (arredondada às décimas)");
        Double CP = sc.nextDouble();
        System.out.println("Insira a nota da Componente teórica (arredondada às décimas) ");
        Double CT = sc.nextDouble();
        if ((CP >=0 && CP<=20) && (CT>=0 && CT<=20)){
        if ((CP >=7.0) && (CT>=7.0)){
            double N= (0.4 * CT)+(0.6*CP);
            /*System.out.printf("A nota final é " + N);*/
            System.out.printf("A nota final é " + Math.round(N));
            sc.close();
        } else {
            System.out.println("Reprovado por nota mínima ");
        }
        }else{
            System.out.println("Introduza valores válidos!! ");
        }
    }
}
