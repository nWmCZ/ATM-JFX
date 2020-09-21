package eu.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Optional;

public class Controller {

    int accountId = 1;
    int accountPIN = 123;
    int regularAccountBalance = 1000;
    int savingAccountBalance = 0;
    boolean userLoggedIn = false;
    StringBuilder pinText = new StringBuilder();
    StringBuilder pinTextSecret = new StringBuilder();
    StringBuilder moneyText = new StringBuilder();

    @FXML
    private Button loginButton;

    @FXML
    private Label regularAccountBalanceLabel;

    @FXML
    private TextField idTextBox;

    @FXML
    private TextField pinTextField;

    @FXML
    private TextField moneyTextField;

    @FXML
    private Button b1Button;

    @FXML
    private Button b2Button;

    @FXML
    private Button b3Button;

    @FXML
    private Button b4Button;

    @FXML
    private Button b5Button;

    @FXML
    private Button b6Button;

    @FXML
    private Button b7Button;

    @FXML
    private Button b8Button;

    @FXML
    private Button b9Button;

    @FXML
    private Button b0Button;

    @FXML
    private Button asteriskButton;

    @FXML
    private Button hashtagButton;

    @FXML
    private Button okButton;

    @FXML
    private Button cancelButton;

    @FXML
    private Label savingsAccountBalanceLabel;

    @FXML
    private Label vysledek1;
    //prejmenovat

    @FXML
    private Button logoutButton;

    @FXML
    void button0_onAction(ActionEvent event) {
        String value = "0";
        if (userLoggedIn) {
            moneyText.append(value);
            moneyTextField.setText(moneyText.toString());
        } else {
            pinText.append(value);
            pinTextSecret.append("*");
            pinTextField.setText(pinTextSecret.toString());
        }
    }

    @FXML
    void button1_onAction(ActionEvent event) {
        String value = "1";
        if (userLoggedIn) {
            moneyText.append(value);
            moneyTextField.setText(moneyText.toString());
        } else {
            pinText.append(value);
            pinTextSecret.append("*");
            pinTextField.setText(pinTextSecret.toString());
        }
    }

    @FXML
    void button2_onAction(ActionEvent event) {
        String value = "2";
        if (userLoggedIn) {
            moneyText.append(value);
            moneyTextField.setText(moneyText.toString());
        } else {
            pinText.append(value);
            pinTextSecret.append("*");
            pinTextField.setText(pinTextSecret.toString());
        }
    }

    @FXML
    void button3_onAction(ActionEvent event) {
        String value = "3";
        if (userLoggedIn) {
            moneyText.append(value);
            moneyTextField.setText(moneyText.toString());
        } else {
            pinText.append(value);
            pinTextSecret.append("*");
            pinTextField.setText(pinTextSecret.toString());
        }
    }

    @FXML
    void button4_onAction(ActionEvent event) {
        String value = "4";
        if (userLoggedIn) {
            moneyText.append(value);
            moneyTextField.setText(moneyText.toString());
        } else {
            pinText.append(value);
            pinTextSecret.append("*");
            pinTextField.setText(pinTextSecret.toString());
        }
    }

    @FXML
    void button5_onAction(ActionEvent event) {
        String value = "5";
        if (userLoggedIn) {
            moneyText.append(value);
            moneyTextField.setText(moneyText.toString());
        } else {
            pinText.append(value);
            pinTextSecret.append("*");
            pinTextField.setText(pinTextSecret.toString());
        }
    }

    @FXML
    void button6_onAction(ActionEvent event) {
        String value = "6";
        if (userLoggedIn) {
            moneyText.append(value);
            moneyTextField.setText(moneyText.toString());
        } else {
            pinText.append(value);
            pinTextSecret.append("*");
            pinTextField.setText(pinTextSecret.toString());
        }
    }

    @FXML
    void button7_onAction(ActionEvent event) {
        String value = "7";
        if (userLoggedIn) {
            moneyText.append(value);
            moneyTextField.setText(moneyText.toString());
        } else {
            pinText.append(value);
            pinTextSecret.append("*");
            pinTextField.setText(pinTextSecret.toString());
        }
    }

    @FXML
    void button8_onAction(ActionEvent event) {
        String value = "8";
        if (userLoggedIn) {
            moneyText.append(value);
            moneyTextField.setText(moneyText.toString());
        } else {
            pinText.append(value);
            pinTextSecret.append("*");
            pinTextField.setText(pinTextSecret.toString());
        }
    }

    @FXML
    void button9_onAction(ActionEvent event) {
        String value = "9";
        if (userLoggedIn) {
            moneyText.append(value);
            moneyTextField.setText(moneyText.toString());
        } else {
            pinText.append(value);
            pinTextSecret.append("*");
            pinTextField.setText(pinTextSecret.toString());
        }
    }

    @FXML
    void buttonAsterisk_onAction(ActionEvent event) {
        String value = "*";
        if (userLoggedIn) {
            moneyText.append(value);
            moneyTextField.setText(moneyText.toString());
        } else {
            pinText.append(value);
            pinTextSecret.append("*");
            pinTextField.setText(pinTextSecret.toString());
        }
    }

    @FXML
    void buttonHastag_onAction(ActionEvent event) {
        String value = "#";
        if (userLoggedIn) {
            moneyText.append(value);
            moneyTextField.setText(moneyText.toString());
        } else {
            pinText.append(value);
            pinTextSecret.append("*");
            pinTextField.setText(pinTextSecret.toString());
        }
    }

    @FXML
    void cancel_onAction(ActionEvent event) {
        pinTextField.setText("");
        moneyTextField.setText("");
        pinText = new StringBuilder();
        pinTextSecret = new StringBuilder();
    }

    @FXML
    void login_onAction(ActionEvent event) {
        String text = idTextBox.getText();
        if (text.length() == 0) {
            // If no character is inserted
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Dialog");
            alert.setHeaderText("Wrong credentials");
            alert.setContentText("Please enter at least one character");

            alert.showAndWait();
            System.out.println("Case 1: No character was inserted");
        } else {
            // Trying to get integer from TextBox
            int accountNumber;
            try {
                accountNumber = Integer.parseInt(text);
            } catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Login Dialog");
                alert.setHeaderText("Wrong credentials");
                alert.setContentText("Please use correct credentials");

                alert.showAndWait();
                accountNumber = 0;
                System.out.println("Case 2: Account id was not a number");
            }

            // Check if value from TextBox is the same as defined
            if (accountNumber == accountId && accountPIN == Integer.parseInt(pinText.toString())) {
                System.out.println("User is logged in");
                idTextBox.setDisable(true);
                moneyTextField.setDisable(false);
                    regularAccountBalanceLabel.setText(String.valueOf(regularAccountBalance));
                userLoggedIn = true;
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Login Dialog");
                alert.setHeaderText("Wrong credentials");
                alert.setContentText("Please use correct credentials");

                alert.showAndWait();
                System.out.println("Case 3: wrong account id and pin");
            }
        }
    }

    @FXML
    void logout_onAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout from ATM");
        alert.setHeaderText(null);
        alert.setContentText("Do you really want to logout?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            // ... user chose OK
            System.exit(0);
        } else {
            // ... user chose CANCEL or closed the dialog
            // Do nothing
            System.out.println("User pressed cancel.");
        }
    }

    @FXML
    void ok_onAction(ActionEvent event) {
        System.out.println(pinText);
        pinText = new StringBuilder();
        pinTextSecret = new StringBuilder();
    }

    @FXML
    void widraw_onAction(ActionEvent event) {
        System.out.println(pinText);
        pinText = new StringBuilder();
        pinTextSecret = new StringBuilder();
        int withdrawSum = Integer.parseInt(moneyTextField.getText());
        if (withdrawSum > regularAccountBalance) {
            System.out.println("malo penez");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Unable to withdraw");
            alert.setHeaderText("");
            alert.setContentText("Not enough finances");
            alert.showAndWait();

        }
        else {
                    regularAccountBalance = regularAccountBalance - withdrawSum;
        }
        System.out.println("castka " + withdrawSum + " odectena");
        regularAccountBalanceLabel.setText(String.valueOf(regularAccountBalance));
    }

    @FXML
    void transfer_onAction(ActionEvent event) {
        System.out.println(pinText);
        pinText = new StringBuilder();
        pinTextSecret = new StringBuilder();
        int transferSum = Integer.parseInt(moneyTextField.getText());
        if (transferSum > regularAccountBalance) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Unable to trnsfer");
            alert.setHeaderText("");
            alert.setContentText("Please enter at least one character");
            alert.showAndWait();
        }
        else {

        }

        regularAccountBalance = regularAccountBalance - transferSum;
        savingAccountBalance = savingAccountBalance + transferSum;
        regularAccountBalanceLabel.setText(String.valueOf(regularAccountBalance));
        vysledek1.setText(String.valueOf(savingAccountBalance));
        System.out.println("castka " + transferSum + " prevedena");


    }
    @FXML
    void transferToRegular_onAction(ActionEvent event) {

    }
    @FXML
    void insert_onAction(ActionEvent event) {

    }

}
