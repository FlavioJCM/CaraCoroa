package application;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TelaController implements Initializable {

//	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	private boolean isGirou = false;
	@FXML
	private Button btnGirar;
	@FXML
	private ImageView imgMoeda;

	private final Image cara = new Image(getClass().getResourceAsStream("/imagens/cara.png"));
	private final Image coroa = new Image(this.getClass().getResourceAsStream("/imagens/coroa.png"));

	@FXML
	void girar(ActionEvent event) {
		Random ra = new Random();
		int x = ra.nextInt(2);
		if (!isGirou) {
			if (x == 0) {
				imgMoeda.setImage(cara);
			} else {
				imgMoeda.setImage(coroa);
			}
			btnGirar.setText("DE NOVO");
			imgMoeda.setVisible(true);
			isGirou = true;
		} else {
			btnGirar.setText("GIRAR");
			imgMoeda.setVisible(false);
			isGirou = false;
		}
		
	}

}
