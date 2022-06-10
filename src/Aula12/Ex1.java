package Aula12;
import java.util.Scanner;
import java.io.FileReader;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.io.*;

public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList <String> Total_Palavras = new ArrayList<>();
        Set<String> Palavras_diferentes = new HashSet<>();
        int dif = 0;
        Scanner input = new Scanner(new FileReader("w12ex1.txt"));
        //input.useDelimiter("[\\,\\.\\s+]");
        while (input.hasNextLine()) {
            String[] strAr = input.nextLine().split("[\\,\\.\\s+]");
            for (String str : strAr){
                Total_Palavras.add(str);
            }    
        }
        for(String str: Total_Palavras){
            if (Palavras_diferentes.add(str) == false)
                dif++;
        }
        System.out.println("Nº Total de Palavras " +Total_Palavras.size()); // nº total de palavras
        System.out.println("Nº de Diferentes Palavras " +dif); // nº total de palavras diferentes
        //input.close();   
    }
}