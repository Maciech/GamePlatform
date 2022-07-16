import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelTestowy implements ActionListener {
    private final JButton b1=new JButton("Button 1");
    private final JButton b2=new JButton("Button 2");
    private boolean windowMenu = true;
    PanelTestowy(){
        JFrame f= new JFrame("Panel Testowy");
        JPanel panel=new JPanel();
        panel.setBounds(20,120,250,250);
        panel.setBackground(Color.blue);

        b1.setBounds(50,100,80,30);
        b1.setBackground(Color.yellow);

        b2.setBounds(100,100,80,30);
        b2.setBackground(Color.green);
        panel.add(b1); panel.add(b2);
        if (windowMenu) {
            f.add(panel);
            f.setSize(400, 400);
            f.setLayout(null);
            f.setVisible(true);
            f.setBackground(Color.pink);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
