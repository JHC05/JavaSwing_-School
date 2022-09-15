package unit03.LayoutExam;

import javax.swing.*;

public class HelloAbsoluteLayout extends JFrame{

	
	HelloAbsoluteLayout(){
		
		setLayout(null); //�������� ���̾ƿ��� absolute�� ����
		
		JButton b1 = new JButton("��ư1");
		b1.setSize(70,20); //����ũ��, ����ũ��
		b1.setLocation(10, 30); //������ġ,������ġ
		
		JButton b2 = new JButton();
		b2.setBounds(100, 40, 40, 70); //����ũ��, ����ũ��, ������ġ, ������ġ
		
		
		
		add(b1);
		add(b2);
		
		setTitle("������ǥ");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(320,200);
		setVisible(true);
		
	}
	
	
	
	
	public static void main(String[] args) {
		new HelloAbsoluteLayout();
	}

}
