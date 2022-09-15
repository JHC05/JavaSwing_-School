package unit03.LayoutExam;

import java.awt.GridLayout;

import javax.swing.*;

public class HelloGridLayout extends JFrame{

	
	HelloGridLayout(){
		
		JPanel p = new JPanel();
		add(p);
		
		JButton b1 = new JButton("버튼1");
		JButton b2 = new JButton("버튼2");
		JButton b3 = new JButton("버튼3");
		JButton b4 = new JButton("버튼4");
		JButton b5 = new JButton("버튼5");
		JButton b6 = new JButton("버튼6");
		JButton b7 = new JButton("버튼7");
		
		p.setLayout(new GridLayout(3,0)); //(행, 열, 좌우간격, 상하간격)
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		
		
		
		
		setTitle("그리드 레이아웃");
		setSize(320, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		new HelloGridLayout();
	}

}
