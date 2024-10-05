package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azhy extends aypy {
    final Future a;

    public azhy(Future future) {
        this.a = future;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        ayto aytoVar = new ayto(ayqdVar);
        ayqdVar.se(aytoVar);
        if (aytoVar.e()) {
            return;
        }
        try {
            Object obj = this.a.get();
            aysw.b(obj, "Future returned null");
            aytoVar.f(obj);
        } catch (Throwable th) {
            aynu.c(th);
            if (aytoVar.e()) {
                return;
            }
            ayqdVar.b(th);
        }
    }
}
