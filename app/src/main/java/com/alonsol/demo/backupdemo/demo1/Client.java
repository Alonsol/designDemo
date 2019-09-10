package com.alonsol.demo.backupdemo.demo1;

public class Client {

    public static void main(String[] args) {
        //构建游戏对象
        CallofDuty game = new CallofDuty();
        //打游戏
        game.play();
        Caretaker caretaker = new Caretaker();
        //游戏存档
        caretaker.archive(game.createMemoto());
        //退出游戏
        game.quit();
        CallofDuty newGame = new CallofDuty();
        //恢复存档
        newGame.restore(caretaker.getMemoto());
    }
}
