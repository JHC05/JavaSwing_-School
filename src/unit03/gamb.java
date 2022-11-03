package unit03JF;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class gamb extends JFrame implements KeyListener{
	
	JPanel p = new JPanel();
	JLabel lb1 = new JLabel("0", JLabel.CENTER);
	JLabel lb2 = new JLabel("0", JLabel.CENTER);
	JLabel lb3 = new JLabel("0", JLabel.CENTER);
	JLabel lbOut = new JLabel("시작합니다.", JLabel.CENTER);
	
	gamb(){
		setLayout(new BorderLayout());
		
		p.setLayout(null);
		lb1.setBounds(30, 50, 60, 30);
		lb2.setBounds(110, 50, 60, 30);
		lb3.setBounds(190, 50, 60, 30);
		
		
		add(p);
		add(lbOut, BorderLayout.SOUTH);
		
		p.add(lb1);
		p.add(lb2);
		p.add(lb3);
		
		
		
		lb1.setOpaque(true);
		lb1.setBackground(Color.pink);
		lb2.setOpaque(true);
		lb2.setBackground(Color.pink);
		lb3.setOpaque(true);
		lb3.setBackground(Color.pink);
		
		p.addKeyListener(this);
		
		
		
		setTitle("겜블링게임");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus();
	}
	
	
	
	public static void main(String[] args) {
		new gamb();
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		int a = 0, b = 0, c = 0;
		
		if(e.getKeyChar() == '\n') {
			
			a = (int)(Math.random()*5);
			b = (int)(Math.random()*5);
			c = (int)(Math.random()*5);
		
			lb1.setText(Integer.toString(a));
			lb2.setText(Integer.toString(b));
			lb3.setText(Integer.toString(c));
		
			if(a==b&&b==c) {
				lbOut.setText("!축하합니다!");
			}
			else {
				lbOut.setText("아쉽군요");
			}
		
		}
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
