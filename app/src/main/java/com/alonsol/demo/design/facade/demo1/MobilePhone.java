package com.alonsol.demo.design.facade.demo1;

public class MobilePhone {

    private Phone mPhone = new PhoneImpl();
    private Camera mCamera = new SamsungCamera();

    public void dial() {
        mPhone.dial();
    }

    public void vedioChat() {
        System.out.println("视频通话接通中...");
        mCamera.open();
        mPhone.dial();
    }

    public void hangup() {
        mPhone.hangup();
    }

    public void takePicture() {
        mCamera.open();
        mCamera.takePicture();
    }

    public void closeCamera() {
        mCamera.close();
    }
}
