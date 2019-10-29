
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyler
 */
public class LandTract {
    
    private double length;
    private double width;
    
    public LandTract(double length, double width){
        this.length = length;
        this.width = width;
           
    }
    
    public double getArea(){
        return length * width;
    }
    
    public boolean checkIfEqual(LandTract tract2){
       
        if(this.length == tract2.getArea() && this.width == tract2.getArea()){
            return true;
        }
        else
        {
            return false;
        }
        
        
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "LandTract{" + "length=" + length + ", width=" + width + '}';
    }
    
    
}
