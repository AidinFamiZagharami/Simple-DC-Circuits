/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
import java.util.*;

/**
 *
 * @author aidinfami
 */
//code mostly from last lab manual 
public class Circuit {
    public ArrayList<Resistor> resistors = new ArrayList<Resistor>();
    public ArrayList<VoltageSource> voltagesource = new ArrayList<VoltageSource>();
     
    public void addr(Resistor r){
       resistors.add(r); 
    }
    
    public void addv(VoltageSource v){
        voltagesource.add(v);
    }
    
        private static Circuit instance = null;
    
    public static Circuit getInstance(){
        if(instance  == null){
            instance = new Circuit();
        }
        return instance;
    }
    
    private Circuit() {}
    
    //this method will check the arraylist t osee if there are any values outputed
    //if there are values are in V or R it will output the vales at index i
    public String toString(){
        String result1= "";
        String result= "";
        int i=0;
        while(i<voltagesource.size() || i<resistors.size()){
            if(i<voltagesource.size()){
                result += voltagesource.get(i);
            }
            if(i<resistors.size()){
                result1 += resistors.get(i);
            }
            i++;
        }
        return result+result1;
    }
}
