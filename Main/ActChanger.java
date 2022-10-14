package Main;

public class ActChanger {

    GameManager gm;
    public ActChanger(GameManager gm) {
        this.gm = gm;
    }

    public void showActI() {
        gm.ui.bgPanel[1].setVisible(true);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[12].setVisible(false);
        gm.ui.messageText.setText("Dai click pe barbos ca sa incepi joaca\nClick pe golden snitch pentru a trece la urmatorul cadru");
    }
    public void showActII() {
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(true);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[12].setVisible(false);
        gm.ui.messageText.setText("Congratulations! You Have Been Accepted to Attend Hogwarts!");
    }
    public void showActIII() {
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(true);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[12].setVisible(false);
        gm.ui.messageText.setText("Poftiti in vagoane nu stati pe peroane !");
    }
    public void showActIV() {
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(true);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[12].setVisible(false);
        gm.ui.messageText.setText("Let's make some shopping!");
    }

    public void showActV() {
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(true);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[12].setVisible(false);
        gm.ui.messageText.setText("What would you like to purchase ?");
    }

    public void showUniforms(){
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(true);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[12].setVisible(false);
        gm.ui.messageText.setText("Check our offer");
    }

    public void showPlain(){
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(true);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[12].setVisible(false);
        gm.ui.messageText.setText("Click on uniforms");
    }

    // Carti

    public void menuBooks(){
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(true);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[12].setVisible(false);
        gm.ui.messageText.setText("Which book would you like to purchase ?\nClick on the pile of books to see what do we have");
    }

    public void viewBooks(){
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(true);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[12].setVisible(false);
        gm.ui.messageText.setText("Click on books if you want to buy something or return");
    }
    public void menuItems() {
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[10].setVisible(true);
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[12].setVisible(false);
        gm.ui.messageText.setText("Which item would you like to purchase ?\nClick on the picture");
    }

    public void viewItems() {
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[11].setVisible(true);
        gm.ui.bgPanel[12].setVisible(false);
        gm.ui.messageText.setText("Which item would you like to purchase ?\nClick on the picture");
    }

    public void showActVI() {
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[12].setVisible(true);
        gm.ui.messageText.setText("Let's make a deposit");
    }

    public void uniform1() {
        gm.ui.messageText.setText("This item costs " + gm.hogwarts.plainWorkRobes + " galleons" + "\nAnd we have " + gm.hogwarts.quantity + " available on stock");
    }
    public void uniform2() {
        gm.ui.messageText.setText("This item costs " + gm.hogwarts.plainPointedHat + " galleons" + "\nAnd we have " + gm.hogwarts.quantity + " available on stock");
    }
    public void uniform3() {
        gm.ui.messageText.setText("This item costs " + gm.hogwarts.protectiveGloves + " galleons" + "\nAnd we have " + gm.hogwarts.quantity + " available on stock");
    }

    public void uniform4() {
        gm.ui.messageText.setText("This item costs " + gm.hogwarts.winterCloak + " galleons" + "\nAnd we have " + gm.hogwarts.quantity + " available on stock");
    }

    public void book1() {
        gm.ui.messageText.setText("Books prices are generated random\nIf you want to finish the transaction click BUY\nThe price for this book is " + gm.hogwarts.book1 + " galleons");
    }
    public void book2() {
        gm.ui.messageText.setText("Books prices are generated random\nIf you want to finish the transaction click BUY\nThe price for this book is " + gm.hogwarts.book2 + " galleons");
    }
    public void book3() {
        gm.ui.messageText.setText("Books prices are generated random\nIf you want to finish the transaction click BUY\nThe price for this book is " + gm.hogwarts.book3 + " galleons");
    }
    public void book4() {
        gm.ui.messageText.setText("Books prices are generated random\nIf you want to finish the transaction click BUY\nThe price for this book is " + gm.hogwarts.book4 + " galleons");
    }
    public void book5() {
        gm.ui.messageText.setText("Books prices are generated random\nIf you want to finish the transaction click BUY\nThe price for this book is " + gm.hogwarts.book5 + " galleons");
    }
    public void book6() {
        gm.ui.messageText.setText("Books prices are generated random\nIf you want to finish the transaction click BUY\nThe price for this book is " + gm.hogwarts.book6 + " galleons");
    }
    public void book7() {
        gm.ui.messageText.setText("Books prices are generated random\nIf you want to finish the transaction click BUY\nThe price for this book is " + gm.hogwarts.book7 + " galleons");
    }
    public void book8() {
        gm.ui.messageText.setText("Books prices are generated random\nIf you want to finish the transaction click BUY\nThe price for this book is " + gm.hogwarts.book8 + " galleons");
    }

    public void item1() {
        gm.ui.messageText.setText("Items prices are generated random\nIf you want to finish the transaction click BUY\nThe price for this item is " + gm.hogwarts.item1 + " galleons");
    }
    public void item2() {
        gm.ui.messageText.setText("Items prices are generated random\nIf you want to finish the transaction click BUY\nThe price for this item is " + gm.hogwarts.item2 + " galleons");
    }
    public void item3() {
        gm.ui.messageText.setText("Items prices are generated random\nIf you want to finish the transaction click BUY\nThe price for this item is " + gm.hogwarts.item3 + " galleons");
    }
    public void item4() {
        gm.ui.messageText.setText("Items prices are generated random\nIf you want to finish the transaction click BUY\nThe price for this item is " + gm.hogwarts.item4 + " galleons");
    }
    public void item5() {
        gm.ui.messageText.setText("Items prices are generated random\nIf you want to finish the transaction click BUY\nThe price for this item is " + gm.hogwarts.item5 + " galleons");
    }


}
