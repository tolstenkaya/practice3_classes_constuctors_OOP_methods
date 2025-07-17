import java.util.Scanner;

public class Movie {
    private String title;
    private String genre;
    private double rating;

    public Movie(String title,String genre, double rating){
        setTitle(title);
        setGenre(genre);
        setRating(rating);
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void setGenre(String genre){
        this.genre=genre;
    }

    public void setRating(double rating){
        if(rating>=0 && rating<=10){
            this.rating=rating;
        }
        else{
            System.out.println("Rating is out of range. Please enter a number between 0 and 10! Please try again.");
        }
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public double getRating(){
        return Math.round(rating*100.0)/100.0;
    }

    public boolean isRecommended(){
        if(getRating()>7){
            return true;
        }
        else{
            return false;
        }
    }

    public void printMovie(){
        System.out.println("Title: "+getTitle());
        System.out.println("Genre: "+getGenre());
        System.out.println("Rating: "+getRating());
    }
}
