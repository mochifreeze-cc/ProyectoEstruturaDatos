/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.proyectoestruturadatos.model.board;

// A CARGO: JEAN PINCAY 
/*
 * @author Dylan Jeanpier Pincay Salazar
 * @author Gabriel Cevallos
 * @author Helen Cruz
 */
public class Box {
    private Symbol symbol;
    
    public Box(){
      
    }
    
    public Box(Box box){
        this.symbol = (box.symbol != null) ? new Symbol(box.symbol.getCharacter()) : null;
    }
    
    public Symbol getSymbol(){
        return this.symbol;
    }
    
    public void setSymbol(Symbol symbol){
        this.symbol = symbol;
    }
    
    public boolean isEmpty(){
        return this.symbol == null;
    }
    
    @Override
    public String toString() {
        return symbol != null ? symbol + "": " ";
    }
}
