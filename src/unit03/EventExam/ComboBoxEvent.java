package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.ComboBoxUI;

public class ComboBoxEvent extends JFrame implements ActionListener{

	String [] coffee = {"�Ƹ޸�ī��", "īǪġ��", "����������", "��"};
	JComboBox<String> combo = new JComboBox<String>(coffee);
	
	JLabel lb = new JLabel();
	
	ImageIcon [] img = {new ImageIcon("img/ame.jpg"),
						new ImageIcon("img/capu.jpg"),
						new ImageIcon("img/es.jpg"),
						new ImageIcon("img/latte.jpg")};
	
	ComboBoxEvent(){
		
		add(lb, BorderLayout.CENTER);
		add(combo, BorderLayout.NORTH);
		
		combo.addActionListener(this);
		
		
		setTitle("Ŀ���ֹ��޺��ڽ�");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
		
	
	public static void main(String[] args) {
		new ComboBoxEvent();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == combo) {
			int index = combo.getSelectedIndex();
			lb.setIcon(img[index]);
		}
		
	}

}
