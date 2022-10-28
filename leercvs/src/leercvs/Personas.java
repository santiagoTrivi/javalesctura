/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leercvs;

/**
 *
 * @author Carvajal-Triviño
 */
public class Personas {
    
    Node head;
    int counter;
        
    public Personas(){
        head = null;
        counter = 0;
    }
        
    public void add(String item1, String item2){
        Node newNode = new Node(item1, item2);
        if (head == null){ 
                head = newNode; 
        }else{
            Node aux = head;
            while (aux.next != null){
                aux = aux.next;
            }
            aux.next = newNode;
        }
        counter += 1;
            
    }
        
    public void show(){
        Node aux = head;
        while(aux != null){
            System.out.println(aux.nombre);
            aux = aux.next;
        }
        
    }
    
    public void detele(String item1){
        Node aux = head;
        Node prev = null;
        while(!aux.nombre.equals(item1)){
            prev = aux;
            aux = aux.next;
        }
        prev.next = aux.next;
        counter -= 1;
    }
    
    public void lenght(){
        System.out.println(counter);
    }
    
    public void insert(int position, String item1, String item2){
        Node newNode = new Node(item1, item2);
        int counterPosition = 0;
        Node aux = head;
        Node prev = null;
        while (counterPosition < position ){
            counterPosition += 1;
            prev = aux;
            aux = aux.next;
        }
        prev.next = newNode;
        newNode.next = aux;
    }
    
}
