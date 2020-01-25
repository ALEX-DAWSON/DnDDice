/*
 * Alex Dawson
 * 24-Jan-2020
 * --------------------------------------
 * DnDDice/Dice.java
 */
package dnddice;
import java.util.*;
import java.text.*;

/**
 *
 * @author ktad2
 */
public class Dice {
    public Random random = new Random();
    public SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
    public Date date;
    private String name;
    private int roll;
     
    public Dice(String n, int max){
        name = n;
        roll = random.nextInt(max) + 1;
        date = new Date();
    }
    
    public String getRoll(){
        return roll + "";
    }
    
    public String toString(){
        return time.format(date) + "\t" + name + ":\t" + roll + "\r\n";
    }
    
}
