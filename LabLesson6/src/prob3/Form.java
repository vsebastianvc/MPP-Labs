package prob3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Form extends Application {

	@FXML
	private TextField txtName;
	@FXML
	private TextField txtStret;
	@FXML
	private TextField txtCity;
	@FXML
	private TextField txtState;
	@FXML
	private TextField txtZip;
	@FXML
	private Button btnSubmit;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
		primaryStage.setTitle("Address Form");
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void btnSubmitOnAction(ActionEvent event) {
		System.out.println(txtName.getText());
		System.out.println(txtStret.getText());
		System.out.print(txtCity.getText() + ", " + txtState.getText() + " " + txtZip.getText());
	}

}