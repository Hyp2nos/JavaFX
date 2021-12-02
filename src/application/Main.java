package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,800,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Fruits");
			HBox hbox1 = new HBox();
			Label nom =new Label("Fruit :");
			TextField textNom = new TextField();
			Button btn = new Button("Ajouter");
			hbox1.getChildren().addAll(nom,textNom,btn);
			hbox1.setPadding(new Insets(10, 10, 10, 10));
			hbox1.setSpacing(10);
			nom.setPadding(new Insets(10,0,0,0));
			
			VBox vBox1 = new VBox();
			ListView<String> listView1 = new ListView<String>();
			listView1.getItems().addAll("Orange","Pommes");
			vBox1.getChildren().add(listView1);
			root.setCenter(vBox1);
			
			root.setTop(hbox1);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
