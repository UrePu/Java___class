package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Day21_1 extends Application{
	
	@Override
	public void start(Stage ��������) throws Exception{
		VBox �ڽ� = new VBox();
		
		Button ��ư = new Button();
		��ư.setText("�ݱ�");
		
		�ڽ�.getChildren().add(��ư);
		
		Scene ��� = new Scene(�ڽ� , 200, 200);
		
		��������.setScene(���);
		��������.show();
	}
}
