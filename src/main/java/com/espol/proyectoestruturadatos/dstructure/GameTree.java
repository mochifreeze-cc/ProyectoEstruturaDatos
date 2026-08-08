
package com.espol.proyectoestruturadatos.dstructure;

import com.espol.proyectoestruturadatos.model.game.Board;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Helen
 */
public class GameTree {

    private GameTreeNode root;

    public GameTree(Board board) {
        root = new GameTreeNode(board);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public GameTreeNode getRoot() {
        return root;
    }

    public void setRoot(Board board) {
        root.setBoard(board);
    }

    public boolean isLeaf() {
        return root.isLeaf();
    }

    public GameTreeNode addChild(
            GameTreeNode parent,
            Board board,
            int movement,
            boolean maximizing) {

        GameTreeNode child = new GameTreeNode(
                board,
                movement,
                parent.getDepth() + 1,
                maximizing
        );

        parent.addChild(child);

        return child;
    }

    public Iterator<GameTreeNode> getChildrenIterator() {
        return root.getChildren().iterator();
    }

    public void traverse() {

        Queue<GameTreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            GameTreeNode node = queue.poll();

            System.out.println("---");
            System.out.println("Nivel: " + node.getDepth());
            System.out.println("Movimiento: " + node.getMovement());
            System.out.println("Utilidad: " + node.getUtility());
            System.out.println(
                    "Tipo: " +
                    (node.isMaximizing() ? "MAX" : "MIN")
            );

            for (GameTreeNode child : node.getChildren()) {
                queue.offer(child);
            }

            System.out.println("---");
        }
    }
}
