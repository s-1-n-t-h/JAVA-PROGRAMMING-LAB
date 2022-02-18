import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/*<applet code='cursorPosition' width=300 height=300></applet>*/
public class cursorPosition extends Applet implements MouseMotionListener 
{
    int x,y;
    String msg="";
    public void init()
    {
        addMouseMotionListener(this);
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,x,y);
    }
    public void mouseMoved(MouseEvent m)
    {
        x=m.getX();y=m.getY();
        msg = "Mouse Moved "+x+","+y;
        repaint();
    }
    public void mouseDragged(MouseEvent m)
    {
        x = m.getX();
        y = m.getY();
        msg = "Mouse Dragged " + x + "," + y;
        repaint();
    }
}