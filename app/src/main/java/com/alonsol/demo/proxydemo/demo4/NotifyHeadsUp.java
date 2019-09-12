package com.alonsol.demo.proxydemo.demo4;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.widget.RemoteViews;
import com.alonsol.demo.R;

public class NotifyHeadsUp extends Notify {

    public NotifyHeadsUp(Context context) {
        super(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void send() {
        Notification n = builder.build();
        n.contentView = new RemoteViews(context.getPackageName(), R.layout.activity_draw);
        n.bigContentView = new RemoteViews(context.getPackageName(), R.layout.activity_draw);
        n.headsUpContentView = new RemoteViews(context.getPackageName(), R.layout.activity_draw);
        nm.notify(0, builder.build());

    }

    @Override
    public void cancel() {
        nm.cancel(0);
    }
}
