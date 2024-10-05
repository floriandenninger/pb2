package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rhf implements rhh {
    public final rgt w;

    public rhf(rgt rgtVar) {
        qip.an(rgtVar);
        this.w = rgtVar;
    }

    public final Context I() {
        return this.w.a;
    }

    public final rem J() {
        return this.w.f;
    }

    public final ret K() {
        return this.w.c();
    }

    public final rfk L() {
        return this.w.k;
    }

    public final rgc M() {
        return this.w.g();
    }

    public final rkm N() {
        return this.w.p();
    }

    public final void O() {
        if (Thread.currentThread() != this.w.aG().c) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void P() {
        ansv ansvVar = this.w.z;
    }

    public final void Q() {
        qtl qtlVar = this.w.y;
    }

    @Override // defpackage.rhh
    public final rfp aF() {
        return this.w.aF();
    }

    @Override // defpackage.rhh
    public final rgr aG() {
        return this.w.aG();
    }

    public void n() {
        this.w.aG().n();
    }
}
