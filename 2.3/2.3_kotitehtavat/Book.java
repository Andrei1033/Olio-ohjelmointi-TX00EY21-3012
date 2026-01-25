import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int year;
    private Double rating;
    private List<String> reviews;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = 0.0;
        this.reviews = new ArrayList<>();
    }

    public Book(String title, String author, int year, Double rating, String rewiew) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = rating;
        this.reviews = (reviews != null) ? reviews : new ArrayList<>();
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }
    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public Double getRating() {
        return rating;
    }
    public List<String> getReviews() {
        return reviews;
    }


    // Add a single review to the list
    public void addReview(String review) {
        if (review != null && !review.trim().isEmpty()) {
            this.reviews.add(review);
        }
    }

    // Get all reviews as a single string (for display purposes)
    public String getAllReviews() {
        if (reviews.isEmpty()) {
            return "";
        }
        return String.join("; ", reviews);
    }
}
