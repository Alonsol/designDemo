package com.alonsol.demo.design.orderdemo.demo2;

public class TransformCommand implements Command {


    private TetrisMachine machine;

    public TransformCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.transform();
    }
}
