import java.util.Scanner;

/**
 * Created by LAUW on 2/23/17.
 */
public class ScantedCandle extends Candle{
    //overide the height and the price


   public int getScantedPrice(){
       return height * 3;
   }

   public void setScantedHeight(int scantedHeight){
       this.height = scantedHeight;

    }




}
