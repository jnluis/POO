package Aula05;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String op;
        Circulo c1 = new Circulo(4);
        Triangulo t1 = new Triangulo(4,5,3);
        Retangulo r1 = new Retangulo(5,6);

        do {
            menu();
            op = sc.next();
            switch(op){
                case "0": break;
                case "1": 
                    System.out.println(" <<< SHOW CURRENT VALUES >>> ");
                    System.out.println(c1.toString());
                    System.out.println(t1.toString());
                    System.out.println(r1.toString());
                    break;
                case "2":
                    System.out.println(" <<< NEW CIRCLE >>> ");
                    System.out.println("Insira o raio do círculo ");
                    double raio = sc.nextDouble();
                    c1.setRaio(raio);
                    System.out.println(c1.toString());
                    break;
                case "3": 
                    System.out.println(" <<< NEW TRIANGLE >>> ");
                    System.out.println("Insira os lados do triangulo ");
                    System.out.print("L1- ");
                    double l1 = sc.nextDouble();
                    System.out.print("L2- ");
                    double l2 = sc.nextDouble();
                    System.out.print("L3- ");
                    double l3 = sc.nextDouble();
                    t1.setlados(l1,l2,l3);
                    System.out.println(t1.toString());
                    break;
                case "4": 
                    System.out.println(" <<< NEW RECTANGLE >>> ");
                    System.out.println("Insira o comprimento do retangulo");
                    double comprimento = sc.nextDouble();
                    System.out.println("Insira a altura do retangulo");
                    double altura = sc.nextDouble();
                    r1.setMedidas(comprimento, altura);
                    System.out.println(r1.toString());
                    break;
            }
        System.out.println();

        }while(!op.equals("0"));
        sc.close();
    }

    public static void menu(){
        System.out.println("--- GEOMETRIC FORMS ---\n"
				+ "1 - Show current values\n"
				+ "2 - New Circle\n"
				+ "3 - New Triangle\n"
				+ "4 - New Rectangle\n"
				+ "0 - exit\n");
        }
}
