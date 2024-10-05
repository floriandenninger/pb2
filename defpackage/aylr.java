package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aylr extends axzk {
    public final aygg a;
    public final aych b;
    public final aycd c;
    public final axzo d;
    public aygd g;
    public boolean h;
    ayhx i;
    public final ayep[] j;
    private final ayfq k;
    public final Object f = new Object();
    public final ayai e = ayai.b();

    public aylr(aygg ayggVar, aych aychVar, aycd aycdVar, axzo axzoVar, ayfq ayfqVar, ayep[] ayepVarArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = ayggVar;
        this.b = aychVar;
        this.c = aycdVar;
        this.d = axzoVar;
        this.k = ayfqVar;
        this.j = ayepVarArr;
    }

    @Override // defpackage.axzk
    public final void a(Status status) {
        amkq.F(!status.f(), "Cannot fail with OK status");
        amkq.O(!this.h, "apply() or fail() already called");
        b(new ayii(status, this.j, null, null, null));
    }

    public final void b(aygd aygdVar) {
        boolean z;
        amkq.O(!this.h, "already finalized");
        this.h = true;
        synchronized (this.f) {
            if (this.g == null) {
                this.g = aygdVar;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.k.a();
            return;
        }
        amkq.O(this.i != null, "delayedStream is null");
        Runnable q = this.i.q(aygdVar);
        if (q != null) {
            q.run();
        }
        this.k.a();
    }
}
