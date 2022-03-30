package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Day21_1 extends Application{
	
	@Override
	public void start(Stage 스테이지) throws Exception{
		VBox 박스 = new VBox();
		
		Button 버튼 = new Button();
		버튼.setText("닫기");
		
		박스.getChildren().add(버튼);
		
		Scene 장면 = new Scene(박스 , 200, 200);
		
		스테이지.setScene(장면);
		스테이지.show();
	}
}
