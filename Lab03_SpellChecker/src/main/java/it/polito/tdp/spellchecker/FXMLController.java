package it.polito.tdp.spellchecker;

import java.net.URL;
import java.util.ResourceBundle;


import it.polito.tdp.spellchecker.model.Dictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;

public class FXMLController {
	
	private Dictionary model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton txtMenu;

    @FXML
    private TextArea txtArea1;

    @FXML
    private TextArea txtArea2;

    @FXML
    private Label conteggioErrori;

    @FXML
    private Label conteggioTempo;

    @FXML
    void doClearText(ActionEvent event) {

    }

    @FXML
    void doSpellCheck(ActionEvent event) {

    }

    @FXML
    void inglese(ActionEvent event) {
    	txtMenu.setText("English");

    }

    @FXML
    void italiano(ActionEvent event) {
    	txtMenu.setText("Italiano");

    }
    
    public void setModel(Dictionary model) {
    	this.model = model;
    }

    @FXML
    void initialize() {
        assert txtMenu != null : "fx:id=\"txtMenu\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtArea1 != null : "fx:id=\"txtArea1\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtArea2 != null : "fx:id=\"txtArea2\" was not injected: check your FXML file 'Scene.fxml'.";
        assert conteggioErrori != null : "fx:id=\"conteggioErrori\" was not injected: check your FXML file 'Scene.fxml'.";
        assert conteggioTempo != null : "fx:id=\"conteggioTempo\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
