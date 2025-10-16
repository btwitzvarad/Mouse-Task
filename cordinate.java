//wap to display current cordinate of the mouse on the viewer

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class cordinate 
extends Applet implements
MouseMotionListener
{
String msg="";
int x=0,y=0;

 public void init()
 {
addMouseMotionListener(this);
}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x=e.getX();
		y=e.getY();
		repaint();
	}
	public void paint (Graphics g)
	{
		g.drawString(x+","+y, x, y);
		
	}
public void mouseGragged(MouseEvent e){}
}



//wap to change background color by enter and exit event enter-red  exit-green
//wap to draw a line on viewer using mouseevent 