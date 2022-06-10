package Aula12;

public class Movie implements Comparable<Movie> {
    String name;
    double score; 
    String rating;
    String genre; 
    Integer runningTime;
    public Movie(String name, double score, String rating, String genre, Integer runningTime){
         this.name =name;
        this.score = score;
        this.rating = rating;
         this.genre= genre;
        this.runningTime= runningTime;
    }

    public String getName(){
        return name;
    }

    public double getScore(){
        return score;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public Integer getRunningTime(){
        return runningTime;
    }

    @Override
	public int compareTo (Movie o) {
		return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return String.format("%-40s %-10.1f %-10s %-10s %-10d", name, score,rating,genre, runningTime);
    }
}
