import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;


public class MyFrame extends JFrame implements MouseListener {
	
	Random ra=new Random();

	public MyFrame(int i) {
		// TODO Auto-generated constructor stub
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		int r=ra.nextInt(256);
		int g=ra.nextInt(256);
		int b=ra.nextInt(256);
		getContentPane().setBackground(new Color(r,g,b));
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		int r=ra.nextInt(256);
		int g=ra.nextInt(256);
		int b=ra.nextInt(256);
		setBackground(new Color(r,g,b));
	}

}