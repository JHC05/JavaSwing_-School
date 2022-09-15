package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloButton extends JFrame{

	
	
	HelloButton(){
		
		JPanel p = new JPanel();
		add(p); //프레임 위에 패널 올림
		p.setBackground(Color.YELLOW); //패널 색
		
		
		JButton btn = new JButton("버튼");
		p.add(btn); //패널 위에 버튼 올림
		
		
		
		
		
		setTitle("안녕버튼");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); //화면 중앙에 위치
		
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new HelloButton();

	}

}
