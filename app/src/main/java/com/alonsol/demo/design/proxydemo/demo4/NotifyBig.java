package com.alonsol.demo.design.proxydemo.demo4;

import android.app.Notification;
import android.content.Context;
import android.widget.RemoteViews;
import com.alonsol.demo.R;

public class NotifyBig extends Notify {

    public NotifyBig(Context context) {
        super(context);
    }

    @Override
    public void send() {
        Notification n = builder.build();
        n.contentView = new RemoteViews(context.getPackageName(), R.layout.activity_draw);
        n.bigContentView = new RemoteViews(context.getPackageName(), R.layout.activity_draw);
        nm.notify(0, n);
    }

    @Override
    public void cancel() {
        nm.cancel(0);
    }
}
