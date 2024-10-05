package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pf implements pl {
    final /* synthetic */ pl b;
    final pi a = new pi();
    private final Handler c = new Handler(Looper.getMainLooper());
    private final Runnable d = new pe(this);

    public pf(pl plVar) {
        this.b = plVar;
    }

    public final void a(pj pjVar) {
        this.a.c(pjVar);
        this.c.post(this.d);
    }
}
