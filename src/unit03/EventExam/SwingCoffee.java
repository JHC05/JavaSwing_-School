package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwingCoffee extends JFrame implements ItemListener{

	JRadioButton ame = new JRadioButton("아메리카노");
	JRadioButton latte = new JRadioButton("라떼");
	JRadioButton capu = new JRadioButton("카푸치노");
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
		
		//버튼 그룹(중복선택 안되게)
		ButtonGroup rg = new ButtonGroup();
		rg.add(ame);
		rg.add(capu);
		rg.add(latte);
		
		
		ame.addItemListener(this);
		latte.addItemListener(this);
		capu.addItemListener(this);
		
		
		setTitle("커피주문");
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
			ta.append(((AbstractButton)e.getItem()).getText()+"가 선택되었습니다.\n");
		}
		
		else if (e.getStateChange() == ItemEvent.DESELECTED) {
			ta.append(((AbstractButton)e.getItem()).getText()+"가 해제되었습니다.\n");
		}
		
	}

}
