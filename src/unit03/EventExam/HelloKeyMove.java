package unit03.EventExam;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class HelloKeyMove extends JFrame implements KeyListener{

	
	JPanel p = new JPanel();
	JLabel lb = new JLabel("Hello");
	
	HelloKeyMove(){
		
		add(p);
		p.setLayout(null);//레이아웃 설정안함, 즉 절대값 레이아웃		
		p.add(lb);
		
		lb.setLocation(130, -30);
		lb.setSize(300, 250);
		
		p.addKeyListener(this);
		
		
		setTitle("키이벤트 예제");
		setSize(300,250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//포커싱 해주기(키 이벤트 페널에 적용)
		p.setFocusable(true);
		p.requestFocus();
	}
	
	
	
	
	public static void main(String[] args) {
		new HelloKeyMove();
	}




	@Override
	public void keyTyped(KeyEvent e) {
		//
		
	}




	@Override
	public void keyPressed(KeyEvent e) {
		//키 누를때
		int key = e.getKeyCode();
		
		switch (key) {
		case KeyEvent.VK_UP:
			lb.setLocation(lb.getX(), lb.getY()-10);
			break;
		case KeyEvent.VK_LEFT:
			lb.setLocation(lb.getX()-10, lb.getY());
			break;
		case KeyEvent.VK_RIGHT:
			lb.setLocation(lb.getX()+10, lb.getY());
			break;
		case KeyEvent.VK_DOWN:
			lb.setLocation(lb.getX(), lb.getY()+10);
			break;

		}
		
	}




	@Override
	public void keyReleased(KeyEvent e) {
		//키 땔때
		
	}

}
