package Aula10;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.util.TreeSet;
import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) throws IOException{
        TreeSet<String> mais2_carateres = new TreeSet<>();
        ArrayList<String> termina_em_s = new ArrayList<>();
        ArrayList<String> tudo_letras = new ArrayList<>();
        ArrayList<String> tudo_letras_2 = new ArrayList<>();
        Scanner input = new Scanner(new FileReader("names.txt"));
        while (input.hasNext()) {
        String word = input.next();
        tudo_letras_2.add(word);
        if(word.length() > 2){ // a'
            mais2_carateres.add(word);
        }      
        if(word.endsWith("S")){ // b' 
            termina_em_s.add(word);
        }
        if(word.matches("^[a-zA-Z]+$")){ // c' método regex foi dito pelo Leandro. É feira a soma porque é mais do que uma letra
            tudo_letras.add(word);
        }
        if(!word.matches("^[a-zA-Z]+$")){ // c' outra maneira --> método regex foi dito pelo Leandro. É feira a soma porque é mais do que uma letra
            tudo_letras_2.remove(word);
        }
        }
        //System.out.println(mais2_carateres); //  lista das palavras com mais do que 2 carateres
        //System.out.println(termina_em_s); //  lista com as palavras acabadas em s
        System.out.println(tudo_letras); // lista com as palavras que contêm só letras
        System.out.println(tudo_letras_2); // outra maneira
    }
}
