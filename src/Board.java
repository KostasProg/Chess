import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Board {
    private int x = 8, y = 8;
    private Image green_img, white_img;
    private Game game;
    private int c = 0;

    public Board(Game game) {
        this.green_img = new ImageIcon("Resources/Board/classic/green .png").getImage();
        this.white_img = new ImageIcon("Resources/Board/classic/white.png").getImage();
        this.game = game;
    }

    public void render(Graphics g) {
        for (int i = 1; i <= 8; i++) {

            for (int j = 1; j <= 8; j++) {

                if (i==j || i==j+2 || i==j+4 || i==j+6|| i==j-2 || i==j-4 || i==j-6) {

                    g.drawImage(white_img, i * 100, j * 100, game);
                }else{
                g.drawImage(green_img, i * 100, j * 100, game);}
            }
        }
    }

}

