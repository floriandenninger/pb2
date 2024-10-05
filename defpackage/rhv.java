package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rhv implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ rid e;

    public rhv(rid ridVar, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.e = ridVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjj n = this.e.w.n();
        AtomicReference atomicReference = this.a;
        String str = this.b;
        String str2 = this.c;
        boolean z = this.d;
        n.n();
        n.a();
        n.u(new rje(n, atomicReference, str, str2, n.e(false), z));
    }
}
