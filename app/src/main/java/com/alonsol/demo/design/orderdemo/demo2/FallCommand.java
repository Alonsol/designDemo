package com.alonsol.demo.design.orderdemo.demo2;

public class FallCommand implements Command {

    private TetrisMachine machine;

    public FallCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.fastToBottom();
    }
}
