package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class CalcolatriceController {
	
	double num1, num2, risultato = 0; 
	int op;

    @FXML
    private Button uno;

    @FXML
    private Button due;

    @FXML
    private Button quattro;

    @FXML
    private Button cinque;

    @FXML
    private Button tre;

    @FXML
    private Button add;

    @FXML
    private Button sei;

    @FXML
    private Button sottr;

    @FXML
    private Button sette;

    @FXML
    private Button nove;

    @FXML
    private Button mol;

    @FXML
    private Button zero;

    @FXML
    private Button ris;

    @FXML
    private Button div;

    @FXML
    private Button pun;

    @FXML
    private Button rad;

    @FXML
    private Button pow;

    @FXML
    private Button canc;

    @FXML
    private Button otto;

    @FXML
    private Button perc;

    @FXML
    private TextField display;

    @FXML
    void addizione(ActionEvent event) {
    	num1 = Double.parseDouble(display.getText());
    	display.setText("");
    	
    	op = 1;

    }

    @FXML
    void btn0(ActionEvent event) {
    	display.setText(display.getText() + "0");

    }

    @FXML
    void btn1(ActionEvent event) {
    	display.setText(display.getText() + "1");

    }

    @FXML
    void btn2(ActionEvent event) {
    	display.setText(display.getText() + "2");

    }

    @FXML
    void btn3(ActionEvent event) {
    	display.setText(display.getText() + "3");

    }

    @FXML
    void btn4(ActionEvent event) {
    	display.setText(display.getText() + "4");

    }

    @FXML
    void btn5(ActionEvent event) {
    	display.setText(display.getText() + "5");

    }

    @FXML
    void btn6(ActionEvent event) {
    	display.setText(display.getText() + "6");

    }

    @FXML
    void btn7(ActionEvent event) {
    	display.setText(display.getText() + "7");

    }

    @FXML
    void btn8(ActionEvent event) {
    	display.setText(display.getText() + "8");

    }

    @FXML
    void btn9(ActionEvent event) {
    	display.setText(display.getText() + "9");

    }

    @FXML
    void cancella(ActionEvent event) {
    	display.setText("");

    }

    @FXML
    void divisione(ActionEvent event) {
    	num1 = Double.parseDouble(display.getText());
    	display.setText("");
    	
    	op = 4;

    }

    @FXML
    void moltiplicazione(ActionEvent event) {
    	num1 = Double.parseDouble(display.getText());
    	display.setText("");
    	
    	op = 3;

    }

    @FXML
    void percentuale(ActionEvent event) {
    	num1 = Double.parseDouble(display.getText());
    	display.setText("");
    	
    	op = 5;

    }

    @FXML
    void potenza(ActionEvent event) {
    	num1 = Double.parseDouble(display.getText());
    	display.setText("");
    	
    	op = 6;

    }

    @FXML
    void radice(ActionEvent event) {
    	num1 = Double.parseDouble(display.getText());
		
		risultato = Math.sqrt(num1);
		display.setText(String.valueOf(risultato));

    }

    @FXML
    void sottrazione(ActionEvent event) {
    	num1 = Double.parseDouble(display.getText());
    	display.setText("");
    	
    	op = 2;

    }

    @FXML
    void uguale(ActionEvent event) {
		num2 = Double.parseDouble(display.getText());
		
		switch(op){
		
		case 1:
			risultato = num1 + num2;
			display.setText(String.valueOf(risultato));
			break;
		case 2:
			risultato = num1 - num2;
			display.setText(String.valueOf(risultato));
			break;
		case 3:
			risultato = num1 * num2;
			display.setText(String.valueOf(risultato));
			break;
		case 4:
			risultato = num1 / num2;
			display.setText(String.valueOf(risultato));
			break;
		case 5:
			risultato = num1 % num2;
			display.setText(String.valueOf(risultato));
			break;
		case 6:
			risultato = Math.pow(num1, num2);
			display.setText(String.valueOf(risultato));
			break;
		}

    }

    @FXML
    void virgola(ActionEvent event) {
    	display.setText(display.getText() + ".");

    }

}
