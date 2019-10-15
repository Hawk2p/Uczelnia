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
    @FXML
    private Text mousePrice;
    @FXML
    private Text mouseAmount;
    @FXML
    private Text firstKeyboardPrice;
    @FXML
    private Text firstKeyboardAmount;
    @FXML
    private Text secondKeyboardPrice;
    @FXML
    private Text secondKeyboardAmount;
    @FXML
    private Text drDrePrice;
    @FXML
    private Text drDreAmount;
    @FXML
    private Text jblPrice;
    @FXML
    private Text jblAmount;
    @FXML
    private Text razerPrice;
    @FXML
    private Text razerAmount;


    public void mainSite(){
        content.getChildren().clear();
        content.getChildren().addAll(banner,categories);

    }
    public void clearBucket(){

    }
    public void categoryOne() throws IOException {
        content.getChildren().clear();
        Pane pane = FXMLLoader.load(getClass().getResource("categories/firstCategory.fxml"));
        content.getChildren().addAll(pane);

    }
    public void categoryTwo() throws IOException {
        content.getChildren().clear();
        Pane pane = FXMLLoader.load(getClass().getResource("categories/secondCategory.fxml"));
        content.getChildren().addAll(pane);
    }
    public void categoryThree() throws IOException {
        content.getChildren().clear();
        Pane pane = FXMLLoader.load(getClass().getResource("categories/thirdCategory.fxml"));
        content.getChildren().add(pane);
    }
    public void textUs(){

    }
    public void printFacture(){

    }
    public void addDrDre(){

    }
    public void addJbl(){

    }
    public void addRazer(){

    }
    public void addMouse(){

    }
    public void addFirstKeyboard(){

    }
    public void addSecondKeyboard(){

    }

    public Text getMousePrice() {
        return mousePrice;
    }

    public void setMousePrice(Text mousePrice) {
        this.mousePrice = mousePrice;
    }

    public Text getMouseAmount() {
        return mouseAmount;
    }

    public void setMouseAmount(Text mouseAmount) {
        this.mouseAmount = mouseAmount;
    }

    public Text getFirstKeyboardPrice() {
        return firstKeyboardPrice;
    }

    public void setFirstKeyboardPrice(Text firstKeyboardPrice) {
        this.firstKeyboardPrice = firstKeyboardPrice;
    }

    public Text getFirstKeyboardAmount() {
        return firstKeyboardAmount;
    }

    public void setFirstKeyboardAmount(Text firstKeyboardAmount) {
        this.firstKeyboardAmount = firstKeyboardAmount;
    }

    public Text getSecondKeyboardPrice() {
        return secondKeyboardPrice;
    }

    public void setSecondKeyboardPrice(Text secondKeyboardPrice) {
        this.secondKeyboardPrice = secondKeyboardPrice;
    }

    public Text getSecondKeyboardAmount() {
        return secondKeyboardAmount;
    }

    public void setSecondKeyboardAmount(Text secondKeyboardAmount) {
        this.secondKeyboardAmount = secondKeyboardAmount;
    }

    public Text getDrDrePrice() {
        return drDrePrice;
    }

    public void setDrDrePrice(Text drDrePrice) {
        this.drDrePrice = drDrePrice;
    }

    public Text getAmountOfItems() {
        return amountOfItems;
    }

    public void setAmountOfItems(Text amountOfItems) {
        this.amountOfItems = amountOfItems;
    }

    public Text getDrDreAmount() {
        return drDreAmount;
    }

    public void setDrDreAmount(Text drDreAmount) {
        this.drDreAmount = drDreAmount;
    }

    public Text getJblPrice() {
        return jblPrice;
    }

    public void setJblPrice(Text jblPrice) {
        this.jblPrice = jblPrice;
    }

    public Text getJblAmount() {
        return jblAmount;
    }

    public void setJblAmount(Text jblAmount) {
        this.jblAmount = jblAmount;
    }

    public Text getRazerPrice() {
        return razerPrice;
    }

    public void setRazerPrice(Text razerPrice) {
        this.razerPrice = razerPrice;
    }

    public Text getRazerAmount() {
        return razerAmount;
    }

    public void setRazerAmount(Text razerAmount) {
        this.razerAmount = razerAmount;
    }

    public Text getMoney() {
        return money;
    }

    public void setMoney(Text money) {
        this.money = money;
    }

}
