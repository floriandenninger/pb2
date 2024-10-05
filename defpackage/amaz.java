package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amaz implements anhh {
    final /* synthetic */ anhy a;
    final /* synthetic */ String b;

    public amaz(anhy anhyVar, String str) {
        this.a = anhyVar;
        this.b = str;
    }

    @Override // defpackage.anhh
    public final void b(Object obj) {
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        if (!(th instanceof TimeoutException) || this.a.isDone()) {
            return;
        }
        ((amxh) ((amxh) ((amxh) amba.a.f()).h(amjq.a(th))).i("com/google/apps/tiktok/concurrent/AndroidFutures$1", "onFailure", 183, "AndroidFutures.java")).s("exceeded timeout: %s", this.b);
    }
}
