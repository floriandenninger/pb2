package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.youtube.mdx.notification.continueontv.ContinueWatchingOnTvNotificationBroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adhr extends BroadcastReceiver {
    private volatile boolean a = false;
    private final Object b = new Object();

    public final void c(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((adhb) ayaw.t(context)).je((ContinueWatchingOnTvNotificationBroadcastReceiver) this);
                this.a = true;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        c(context);
    }
}
