package Art.Exhibition.Managemen;

public class Main {
    public static void main(String[] args) {
        Artist kasteev = new Artist("Abilkhan Kasteev", "neosymbolism");
        Artist malybekov = new Artist("Zhandarbek Malybekov", "Socialist realism");

        Artwork painting1 = new Painting("Turk-Sib", 1969, kasteev, "Oil");
        Artwork sculpture1 = new Sculpture("Golden Man replica", 2001, malybekov, "Gold/Bronze");
        Artwork painting2 = new Painting("Kazakhstan Flag", 1991, malybekov, "Canvas");

        Gallery museum = new Gallery("National Museum");
        museum.addArtwork(painting1);
        museum.addArtwork(sculpture1);
        museum.addArtwork(painting2);

        museum.showAll();

        System.out.println("\n--- Testing Search ---");
        museum.findByTitle("Turk-Sib");

        System.out.println("\n--- Testing Sort ---");
        museum.sortByYear();
        museum.showAll();
    }
}
