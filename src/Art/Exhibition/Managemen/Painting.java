package Art.Exhibition.Managemen;

public class Painting extends Artwork {
    private String typeOfPaint;

    public Painting(String title, int year, Artist artist, String typeOfPaint) {
        super(title, year, artist);
        this.typeOfPaint = typeOfPaint;
    }

    @Override
    public String toString() {
        return "Painting: " + getTitle() + " (" + typeOfPaint + "), " + getYear();
    }
}
