package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rhu implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ rid d;

    public rhu(rid ridVar, AtomicReference atomicReference, String str, String str2) {
        this.d = ridVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjj n = this.d.w.n();
        AtomicReference atomicReference = this.a;
        String str = this.b;
        String str2 = this.c;
        n.n();
        n.a();
        n.u(new rjc(n, atomicReference, str, str2, n.e(false)));
    }
}
