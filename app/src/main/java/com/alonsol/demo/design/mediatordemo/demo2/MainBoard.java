package com.alonsol.demo.design.mediatordemo.demo2;

public class MainBoard extends Mediator {

    private CDDevice cdDevice;//光驱设备
    private CPU cpu;   //cpu
    private SoundCard soundCard;//声卡设备
    private GraphicsCard graphicsCard;//显卡设备


    @Override
    public void changed(Colleague colleague) {
        //如果是光驱读取了数据
        if (colleague == cdDevice) {
            handleCD((CDDevice) colleague);
        } else if (colleague == cpu) {
            handleCpu((CPU) colleague);
        }
    }

    private void handleCD(CDDevice cdDevice) {
        cpu.decodeData(cdDevice.read());
    }

    private void handleCpu(CPU cpu) {
        soundCard.soundPlay(cpu.getDataSound());
        graphicsCard.videoPlay(cpu.getDataVideo());
    }

    public void setCCDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

}
