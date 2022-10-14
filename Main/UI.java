package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// Toate elementele grafice o sa fie in aceasta clasa
public class UI {

    GameManager gm;
    JFrame window;
    public JTextArea messageText;
    // Le-am pus de tip array pentru a stroca mai multe imagini de fundal
    public JPanel bgPanel[] = new JPanel[50];
    public JLabel bgLabel[] = new JLabel[50];
    public UI(GameManager gm) {
        this.gm = gm;
        createMainField();
        generateScene();
        window.setVisible(true);
    }

    //Aici se instantiaza fereasta
    public void createMainField () {
        // Fereasta principala
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);

        // Text area
        messageText = new JTextArea();
        messageText.setBounds(50,410,700,150);
        messageText.setBackground(Color.black);
        messageText.setForeground(Color.white);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Book Antiqua", Font.PLAIN, 26));
        window.add(messageText);

    }

    public void createBackground(int bgNum, String bgFileName) {
        bgPanel[bgNum] = new JPanel();
        bgPanel[bgNum].setBounds(50,50,700,350);
        bgPanel[bgNum].setBackground(Color.pink);
        bgPanel[bgNum].setLayout(null);
        window.add(bgPanel[bgNum]);

        bgLabel[bgNum] = new JLabel();
        bgLabel[bgNum].setBounds(0,0,700, 350);

        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));
        bgLabel[bgNum].setIcon(bgIcon);


    }

    public void createObject(int bgNum, int x, int y, int width, int height, String objFilenameI, String choice1, String choice1Command) {

        // Creeare meniu pop
        JPopupMenu popMenu = new JPopupMenu();

        // Creeare meniu optiuni
        JMenuItem menuItem[] = new JMenuItem[1];
        menuItem[0] = new JMenuItem(choice1);
        menuItem[0].addActionListener(gm.actionHandler);
        menuItem[0].setActionCommand(choice1Command);
        popMenu.add(menuItem[0]);


        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(x,y,width,height);
        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFilenameI));
        objectLabel.setIcon(objectIcon);

        objectLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popMenu.show(objectLabel, e.getX(), e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        bgPanel[bgNum].add(objectLabel);

    }

    public void createNextButton(int bgNum, int x, int y, int width, int height, String bgFileName, String command) {
        ImageIcon nextIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));

        JButton nextButton = new JButton();
        nextButton.setBounds(x,y,width,height);
        nextButton.setBackground(null);
        nextButton.setContentAreaFilled(false);
        nextButton.setFocusPainted(false);
        nextButton.addActionListener(gm.actionHandler);
        nextButton.setActionCommand(command);
        nextButton.setBorderPainted(false);
        nextButton.setIcon(nextIcon);

        bgPanel[bgNum].add(nextButton);
    }
    public void createShop(int bgNum, int x, int y, int width, int height, String objFilenameI, String choice1, String choice1Command, String choice2, String choice2Command, String choice3, String choice3Command, String choice4, String choice4Command) {

        // Creeare meniu pop
        JPopupMenu popMenu = new JPopupMenu();

        // Creeare meniu optiuni
        JMenuItem menuItem[] = new JMenuItem[4];
        menuItem[0] = new JMenuItem(choice1);
        menuItem[0].addActionListener(gm.actionHandler);
        menuItem[0].setActionCommand(choice1Command);
        popMenu.add(menuItem[0]);

        menuItem[1] = new JMenuItem(choice2);
        menuItem[1].addActionListener(gm.actionHandler);
        menuItem[1].setActionCommand(choice2Command);
        popMenu.add(menuItem[1]);

        menuItem[2] = new JMenuItem(choice3);
        menuItem[2].addActionListener(gm.actionHandler);
        menuItem[2].setActionCommand(choice3Command);
        popMenu.add(menuItem[2]);

        menuItem[3] = new JMenuItem(choice4);
        menuItem[3].addActionListener(gm.actionHandler);
        menuItem[3].setActionCommand(choice4Command);
        popMenu.add(menuItem[3]);

        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(x,y,width,height);
        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFilenameI));
        objectLabel.setIcon(objectIcon);

        objectLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popMenu.show(objectLabel, e.getX(), e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        bgPanel[bgNum].add(objectLabel);

    }

    public void uniforms(int bgNum, int x, int y, int width, int height, String objFilenameI, String choice1, String choice1Command, String choice2, String choice2Command, String choice3, String choice3Command, String choice4, String choice4Command, String choice5, String choice5Command) {

        // Creeare meniu pop
        JPopupMenu popMenu = new JPopupMenu();

        // Creeare meniu optiuni
        JMenuItem menuItem[] = new JMenuItem[6];
        menuItem[0] = new JMenuItem(choice1);
        menuItem[0].addActionListener(gm.actionHandler);
        menuItem[0].setActionCommand(choice1Command);
        popMenu.add(menuItem[0]);

        menuItem[1] = new JMenuItem(choice2);
        menuItem[1].addActionListener(gm.actionHandler);
        menuItem[1].setActionCommand(choice2Command);
        popMenu.add(menuItem[1]);

        menuItem[2] = new JMenuItem(choice3);
        menuItem[2].addActionListener(gm.actionHandler);
        menuItem[2].setActionCommand(choice3Command);
        popMenu.add(menuItem[2]);

        menuItem[3] = new JMenuItem(choice4);
        menuItem[3].addActionListener(gm.actionHandler);
        menuItem[3].setActionCommand(choice4Command);
        popMenu.add(menuItem[3]);

        menuItem[4] = new JMenuItem(choice5);
        menuItem[4].addActionListener(gm.actionHandler);
        menuItem[4].setActionCommand(choice5Command);
        popMenu.add(menuItem[4]);

        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(x,y,width,height);
        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFilenameI));
        objectLabel.setIcon(objectIcon);

        objectLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popMenu.show(objectLabel, e.getX(), e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        bgPanel[bgNum].add(objectLabel);

    }

    public void quantityPrice(int bgNum, int x, int y, int width, int height, String objFilenameI, String choice1, String choice1Command, String choice2, String choice2Command) {

        // Creeare meniu pop
        JPopupMenu popMenu = new JPopupMenu();

        // Creeare meniu optiuni
        JMenuItem menuItem[] = new JMenuItem[6];
        menuItem[0] = new JMenuItem(choice1);
        menuItem[0].addActionListener(gm.actionHandler);
        menuItem[0].setActionCommand(choice1Command);
        popMenu.add(menuItem[0]);

        menuItem[1] = new JMenuItem(choice2);
        menuItem[1].addActionListener(gm.actionHandler);
        menuItem[1].setActionCommand(choice2Command);
        popMenu.add(menuItem[1]);


        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(x,y,width,height);
        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFilenameI));
        objectLabel.setIcon(objectIcon);

        objectLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popMenu.show(objectLabel, e.getX(), e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        bgPanel[bgNum].add(objectLabel);
    }

    public void books (int bgNum, int x, int y, int width, int height, String objFilenameI, String choice1, String choice1Command, String choice2, String choice2Command, String choice3, String choice3Command, String choice4, String choice4Command, String choice5, String choice5Command, String choice6, String choice6Command, String choice7, String choice7Command, String choice8, String choice8Command, String choice9, String choice9Command) {
        // Creeare meniu pop
        JPopupMenu popMenu = new JPopupMenu();

        // Creeare meniu optiuni
        JMenuItem menuItem[] = new JMenuItem[10];
        menuItem[0] = new JMenuItem(choice1);
        menuItem[0].addActionListener(gm.actionHandler);
        menuItem[0].setActionCommand(choice1Command);
        popMenu.add(menuItem[0]);

        menuItem[1] = new JMenuItem(choice2);
        menuItem[1].addActionListener(gm.actionHandler);
        menuItem[1].setActionCommand(choice2Command);
        popMenu.add(menuItem[1]);

        menuItem[2] = new JMenuItem(choice2);
        menuItem[2].addActionListener(gm.actionHandler);
        menuItem[2].setActionCommand(choice2Command);
        popMenu.add(menuItem[1]);

        menuItem[3] = new JMenuItem(choice3);
        menuItem[3].addActionListener(gm.actionHandler);
        menuItem[3].setActionCommand(choice3Command);
        popMenu.add(menuItem[3]);

        menuItem[4] = new JMenuItem(choice4);
        menuItem[4].addActionListener(gm.actionHandler);
        menuItem[4].setActionCommand(choice4Command);
        popMenu.add(menuItem[4]);

        menuItem[5] = new JMenuItem(choice5);
        menuItem[4].addActionListener(gm.actionHandler);
        menuItem[5].setActionCommand(choice5Command);
        popMenu.add(menuItem[5]);

        menuItem[6] = new JMenuItem(choice6);
        menuItem[6].addActionListener(gm.actionHandler);
        menuItem[6].setActionCommand(choice6Command);
        popMenu.add(menuItem[6]);

        menuItem[7] = new JMenuItem(choice7);
        menuItem[7].addActionListener(gm.actionHandler);
        menuItem[7].setActionCommand(choice7Command);
        popMenu.add(menuItem[7]);

        menuItem[8] = new JMenuItem(choice8);
        menuItem[8].addActionListener(gm.actionHandler);
        menuItem[8].setActionCommand(choice8Command);
        popMenu.add(menuItem[8]);

        menuItem[9] = new JMenuItem(choice9);
        menuItem[9].addActionListener(gm.actionHandler);
        menuItem[9].setActionCommand(choice9Command);
        popMenu.add(menuItem[9]);


        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(x,y,width,height);
        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFilenameI));
        objectLabel.setIcon(objectIcon);

        objectLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popMenu.show(objectLabel, e.getX(), e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        bgPanel[bgNum].add(objectLabel);
    }

    public void items(int bgNum, int x, int y, int width, int height, String objFilenameI, String choice1, String choice1Command, String choice2, String choice2Command, String choice3, String choice3Command, String choice4, String choice4Command, String choice5, String choice5Command, String choice6, String choice6Command) {

        // Creeare meniu pop
        JPopupMenu popMenu = new JPopupMenu();

        // Creeare meniu optiuni
        JMenuItem menuItem[] = new JMenuItem[7];
        menuItem[0] = new JMenuItem(choice1);
        menuItem[0].addActionListener(gm.actionHandler);
        menuItem[0].setActionCommand(choice1Command);
        popMenu.add(menuItem[0]);

        menuItem[1] = new JMenuItem(choice2);
        menuItem[1].addActionListener(gm.actionHandler);
        menuItem[1].setActionCommand(choice2Command);
        popMenu.add(menuItem[1]);

        menuItem[2] = new JMenuItem(choice3);
        menuItem[2].addActionListener(gm.actionHandler);
        menuItem[2].setActionCommand(choice3Command);
        popMenu.add(menuItem[2]);

        menuItem[3] = new JMenuItem(choice4);
        menuItem[3].addActionListener(gm.actionHandler);
        menuItem[3].setActionCommand(choice4Command);
        popMenu.add(menuItem[3]);

        menuItem[4] = new JMenuItem(choice5);
        menuItem[4].addActionListener(gm.actionHandler);
        menuItem[4].setActionCommand(choice5Command);
        popMenu.add(menuItem[4]);

        menuItem[4] = new JMenuItem(choice6);
        menuItem[4].addActionListener(gm.actionHandler);
        menuItem[4].setActionCommand(choice6Command);
        popMenu.add(menuItem[4]);

        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(x,y,width,height);
        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFilenameI));
        objectLabel.setIcon(objectIcon);

        objectLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popMenu.show(objectLabel, e.getX(), e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        bgPanel[bgNum].add(objectLabel);
    }
    public void generateScene() {

        // PROLOGUE
        createBackground(1,"main700350.png");
        createObject(1, 540, 150, 200, 200, "wizard.png", "START", "START");
        bgPanel[1].add(bgLabel[1]);
        // ACT 1
        createBackground(2,"letter.jpg");
        createNextButton(2,650,150,50,50, "goldensnitch.png", "goToActIII");
        bgPanel[2].add(bgLabel[2]);

        // ACT 2
        createBackground(3,"express.jpg");
        createNextButton(3,650,150,50,50, "goldensnitch.png", "goToActIV");
        bgPanel[3].add(bgLabel[3]);

        // ACT 3
        createBackground(4,"alley.jpg");
        createNextButton(4,650,150,50,50, "goldensnitch.png", "goToActV");
        bgPanel[4].add(bgLabel[4]);

        // ACT 4 Shopping
        createBackground(5, "fundalshop.jpg");
        createShop(5, 250, 150, 200 ,200, "nif.png", "UNIFORMS", "UNIFORMS", "SETBOOKS", "SETBOOKS", "EQUIPMENT", "EQUIPMENT", "LEAVE", "LEAVE");
        bgPanel[5].add(bgLabel[5]);

        // ACT 4 Uniforms
        createBackground(6, "fundalshop.jpg");
        uniforms(6, 250, 150, 200 ,200, "rsz_robes.png", "Plain work robes", "Plain work robes", "Plain pointed hat", "Plain pointed hat", "Protective gloves", "Protective gloves", "Winter cloak", "Winter cloak", "RETURN", "RETURN");
        bgPanel[6].add(bgLabel[6]);

        // ACT 4 BUY UNIFORMS
        createBackground(7, "fundalshop.jpg");
        quantityPrice(7, 250, 150, 200 ,200, "rsz_robes.png", "BUY", "BUY", "BACK", "BACK");
        bgPanel[7].add(bgLabel[7]);

        //ACT 4 Books
        createBackground(8, "fundalshop.jpg");
        books(8, 250, 150, 200 ,200, "rsz_books.png", "The Standard Book of Spells (GRADE 1)", "The Standard Book of Spells (GRADE 1)", "A History of Magic", "A History of Magic", "Magical Theory", "Magical Theory", "A Beginner's Guide to Transfiguration", "A Beginner's Guide to Transfiguration", "One Thousand Magical Herbs and Fungi", "One Thousand Magical Herbs and Fungi", "Magical Drafts and Potions", "Magical Drafts and Potions", "Fantastic Beasts and Where to Find Them", "Fantastic Beasts and Where to Find Them", "The Dark Forces: A Guide to Self-Protection", "The Dark Forces: A Guide to Self-Protection", "RETURN", "RETURN");
        bgPanel[8].add(bgLabel[8]);

        // ACT 4 BUY BOOKS
        createBackground(9, "fundalshop.jpg");
        quantityPrice(9, 250, 150, 200 ,200, "rsz_books.png", "BUY", "BUYBOOK", "BACK", "BACKBOOK");
        bgPanel[9].add(bgLabel[9]);

        //ACT 4 ITEMS
        createBackground(10, "fundalshop.jpg");
        items(10, 250, 150, 200 ,200, "rsz_1items.png", "Wand", "Wand", "Cauldron (pewter, standard size 2)", "Cauldron (pewter, standard size 2)", "Set of glass or crystal phials", "Set of glass or crystal phials", "Telescope", "Telescope", "Set of brass scales", "Set of brass scales", "RETURN", "RETURN");
        bgPanel[10].add(bgLabel[10]);

        // ACT 4 BUY ITEMS
        createBackground(11, "fundalshop.jpg");
        quantityPrice(11, 250, 150, 200 ,200, "rsz_1items.png", "BUY", "BUYBOOK", "BACK", "BACKITEMS");
        bgPanel[11].add(bgLabel[11]);

        // ACT 5 Diagon alley
        createBackground(12,"bankk.jpg");
        createNextButton(12,650,150,50,50, "goldensnitch.png", "goToActVII");
        bgPanel[12].add(bgLabel[12]);


    }
}
