package players;

import pieces.*;

import javax.swing.*;
import java.util.Vector;

public class BlackClassicPieces extends PiecesTier {

    public BlackClassicPieces(String vew) {
        super();
        switch (vew) {
            case "p":
                player_init();
                break;
            case "e":
                enemy_init();
                break;
        }


    }

    public void player_init() {
        int s = 0;
        while (s <= 7) {
            addPiece(new Soldier(s + 1, 7, "bSOLDIER", new ImageIcon("Resources/pieces/classic pieces/black/soldier.png").getImage()));
            s++;
        }
        addPiece(new Bishop(3, 8, "pBISHOP", new ImageIcon("Resources/pieces/classic pieces/black/bishop.png").getImage()));
        addPiece(new Bishop(6, 8, "pBISHOP", new ImageIcon("Resources/pieces/classic pieces/black/bishop.png").getImage()));

        addPiece(new Knight(2, 8, "pKNIGHT", new ImageIcon("Resources/pieces/classic pieces/black/knight.png").getImage()));
        addPiece(new Knight(7, 8, "pKNIGHT", new ImageIcon("Resources/pieces/classic pieces/black/knight.png").getImage()));

        addPiece(new Tower(1, 8, "pTOWER", new ImageIcon("Resources/pieces/classic pieces/black/tower.png").getImage()));
        addPiece(new Tower(8, 8, "pTOWER", new ImageIcon("Resources/pieces/classic pieces/black/tower.png").getImage()));

        addPiece(new Queen(5, 8, "pQUEEN", new ImageIcon("Resources/pieces/classic pieces/black/queen.png").getImage()));
        addPiece(new King(4, 8, "pKING", new ImageIcon("Resources/pieces/classic pieces/black/king.png").getImage()));
    }

    public void enemy_init() {
        int s = 0;
        while (s <= 7) {
            addPiece(new Soldier(s + 1, 2, "oSOLDIER", new ImageIcon("Resources/pieces/classic pieces/black/soldier.png").getImage()));
            s++;
        }
        addPiece(new Bishop(3, 1, "oBISHOP", new ImageIcon("Resources/pieces/classic pieces/black/bishop.png").getImage()));
        addPiece(new Bishop(6, 1, "oBISHOP", new ImageIcon("Resources/pieces/classic pieces/black/bishop.png").getImage()));

        addPiece(new Knight(2, 1, "oKNIGHT", new ImageIcon("Resources/pieces/classic pieces/black/knight.png").getImage()));
        addPiece(new Knight(7, 1, "oKNIGHT", new ImageIcon("Resources/pieces/classic pieces/black/knight.png").getImage()));

        addPiece(new Tower(1, 1, "oTOWER", new ImageIcon("Resources/pieces/classic pieces/black/tower.png").getImage()));
        addPiece(new Tower(8, 1, "oTOWER", new ImageIcon("Resources/pieces/classic pieces/black/tower.png").getImage()));

        addPiece(new Queen(5, 1, "oQUEEN", new ImageIcon("Resources/pieces/classic pieces/black/queen.png").getImage()));
        addPiece(new King(4, 1, "oKING", new ImageIcon("Resources/pieces/classic pieces/black/king.png").getImage()));
    }

}
