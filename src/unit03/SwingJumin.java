package unit03JF;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class SwingJumin extends JFrame implements ActionListener, KeyListener{

	JTextField jt1 = new JTextField(10);
	JTextField jt2 = new JTextField(10);
	JButton btn = new JButton("버튼");
	
	SwingJumin(){
		
		JPanel p = new JPanel();
		add(p);
		
		JLabel lb = new JLabel("-");
		
		p.add(jt1);
		p.add(lb);
		p.add(jt2);
		p.add(btn);
		
		jt1.addKeyListener(this);
		jt2.addKeyListener(this);
		btn.addActionListener(this);
		
		
		setTitle("주민번호 분석");
		setSize(400,100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	
	
	public static void main(String[] args) {
		new SwingJumin();
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn) {
			
			if(jt2.getText().substring(0,1).equals("1") || jt2.getText().substring(0,1).equals("2")) {
				JOptionPane.showMessageDialog(null, "당신의 생일은 "+"19"+jt1.getText().substring(0,2)+"년 "+jt1.getText().substring(2,4)+"월"+jt1.getText().substring(4,6)+"일 입니다.");
			}
			
			else if(jt2.getText().substring(0,1).equals("3") || jt2.getText().substring(0,1).equals("4")) {
				JOptionPane.showMessageDialog(null, "당신의 생일은 "+"20"+jt1.getText().substring(0,2)+"년 "+jt1.getText().substring(2,4)+"월"+jt1.getText().substring(4,6)+"일 입니다.");
			}
			
			else {
				JOptionPane.showMessageDialog(null, "올바른 주민번호를 입력하세요");
			}
			
		}
		
	}




	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource() == jt2 && e.getKeyCode() == KeyEvent.VK_ENTER) {
			btn.doClick();
		}
		
	}




	@Override
	public void keyReleased(KeyEvent e) {
		if(jt1.getText().length() == 6) {
			jt2.requestFocus();
		}
		
	}

}
