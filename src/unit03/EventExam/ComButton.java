package unit03.EventExam;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComButton extends JFrame implements ActionListener{

	JPanel p = new JPanel();
	JButton btnY = new JButton("�����");
	JButton btnP = new JButton("��ũ��");
	
	ComButton(){
		
		add(p);
		p.add(btnP);
		p.add(btnY);
		
		
		//�̺�Ʈ ����
		btnY.addActionListener(this);
		btnP.addActionListener(this); //this�� �������̶�� ��
		
		//������ �⺻����
		setTitle("���� �ٲٱ�");
		setSize(700, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
			
		
		
	}
		
	
	public static void main(String[] args) {
		new ComButton();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//��ư�� ������ ����� ��
		
		if(e.getSource() == btnY) { // e.getSource()�� ��ư�� (����)���� �޾ƿ�
			p.setBackground(Color.yellow);
		}
		else if(e.getSource() == btnP) {
			p.setBackground(Color.pink);
		}
		
	}

}
