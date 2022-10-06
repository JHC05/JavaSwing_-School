package unit03.EventExam;



import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener {

	JCheckBox fruit1 = new JCheckBox("사과");
	JCheckBox fruit2 = new JCheckBox("배");
	JCheckBox fruit3 = new JCheckBox("체리");
	JLabel lb_reult = new JLabel("현재 0원 입니다.");
	int price = 0;
	
	CheckBoxItemEventEx(){
		JPanel p = new JPanel();
		add(p);
		
		JLabel lb = new JLabel("사과 100원, 배 500원, 체리 2000원");
		
		
		p.add(lb);
		p.add(fruit1);
		p.add(fruit2);
		p.add(fruit3);
		p.add(lb_reult);
		
		
		fruit1.addItemListener(this);
		fruit2.addItemListener(this);
		fruit3.addItemListener(this);
		
		
		setTitle("가격합산");
		setSize(250,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}


	@Override
	public void itemStateChanged(ItemEvent e) {

		if(e.getStateChange() == ItemEvent.SELECTED) {
			
			if(e.getItem() == fruit1) {
				price+=100;
			}
			
			else if(e.getItem() == fruit2) {
				price+=500;
			}
			
			else if(e.getItem() == fruit3) {
				price+=2000;
			}
		}
		
		else if(e.getStateChange() == ItemEvent.DESELECTED) {
			
			if(e.getItem() == fruit1) {
				price-=100;
			}
			
			else if(e.getItem() == fruit2) {
				price-=500;
			}
			
			else if(e.getItem() == fruit3) {
				price-=2000;
			}
		}
		
		lb_reult.setText("현제 "+price+"원 입니다.");
	}


}
