package unit03.LayoutExam;

import java.awt.*;

import javax.swing.*;

public class LayoutTest2 extends JFrame{

	LayoutTest2(){

		//프레임 기본세팅
		setTitle("레이아웃 섞기");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		//프레임을 보더레이아웃으로 쪼갬
		setLayout(new BorderLayout());
		
		//버튼생성
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼1");
		JButton btn3 = new JButton("버튼1");
		JButton btn4 = new JButton("버튼1");
		JButton btn5 = new JButton("버튼1");
		JButton btn6 = new JButton("버튼1");
		
		//패널생성
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());		
		//패널에 버튼 올리기
		p1.add(btn1);
		p1.add(btn2);
		add(p1, BorderLayout.NORTH);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(0,2));
		p2.add(btn3);
		p2.add(btn4);
		add(p2, BorderLayout.CENTER);
		
		//패널생성
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());		
		//패널에 버튼 올리기
		p3.add(btn5);
		p3.add(btn6);
		add(p3, BorderLayout.SOUTH);
		
		
	}
	
		
	public static void main(String[] args) {
		new LayoutTest2();
	}

}
