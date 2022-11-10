package m11d10;

import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.*;

public class MouseWheelEventEx extends JFrame implements MouseWheelListener{

	JLabel lb = new JLabel("��");
	int fontSize = 30;
	
	MouseWheelEventEx() {
		add(lb);
		
		lb.setFont(new Font("����ü", Font.BOLD, fontSize));
		
		lb.addMouseWheelListener(this);
		
		
		setTitle("���콺�� �̺�Ʈ");
		setSize(600,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MouseWheelEventEx();
	}


	
	
	
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		
		if(e.getWheelRotation()<0) {	//�� ���� ������
			fontSize+=5;
			lb.setFont(new Font("����ü", Font.BOLD, fontSize));
		}
		
		else {
			fontSize-=5;
			lb.setFont(new Font("����ü", Font.BOLD, fontSize));
		}
		
	}

}
