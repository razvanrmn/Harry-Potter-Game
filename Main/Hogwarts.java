package Main;
import java.util.Random;

public class Hogwarts {
    GameManager gm;
    private String house;
    private String trait;
    static final int plainWorkRobes = 4000;
    static final int plainPointedHat = 200;
    static final int protectiveGloves = 194;
    static final int winterCloak = 423;
    Random q = new Random();
    int quantity = q.nextInt(20);
    private double galleon = 5600;
    int book1 = q.nextInt(100);
    int book2 = q.nextInt(100);
    int book3 = q.nextInt(100);
    int book4 = q.nextInt(100);
    int book5 = q.nextInt(100);
    int book6 = q.nextInt(100);
    int book7 = q.nextInt(100);
    int book8 = q.nextInt(100);

    int item1 = q.nextInt(32);
    int item2 = q.nextInt(32);
    int item3 = q.nextInt(32);
    int item4 = q.nextInt(32);
    int item5 = q.nextInt(32);

    public Hogwarts(String house, String trait) {
        this.house = house;
        this.trait = trait;
    }
    public Hogwarts(GameManager gm) {
        this.gm = gm;
    }

    public void purchase(double price) {
        galleon -= price;
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("Welcome");
        str.append("\n\nClick on Dumbledore to start");
        return str.toString();
    }

    public String getHouse () {
        return this.house;
    }

    public double getGalleon() {
        return galleon;
    }
    public void setGalleon(double galleon) {
        this.galleon = galleon;
    }
    public String getTrait () {
        return this.trait;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setTrait(String trait) {
        this.trait = trait;
    }
}
