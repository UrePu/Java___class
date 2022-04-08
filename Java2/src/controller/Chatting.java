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
    	if(btnconnect.getText().equals("ä�ù� ����")) {
    		
    		//Ŭ���̾�Ʈ ���� �޼ҵ�
    		
    		txtcontent.appendText("---[ä�ù� ����]----\n");
    		btnconnect.setText("ä�ù� ������");
    		
    		
    	}else{
    		
    		//Ŭ���̾�Ʈ ���� �޼ҵ�
    		
    		txtcontent.appendText("---[ä�ù� ����]----\n");
    		btnconnect.setText("ä�ù� ����");
    	}
    }

    @FXML
    void send(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    }
	
}