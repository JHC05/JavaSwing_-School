package unit03.EventExam;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TextAreaEx extends JFrame implements ActionListener{

	JLabel lb = new JLabel("�Է���<Enter>Ű�� �Է��ϼ���");
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(7,20);
	JScrollPane sp = new JScrollPane(ta);
	
	TextAreaEx(){
		JPanel p = new JPanel();
		add(p);

		
		p.add(lb);
		p.add(tf);
		p.add(sp);
		
		tf.addActionListener(this);
		
		
		setTitle("�ؽ�Ʈ���������");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new TextAreaEx();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tf) { //Ȥ�ø���
			
			String str = tf.getText();
			ta.append(str+"\n");
			tf.setText("");
			
		}
		
	}

}
