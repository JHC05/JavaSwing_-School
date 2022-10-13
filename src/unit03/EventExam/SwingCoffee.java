package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwingCoffee extends JFrame implements ItemListener{

	JRadioButton ame = new JRadioButton("�Ƹ޸�ī��");
	JRadioButton latte = new JRadioButton("��");
	JRadioButton capu = new JRadioButton("īǪġ��");
	JTextArea ta = new JTextArea(12,0);
	JScrollPane sp = new JScrollPane(ta);
	
	
	SwingCoffee(){
		
		JPanel bg = new JPanel();
		
		setLayout(new BorderLayout());
		add(bg, BorderLayout.NORTH);
		
		bg.add(ame);
		bg.add(latte);
		bg.add(capu);
		
		add(sp, BorderLayout.SOUTH);
		
		//��ư �׷�(�ߺ����� �ȵǰ�)
		ButtonGroup rg = new ButtonGroup();
		rg.add(ame);
		rg.add(capu);
		rg.add(latte);
		
		
		ame.addItemListener(this);
		latte.addItemListener(this);
		capu.addItemListener(this);
		
		
		setTitle("Ŀ���ֹ�");
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new SwingCoffee();
	}


	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getStateChange() == ItemEvent.SELECTED) {
			ta.append(((AbstractButton)e.getItem()).getText()+"�� ���õǾ����ϴ�.\n");
		}
		
		else if (e.getStateChange() == ItemEvent.DESELECTED) {
			ta.append(((AbstractButton)e.getItem()).getText()+"�� �����Ǿ����ϴ�.\n");
		}
		
	}

}
