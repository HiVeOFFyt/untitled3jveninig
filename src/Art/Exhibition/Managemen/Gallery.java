package Art.Exhibition.Managemen;
import Art.Exhibition.Managemen.Artwork;

import java.util.ArrayList;
import java.util.Comparator;

public class Gallery {
    private String galleryName;
    private ArrayList<Artwork> storage = new ArrayList<>();

    public Gallery(String galleryName) {
        this.galleryName = galleryName;
    }

    public void addArtwork(Artwork art) {
        storage.add(art);
    }

    public void findByTitle(String searchTitle) {
        System.out.println("Searching for: " + searchTitle);
        for (Artwork a : storage) {
            if (a.getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println("Found: " + a.toString());
                return;
            }
        }
        System.out.println("Not found.");
    }


    public void sortByYear() {
        storage.sort(Comparator.comparingInt(Artwork::getYear));
        System.out.println("Gallery sorted by year.");
    }

    public void showAll() {
        System.out.println("--- " + galleryName + " Exhibition ---");
        for (Artwork a : storage) {
            System.out.println(a.toString());
        }
    }
}
