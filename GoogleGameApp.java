import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GoogleGameApp {
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	public void start(Stage stage) throws Exception {
		BorderPane root = new BorderPane();
		
		stage.setScene(new Scene(root, 700, 700));
		stage.setTitle("GoogleGame");
		stage.setResizable(false);
		stage.show();
	}
}
