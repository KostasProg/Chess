import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Boot {
    private JFrame frame;
    private Game game;
    private Dimension dimension;

    public Boot() {
        dimension=new Dimension(1100,1000);
        frame=new JFrame("Chaotic Chess");
        frame.setPreferredSize(dimension);
        frame.setSize(dimension);
        frame.setMaximumSize(dimension);
        frame.setMinimumSize(dimension);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        game=new Game(dimension,frame);
        frame.add(game);
        frame.setVisible(true);
         game.start();

    }

    public static void main(String[] args) {
        new Boot();
    }
}
