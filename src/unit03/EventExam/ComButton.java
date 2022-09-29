package unit03.EventExam;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComButton extends JFrame implements ActionListener{

	JPanel p = new JPanel();
	JButton btnY = new JButton("노란색");
	JButton btnP = new JButton("핑크색");
	
	ComButton(){
		
		add(p);
		p.add(btnP);
		p.add(btnY);
		
		
		//이벤트 시작
		btnY.addActionListener(this);
		btnP.addActionListener(this); //this는 프레임이라는 뜻
		
		//프레임 기본설정
		setTitle("배경색 바꾸기");
		setSize(700, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
			
		
		
	}
		
	
	public static void main(String[] args) {
		new ComButton();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//버튼을 누르면 여기로 옴
		
		if(e.getSource() == btnY) { // e.getSource()는 버튼의 (종류)정보 받아옴
			p.setBackground(Color.yellow);
		}
		else if(e.getSource() == btnP) {
			p.setBackground(Color.pink);
		}
		
	}

}
