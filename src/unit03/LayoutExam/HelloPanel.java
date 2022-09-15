package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.*;

public class HelloPanel extends JFrame{

	
	
	HelloPanel(){
		JPanel p = new JPanel();
		add(p);
		p.setBackground(Color.ORANGE);
		
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		
		btn1.setBackground(Color.YELLOW);
		btn2.setBackground(Color.pink);
		
		p.add(btn1);
		p.add(btn2);
		
		
		setTitle("�ȳ��г�");
		setLocationRelativeTo(null);
		setSize(400, 300);
		
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new HelloPanel();
	}

}
