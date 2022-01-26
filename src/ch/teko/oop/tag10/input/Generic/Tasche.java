package ch.teko.oop.tag10.input.Generic;

public class Tasche<T> {
    private T var;

    public Tasche(T var) {
        this.var = var;
    }

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}
