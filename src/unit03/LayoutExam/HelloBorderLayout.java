package unit03.LayoutExam;

import java.awt.BorderLayout;

import javax.swing.*;

public class HelloBorderLayout extends JFrame{

	
	
	HelloBorderLayout(){
		
		JPanel p = new JPanel();
		add(p);
		
		JButton b1 = new JButton("��ư1");
		JButton b2 = new JButton("��ư2");
		JButton b3 = new JButton("��ư3");
		JButton b4 = new JButton("��ư4");
		JButton b5 = new JButton("��ư5");
		
		p.setLayout(new BorderLayout());
		p.add(b1, BorderLayout.WEST);
		p.add(b2, BorderLayout.EAST);
		p.add(b3, BorderLayout.SOUTH);
		p.add(b4, BorderLayout.NORTH);
		p.add(b5, BorderLayout.CENTER);
		
		
		
		setTitle("���� ���̾ƿ�");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}
	
	
	
	
	public static void main(String[] args) {
		new HelloBorderLayout();
	}

}
