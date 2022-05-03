package Aula05;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n, ano=0;
        int diaSemana=0;
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new Calendar();
        Date date = new Date(5, 5, 1995); //data inventada só como exemplo

        do{
            menu(); 
            n = sc.nextInt();

            switch(n){
                case 0: break;
                case 1:
                    System.out.println("----------------------------------");
                    System.out.print("Ano: ");
                    ano = sc.nextInt();
                    System.out.print("Dia da semana que começa (1 a 7): ");
                    diaSemana = sc.nextInt();
                    calendar.setCalendar(ano, diaSemana);
                    break;
                case 2:
                    System.out.println("----------------------------------");
                    System.out.print("Mes (número): ");
                    int m = sc.nextInt();
                    System.out.print("Dia da semana em que o mês começa (1 a 7): ");
                    int d = sc.nextInt();
                    System.out.print("Ano: ");
                    int a = sc.nextInt();
                    date.setDate(d, m, a);
                    calendar.printMes(m,a,d);
                    break;
                case 3:
                    System.out.println("----------------------------------");
                    calendar.printCalendar(ano, diaSemana);

                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
        }
        }while(n!= 0);
        sc.close();
    }

    public static void menu(){
        System.out.println("--- Calendar operations ---\n"
				+ "1 - Create new calendar\n"
				+ "2 - Print calendar month\n"
				+ "3 - Print calendar\n"
				+ "0 - exit\n");
        }
    
}
