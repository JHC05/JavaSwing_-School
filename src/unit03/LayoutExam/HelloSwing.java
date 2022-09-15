package unit03.LayoutExam;

import javax.swing.*;	//* 모두 적용

public class HelloSwing extends JFrame{

	//생성자에서 화면 만들기
	HelloSwing(){
		//초기세팅 기본
		setTitle("안녕 스윙!");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //완전종료
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		//1. new 생성자로 윈도우 프로그램 실행시키기
		new HelloSwing();

	}

}
