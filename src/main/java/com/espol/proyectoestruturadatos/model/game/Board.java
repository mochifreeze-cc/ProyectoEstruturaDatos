/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.proyectoestruturadatos.model.game;

import java.util.LinkedList;
import java.util.List;

// A CARGO: JEAN PINCAY 
/*
 * @author Dylan Jeanpier Pincay Salazar
 * @author Gabriel Cevallos
 * @author Helen Cruz
 */

public class Board {
    // private final Integer rows = 3; // filas de tablero.
    // private final Integer columns = 3; // columnas del tablero.
    public final Box[] boxes = new Box[9]; // Matrix 3 x 3, osea el contenido del tablero.
    public List<Subscriber> suscribers;  ///////////////////////////////////////////
    private Symbol winner; // Conocer el ganador
    private int lastMovement; // Ultima jugada que se realizo para llegar a ese estado.
    public boolean hasEnded; // Verifica si la partida a terminado.
    public boolean choosen; ///////////////////////////////////////////////////////
   
    public Board(){
        hasEnded = false;
        suscribers = new LinkedList<>();
        
        for(int i = 0; i < boxes.length; i++){
            boxes[i] = new Box();
        }
    }
    
    public Board(Board board){
        this(); // llamamos el contructor anterior
        for(int i = 0; i < boxes.length; i++ ){
            boxes[i] = new Box(board.boxes[i]);
        }
    }

    public Symbol getWinner() {
        return winner;
    }

    public int getLastMovement() {
        return lastMovement;
    }
    
    
    public void setSymbol(Symbol symbol, int arrayIndex){
        boxes[arrayIndex].setSymbol(symbol);
        setLastMovement(arrayIndex);
        
        final boolean isWinner = this.isWinner(symbol);
        final boolean isFull = this.isFull();
       
        if (isWinner){
            this.winner = symbol;
        }
        
        if (isWinner || isFull){
            this.hasEnded = true;
            this.notifySuscribers();
        }
    }
    
    
}
