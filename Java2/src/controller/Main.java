package controller;

import java.net.URL;
import java.util.ResourceBundle;

import controller.login.Login;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class Main implements Initializable {
				// Initializable : 해당 fxml이 열렸을때 초기값 메소드 제공 
	
	// * 현재 클래스의 메모리를 반환하는 방법
		// 1. 현재 클래스로 객체 선언 
	public static Main instance ;
		// 2. 생성자에서 객체내 this 넣어주기 
			// this : 현재클래스의 메모리 [ 새로운 메모리할당 X ]
	public Main() { instance = this; }
	
	public static Main getmain() {
		return instance;
	}
	//로그인 성공
	
    @FXML
    private BorderPane borderpane; // fx:id 
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) { // 해당 fxml이 열렸을때 초기값 설정
		loadpage("/view/login/login.fxml");	// loadpage 메소드 호출시 ( 파일경로 )
	}
	
	public void loadpage( String page ) { // loadpage( 파일경로 ) 
		try { // 예외처리 
			Parent parent = FXMLLoader.load( getClass().getResource(page)); // 해당 파일 불러오기 
			borderpane.setCenter(parent); // main.fxml에 존재하는 borderpane객체내 center을 해당 파일로 변경 
		}catch( Exception e ) { System.out.println("페이지 불러오기 실패 사유: "+ e);} // 만약에 파일이 존재하지 않으면 예외 발생 
		
	}
	
}
