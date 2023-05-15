package Day51.LibraryManagementSystem;

public class DVD extends LibraryItem{
    private String director;
    private int duration;

    public DVD(String title, int releaseYear, String director, int duration) {
        super(title, releaseYear);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String getItemType() {
        return "DVD";
    }
    @Override
    public String getItemDetails() {
        return getItemType() + ": " + getTitle() + ", " + director + ", " + duration + ", " + getReleaseYear();
    }

}
