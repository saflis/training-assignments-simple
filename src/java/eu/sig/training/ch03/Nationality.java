package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;

public enum Nationality {
    DUTCH(Color.RED, Color.WHITE, Color.BLUE), GERMAN(Color.BLACK, Color.RED, Color.YELLOW),  BELGIAN(Color.BLACK, Color.YELLOW, Color.RED), 
    FRENCH(Color.BLUE, Color.WHITE, Color.RED), ITALIAN(Color.GREEN, Color.WHITE, Color.RED), 
    ROMANIA(Color.BLUE, Color.YELLOW, Color.RED), IRELAND(Color.GREEN, Color.WHITE, Color.ORANGE), HUNGARIAN(Color.RED, Color.WHITE, Color.GREEN), 
    BULGARIAN(Color.WHITE, Color.GREEN, Color.RED) RUSSIA(Color.WHITE, Color.BLUE, Color.RED), UNCLASSIFIED(Color.gray);
    
    private Color[] flagColors; 
    Nationality(Color[] pColor){
        this.flagColors = pColor;
    }

    public List<Color> getFlagColors(){
        return  Arrays.asList(this.flagColors);
    }
}