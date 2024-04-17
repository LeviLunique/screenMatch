public class Movie {
    private String title;
    private int releaseYear;
    private boolean isIncludedInSubscription;
    private double rating;
    private int ratingCount;
    private int durationMinutes;

    public String getTitle() {
        return this.title;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public boolean isIncludedInSubscription() {
        return this.isIncludedInSubscription;
    }

    public int getDurationMinutes() {
        return this.durationMinutes;
    }
    public int getRatingCount() {
        return this.ratingCount;
    }

    public double getRating () {
        return this.rating;
    }

    public double getAverage () {
        return this.getRating() / this.getRatingCount();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void setIncludedInSubscription(boolean isIncludedInSubscription) {
        this.isIncludedInSubscription = isIncludedInSubscription;
    }


    public void showInfo() {
        System.out.println("Movie title: " + this.title);
        System.out.println("Release year: " + this.releaseYear);
    }

    public void rankMovie(double score){
        this.rating += score;
        this.ratingCount++;
    }
}
