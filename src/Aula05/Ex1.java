package Aula05;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        String op;
        Scanner sc = new Scanner(System.in);
        Date date = new Date(5, 5, 1995);

        do {
            menu();
            op = sc.next();
            switch (op){
                case "0": break;
                case "1": 
                    System.out.println(" <<< CREATE NEW DATE >>> ");
                    System.out.println("Insira o ano ");
                    int year = sc.nextInt();

                    System.out.println("Insira o mês ");
                    int month = sc.nextInt();

                    System.out.println("Insira o dia ");
                    int day = sc.nextInt();
                    date.set(day, month, year);
                    System.out.println(date.toString());
                  break;
                case "2": 
                    System.out.println();
                    System.out.println(" <<< SHOW CURRENT DATE >>> ");
                    System.out.println(date.toString()); break;
                case "3":
                    System.out.println();
                    System.out.println(" <<< INCREMENT DATE >>> "); 
                    date.incrementDate(); 
                    System.out.println(date.toString());
                    break;
                case "4":
                System.out.println();
                System.out.println(" <<< DECREMENT DATE >>> "); 
                date.decrementDate();
                System.out.println(date.toString());
                 break;
                default: System.out.println("Insira uma opção válida!"); 
            }
            System.out.println();

        } while(!op.equals("0"));
        sc.close();
    }

    public static void menu(){
        System.out.println("--- Date operations ---\n"
				+ "1 - create new date\n"
				+ "2 - show current date\n"
				+ "3 - increment date\n"
				+ "4 - decrement date\n"
				+ "0 - exit\n");
        }


}
