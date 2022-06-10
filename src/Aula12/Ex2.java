package Aula12;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

import java.util.Set;
import java.util.TreeSet;

import java.util.List;
import java.util.stream.Collectors;

import java.util.HashSet;

import java.io.File;
import java.io.PrintWriter;
public class Ex2 {
    public static void main(String[] args) throws IOException {
        Scanner inputMovies = null;
        String[] linha = null;
        Set<Movie> ListaMovies = new TreeSet<>();

        inputMovies = new Scanner(new FileReader("movies.txt",StandardCharsets.UTF_8)); 
        inputMovies.nextLine(); // Ignorar a 1º linha porque é o cabeçalho

        while (inputMovies.hasNextLine()) {
            linha = inputMovies.nextLine().split("[\t]");
                ListaMovies.add(new Movie(linha[0], Double.parseDouble(linha[1]), linha[2], linha[3], Integer.parseInt(linha[4])));
 
        }
        inputMovies.close();

        System.out.printf("%-40s %-10s %-10s %-10s %-10s\n", "NAME", "SCORE", "RATING", "GENRE", "RUNTIME");
        for (Movie m : ListaMovies){    
            System.out.println(m);
        }
        System.out.println("-----------------ORDERED BY SCORE DES----------------------");
        //c Liste no ecrã os vários filmes, ordenados por: 1) ordem decrescente de score; 2) por
        //ordem crescente de “running time”.

        List<Movie> List_byScore_down = ListaMovies.stream().collect(Collectors.toList());
        //Ordem decrescente do Score
        List_byScore_down.sort(new ScoreComparator());
        System.out.printf("%-40s %-10s %-10s %-10s %-10s\n", "NAME", "SCORE", "RATING", "GENRE", "RUNTIME");
        for (Movie m : List_byScore_down ){    
            System.out.println(m);
        }

        System.out.println("-------------ORDERED BY RUNNING_TIME ASC-------------------");
        // Ordem crescente de runningTime
        List<Movie> List_byRunTime = ListaMovies.stream().collect(Collectors.toList());
        //Ordem decrescente do Score
        List_byRunTime.sort(new RunningComparator());
        System.out.printf("%-40s %-10s %-10s %-10s %-10s\n", "NAME", "SCORE", "RATING", "GENRE", "RUNTIME");
        for (Movie m : List_byRunTime ){    
            System.out.println(m);
        }

        //d Imprima no ecrã os géneros existentes (genre), distintos. 
        // Como são distintos, vamos usar um set
        Set<String> Genres= new HashSet<>();
        for (Movie m : ListaMovies ){    
            Genres.add(m.getGenre());
        }
        System.out.println("-------------GENRES-------------------");
        System.out.println(Genres);

        //Escreva no ficheiro “myselection.txt” os filmes com um score superior a 60 e que pertençam
        //ao género comedy.

        PrintWriter selection = new PrintWriter(new File("myselection.txt"));
        selection.printf("%-40s\n", "FILMES");
        for (Movie m : ListaMovies) {
            if (m.getScore()>60 && m.getGenre().equals("comedy"))
                selection.println(m);
        }
        selection.close();
    }
}
