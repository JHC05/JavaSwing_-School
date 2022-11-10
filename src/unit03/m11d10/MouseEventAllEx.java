package m11d10;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class MouseEventAllEx extends JFrame implements MouseListener, MouseMotionListener{

	JPanel p = new JPanel();
	JLabel lb = new JLabel("움직여봐");
	
	MouseEventAllEx() {
		
		add(p);
		p.add(lb);
		p.setLayout(null);
		
		lb.setBounds(100, 50, 80, 20);
		
		p.addMouseListener(this);
		p.addMouseMotionListener(this);
		
		
		setTitle("마우스 이벤트");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
		
	public static void main(String[] args) {
		new MouseEventAllEx();
	}


	
	
	

	@Override
	public void mouseDragged(MouseEvent e) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("마우스가 드래그된 위치 : "+e.getX()+", "+e.getY());
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("마우스가 움직이는 위치 : "+e.getX()+", "+e.getY());
		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getClickCount() == 2) {
			setTitle("마우스 더블클릭 위치 : "+e.getX()+", "+e.getY());
		}
		else {
			setTitle("마우스 클릭 위치 : "+e.getX()+", "+e.getY());
		}
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("마우스가 눌린 위치 : "+e.getX()+", "+e.getY());
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("마우스가 놓인 위치 : "+e.getX()+", "+e.getY());
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		p.setBackground(Color.YELLOW);
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		p.setBackground(Color.pink);
		setTitle("나감");
		
	}

}
