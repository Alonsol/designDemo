package com.alonsol.demo.mediatordemo.demo2;

public class Client {

    public static void main(String[] args){
        //构造主板对象
        MainBoard mediator = new MainBoard();
        //分别构造各个零部件
        CDDevice cdDevice = new CDDevice(mediator);
        CPU cpu = new CPU(mediator);
        GraphicsCard graphicsCard = new GraphicsCard(mediator);
        SoundCard soundCard = new SoundCard(mediator);

        //将各个零部件安装到主板
        mediator.setCCDevice(cdDevice);
        mediator.setCPU(cpu);
        mediator.setGraphicsCard(graphicsCard);
        mediator.setSoundCard(soundCard);

        //完成后就可以开始放片了
        cdDevice.load();

    }
}
