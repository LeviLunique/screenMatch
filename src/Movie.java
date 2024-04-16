public class Movie {
    String title;
    int releaseYear;
    boolean includedInSubscription;
    double rating;
    int ratingCount;
    int durationMinutes;

    void showInfo() {
        System.out.println("Movie title: " + this.title);
        System.out.println("Release year: " + this.releaseYear);
    }

    void rankMovie(double score){
        rating += score;
        ratingCount++;
    }

    double getAverage () {
        return rating / ratingCount;
    }
}
