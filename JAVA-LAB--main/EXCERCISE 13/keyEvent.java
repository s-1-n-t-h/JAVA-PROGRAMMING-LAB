import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/*<applet code='keyEvent' width=300 height=300></applet>*/
public class keyEvent extends Applet implements KeyListener
{
    int x=20,y=30;
    String msg = "";
    public void init()
    {
        addKeyListener(this);
        //requestFocus();
    }
    public void keyPressed(KeyEvent k)
    {
        showStatus("Key Pressed");
        msg = "Key Pressed";
        repaint();
    }
    public void keyReleased(KeyEvent k)
    {
        showStatus("Key Released");
        msg = "Key Released";
        repaint();
    }
    public void keyTyped(KeyEvent k)
    {
        showStatus("Key Typed");
        msg = "Key Typed";
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,x,y);
    }
}