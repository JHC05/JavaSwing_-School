package m11d10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class ClickRandomLocation extends JFrame implements MouseListener{

	JPanel p = new JPanel();
	JLabel lb = new JLabel("[(나잡아봐라)]");
	
	
	ClickRandomLocation() {
		add(p);
		p.add(lb);
		p.setLayout(null);
		
		lb.setBounds(50,50,100,40);
		
		lb.addMouseListener(this);
		
		
		setTitle("클릭연습");
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new ClickRandomLocation();

	}



	@Override
	public void mouseClicked(MouseEvent e) {
		
		int a = (int) (Math.random()*(p.getWidth()-lb.getWidth()));
		int b = (int) (Math.random()*(p.getHeight()-lb.getHeight()));
		
		lb.setLocation(a,b);
		setTitle(a+", "+b);
		
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
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
