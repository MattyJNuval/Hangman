import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Hangman extends Application {

	@Override
	public void start(final Stage primaryStage) throws IOException {
		final Game game = new Game();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Hangman.fxml"));
		loader.setController(new GameController(game));
		System.out.println(getClass().getResource("Hangman.fxml"));
		Parent root = loader.load();

		Scene scene = new Scene(root, 700, 800);
		primaryStage.setResizable(false);

		scene.getStylesheets().add(getClass().getResource("Hangman.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
