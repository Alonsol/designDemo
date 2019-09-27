package com.alonsol.demo.design.mediatordemo.demo2;

public class GraphicsCard extends Colleague {

    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 播放视频
     * @param data
     */
    public void videoPlay(String data) {
        System.out.println("视频："+data);
    }

}
