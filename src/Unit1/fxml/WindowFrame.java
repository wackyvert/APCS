package Unit1.fxml;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class WindowFrame {

    @FXML
    ColorPicker colorPicker = new ColorPicker();
    @FXML
    TextField widthInput = new TextField();
    @FXML
    TextField lengthInput = new TextField();
    @FXML
    CheckBox fancyButton = new CheckBox();
    @FXML
    CheckBox crownButton = new CheckBox();
    @FXML
    TextArea output = new TextArea();
    double frameCost;
    double glassCost;
    double cardboardCost;
    double totalCost;
    DecimalFormat df = new DecimalFormat("0.00");

    public void createPictureFrame(){
        int length = Integer.parseInt(lengthInput.getText());
        int width = Integer.parseInt(widthInput.getText());
        int totalArea = width*length;
        String hexColor = "#" + Integer.toHexString((colorPicker).getValue().hashCode());
        if (fancyButton.isSelected())
        {
            frameCost = totalArea * 0.25;
        }
        else
        {
            frameCost = totalArea * 0.15;
        }
        glassCost = totalArea * 0.07;
        cardboardCost = totalArea * 0.02;
        if (crownButton.isSelected())
        {
            totalCost = glassCost + cardboardCost + frameCost + 1.4;
        }
        else
        {
            totalCost = glassCost + cardboardCost + frameCost;
        }
        output.setText("Total Cost Of a "+hexColor+" Frame: $"+df.format(frameCost)+"" +
                "\n Total Cost Of Glass: $"+df.format(glassCost)+
                "\n Total Cost Of Cardboard: $"+df.format(cardboardCost)+
                "\n Total Cost: $"+df.format(totalCost));
        }





}
