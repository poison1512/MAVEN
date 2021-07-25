package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
	Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
	Scene scene = new Scene(root);

	stage.setTitle("Media Player 1.0");

	scene.setOnMouseClicked(new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
		if(event.getClickCount() == 2) {
			stage.setFullScreen(true);
		}

		}
	});


	stage.setScene(scene);
	stage.show();

	}
	public static void main(String[] args) {
		launch(args);
	}
}
