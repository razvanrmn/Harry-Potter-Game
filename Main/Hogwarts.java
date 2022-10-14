package Main;
import java.util.Random;

public class Hogwarts {
    GameManager gm;
    String house;
    String trait;
    int plainWorkRobes = 4000;
    int plainPointedHat = 200;
    int protectiveGloves = 194;
    int winterCloak = 423;
    Random q = new Random();
    int quantity = q.nextInt(20);
    double galleon = 4125;
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

    public Hogwarts(GameManager gm) {
        this.gm = gm;
    }

    public void purchase(double price) {
        galleon -= price;
    }

    public void displayQuantity() {
        gm.ui.messageText.setText("We have = " + gm.hogwarts.quantity);
    }


}
