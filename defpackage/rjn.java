package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rjn implements Runnable {
    final /* synthetic */ rki a;
    final /* synthetic */ Runnable b;

    public rjn(rki rkiVar, Runnable runnable) {
        this.a = rkiVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.w();
        rki rkiVar = this.a;
        Runnable runnable = this.b;
        rkiVar.v();
        if (rkiVar.l == null) {
            rkiVar.l = new ArrayList();
        }
        rkiVar.l.add(runnable);
        this.a.M();
    }
}
