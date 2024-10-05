package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pky extends BroadcastReceiver implements Runnable {
    private final Handler a;

    public pky(Handler handler) {
        this.a = handler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.a.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
