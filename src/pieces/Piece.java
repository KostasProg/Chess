package pieces;

import java.awt.*;

public class Piece {
    private int x,y;
    private String type;
    private Image piece_img;

    public Piece(int x, int y, String type, Image piece_img) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.piece_img = piece_img;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getType() {
        return type;
    }

    public Image getPiece_img() {
        return piece_img;
    }
    public void setPosition(int x,int y){
        this.x=x;
        this.y=y;
    }
    public  boolean apropriateMove(){return false;}
}
