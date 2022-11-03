package unit03JF;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.*;

public class HelloKeyEnter extends JFrame implements KeyListener{

	JPanel p = new JPanel();
	JLabel lb = new JLabel("<Enter>키로 배경 색이 바뀝니다.");
	
	HelloKeyEnter(){
		
		add(p);
		p.add(lb);
		
		p.addKeyListener(this);
		
		
		setTitle("키이벤트 예제");
		setSize(300,250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus();
	}
	
	public static void main(String[] args) {
		new HelloKeyEnter();
	}


	
	


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void keyPressed(KeyEvent e) {
		
		int r = (int)(Math.random()*256);	//0~255
		int g = (int)(Math.random()*256);	//0~255
		int b = (int)(Math.random()*256);	//0~255
		
		switch (e.getKeyChar()) {
		case '\n' :
			lb.setText("r = "+r+", g = "+g+", b = "+b);
			p.setBackground(new Color(r, g, b));
			break;
			
		case 'q' :
			System.exit(0);
			break;
		}
		
	}




	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
