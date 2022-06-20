package Aula07.Ex3;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = 0;
        AgenciaViagens agencia = new AgenciaViagens("Agencia", "Rua", new ArrayList<Carro>(), new ArrayList<Alojamento>());

        do{
            menu();
            n = input.nextInt();

            switch(n){
                case 0:
                    break;
                case 1:
                    agencia.adicionarAlojamento();
                    break;
                case 2:
                    agencia.adicionarQuarto();
                    break;
                case 3:
                    agencia.adicionarCarro();
                    break;
                case 4:
                    agencia.verAlojamentos();
                    break;
                case 5:
                    agencia.verCarros();
                    break;
                case 6:
                    agencia.emprestarCarro();
                    break;
                case 7:
                    agencia.reservarAlojamento();
                    break;
                default:
                    System.out.println("    ");
                    System.out.println("Invalid option!");
            }

        }while(n != 0);
        input.close();

    }

    public static void menu(){
        System.out.println("--- Travel Agency operations ---\n"
				+ "1 - Adicionar apartamento\n"
				+ "2 - Adicionar Quarto\n"
				+ "3 - Adicionar Carro\n"
				+ "4 - Ver alojamentos\n"
                + "5 - Ver carros\n"
                + "6 - Emprestar Carro\n"
                + "7 - Reservar Alojamento\n"
				+ "0 - exit\n");
        }
}
