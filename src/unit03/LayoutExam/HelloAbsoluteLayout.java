package unit03.LayoutExam;

import javax.swing.*;

public class HelloAbsoluteLayout extends JFrame{

	
	HelloAbsoluteLayout(){
		
		setLayout(null); //프레임의 레이아웃을 absolute로 만듬
		
		JButton b1 = new JButton("버튼1");
		b1.setSize(70,20); //가로크기, 세로크기
		b1.setLocation(10, 30); //가로위치,세로위치
		
		JButton b2 = new JButton();
		b2.setBounds(100, 40, 40, 70); //가로크기, 세로크기, 가로위치, 세로위치
		
		
		
		add(b1);
		add(b2);
		
		setTitle("절대좌표");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(320,200);
		setVisible(true);
		
	}
	
	
	
	
	public static void main(String[] args) {
		new HelloAbsoluteLayout();
	}

}
