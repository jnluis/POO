package Aula03;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double med,min,max,Start, n2;

        String msg= "Insira um conjunto de números reais. Para acabar, insira novamente o primeiro número.";

        System.out.println(msg);
        System.out.println("N? ");
        Start = sc.nextDouble();
        max= Start;
        min= Start;
        med = Start;
        int i =1;
        do {
            System.out.println("N? ");
            n2 = sc.nextDouble();

            med +=n2;
            i+=1;
            if (n2>max) /* quando é só uma condição, não é preciso pôr {}*/
            max=n2;
            if (n2<min)
            min = n2;


        }
        while (n2 != Start);
        med= med/i;
        System.out.printf("O valor máximo introduzido foi %.02f , o mínimo %.02f , a média %.02f, tendo sido introduzidos "+i+" valores. %n ",max, min, med);
        sc.close();
    }
}
