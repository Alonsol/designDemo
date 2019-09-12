package com.alonsol.demo.mediatordemo.demo2;

public class SoundCard extends Colleague {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }


    /**
     * 播放音频
     * @param data
     */
    public void soundPlay(String data) {
        System.out.println("音频：" + data);
    }
}
