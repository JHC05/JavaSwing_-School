package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingLogin extends JFrame implements ActionListener{

	JTextField tfid = new JTextField();
	JPasswordField tfPwd = new JPasswordField();
	JButton btnLogin = new JButton("로그인");
	JButton btnCancel = new JButton("취소");
	JLabel lbResult = new JLabel("결과출력");
		
	
	
	SwingLogin(){
		btnLogin.setBackground(Color.yellow); //버튼색
		btnCancel.setBackground(Color.pink);
		
		
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0,2));
		add(p);
		
		//북쪽
		ImageIcon img1 = new ImageIcon("img/robot.PNG");
		JLabel lbLogo = new JLabel(img1);
		add(lbLogo, BorderLayout.NORTH);
		
		//남쪽
		add(lbResult, BorderLayout.SOUTH);
		
		
		//센터
		JLabel lbId = new JLabel("아이디", JLabel.CENTER);
		p.add(lbId);
		p.add(tfid);
		JLabel idPwd = new JLabel("비밀번호", JLabel.CENTER);
		p.add(idPwd);
		p.add(tfPwd);
		p.add(btnLogin);
		p.add(btnCancel);
		
		
		
		//이벤트
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);
		
		setTitle("로그인");
		setSize(300,250);
		setResizable(false);//사이즈 변경 불가하게
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	
	
	
	public static void main(String[] args) {
		new SwingLogin();
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == btnLogin) {
			String strid = tfid.getText();
			String strpwd = new String(tfPwd.getPassword());
			
			
			if(strid.length() == 0) {
				lbResult.setText("아이디를 입력하세요");
			}
			
			else if(strpwd.length() == 0) {
				lbResult.setText("비밀번호를 입력하세요");
			}
			
			else {
				lbResult.setText(strid+"님의 비밀번호는"+strpwd+"입니다");
			}
			
		}
		
		
		
		else if(e.getSource() == btnCancel) {
			lbResult.setText("취소하였습니다.");//텍스트 재설정
			tfid.setText("");
			tfPwd.setText("");
		}
			
		
	}

}
