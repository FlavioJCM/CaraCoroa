package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class CaraCoroa extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("TelaFXML.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("Cara e Coroa");
			primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/imagens/moeda.png")));
			primaryStage.resizableProperty().setValue(Boolean.FALSE);
			primaryStage.setMaximized(false); 
			primaryStage.setResizable(false);   
			primaryStage.setScene(scene);		
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
