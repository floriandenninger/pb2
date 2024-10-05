package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azbw extends AtomicReference implements aypq {
    private static final long serialVersionUID = 3256684027868224024L;
    final azbv a;
    final int b;
    boolean c;

    public azbw(azbv azbvVar, int i) {
        this.a = azbvVar;
        this.b = i;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        azbv azbvVar = this.a;
        int i = this.b;
        azbvVar.h = true;
        azqb.f(azbvVar.e);
        azbvVar.d(i);
        ayeq.g(azbvVar.a, th, azbvVar, azbvVar.g);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (!this.c) {
            this.c = true;
        }
        azbv azbvVar = this.a;
        azbvVar.d.set(this.b, obj);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        azqb.k(this, banxVar, Long.MAX_VALUE);
    }

    @Override // defpackage.banw
    public final void sh() {
        azbv azbvVar = this.a;
        int i = this.b;
        if (this.c) {
            return;
        }
        azbvVar.h = true;
        azqb.f(azbvVar.e);
        azbvVar.d(i);
        ayeq.e(azbvVar.a, azbvVar, azbvVar.g);
    }
}
