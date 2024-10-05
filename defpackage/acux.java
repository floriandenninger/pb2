package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.youtube.mdx.background.MdxBackgroundPlaybackBroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
public class acux extends BroadcastReceiver {
    private volatile boolean a = false;
    private final Object b = new Object();

    public final void a(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((acuz) ayaw.t(context)).jg((MdxBackgroundPlaybackBroadcastReceiver) this);
                this.a = true;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context);
    }
}
