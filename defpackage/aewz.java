package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aewz implements bjc {
    private bjc a = new big();
    public volatile IOException c;

    @Override // defpackage.bjc
    public final int B(atc atcVar, int i, boolean z) {
        if (this.c != null) {
            IOException iOException = this.c;
            this.c = null;
            throw iOException;
        }
        return this.a.e(atcVar, i, z);
    }

    public final void a(bjc bjcVar) {
        this.a = bjcVar;
        this.c = null;
    }

    @Override // defpackage.bjc
    public final /* synthetic */ int e(atc atcVar, int i, boolean z) {
        return hp.d(this, atcVar, i, z);
    }

    @Override // defpackage.bjc
    public final void rp(pms pmsVar) {
        this.a.rp(pmsVar);
    }

    @Override // defpackage.bjc
    public /* synthetic */ void t(pth pthVar, int i) {
        hp.e(this, pthVar, i);
    }

    @Override // defpackage.bjc
    public final void u(pth pthVar, int i, int i2) {
        this.a.t(pthVar, i);
    }

    @Override // defpackage.bjc
    public void v(long j, int i, int i2, int i3, bjb bjbVar) {
        this.a.v(j, i, i2, i3, bjbVar);
    }
}
