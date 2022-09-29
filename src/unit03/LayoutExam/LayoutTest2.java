package unit03.LayoutExam;

import java.awt.*;

import javax.swing.*;

public class LayoutTest2 extends JFrame{

	LayoutTest2(){

		//������ �⺻����
		setTitle("���̾ƿ� ����");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		//�������� �������̾ƿ����� �ɰ�
		setLayout(new BorderLayout());
		
		//��ư����
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư1");
		JButton btn3 = new JButton("��ư1");
		JButton btn4 = new JButton("��ư1");
		JButton btn5 = new JButton("��ư1");
		JButton btn6 = new JButton("��ư1");
		
		//�гλ���
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());		
		//�гο� ��ư �ø���
		p1.add(btn1);
		p1.add(btn2);
		add(p1, BorderLayout.NORTH);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(0,2));
		p2.add(btn3);
		p2.add(btn4);
		add(p2, BorderLayout.CENTER);
		
		//�гλ���
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());		
		//�гο� ��ư �ø���
		p3.add(btn5);
		p3.add(btn6);
		add(p3, BorderLayout.SOUTH);
		
		
	}
	
		
	public static void main(String[] args) {
		new LayoutTest2();
	}

}
