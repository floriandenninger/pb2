package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class big implements bjc {
    private final byte[] a = new byte[4096];

    @Override // defpackage.bjc
    public final int B(atc atcVar, int i, boolean z) {
        int g = atcVar.g(this.a, 0, Math.min(4096, i));
        if (g != -1) {
            return g;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.bjc
    public final /* synthetic */ int e(atc atcVar, int i, boolean z) {
        return hp.d(this, atcVar, i, z);
    }

    @Override // defpackage.bjc
    public final void rp(pms pmsVar) {
    }

    @Override // defpackage.bjc
    public final /* synthetic */ void t(pth pthVar, int i) {
        hp.e(this, pthVar, i);
    }

    @Override // defpackage.bjc
    public final void u(pth pthVar, int i, int i2) {
        pthVar.H(i);
    }

    @Override // defpackage.bjc
    public final void v(long j, int i, int i2, int i3, bjb bjbVar) {
    }
}
