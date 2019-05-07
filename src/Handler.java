import players.BlackClassicPieces;
import players.PiecesTier;
import players.WhiteClassicPieces;

import javax.swing.*;
import java.awt.*;

public class Handler {
    private Game game;
    private Board board;
    private PiecesTier player, opponent;
    private int selectedX = 4, selectedY = 5;
    private Image redSquare;

    public Handler(Game game) {
        this.game = game;
        board = new Board(game);
        player = new BlackClassicPieces("p");
        opponent = new WhiteClassicPieces("e");
        redSquare = new ImageIcon("Resources/props/redSquare.png").getImage();
    }

    public void render(Graphics g) {
        for (int x = 0; x <= 12; x++) {
            for (int y = 0; y <= 9; y++) {
                g.setColor(Color.black);
                g.fillRect(x * 100, y * 100, 100, 100);
            }
        }

        board.render(g);
        if (selectedX != -1 && selectedY != -1) {

            g.drawImage(redSquare, selectedX * 100, selectedY * 100, null);
        }
        opponent.render(g);
        player.render(g);
    }

    public void tick() {


    }

    public PiecesTier getPlayer() {
        return player;
    }

    public PiecesTier getOpponent() {
        return opponent;
    }

    public void setRedSquare(int x, int y) {
        selectedY = y;
        selectedX = x;
    }
}
