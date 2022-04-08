package controller;

import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Chatting implements Initializable {

    @FXML
    private Button btnconnect;

    @FXML
    private TextArea txtcontent;

    @FXML
    private TextField txtmsg;

    @FXML
    private Button btnsend;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtip;

    @FXML
    private TextField txtport;

    
    Socket socket;
    
    
    @FXML
    void connect(ActionEvent event) {
    	if(btnconnect.getText().equals("채팅방 입장")) {
    		
    		//클라이언트 실행 메소드
    		
    		txtcontent.appendText("---[채팅방 입장]----\n");
    		btnconnect.setText("채팅방 나가기");
    		
    		
    	}else{
    		
    		//클라이언트 종료 메소드
    		
    		txtcontent.appendText("---[채팅방 퇴장]----\n");
    		btnconnect.setText("채팅방 입장");
    	}
    }

    @FXML
    void send(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    }
	
}
