package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class simpleCalculaor extends JFrame implements ActionListener{

	JTextField input = new JTextField(10);
	JTextField output = new JTextField(10);
	JLabel inlab = new JLabel("수식");
	JLabel outlab = new JLabel("결과");
	
	JButton [] btn = new JButton[16];
	String [] btnName = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
						"CE", "계산", "+", "-", "X", "/"};
	
	
	
	simpleCalculaor(){
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		p2.setLayout(new GridLayout(4,0, 2, 2));
		
		p1.add(inlab);
		p1.add(input);
		p1.add(outlab);
		p1.add(output);
		
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(btnName[i]);
			p2.add(btn[i]);
			btn[i].addActionListener(this);
		}
		
		
		
		setTitle("간단한 계산기");
		setSize(350,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new simpleCalculaor();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "CE") {
			input.setText("");
			output.setText("");
		}
		
		
		else if(e.getActionCommand() == "계산") {
			String str = input.getText();
			char ch;
			int ind = 0;
			char indc;
			int num1=0;
			int num2=0;
			int outnum = 0;
						
			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				if (ch=='+' || ch=='-' || ch=='X' || ch=='/') {
					ind = i;
				}	
			}
			
			indc = str.charAt(ind);
			num1 = Integer.parseInt(str.substring(0,ind));
			num2 = Integer.parseInt(str.substring(ind+1));
			
			if (indc == '+') {outnum = num1+num2;}
			else if (indc == '-') {outnum = num1-num2;}
			else if (indc == 'X') {outnum = num1*num2;}
			else if (indc == '/') {outnum = num1/num2;}
			
			output.setText(Integer.toString(outnum));
		}
		
		
		else {
			input.setText(input.getText()+e.getActionCommand());
		}
		
	}

}
