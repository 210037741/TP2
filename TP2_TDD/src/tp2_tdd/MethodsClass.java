/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp2_tdd;

/**
 *
 * @author Guest
 */
public class MethodsClass {
    public int add(int number1, int number2){
        return number1 + number2;
    }
    
    public double subtract(double one, double two){
        return one - two;
    }
    
    public float multiple(float num1, float num2){
        return num1 * num2;
    }
    
    public String notBeNull(String value) {
            return value;
    }
    
    public boolean beTrue(int state) {
        if (state == 1)
            return true;
        else
            return false;
    }
    
    
    
    
}
