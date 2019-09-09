package com.alonsol.demo.orderdemo.demo3;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import com.alonsol.demo.R;

public class DrawActivity extends AppCompatActivity {


    private DrawCanvas mCanvas;//绘制画布
    private DrawPath mPath;//路径绘制命令
    private Paint mPaint;//画笔对象
    private IBush mBrush;//笔触对象

    private Button btnRedo, btnUndo;//重做，撤销

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);
    }


}
