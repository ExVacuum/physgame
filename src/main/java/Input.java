import java.awt.*;
import java.awt.event.*;

public class Input implements KeyListener, MouseListener, MouseWheelListener, MouseMotionListener {

    //Mouse location
    Point mouseLocation = new Point(0,0);

    /**
     * Create a new input handler, which contains keyboard and mouse listeners.
     */
    public Input(){
        Game.game.addKeyListener(this);
        Game.game.addMouseListener(this);
        Game.game.addMouseWheelListener(this);
        Game.game.addMouseMotionListener(this);
    }

    /**
     * Updates mouse location, taking window insets into account.
     */
    public void update(){
        mouseLocation.setLocation(MouseInfo.getPointerInfo().getLocation().getX()-Game.game.getLocationOnScreen().getX()-Game.game.insets.left,
                MouseInfo.getPointerInfo().getLocation().getY()-Game.game.getLocationOnScreen().getY()-Game.game.insets.top);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

        //Check for button presses
        for (int i = 0; i < Game.game.buttons.size(); i++){
            MButton b = Game.game.buttons.get(i);
            if(b.containsMouse()){
                b.performAction();
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
    }
}
