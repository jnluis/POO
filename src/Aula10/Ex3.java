package Aula10;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        //String frase = "Hello World"; exemplo só para uma frase
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza a frase: "); 
        String frase= sc.nextLine();

        Map<Character, TreeSet<Integer>> mapa = new TreeMap<>();
        char[] frase_array = frase.toCharArray();

        for (int i = 0; i < frase_array.length; i++){
            //System.out.println(frase_array[i]); só para ver a os valores do array
            Character c = frase_array[i];
            if (mapa.containsKey(c)) {
                mapa.get(c).add(i);
            }
            else {
                TreeSet<Integer> set = new TreeSet<>();
                set.add(i); // Adicionar ao set vazio a posição 
                mapa.put(c,set);
            }    
        }
        System.out.println(mapa);
        sc.close();
    }
}
