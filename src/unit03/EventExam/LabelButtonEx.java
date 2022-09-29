package unit03.EventExam;

import javax.swing.*;

public class LabelButtonEx extends JFrame{

	LabelButtonEx(){
		
		JPanel p = new JPanel();
		add(p);
		
		//글자라벨
		JLabel lb = new JLabel("제임스 고슬링 입니더~");
		p.add(lb);
		
		//이미지 라벨
		ImageIcon img = new ImageIcon("img/gosling.jpg");//이미지 객체로 가져오기
		JLabel lbimg = new JLabel(img);
		p.add(lbimg);
		
		//이미지 버튼
		ImageIcon normalIcon = new ImageIcon("img/normalicon.gif");
		ImageIcon pressedicon = new ImageIcon("img/pressedicon.gif");
		ImageIcon rollovericon = new ImageIcon("img/rollovericon.gif");
		
		JButton btn = new JButton("call~", normalIcon);
		btn.setPressedIcon(pressedicon); //눌렀을때 사용할 이미지
		btn.setRolloverIcon(rollovericon); //마우스 올릴때
		p.add(btn);
		
		
		
		setTitle("라벨과 버튼예제");
		setSize(300,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new LabelButtonEx();
	}

}
