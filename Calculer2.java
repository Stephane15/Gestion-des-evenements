package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Calculer2 {

    @FXML
    private Button add;

    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
    private Label lblres;

    @FXML
    private Button Sous;
    
    @FXML
    private Button multip;
    
    @FXML
    private Button divise;

    Double num1 ,num2, res;
    
    @FXML
    void check()
    {
    		num1 = (double) Integer.parseInt(text1.getText());
			num2 = (double) Integer.parseInt(text2.getText());
			res = num1 + num2;
			lblres.setText(Double.toString(res));
    }
    
    @FXML
    void check2()
    {
    		num1 = (double) Integer.parseInt(text1.getText());
			num2 = (double) Integer.parseInt(text2.getText());
			res = num1 - num2;
			lblres.setText(Double.toString(res));
			
    }
    
    @FXML
    void multiply()
    {
    		num1 = (double) Integer.parseInt(text1.getText());
			num2 = (double) Integer.parseInt(text2.getText());
			res = num1 * num2;
			lblres.setText(Double.toString(res));		
    		
    }
    
    @FXML
    void divide()
    {
    		num1 = (double) Integer.parseInt(text1.getText());
			num2 = (double) Integer.parseInt(text2.getText());
			res = num1 / num2;
			lblres.setText(Double.toString(res));		
    		
    }
    
    
    
    
    @FXML
    void checkNum() {
    		try {
    			
				num1=(double) Integer.parseInt(text1.getText());
				
			} catch (NumberFormatException e) {
				Alert alert=new Alert(AlertType.ERROR);
				alert.setHeaderText("Erreur");
				alert.setTitle("Erreur");
				alert.setContentText("ecrire un nombre");
				alert.show();
				//e.printStackTrace();
			}
    		
    }
    
    
}
