package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azhc extends aypy {
    final Callable a;

    public azhc(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        try {
            th = (Throwable) this.a.call();
            aysw.b(th, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            aynu.c(th);
        }
        aysa.h(th, ayqdVar);
    }
}
