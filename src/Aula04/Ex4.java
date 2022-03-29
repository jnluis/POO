package Aula04;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        int mes, ano, dia, diasdoMes;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Mês: ");
            mes = sc.nextInt();
            if (mes<0 || mes>12){
                System.out.println("Mês inválido!");
            }
        }while(mes<0 || mes>12);
        do{
            System.out.print("Ano: ");
            ano = sc.nextInt();
            if (ano<0){
                System.out.println("Ano inválido!");
            }
        }while(ano<0);
        do{
            System.out.print("Dia da semana: ");
            dia = sc.nextInt();
            if (dia<0 || dia>7){
                System.out.println("Ano inválido!");
            }
        }while(dia<0 || dia>7);
    
        diasdoMes = diasNoMEs(mes, ano);

        String month = nMeses(mes);

        printCalendario(diasdoMes, ano, dia, month);
		
        sc.close();
    }
    public static int diasNoMEs(int mes, int ano){
        int dias;
        switch (mes){
            case 1: 
            case 3:dias = 31; break;
            case 2: 
                if((ano%4 == 0) && ((ano%100 != 0) || (ano%400 == 0))){
                    dias = 29;
                }else{dias = 28;
                }break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: dias = 31; break;
            default: dias = 30;
        }
        return dias;
    }
    public static String nMeses(int mes){
        String nMes;
        switch (mes){
            case 1: nMes = "Janeiro"; break;
            case 2: nMes = "Fevereiro"; break;
            case 3: nMes = "Março"; break;
            case 4: nMes = "Abril"; break;
            case 5: nMes = "Maio"; break;
            case 6: nMes = "Junho"; break;
            case 7: nMes = "Julho"; break;
            case 8: nMes = "Agosto"; break;
            case 9: nMes = "Setembro"; break;
            case 10: nMes = "Outubro"; break;
            case 11: nMes = "Novembro"; break;
            case 12: nMes = "Dezembro"; break;
            default: nMes = "Mês inválido";
        }
        return nMes;
    }
    static void printCalendario(int mes, int ano, int dia, String month) {
        System.out.println("");
		System.out.format("%s   %s   %s   %s   %s   %s   %s    %n", "  ","  ",month, ano,"","","");
        System.out.println("");
        System.out.format("%s   %s   %s   %s   %s   %s   %s   %n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
		int counter = dia;
		
		int j = 0;
		
		while (j < dia) {
			System.out.print("     ");
			j++;
		}

		for (int i = 1; i <= mes; i++) {

			if (counter % 7 == 0) {
				System.out.print("\n");
			}
            System.out.printf("%02d   ", i);

			counter++;
		}

	}

}