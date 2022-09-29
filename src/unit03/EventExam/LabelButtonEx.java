package unit03.EventExam;

import javax.swing.*;

public class LabelButtonEx extends JFrame{

	LabelButtonEx(){
		
		JPanel p = new JPanel();
		add(p);
		
		//���ڶ�
		JLabel lb = new JLabel("���ӽ� ���� �Դϴ�~");
		p.add(lb);
		
		//�̹��� ��
		ImageIcon img = new ImageIcon("img/gosling.jpg");//�̹��� ��ü�� ��������
		JLabel lbimg = new JLabel(img);
		p.add(lbimg);
		
		//�̹��� ��ư
		ImageIcon normalIcon = new ImageIcon("img/normalicon.gif");
		ImageIcon pressedicon = new ImageIcon("img/pressedicon.gif");
		ImageIcon rollovericon = new ImageIcon("img/rollovericon.gif");
		
		JButton btn = new JButton("call~", normalIcon);
		btn.setPressedIcon(pressedicon); //�������� ����� �̹���
		btn.setRolloverIcon(rollovericon); //���콺 �ø���
		p.add(btn);
		
		
		
		setTitle("�󺧰� ��ư����");
		setSize(300,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new LabelButtonEx();
	}

}
