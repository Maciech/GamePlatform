import javax.swing.*;

public class GameFrameSnake extends JFrame {
    GameFrameSnake() {
        this.add(new GamePanelSnake());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
