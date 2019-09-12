package com.alonsol.demo.proxydemo.demo4;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import com.alonsol.demo.MainActivity;
import com.alonsol.demo.R;

public abstract class Notify {

    protected Context context;

    protected NotificationManager nm;

    protected NotificationCompat.Builder builder;

    public Notify(Context context) {
        this.context = context;
        nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        builder = new NotificationCompat.Builder(context);
        builder.setSmallIcon(R.drawable.ic_launcher_background)
                .setContentIntent(PendingIntent.getActivity(context, 0, new Intent(context, MainActivity.class), PendingIntent.FLAG_CANCEL_CURRENT));

    }

    /**
     * 发送通知
     */
    public abstract void send();

    /**
     * 取消通知
     */
    public abstract void cancel();

}
