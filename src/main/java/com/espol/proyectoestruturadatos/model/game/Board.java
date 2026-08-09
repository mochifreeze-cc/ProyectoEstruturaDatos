/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.proyectoestruturadatos.model.game;

/*
 * @author Dylan Jeanpier Pincay Salazar
 * @author Gabriel Cevallos
 * @author Helen Cruz
 */

public class Board {
    private final Integer rows = 3; // filas de tablero.
    private final Integer columns = 3; // columnas del tablero.
    public Box[] boxes; // Matrix 3 x 3, osea el contenido del tablero.
    // public List<Subscriber> suscribers; 
    private Symbol winner; // Conocer el ganador
    private int lastMovement; // Ultima jugada que se realizo para llegar a ese estado.
    public boolean hasEnded; // Verifica si la partida a terminado.
    // public boolean choosen;
   
    
    
}
