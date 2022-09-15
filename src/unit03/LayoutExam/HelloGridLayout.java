package unit03.LayoutExam;

import java.awt.GridLayout;

import javax.swing.*;

public class HelloGridLayout extends JFrame{

	
	HelloGridLayout(){
		
		JPanel p = new JPanel();
		add(p);
		
		JButton b1 = new JButton("��ư1");
		JButton b2 = new JButton("��ư2");
		JButton b3 = new JButton("��ư3");
		JButton b4 = new JButton("��ư4");
		JButton b5 = new JButton("��ư5");
		JButton b6 = new JButton("��ư6");
		JButton b7 = new JButton("��ư7");
		
		p.setLayout(new GridLayout(3,0)); //(��, ��, �¿찣��, ���ϰ���)
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		
		
		
		
		setTitle("�׸��� ���̾ƿ�");
		setSize(320, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		new HelloGridLayout();
	}

}
