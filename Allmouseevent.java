import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class Allmouseevent
extends Applet implements
MouseListener,MouseMotionListener
{
 String msg="";
 int x=0,y=0;
 
 public void init()
 {
	 
	 addMouseListener(this);
	 addMouseMotionListener(this);
	 
 }
 
 
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
       msg="clicked";
       repaint();
 
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		 msg="pressed";
		 repaint();		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		 msg="Release";
		 repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		 msg="Entered";
		 repaint();
	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		 msg="Exited";	
		 repaint();
	}




	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		 msg="Dragged";
		 repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		 msg="Moved";
		 repaint();
	}
public void paint(Graphics g)
{
g.drawString(msg,70,110);	
}
}


