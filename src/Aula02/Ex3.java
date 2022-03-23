package Aula02;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
    double M,ti,tf,Q;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduza a massa de quantidade de água em quilogramas ");
    M = sc.nextDouble();
    System.out.println("Introduza a temperatura inicial e final da temperatura da água ");
    ti = sc.nextDouble();
    tf = sc.nextDouble();
    Q = M *(tf - ti) *4184;
    System.out.println("A energia necessária para aquecer a água é " +Q);
    sc.close();
    }
}
