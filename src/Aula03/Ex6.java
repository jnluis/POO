package Aula03;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        int ano, mes,dias;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Insira o número do mês: ");
            mes = sc.nextInt();
            if ((mes<0) || (mes>12)){
                System.out.println("Insira um mês válido!");
            }
        }while((mes<0) || (mes>12));
        do{
            System.out.print("Insira o número do ano: ");
            ano = sc.nextInt();
            if (ano<0){
                System.out.println("Insira um ano válido!");
            }
        }while(ano<0);
        switch(mes){ 
            case 4:
            case 6:
            case 9:
            case 11: dias =30; break;
            case 2:
                if((ano%4 == 0) && ((ano%100 != 0) || (ano%400 == 0))){
                dias = 29;
            }else{dias = 28;
            } break;
            default: dias=31;

        }
        System.out.println("O mês " + mes + " do ano " + ano + " tem " + dias + " dias.");
        sc.close();
}
    
}
