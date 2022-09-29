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
	JButton btnLogin = new JButton("�α���");
	JButton btnCancel = new JButton("���");
	JLabel lbResult = new JLabel("������");
		
	
	
	SwingLogin(){
		btnLogin.setBackground(Color.yellow); //��ư��
		btnCancel.setBackground(Color.pink);
		
		
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0,2));
		add(p);
		
		//����
		ImageIcon img1 = new ImageIcon("img/robot.PNG");
		JLabel lbLogo = new JLabel(img1);
		add(lbLogo, BorderLayout.NORTH);
		
		//����
		add(lbResult, BorderLayout.SOUTH);
		
		
		//����
		JLabel lbId = new JLabel("���̵�", JLabel.CENTER);
		p.add(lbId);
		p.add(tfid);
		JLabel idPwd = new JLabel("��й�ȣ", JLabel.CENTER);
		p.add(idPwd);
		p.add(tfPwd);
		p.add(btnLogin);
		p.add(btnCancel);
		
		
		
		//�̺�Ʈ
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);
		
		setTitle("�α���");
		setSize(300,250);
		setResizable(false);//������ ���� �Ұ��ϰ�
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
				lbResult.setText("���̵� �Է��ϼ���");
			}
			
			else if(strpwd.length() == 0) {
				lbResult.setText("��й�ȣ�� �Է��ϼ���");
			}
			
			else {
				lbResult.setText(strid+"���� ��й�ȣ��"+strpwd+"�Դϴ�");
			}
			
		}
		
		
		
		else if(e.getSource() == btnCancel) {
			lbResult.setText("����Ͽ����ϴ�.");//�ؽ�Ʈ �缳��
			tfid.setText("");
			tfPwd.setText("");
		}
			
		
	}

}
