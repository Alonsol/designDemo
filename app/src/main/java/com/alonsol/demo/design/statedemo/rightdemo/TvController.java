package com.alonsol.demo.design.statedemo.rightdemo;

public class TvController implements PowerController {

    private TvState mTvState;


    private void setTvState(TvState tvState) {
        this.mTvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
    }


    public void nextChannel() {
        mTvState.nextChannel();
    }

    public void prevChannel() {
        mTvState.prevChannel();
    }

    public void turnUp() {
        mTvState.turnUp();
    }

    public void turnDown() {
        mTvState.turnDown();
    }
}
