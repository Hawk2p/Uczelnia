package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

import java.io.IOException;

public class Controller {
    @FXML
    private Text amountOfItems;
    @FXML
    private Text money;
    @FXML
    private AnchorPane content;
    @FXML
    private Pane banner;
    @FXML
    private Pane categories;



    public void mainSite(){
        content.getChildren().clear();
        content.getChildren().addAll(banner,categories);

    }
    public void clearBucket(){

    }
    public void categoryOne() throws IOException {
        content.getChildren().clear();
        Pane pane = FXMLLoader.load(getClass().getResource("firstCategory.fxml"));
        content.getChildren().addAll(pane);

    }
    public void categoryTwo() throws IOException {
        content.getChildren().clear();
        Pane pane = FXMLLoader.load(getClass().getResource("secondCategory.fxml"));
        content.getChildren().addAll(pane);
    }
    public void categoryThree(){
        content.getChildren().clear();
    }
    public void textUs(){

    }
    public void printFacture(){

    }




}
