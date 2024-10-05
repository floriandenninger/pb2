package defpackage;

import android.content.BroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class amev implements Runnable {
    public final /* synthetic */ BroadcastReceiver.PendingResult a;
    private final /* synthetic */ int b;

    public /* synthetic */ amev(BroadcastReceiver.PendingResult pendingResult, int i) {
        this.b = i;
        this.a = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.finish();
        } else {
            this.a.finish();
        }
    }
}
