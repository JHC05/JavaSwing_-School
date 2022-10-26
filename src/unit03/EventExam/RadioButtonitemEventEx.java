package unit03.EventExam;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class RadioButtonitemEventEx extends JFrame implements ItemListener{

	JTextField src = new JTextField(9);
	JTextField des = new JTextField(9);
	JLabel lb = new JLabel("ㅡ>", JLabel.CENTER);
	
	JRadioButton [] rbtn = new JRadioButton[4];
	String [] names = {"decimal", "binary", "doctal", "hex"};
	
	
	/*JRadioButton decimal = new JRadioButton("decimal");
	JRadioButton binary = new JRadioButton("binary");
	JRadioButton octal = new JRadioButton("octal");
	JRadioButton hex = new JRadioButton("hex");*/
	
	ButtonGroup bg = new ButtonGroup(); 
	
	RadioButtonitemEventEx(){
		
		JPanel p = new JPanel();
		add(p);
		
		p.add(src);
		p.add(lb);
		p.add(des);
		
		for (int i = 0; i < rbtn.length; i++) {
			rbtn[i] = new JRadioButton(names[i]);
			bg.add(rbtn[i]);
			p.add(rbtn[i]);
			rbtn[i].addItemListener(this);
		}
		
		
		
		/*bg.add(hex);
		bg.add(octal);
		bg.add(binary);
		bg.add(decimal);
		
		
		
		p.add(decimal);
		p.add(binary);
		p.add(octal);
		p.add(hex);
		
		decimal.addItemListener(this);
		binary.addItemListener(this);
		octal.addItemListener(this);
		hex.addItemListener(this);*/
		
		setTitle("진수변환에제");
		setSize(300,150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
		
	
	public static void main(String[] args) {
		new RadioButtonitemEventEx();

	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			
			int num = Integer.parseInt(src.getText());
			String desnum = null;
			
			if(e.getItem() == rbtn[0]) {
				desnum = Integer.toString(num);
			}
			
			else if(e.getItem() == rbtn[1]) {
				desnum = Integer.toBinaryString(num);
			}
			
			else if(e.getItem() == rbtn[2]) {
				desnum = Integer.toOctalString(num);
			}
			
			else if(e.getItem() == rbtn[3]) {
				desnum = Integer.toHexString(num);
			}
			
			des.setText(desnum);
		}
		
	}

}
