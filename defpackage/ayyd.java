package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayyd extends aypn {
    final Future b;

    public ayyd(Future future) {
        this.b = future;
    }

    @Override // defpackage.aypn
    public final void ac(banw banwVar) {
        azpx azpxVar = new azpx(banwVar);
        banwVar.f(azpxVar);
        try {
            Object obj = this.b.get();
            if (obj == null) {
                banwVar.b(new NullPointerException("The future returned null"));
            } else {
                azpxVar.g(obj);
            }
        } catch (Throwable th) {
            aynu.c(th);
            if (azpxVar.get() == 4) {
                return;
            }
            banwVar.b(th);
        }
    }
}
