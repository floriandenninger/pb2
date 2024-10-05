package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azng extends ayqj {
    final Callable a;

    public azng(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.ayqj
    protected final void aa(ayqk ayqkVar) {
        ayqx d = aynu.d();
        ayqkVar.se(d);
        if (d.e()) {
            return;
        }
        try {
            Object call = this.a.call();
            aysw.b(call, "The callable returned a null value");
            if (d.e()) {
                return;
            }
            ayqkVar.sc(call);
        } catch (Throwable th) {
            aynu.c(th);
            if (!d.e()) {
                ayqkVar.b(th);
            } else {
                aynu.j(th);
            }
        }
    }
}
