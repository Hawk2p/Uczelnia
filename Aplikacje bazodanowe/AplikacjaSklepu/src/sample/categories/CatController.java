package sample.categories;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import sample.Controller;

public class CatController {

    Controller controller = new Controller();
    private int totalItems =0;
    private int totalMoney =0;

    @FXML
    private Text ramPrice;
    @FXML
    private Text ramAmount;
    @FXML
    private Text graphicPrice;
    @FXML
    private Text graphicAmount;
    @FXML
    private Text processorPrice;
    @FXML
    private Text processorAmount;

    public void addRam(){
        totalItems++;
        totalMoney++;
        String it = "10";
        String mo = "5";
        controller.getAmountOfItems().setText(it);
        controller.getMoney().setText(mo);

    }
    public void addGraphic(){

    }
    public void addProcessor(){

    }
    public Text getRamPrice() {
        return ramPrice;
    }

    public void setRamPrice(Text ramPrice) {
        this.ramPrice = ramPrice;
    }

    public Text getRamAmount() {
        return ramAmount;
    }

    public void setRamAmount(Text ramAmount) {
        this.ramAmount = ramAmount;
    }

    public Text getGraphicPrice() {
        return graphicPrice;
    }

    public void setGraphicPrice(Text graphicPrice) {
        this.graphicPrice = graphicPrice;
    }

    public Text getGraphicAmount() {
        return graphicAmount;
    }

    public void setGraphicAmount(Text graphicAmount) {
        this.graphicAmount = graphicAmount;
    }

    public Text getProcessorPrice() {
        return processorPrice;
    }

    public void setProcessorPrice(Text processorPrice) {
        this.processorPrice = processorPrice;
    }

    public Text getProcessorAmount() {
        return processorAmount;
    }

    public void setProcessorAmount(Text processorAmount) {
        this.processorAmount = processorAmount;
    }


}
