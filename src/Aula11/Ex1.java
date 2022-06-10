package Aula11;
import java.util.Scanner;
import java.io.IOException;
import java.util.HashMap;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.TreeMap;
import java.util.Map;
import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) throws IOException{
        // String sep = "\t\n.,:'‘’;?!-*{}=+&/()[]”“\"\'"; equivalente ao método regex punct do JAVA
        ArrayList<String> palavras = new ArrayList<>();
        Map<String, TreeMap<String, Integer>> conjunto_final = new HashMap<>(); //não diz para pôr por ordem
        Scanner input = null;
        try{
            input= new Scanner(new FileReader("major.txt",StandardCharsets.UTF_8)); 
            input.useDelimiter("[\\p{Punct}\\s+]");
        }
        catch(IOException e){
            System.out.println("Erro a abrir o ficheiro");
        } 
           
        while (input.hasNext()) {
            String word = input.next();
            if (word.length()> 2){
                palavras.add(word);
            }
        }

        for(int i=0;i<palavras.size()-1;i++) {
            String palAtual = palavras.get(i);
            String palProxima = palavras.get(i+1);
            if(!conjunto_final.containsKey(palAtual)) {
                TreeMap<String, Integer> mapa = new TreeMap<>();
                mapa.put(palProxima, 1);
                conjunto_final.put(palAtual, mapa);
            }else {
                if(conjunto_final.get(palAtual).containsKey(palProxima)) {
                    conjunto_final.get(palAtual).replace(palProxima, conjunto_final.get(palAtual).get(palProxima) , conjunto_final.get(palAtual).get(palProxima)+1);
                } else {
                    conjunto_final.get(palAtual).put(palProxima, 1);
                }
            }
        }

		input.close();
		for(int i = 0; i < conjunto_final.size(); i++) {
			System.out.println(conjunto_final.entrySet().toArray()[i].toString());
			
		}
    }
}