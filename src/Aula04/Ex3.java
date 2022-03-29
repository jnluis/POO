package Aula04;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S;
        StringBuilder Sfinal= new StringBuilder(); 
        System.out.println("Introduza uma frase: ");
        S = sc.nextLine();
        String[] SPartida = S.split("\\s+");
        for(int i = 0; i < SPartida.length; i++){
            char c = SPartida[i].charAt(0);
                if ((SPartida[i].length()) >= 3){
                    c = Character.toUpperCase(c);
                    Sfinal.append(c);            
            } else {
                System.out.println("Palavra com menos de 3 carateres");
            }
        } 
        System.out.println("Acrónnimo: "+Sfinal);
        sc.close();
    }
}
