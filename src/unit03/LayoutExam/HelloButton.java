package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloButton extends JFrame{

	
	
	HelloButton(){
		
		JPanel p = new JPanel();
		add(p); //������ ���� �г� �ø�
		p.setBackground(Color.YELLOW); //�г� ��
		
		
		JButton btn = new JButton("��ư");
		p.add(btn); //�г� ���� ��ư �ø�
		
		
		
		
		
		setTitle("�ȳ��ư");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); //ȭ�� �߾ӿ� ��ġ
		
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new HelloButton();

	}

}
