public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.title = "The Godfather";
        myMovie.releaseYear = 1970;
        myMovie.durationMinutes = 180;

        myMovie.showInfo();
        myMovie.rankMovie(8);
        myMovie.rankMovie(5);
        myMovie.rankMovie(10);

        System.out.println(myMovie.rating);
        System.out.println(myMovie.ratingCount);
        System.out.println(myMovie.getAverage());
    }
}