/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.proyectoestruturadatos.model.game;

// A CARGO: JEAN PINCAY 

import java.util.Objects;

/*
 * @author Dylan Jeanpier Pincay Salazar
 * @author Gabriel Cevallos
 * @author Helen Cruz
 */

public class Symbol {
    private Character character;
    private String color;
    
    public Symbol(Character character){
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    public String getColor() {
        return color;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        
        if(obj == null){
            return false;
        }
        
        if(getClass() != obj.getClass()){ // Los objetos son de la misma clase
            return false;
        }
        
        final Symbol other = (Symbol) obj;
        return Objects.equals(this.character, other.character); // Si ambos simbolos son iguales
    }
    
    @Override
    public String toString() {
        return character + "";
    }
}
