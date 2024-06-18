import java.awt.*;
import javax.swing.*;

class GameFrame extends JFrame{

    GamePanel panel; 
    GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack(); // adjusts the frame according to the panel.
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        


    }
}