
package com.espol.proyectoestruturadatos.model.player;
import com.espol.proyectoestruturadatos.model.board.Symbol;
/**
 *
 * @author Helen
 */
public abstract class Player {

    protected Symbol symbol;
    protected int wins;

    public Player() {
        this.wins = 0;
    }

    public Player(Symbol symbol) {
        this.symbol = symbol;
        this.wins = 0;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void addWin() {
        wins++;
    }

    public String getColor() {
        return symbol.getColor();
    }

    public void setColor(String color) {
        symbol.setColor(color);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()
                + "(" + symbol + ")";
    }
}
