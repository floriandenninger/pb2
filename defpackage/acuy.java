package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.youtube.mdx.background.MdxBackgroundScanBootReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
public class acuy extends BroadcastReceiver {
    private volatile boolean a = false;
    private final Object b = new Object();

    public final void a(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((acvi) ayaw.t(context)).jh((MdxBackgroundScanBootReceiver) this);
                this.a = true;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context);
    }
}
