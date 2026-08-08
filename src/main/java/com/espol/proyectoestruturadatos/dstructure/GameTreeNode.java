/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.proyectoestruturadatos.dstructure;

import com.espol.proyectoestruturadatos.model.game.Board;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Helen
 */
public class GameTreeNode {

    private Board board;
    private int movement;
    private int utility;
    private int depth;
    private boolean maximizing;

    private GameTreeNode parent;
    private List<GameTreeNode> children;

    public GameTreeNode(Board board) {
        this.board = board;
        this.movement = -1;
        this.utility = 0;
        this.depth = 0;
        this.maximizing = true;
        this.parent = null;
        this.children = new LinkedList<>();
    }

    public GameTreeNode(
            Board board,
            int movement,
            int depth,
            boolean maximizing) {

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
