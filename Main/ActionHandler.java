package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

    GameManager gm;

    public ActionHandler(GameManager gm) {
        this.gm = gm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String yourChoice = e.getActionCommand();
        switch (yourChoice) {

            case "goToActII" :
                gm.actChanger.showActII();
            break;
            case "goToActIII" : gm.actChanger.showActIII();
            break;
            case "goToActIV" : gm.actChanger.showActIV();
            break;
            case "goToActV" : gm.actChanger.showActV();
            break;
            case "LEAVE" : gm.actChanger.showActVI();
            break;
            case "UNIFORMS" : gm.actChanger.showUniforms();
            break;
            case "RETURN" : gm.actChanger.showActV();
            break;
            case "Plain work robes" :
                gm.actChanger.showPlain();
                gm.actChanger.uniform1();
                break;
            case "Plain pointed hat" :
                gm.actChanger.showPlain();
                gm.actChanger.uniform2();
                break;
            case "Protective gloves" :
                gm.actChanger.showPlain();
                gm.actChanger.uniform3();
                break;
            case "Winter cloak" :
                gm.actChanger.showPlain();
                gm.actChanger.uniform4();
                break;

            case "BUY" :
                if (gm.hogwarts.getGalleon() < Hogwarts.plainWorkRobes)
                {
                    gm.ui.messageText.setText("You don't have enough money");
                }
                if (gm.hogwarts.getGalleon() < Hogwarts.plainPointedHat)
                {
                    gm.ui.messageText.setText("You don't have enough money");
                }
                if (gm.hogwarts.getGalleon() < Hogwarts.winterCloak)
                {
                    gm.ui.messageText.setText("You don't have enough money");
                }
                else {
                    gm.hogwarts.purchase(Hogwarts.plainWorkRobes);
                    gm.ui.messageText.setText("Payment Successful");
                    gm.actChanger.showUniforms();
                }
                break;
            case "BACK" :
                gm.actChanger.showUniforms();
                break;
                //Carti

            case "SETBOOKS" :
                gm.actChanger.menuBooks();
                break;

            case "The Standard Book of Spells (GRADE 1)" :
                gm.actChanger.viewBooks();
                gm.actChanger.book1();
                break;
            case "A History of Magic" :
                gm.actChanger.viewBooks();
                gm.actChanger.book2();
                break;
            case "Magical Theory" :
                gm.actChanger.viewBooks();
                gm.actChanger.book3();
                break;
            case "A Beginner's Guide to Transfiguration" :
                gm.actChanger.viewBooks();
                gm.actChanger.book4();
                break;
            case "One Thousand Magical Herbs and Fungi" :
                gm.actChanger.viewBooks();
                gm.actChanger.book5();
                break;
            case "Magical Drafts and Potions" :
                gm.actChanger.viewBooks();
                gm.actChanger.book6();
                break;
            case "Fantastic Beasts and Where to Find Them" :
                gm.actChanger.viewBooks();
                gm.actChanger.book7();
                break;
            case "The Dark Forces: A Guide to Self-Protection" :
                gm.actChanger.viewBooks();
                gm.actChanger.book8();
                break;

            case "BUYBOOK" :
                if (gm.hogwarts.getGalleon() < gm.hogwarts.book1)
                {
                    gm.ui.messageText.setText("You don't have enough money");
                }
                else {
                    gm.hogwarts.purchase(gm.hogwarts.book1);
                    gm.ui.messageText.setText("Payment Successful");
                    gm.ui.messageText.setText("You have " + gm.hogwarts.getGalleon() + " left in your bank account");
                };

                if (gm.hogwarts.getGalleon() < gm.hogwarts.book2)
                {
                    gm.ui.messageText.setText("You don't have enough money");
                }
                else {
                    gm.hogwarts.purchase(gm.hogwarts.book2);
                    gm.ui.messageText.setText("Payment Successful");
                    gm.ui.messageText.setText("You have " + gm.hogwarts.getGalleon() + " left in your bank account");
                };

                if (gm.hogwarts.getGalleon() < gm.hogwarts.book3)
                {
                    gm.ui.messageText.setText("You don't have enough money");
                }
                else {
                    gm.hogwarts.purchase(gm.hogwarts.book3);
                    gm.ui.messageText.setText("Payment Successful");
                    gm.ui.messageText.setText("You have " + gm.hogwarts.getGalleon() + " left in your bank account");
                };

                if (gm.hogwarts.getGalleon() < gm.hogwarts.book4)
                {
                    gm.ui.messageText.setText("You don't have enough money");
                }
                else {
                    gm.hogwarts.purchase(gm.hogwarts.book4);
                    gm.ui.messageText.setText("Payment Successful");
                    gm.ui.messageText.setText("You have " + gm.hogwarts.getGalleon() + " left in your bank account");
                };

                if (gm.hogwarts.getGalleon() < gm.hogwarts.book5)
                {
                    gm.ui.messageText.setText("You don't have enough money");
                }
                else {
                    gm.hogwarts.purchase(gm.hogwarts.book5);
                    gm.ui.messageText.setText("Payment Successful");
                    gm.ui.messageText.setText("You have " + gm.hogwarts.getGalleon() + " left in your bank account");
                };

                if (gm.hogwarts.getGalleon() < gm.hogwarts.book6)
                {
                    gm.ui.messageText.setText("You don't have enough money");
                }
                else {
                    gm.hogwarts.purchase(gm.hogwarts.book6);
                    gm.ui.messageText.setText("Payment Successful");
                    gm.ui.messageText.setText("You have " + gm.hogwarts.getGalleon() + " left in your bank account");
                };

                if (gm.hogwarts.getGalleon() < gm.hogwarts.book7)
                {
                    gm.ui.messageText.setText("You don't have enough money");
                }
                else {
                    gm.hogwarts.purchase(gm.hogwarts.book7);
                    gm.ui.messageText.setText("Payment Successful");
                    gm.ui.messageText.setText("You have " + gm.hogwarts.getGalleon() + " left in your bank account");
                };

                if (gm.hogwarts.getGalleon() < gm.hogwarts.book8)
                {
                    gm.ui.messageText.setText("You don't have enough money");
                }
                else {
                    gm.hogwarts.purchase(gm.hogwarts.book8);
                    gm.ui.messageText.setText("Payment Successful");
                    gm.ui.messageText.setText("You have " + gm.hogwarts.getGalleon() + " left in your bank account");
                    gm.actChanger.menuBooks();
                };
                break;
            case "EQUIPMENT" :
                gm.actChanger.menuItems();
                break;
            case "BACKBOOK" :
                gm.actChanger.menuBooks();
                break;
            case "BACKITEMS" :
                gm.actChanger.menuItems();
                break;
            case "Wand" :
                gm.actChanger.viewItems();
                gm.actChanger.item1();
                break;
            case "Cauldron (pewter, standard size 2)" :
                gm.actChanger.viewItems();
                gm.actChanger.item2();
                break;
            case "Set of glass or crystal phials" :
                gm.actChanger.viewItems();
                gm.actChanger.item3();
                break;
            case "Telescope" :
                gm.actChanger.viewItems();
                gm.actChanger.item4();
                break;
            case "Set of brass scales" :
                gm.actChanger.viewItems();
                gm.actChanger.item5();
                break;
            case "BUYITEMS" :

        }


    }
}
