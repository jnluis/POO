package Aula12;
import java.util.Comparator;

public class RunningComparator implements Comparator<Movie>{
    public int compare(Movie a, Movie b){
        return b.getRunningTime() - a.getRunningTime();
    }
}
