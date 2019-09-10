package com.alonsol.demo.backupdemo.demo1;

public class Caretaker {

    Memoto mMemoto;//备忘录

    /**
     * 存档
     *
     * @param memoto
     */
    public void archive(Memoto memoto) {
        this.mMemoto = memoto;
    }

    public Memoto getMemoto() {
        return mMemoto;
    }


}
