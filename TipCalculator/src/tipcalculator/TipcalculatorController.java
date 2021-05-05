/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipcalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author tatiana
 */
public class TipcalculatorController implements Initializable {

    @FXML Button calculateButton;
    @FXML TextField amountTextField;
    @FXML Label totalTipLabel;
    @FXML RadioButton tip15RadioButton;
    @FXML RadioButton tip20RadioButton;
    @FXML ToggleGroup ratesToggleGroup;
    
    
     @FXML
    private void handleAction_Calc(javafx.event.ActionEvent event) {
        
        /* local variable(s) definition */
        //float init, pct, netPct, result;
         float amount, tip15 = 15, tip20 = 20, totalTip = 0;
        
        
        amount = Float.parseFloat(amountTextField.getText());
        
        
        if(this.ratesToggleGroup.getSelectedToggle().equals(this.tip15RadioButton))
            totalTip = (tip15 * amount) / 100 ;
        
        if(this.ratesToggleGroup.getSelectedToggle().equals(this.tip20RadioButton))
            totalTip = (tip20 * amount) / 100 ;
        
        totalTipLabel.setText(Float.toString(totalTip));
        
       
    }

  
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
         //TextField
        amountTextField.setText("Type Billing Amount Here.");
        
        //set tip label to blank
        totalTipLabel.setText("");
        ratesToggleGroup = new ToggleGroup();
        this.tip15RadioButton.setToggleGroup(ratesToggleGroup);
        this.tip20RadioButton.setToggleGroup(ratesToggleGroup);
        
    
}

}
