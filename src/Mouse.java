import pieces.Piece;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse implements MouseListener {
    private Game game;
    private Handler handler;
    private Piece selectedPiece = null;
    private boolean selected = false;


    public Mouse(Game game, Handler handler) {
        this.game = game;
        this.handler = handler;

    }

    private void updateAI() {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        handler.setRedSquare(x/100,y/100);


    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        for (Piece piece : handler.getPlayer().getPieces()) {
            if (x / 100 == piece.getX() && y / 100 == piece.getY()) {
                System.out.println(piece.getType());
                selectedPiece = piece;



                break;


            }
    }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int x=e.getX();
        int y=e.getY();
        selectedPiece.setPosition(x/100,y/100);
        selectedPiece=null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}
