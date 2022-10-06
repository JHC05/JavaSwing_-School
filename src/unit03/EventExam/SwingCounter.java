package unit03.EventExam;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingCounter extends JFrame implements ActionListener{

	JLabel lb = new JLabel("카운터값");
	JLabel tf = new JLabel("0"); //초기값, 길이
	JButton btnInc = new JButton("증가");
	JButton btnDec = new JButton("감소");
	JButton btnCls = new JButton("초기화");
	
	SwingCounter(){
		
		
		JPanel p = new JPanel();
		add(p);		
		

		p.add(lb);
		p.add(tf);
		p.add(btnInc);
		p.add(btnDec);
		p.add(btnCls);
		
		
		btnInc.addActionListener(this);
		btnDec.addActionListener(this);
		btnCls.addActionListener(this);
		
		
		//기본세팅
		setTitle("간단 카운터");
		setSize(400,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	
	
	public static void main(String[] args) {
		new SwingCounter();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnInc) {
			String str = tf.getText().trim();	//좌우 공백 제거
			int cnt  = Integer.parseInt(str) + 1 ;	//인트로 바꿈+1
			str = Integer.toString(cnt);			//스트링으로 바꿈
			
			tf.setText(str);
		}
		
		else if(e.getSource() == btnDec) {
			String str = tf.getText().trim();	//좌우 공백 제거
			int cnt  = Integer.parseInt(str);	//인트로 바꿈
			
			if(cnt>0) {
				cnt  = Integer.parseInt(str)-1;
			}
			
			str = Integer.toString(cnt);			//스트링으로 바꿈
			tf.setText(str);
		}
		
		else if(e.getSource() == btnCls) {
			tf.setText("0");
		}
		
	}

}
