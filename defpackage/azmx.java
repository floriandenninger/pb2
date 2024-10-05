package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azmx extends ayqj {
    final Callable a;

    public azmx(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.ayqj
    protected final void aa(ayqk ayqkVar) {
        try {
            th = (Throwable) ((aysq) this.a).a;
            aysw.b(th, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            aynu.c(th);
        }
        aysa.i(th, ayqkVar);
    }
}
