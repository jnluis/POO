package Aula04;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S;
        System.out.println("Introduza uma frase: ");
        S = sc.nextLine();

       countDigits_SpaceChars_stringminusc(S);
       System.out.println("A sua frase é palíndromo? "+ispalindrome(S));
       S = S.replaceAll("\s+", " "); /* não é este método para tirar os espaços? */
       System.out.println("A sua frase sem múltiplos espaços é: "+S);
        sc.close();
    }

    public static void countDigits_SpaceChars_stringminusc(String S){
        char[] ch = S.toCharArray();
        int num = 0;
        int spacechar =0;
        boolean string_inLower = true;
        for(int i = 0; i < S.length(); i++){
            if (Character.isDigit(ch[i])){
                num++;
            } if (Character.isSpaceChar(ch[i])){
                spacechar++;
            } if ( Character.isLetter(ch[i]) ){
                if( !Character.isLowerCase( ch[i] )){
                    string_inLower = false;
                }
            }
        }     
        System.out.printf("A sua frase tem %2d carateres numéricos %n",num);  
        System.out.printf("A sua frase tem %2d espaços %n",spacechar);
        System.out.printf("A sua frase contém só minusculas? "+string_inLower+"%n");    
    }

    public static boolean ispalindrome(String S){
        int strLength = S.length(); 
        String s= "";
        for (int i = (strLength - 1); i >=0; --i) {
            s = s + S.charAt(i);
          }
          if(S.equalsIgnoreCase(s))
        {
            return true;
        } else
        {
           return false;
        } 
    }

}
