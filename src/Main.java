import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

public class Main {
    public static int status;

    public static class PanelExample implements ActionListener {
        private final JButton b1 = new JButton("Snake");
        private final JButton b2 = new JButton("Saper");
        private final  JButton b3 = new JButton("Login");
        private final JButton b4 = new JButton("I already have an account");
        private final JButton b5 = new JButton("I want to create an account");
        private final  JButton b6 = new JButton("Register");
        private final JPasswordField p2 = new JPasswordField("Password");
        private final JTextField p1 = new JTextField("Username");
        private final JLabel l1 = new JLabel("Login");
        private final JLabel l2 = new JLabel("Registration");
        private final JLabel l3 = new JLabel("Wrong login or password");


        boolean mainMenu = true;
        private final int WIDTH = 400;
        private final int HEIGHT = 400;

        PanelExample(){
                JFrame f = new JFrame("Login");
                JPanel panel = new JPanel();
                panel.setLayout(null);
                //panel.setBounds(WIDTH/8,HEIGHT/8,WIDTH-(2*WIDTH/8),(HEIGHT-(3*HEIGHT/10)));
                panel.setBounds(0,0,WIDTH,HEIGHT);
                panel.setBorder(BorderFactory.createEtchedBorder(Color.black, Color.red));
                panel.setBackground(Color.lightGray);

                l1.setBounds(10,10, 350,30);
                l1.setFont(new Font("Courier",Font.BOLD,28));

                b3.setBounds(10,150,240,40);
                b3.setBackground(Color.yellow);
                b3.addActionListener(e -> {
                    String username = p1.getText();
                    String password = String.valueOf(p2.getPassword());
                    BazaUzytkownikow bazaUzytkownikow = new BazaUzytkownikow();
                    try {
                        bazaUzytkownikow.Read(username,password);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                   //new GameFrameSnake();
                });
                //b4.setBounds(10,150,240,30);
                b5.setBounds(10,200,240,40);
                b5.addActionListener(e -> {
                    f.dispose();
                    registerView();
                });

                panel.add(b3);
                panel.add(b5);
                panel.add(l1);
                //panel.add(l2);

                p1.setBounds(10,50,240,40);
                p1.setBackground(Color.gray);
                panel.add(p1);
                p1.getText();
                System.out.println(p1);

                p2.setBounds(10,100,240,40);
                p2.setBackground(Color.gray);
                panel.add(p2);

            if (status == 1){
                l3.setBounds(50,300,250,60);
                l3.setFont(new Font("Courier",Font.BOLD,28));
                panel.add(l3);
                f.add(panel);
            }

                    f.setSize(WIDTH, HEIGHT);
                    f.setLayout(null);
                    f.setVisible(true);
                    f.setLocationRelativeTo(null);
                    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    f.add(panel);
            }
        public void registerView(){
            JFrame f = new JFrame("Register");
            JPanel panel = new JPanel();
            panel.setLayout(null);
            f.setSize(WIDTH, HEIGHT);
            f.setLayout(null);
            f.setVisible(true);
            f.setLocationRelativeTo(null);
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            f.add(panel);

            panel.setBounds(0,0,WIDTH,HEIGHT);
            panel.setBorder(BorderFactory.createEtchedBorder(Color.black, Color.red));
            panel.setBackground(Color.lightGray);

            b6.setBounds(10,150,240,40);
            b6.setBackground(Color.yellow);
            b6.addActionListener(e -> {
                String username = p1.getText();
                String password = String.valueOf(p2.getPassword());
                BazaUzytkownikow bazaUzytkownikow = new BazaUzytkownikow();
                try {
                    bazaUzytkownikow.Write(username,password);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            });
            panel.add(b6);

            b4.setBounds(10,200,240,40);
            b4.addActionListener(e -> {
                f.dispose();
                new PanelExample();
            });
            panel.add(b4);
            p1.setBounds(10,50,240,40);
            p1.setBackground(Color.gray);
            panel.add(p1);
            p1.getText();
            System.out.println(p1);

            p2.setBounds(10,100,240,40);
            p2.setBackground(Color.gray);
            panel.add(p2);

            l2.setBounds(10,10,350,30);
            l2.setFont(new Font("Courier",Font.BOLD,28));
            panel.add(l2);

        }
        public void libraryView(){
            JFrame f = new JFrame("Library");
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBounds(0,0,2*WIDTH,2*HEIGHT);
            panel.setBorder(BorderFactory.createEtchedBorder(Color.black, Color.red));
            panel.setBackground(Color.lightGray);
            f.setSize(2*WIDTH, 2*HEIGHT);
            f.setLayout(null);
            f.setVisible(true);
            f.setLocationRelativeTo(null);
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            panel.add(b1);
            panel.add(b2);
            f.add(panel);

            b1.setBounds(200,50,400,200);
            b1.setBackground(Color.yellow);
            b1.setFont(new Font("Courier",Font.BOLD,30));
            b1.addActionListener(e -> {
                new GameFrameSnake();
                f.dispose();
            });

            b2.setBounds(200,350,400,200);
            b2.setBackground(Color.green);
            b2.setFont(new Font("Courier",Font.BOLD,30));
            b2.addActionListener(e -> {
                //new GameFrameSaper();
                f.dispose();
            });

        }
        @Override
        public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        e.getSource();
        if (source == b1){
            mainMenu = false;

            new PanelTestowy();
        }
        if(source == b2){
            System.out.println("kurrrr");
        }
        }
    }
    public static void main(String[] args) {

        new PanelExample();

    }
}