package Aula11;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

import java.util.TreeMap;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.io.File;
import java.io.PrintWriter;

import java.util.Comparator;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        Scanner inputVoos, inputCompanhias = null;
        Map<String, String> Siglas_e_Companhias = new TreeMap<>();
        List<Voo> ListaVoos = new LinkedList<>();
        String[] linha = null; // Não dá para fazer em array list porque dá erro. As linhas são do tipo String[]

        inputVoos = new Scanner(new FileReader("voos.txt",StandardCharsets.UTF_8)); 
        inputCompanhias = new Scanner(new FileReader("companhias.txt",StandardCharsets.UTF_8)); 
    
        inputVoos.nextLine(); // Ignorar a 1º linha porque é o cabeçalho
      
        while (inputVoos.hasNextLine()) {
            linha = inputVoos.nextLine().split("[\t]");
            if (linha.length ==4){
                ListaVoos.add(new Voo(linha[0], linha[1], linha[2], linha[3]));
            } else {
                ListaVoos.add(new Voo(linha[0], linha[1], linha[2]));
            }
        }
        inputVoos.close();
        
        // passar as siglas das companhias para a classe Voo
        inputCompanhias.nextLine();
        while (inputCompanhias.hasNextLine()) {
            linha = inputCompanhias.nextLine().split("[\t]");
            Siglas_e_Companhias.put(linha[0], linha[1]);
            //ListaVoos.add(new Voo(linha[0], linha[1]));
        }
        inputCompanhias.close();

        // passar as siglas das companhias para a classe Voo
        Voo.setCompanhias(Siglas_e_Companhias);


        // Mostrar a informação completa
        System.out.printf("%-15s %-15s %-20s %-20s %-15s %-15s \n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");

        for (Voo v : ListaVoos) {
            System.out.println(v);
        }


        //b- Guardar num ficheiro
        //Copiado dos slides Teoricos
        try {
            PrintWriter novo_fiche = new PrintWriter(new File("Infopublico.txt"));
            novo_fiche.printf("%-15s %-15s %-20s %-20s %-15s %-15s \n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
            for (Voo v : ListaVoos) {
                novo_fiche.println(v);
            }
            novo_fiche.close();
        } catch (Exception e) {
            System.out.println("Não conseguiu escrever o novo ficheiro!");
        }

        //c Calcule a média dos atrasos por companhia e apresente no ecrã uma tabela
        //(Companhia, Atraso médio) ordenada por ordem crescente de atraso médio.
        System.out.println("--------------------------------------------"); //Só para dividir as alíneas
        Map<String, int[]> Atrasos = new HashMap<>();
        for(Voo v: ListaVoos){
            if (v.getAtraso() != "") {
                int[] tempoMedio;
                if (Atrasos.containsKey(v.getCodigo().substring(0, 2).trim())) {
                    tempoMedio = Atrasos.get(v.getCodigo().substring(0, 2).trim());
                } else {
                    tempoMedio = new int[2];
                }
                tempoMedio[0]++; //nº de vezes atrasado
                tempoMedio[1] += Voo.stringToMinutes(v.getAtraso()); //soma dos atrasos
                Atrasos.put(v.getCodigo().substring(0, 2).trim(), tempoMedio);
            }
        }

        Map<String, Integer> mapAtrasosTable = new HashMap<>();
        for (String c : Atrasos.keySet()) {
            int[] a = Atrasos.get(c);
            mapAtrasosTable.put(c, (int) a[1] / a[0]);
        }

        mapAtrasosTable = SortCrescente(mapAtrasosTable);

        System.out.printf("%-20s %-15s\n", "Companhia", "Atraso médio");
        for (String k : mapAtrasosTable.keySet()) {
            System.out.printf("%-20s %-18s\n", Siglas_e_Companhias.get(k), Voo.minutesToString(mapAtrasosTable.get(k)));
        }
        //d-Guarde no ficheiro cidades.txt uma tabela com informação com o total de chegadas de
        // cada cidade origem. Exemplo (ordenação por número de voos):
        System.out.println("--------------------------------------------"); //Só para dividir as alíneas
        Map<String, Integer> mapaVoos = new HashMap<>();
        for(Voo v : ListaVoos){
            String origem = v.getOrigem();
            int nVoo =0;
            if(!mapaVoos.containsKey(origem)){
                mapaVoos.put(origem, nVoo+1);
            }else{
                mapaVoos.put(origem, mapaVoos.get(origem) +1);
            }
        }

        mapaVoos = SortDecrescente(mapaVoos);

        PrintWriter cidades = new PrintWriter(new File("cidades.txt"));
        cidades.printf("%-20s %-15s\n", "Origem", "Voos");
        for (String k : mapaVoos.keySet()) {
            cidades.printf("%-20s %-15s\n", k, mapaVoos.get(k));
        }
        cidades.close();
    }

    private static Map<String, Integer> SortCrescente(Map<String, Integer> map) {
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();           
        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
        .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
    
    return sortedMap;
    }

    private static Map<String, Integer> SortDecrescente(Map<String, Integer> map) {
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();           
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
    
    return sortedMap;
    }
}
