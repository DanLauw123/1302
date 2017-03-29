/**
 * Created by LAUW on 2/23/17.
 */
public class Candle {

    private String color;
    protected int height;


// Below this comment line is the 2 "Set Method" for color and height.
    public void setColor(String CandleColour){
        this.color = CandleColour;

    }
    public void setHeight(int CandleHeight){
        this.height = CandleHeight;
    }


    //the 3 methods below were created for "Get Methods"(return color, height, and price).
    public String getColor(){
        return color;
    }
    public int getHeight(){
        return height;
    }
    public int getPrice(){
        return height * 2;
    }

}

