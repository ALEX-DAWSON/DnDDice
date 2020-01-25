/*
 * Alex Dawson
 * 24-Jan-2020
 * --------------------------------------
 * DnDDice/Calculator.java
 */
package dnddice;

/**
 *
 * @author ktad2
 */
public class Calculator {
    
    private int num1;
    private int num2;
    private int answer;
    
    public Calculator(int nOne, int nTwo){
        num1 = nOne;
        num2 = nTwo;
        answer = nOne + nTwo;
    }
    
    public String toString(){
        return num1 + " + " + num2 + "\t=\t" + answer + "\r\n";
    }
    
    public String getAnswer(){
        return answer + "";
    }
    
}
