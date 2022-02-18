import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="Paint.class" width=500 height=500></applet>*/
public class Paint extends Applet implements MouseMotionListener
{
    public void init()
    {
        addMouseMotionListener(this);
        setBackground(Color.red);
    }
    public void mouseDragged(MouseEvent e)
    {
        Graphics g = getGraphics();
        g.setColor(Color.blue);
        g.fillOval(e.getX(), e.getY(), 10, 10);
    }
    public void mouseMoved(MouseEvent me){}
}