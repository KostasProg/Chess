package players;

import pieces.Piece;

import java.awt.*;
import java.util.Vector;

public class PiecesTier {
private Vector<Piece> pieces;

    public PiecesTier() {
        this.pieces = new Vector<Piece>();
    }
    public void addPiece(Piece piece){
        pieces.add(piece);
    }
    public void render(Graphics graphics){
        for(Piece piece:pieces){
            graphics.drawImage(piece.getPiece_img(),piece.getX()*100,piece.getY()*100,null);
        }
    }

    public Vector<Piece> getPieces() {
        return pieces;
    }
}
