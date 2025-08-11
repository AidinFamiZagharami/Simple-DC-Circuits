/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author aidinfami
 */
//code taken from last lab 
public class Node {
    
        public int id; 
    public static int id_next=0; 
    
    public Node()
    {
        this.id= id_next;
        id_next++;     
    }
    
    public int getNode(){
       return id; 
    }
    
    public String toString(){
        return " " + this.id;
    }
    
}