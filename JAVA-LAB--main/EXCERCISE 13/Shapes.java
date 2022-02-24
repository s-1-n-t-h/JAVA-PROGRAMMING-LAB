import java.applet.Applet;
import java.awt.*;
/*<applet code='Shapes' width=500 height=500></applet>*/
public class Shapes extends Applet
{
    public void paint(Graphics g)
    {
        g.drawLine(0,0,100,150);
        g.setColor(Color.blue);
        g.fillRect(10,250,300,40);
        g.setColor(Color.red);
        g.drawOval(75,90,250,300);
        g.fillOval(200,250,100,100);
        g.draw3DRect(300, 150, 195, 195,false);
    }
}