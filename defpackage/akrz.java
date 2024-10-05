package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akrz implements anhh {
    final /* synthetic */ aksb a;

    public akrz(aksb aksbVar) {
        this.a = aksbVar;
    }

    @Override // defpackage.anhh
    public final void b(Object obj) {
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        if (th instanceof CancellationException) {
            this.a.b.run();
        } else {
            this.a.c.accept(th);
        }
    }
}
