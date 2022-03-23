package Aula02;
import java.util.Scanner;
import java.lang.Math;

public class Ex8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Introduza o comprimento dos catetos A e B ");
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double hip = Math.sqrt(Math.pow(A,2)+Math.pow(B,2));
    double ang = Math.toDegrees(Math.acos(A/hip)); // como é o valor do ângulo, é arr cos
    System.out.printf("O valor da hipotenusa é %.3f ",hip);
    System.out.printf("O valor do ângulo entre A e a hipotenusa é %.3f ",ang);
    sc.close();
    }
}
