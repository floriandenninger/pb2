package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.app.application.system.LocaleUpdatedReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class enr extends BroadcastReceiver {
    private volatile boolean a = false;
    private final Object b = new Object();

    public final void a(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((enu) ayaw.t(context)).jf((LocaleUpdatedReceiver) this);
                this.a = true;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context);
    }
}
