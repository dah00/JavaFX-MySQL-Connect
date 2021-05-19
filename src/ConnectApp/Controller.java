package ConnectApp;

import Connectivity.DatabaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controller {
    @FXML
    public TextField textField;
    @FXML
    public Label textLabel;

    public void button(ActionEvent event) {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String connectQuery = "SELECT firstname FROM usersdb.student WHERE id = 2" ;

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(connectQuery);

            while(queryOutput.next()){
                textLabel.setText(queryOutput.getString("firstname"));
            }

        } catch (Exception e){
            e.printStackTrace();
        }



    }


}
