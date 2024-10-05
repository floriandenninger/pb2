package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rjr implements Runnable {
    final long a;
    final long b;
    final /* synthetic */ rjs c;

    public rjr(rjs rjsVar, long j, long j2) {
        this.c = rjsVar;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.aG().g(new Runnable() { // from class: rjq
            @Override // java.lang.Runnable
            public final void run() {
                rjr rjrVar = rjr.this;
                rjs rjsVar = rjrVar.c;
                long j = rjrVar.a;
                long j2 = rjrVar.b;
                rjsVar.b.n();
                rjsVar.b.aF().j.a("Application going to the background");
                boolean z = true;
                rjsVar.b.M().p.a(true);
                Bundle bundle = new Bundle();
                if (!rjsVar.b.J().r()) {
                    rjsVar.b.d.c();
                    if (rjsVar.b.J().o(rfd.ah)) {
                        bundle.putLong("_et", rjsVar.b.e(j2));
                        rkm.D(rjsVar.b.k().p(true), bundle, true);
                    } else {
                        z = false;
                    }
                    rjsVar.b.p(false, z, j2);
                }
                rjsVar.b.j().w("auto", "_ab", j, bundle);
            }
        });
    }
}
