package Aula12;
import java.util.Comparator;

public class ScoreComparator implements Comparator<Movie>{
    public int compare(Movie a, Movie b){
        if (a.getScore() < b.getScore()) {
			return 1;
		} else if (a.getScore()>b.getScore()) {
			return -1;
		} else {
			return 0;
		}
    }
}
