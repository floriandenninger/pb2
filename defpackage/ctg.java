package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctg {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new dci(1));

    public final synchronized void a(ctd ctdVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            ctdVar.e();
            this.a = false;
            return;
        }
        this.b.obtainMessage(1, ctdVar).sendToTarget();
    }
}
