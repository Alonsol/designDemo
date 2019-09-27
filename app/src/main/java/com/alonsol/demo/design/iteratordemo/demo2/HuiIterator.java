package com.alonsol.demo.design.iteratordemo.demo2;

public class HuiIterator implements Iterator {

    private Employee[] array;
    private int position;

    public HuiIterator(Employee[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return !(position > array.length - 1 || array[position] == null);
    }

    @Override
    public Object next() {
        Employee employee = array[position];
        position++;
        return employee;
    }
}
