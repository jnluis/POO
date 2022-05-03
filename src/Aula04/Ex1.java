package Aula04;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){   
        Scanner sc = new Scanner(System.in);
        String S,s;
        System.out.println("Introduza uma palavra, uma frase ou um parágrafo");
        S = sc.nextLine();

        s = S.toLowerCase();
        System.out.println("A sua string, convertida para minúsculas: "+s);
        System.out.println("O último carater da sua string é: "+(S.substring(S.length() - 1))); 
        System.out.println("Os 3 primeiros carateres da sua string é: "+(S.substring(0,3))); 

        System.out.println("A sua string começa com Bac?: "+S.startsWith("Bac")); 
        System.out.println("A sua string acaba em ouco?: "+S.endsWith("ouco"));
        System.out.println("A sua string contém a expressão ora?: "+S.contains("ora"));

        sc.close();} 
    
}

