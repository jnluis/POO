package Aula07;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String op, cor;
        Forma c1,t1,r1;
        
        c1 = new Circulo(4);
        t1 = new Triangulo(4,5,3);
        r1 = new Retangulo(5,6);

        do{
			System.out.print("Cor da forma: ");
			cor = sc.nextLine();
			if(cor.isEmpty()){ //Método do java para ver se a string que vem do input é vazia ou não
				System.out.println("Cor inválida!");
			}
			else{
				break;
			}
		}while(cor.isEmpty());

		Forma.setcor(cor);




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
                    ((Circulo)c1).setRaio(raio);
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
                    ((Triangulo)t1).setlados(l1,l2,l3);
                    System.out.println(t1.toString());
                    break;
                case "4": 
                    System.out.println(" <<< NEW RECTANGLE >>> ");
                    System.out.println("Insira o comprimento do retangulo");
                    double comprimento = sc.nextDouble();
                    System.out.println("Insira a altura do retangulo");
                    double altura = sc.nextDouble();
                    ((Retangulo)r1).setMedidas(comprimento, altura);
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
