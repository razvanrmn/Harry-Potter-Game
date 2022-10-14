package Main;

// Toate clasele o sa fie conectate catre aceasta clasa
public class GameManager {
    public Hogwarts hogwarts = new Hogwarts(this);
    ActionHandler actionHandler = new ActionHandler(this);
    public UI ui = new UI(this);
    public ActChanger actChanger = new ActChanger(this);

    public static void main(String[] args) {
        new GameManager();
    }

    public GameManager(){
        actChanger.showActI();
    }

}
