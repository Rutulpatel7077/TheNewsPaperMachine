/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Rutul
 */
public class LaunchNewsPaperSystem extends Application {

    NewsPaper theStar, torontoSun, barrieExaminer, globeAndMail;
 
    @Override
    public void start(Stage primaryStage) throws IOException {

        
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("NewsPaperSystemView.fxml"));
            
            AnchorPane newsPaperPane = loader.load();
            Scene scene = new Scene(newsPaperPane);
           
            primaryStage.setTitle("The NewsPaper Machine");
            primaryStage.setScene(scene);
            primaryStage.show();
        
            
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
   
    }

}
