package Aula02;
import java.util.Scanner;
import java.lang.Math;

public class Ex7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Introduza as coordenadas do ponto p1 ");
    double x1 = sc.nextDouble();
    double y1 = sc.nextDouble();
    System.out.println("Introduza as coordenadas do ponto p2 ");
    double x2 = sc.nextDouble();
    double y2 = sc.nextDouble();
    double d= Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    System.out.printf("A distância entre 2 pontos é %.3f ",d);
    sc.close();
    }
}
