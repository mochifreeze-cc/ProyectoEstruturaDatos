
package com.espol.proyectoestruturadatos.dstructure;

import com.espol.proyectoestruturadatos.model.board.Board;
import java.util.LinkedList;
import java.util.List;

/*
 * @author Dylan Jeanpier Pincay Salazar
 * @author Gabriel Cevallos
 * @author Helen Cruz
 */

public class GameTreeNode {

    private Board board; // Tablero 
    private int movement; // Movimiento
    private int utility; // Utilidad
    private int depth; // nivel
    private boolean maximizing; // Max o Min 
    private GameTreeNode parent; // Nodo Padre
    private List<GameTreeNode> children; // Nodo Hijos

    public GameTreeNode(Board board) {
        this.board = board;
        this.movement = -1;
        this.utility = 0;
        this.depth = 0;
        this.maximizing = true;
        this.parent = null;
        this.children = new LinkedList<>();
    }

    public GameTreeNode(Board board, int movement, int depth, boolean maximizing) {
        this.board = board;
        this.movement = movement;
        this.utility = 0;
        this.depth = depth;
        this.maximizing = maximizing;
        this.parent = null;
        this.children = new LinkedList<>();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public int getUtility() {
        return utility;
    }

    public void setUtility(int utility) {
        this.utility = utility;
    }

    public int getDepth() {
        return depth;
    }

    public boolean isMaximizing() {
        return maximizing;
    }

    public GameTreeNode getParent() {
        return parent;
    }

    public List<GameTreeNode> getChildren() {
        return children;
    }

    public void addChild(GameTreeNode child) {
        child.parent = this;
        children.add(child);
    }

    public boolean isLeaf() {
        return children.isEmpty();
    }
}
