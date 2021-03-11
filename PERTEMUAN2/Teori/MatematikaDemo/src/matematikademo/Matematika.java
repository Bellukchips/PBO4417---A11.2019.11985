/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematikademo;

/**
 *
 * @author nothing
 */
public class Matematika {
    private float total = 0;
    Matematika(){
        
    }
    
    public float add(float operand1,float operand2){
        total = operand1 + operand2;
        return total;
    }
    public float subtraction(float operand1,float operand2){
        total = operand1 - operand2;
        return total;
    }
    public float devision(float operand1,float operand2){
        total = operand1 / operand2;
        return total;
    }
    public float multiplication(float operand1,float operand2){
        total = operand1 * operand2;
        return total;
    }
    public float getTotal(){
        return total;
    }
}
