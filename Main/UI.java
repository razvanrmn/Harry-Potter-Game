package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

// Toate elementele grafice o sa fie in aceasta clasa
public class UI {

    GameManager gm;
    JFrame window;
    public JTextArea messageText;
    // Le-am pus de tip array pentru a stroca mai multe imagini de fundal
    ArrayList <JPanel> bgPanel = new ArrayList<>();
    ArrayList <JLabel> bgLabel = new ArrayList<>();

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
        bgPanel.add(new JPanel());
        bgPanel.get(bgNum).setBounds(50,50,700,350);
        bgPanel.get(bgNum).setBackground(Color.pink);
        bgPanel.get(bgNum).setLayout(null);
        window.add(bgPanel.get(bgNum));

        bgLabel.add(new JLabel());
        bgLabel.get(bgNum).setBounds(0,0,700, 350);

        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));
        bgLabel.get(bgNum).setIcon(bgIcon);
    }

    public void createStart(int bgNum, int x, int y, int width, int height, String objFilenameI) {

        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(x,y,width,height);
        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFilenameI));
        objectLabel.setIcon(objectIcon);

        objectLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                gm.actChanger.showActII();
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
        bgPanel.get(bgNum).add(objectLabel);

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

        bgPanel.get(bgNum).add(nextButton);
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
        bgPanel.get(bgNum).add(objectLabel);

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
        bgPanel.get(bgNum).add(objectLabel);

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
        bgPanel.get(bgNum).add(objectLabel);
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
        bgPanel.get(bgNum).add(objectLabel);
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
        bgPanel.get(bgNum).add(objectLabel);
    }

    public void login(int bgNum, int x, int y, int width, int height) {

        JLabel usernameLabel = new JLabel();
        usernameLabel.setBounds(220,100,200,200);
        usernameLabel.setText("USERNAME");
        usernameLabel.setForeground(Color.PINK);
        JLabel passLabel = new JLabel();
        passLabel.setBounds(220,150,200,200);
        passLabel.setText("PASSWORD");
        passLabel.setForeground(Color.PINK);

        JTextField user = new JTextField(15);
        user.setBounds(300,190,100,20);
        user.setBackground(Color.black);
        user.setForeground(Color.pink);


        JPasswordField pass = new JPasswordField(15);
        pass.setBounds(300, 240, 100,20);
        pass.setBackground(Color.black);
        pass.setForeground(Color.pink);

        JButton submit = new JButton("SUBMIT");
        submit.setBounds(300,330,100,20);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setBorderPainted(false);
        submit.setFocusPainted(false);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userValue = user.getText();
                String passValue = String.valueOf(pass.getPassword());

                if ((userValue.isEmpty()) && (userValue.isBlank())){
                    gm.ui.messageText.setText("ENTER USERNAME");
                }

                else if ((passValue.isEmpty() && (passValue.isBlank()))) {
                    gm.ui.messageText.setText("ENTER PASSWORD");
                }
                else
                    gm.actChanger.showActI();
            }
        });
        bgPanel.get(bgNum).add(usernameLabel);
        bgPanel.get(bgNum).add(passLabel);
        bgPanel.get(bgNum).add(user);
        bgPanel.get(bgNum).add(pass);
        bgPanel.get(bgNum).add(submit);

    }

    public void generateScene() {

        //PROLOGUE
        createBackground(0, "loginpic.jpg");
        login(0, 300,30,700,350);
        bgPanel.get(0).add(bgLabel.get(0));

        // ACT 1
        createBackground(1,"main700350.png");
        createStart(1, 540, 150, 200, 200, "wizard.png");
        bgPanel.get(1).add(bgLabel.get(1));

        // ACT 2
        createBackground(2,"letter.jpg");
        createNextButton(2,650,150,50,50, "goldensnitch.png", "goToActIII");
        bgPanel.get(2).add(bgLabel.get(2));

        // ACT 2
        createBackground(3,"express.jpg");
        createNextButton(3,650,150,50,50, "goldensnitch.png", "goToActIV");
        bgPanel.get(3).add(bgLabel.get(3));

        // ACT 3
        createBackground(4,"alley.jpg");
        createNextButton(4,650,150,50,50, "goldensnitch.png", "goToActV");
        bgPanel.get(4).add(bgLabel.get(4));

        // ACT 4 Shopping
        createBackground(5, "fundalshop.jpg");
        createShop(5, 250, 150, 200 ,200, "nif.png", "UNIFORMS", "UNIFORMS", "SETBOOKS", "SETBOOKS", "EQUIPMENT", "EQUIPMENT", "LEAVE", "LEAVE");
        bgPanel.get(5).add(bgLabel.get(5));

        // ACT 4 Uniforms
        createBackground(6, "fundalshop.jpg");
        uniforms(6, 250, 150, 200 ,200, "rsz_robes.png", "Plain work robes", "Plain work robes", "Plain pointed hat", "Plain pointed hat", "Protective gloves", "Protective gloves", "Winter cloak", "Winter cloak", "RETURN", "RETURN");
        bgPanel.get(6).add(bgLabel.get(6));

        // ACT 4 BUY UNIFORMS
        createBackground(7, "fundalshop.jpg");
        quantityPrice(7, 250, 150, 200 ,200, "rsz_robes.png", "BUY", "BUY", "BACK", "BACK");
        bgPanel.get(7).add(bgLabel.get(7));

        //ACT 4 Books
        createBackground(8, "fundalshop.jpg");
        books(8, 250, 150, 200 ,200, "rsz_books.png", "The Standard Book of Spells (GRADE 1)", "The Standard Book of Spells (GRADE 1)", "A History of Magic", "A History of Magic", "Magical Theory", "Magical Theory", "A Beginner's Guide to Transfiguration", "A Beginner's Guide to Transfiguration", "One Thousand Magical Herbs and Fungi", "One Thousand Magical Herbs and Fungi", "Magical Drafts and Potions", "Magical Drafts and Potions", "Fantastic Beasts and Where to Find Them", "Fantastic Beasts and Where to Find Them", "The Dark Forces: A Guide to Self-Protection", "The Dark Forces: A Guide to Self-Protection", "RETURN", "RETURN");
        bgPanel.get(8).add(bgLabel.get(8));

        // ACT 4 BUY BOOKS
        createBackground(9, "fundalshop.jpg");
        quantityPrice(9, 250, 150, 200 ,200, "rsz_books.png", "BUY", "BUYBOOK", "BACK", "BACKBOOK");
        bgPanel.get(9).add(bgLabel.get(9));

        //ACT 4 ITEMS
        createBackground(10, "fundalshop.jpg");
        items(10, 250, 150, 200 ,200, "rsz_1items.png", "Wand", "Wand", "Cauldron (pewter, standard size 2)", "Cauldron (pewter, standard size 2)", "Set of glass or crystal phials", "Set of glass or crystal phials", "Telescope", "Telescope", "Set of brass scales", "Set of brass scales", "RETURN", "RETURN");
        bgPanel.get(10).add(bgLabel.get(10));

        // ACT 4 BUY ITEMS
        createBackground(11, "fundalshop.jpg");
        quantityPrice(11, 250, 150, 200 ,200, "rsz_1items.png", "BUY", "BUYITEMS", "BACK", "BACKITEMS");
        bgPanel.get(11).add(bgLabel.get(11));

        // ACT 5 Diagon alley
        createBackground(12,"bankk.jpg");
        createNextButton(12,650,150,50,50, "goldensnitch.png", "goToActVII");
        bgPanel.get(12).add(bgLabel.get(12));




    }
}
