package defpackage;

import android.net.Uri;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pcc implements pgc {
    private final Uri a;
    private final pfq b;
    private final pcd c;
    private final int d;
    private volatile boolean e;
    private boolean f;
    private final pft g;
    private final tfq h;

    public pcc(Uri uri, pfq pfqVar, pcd pcdVar, pft pftVar, int i, long j) {
        opn.h(uri);
        this.a = uri;
        this.b = pfqVar;
        opn.h(pcdVar);
        this.c = pcdVar;
        this.g = pftVar;
        this.d = i;
        tfq tfqVar = new tfq(null);
        this.h = tfqVar;
        tfqVar.a = j;
        this.f = true;
    }

    @Override // defpackage.pgc
    public final void i() {
        this.e = true;
    }

    @Override // defpackage.pgc
    public final void k() {
        pbw pbwVar;
        while (!this.e) {
            int i = 0;
            try {
                long j = this.h.a;
                long b = this.b.b(new pfs(this.a, j, -1L, null));
                if (b != -1) {
                    b += j;
                }
                pbw pbwVar2 = new pbw(this.b, j, b);
                try {
                    pbz a = this.c.a(pbwVar2);
                    if (this.f) {
                        a.d();
                        this.f = false;
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (this.e) {
                                i2 = 0;
                                break;
                            } else {
                                this.g.b(this.d);
                                i2 = a.f(pbwVar2, this.h);
                            }
                        } catch (Throwable th) {
                            pbwVar = pbwVar2;
                            th = th;
                            i = i2;
                            if (i != 1 && pbwVar != null) {
                                this.h.a = pbwVar.c;
                            }
                            pgz.n(this.b);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.h.a = pbwVar2.c;
                        i = i2;
                    }
                    pgz.n(this.b);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    pbwVar = pbwVar2;
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                pbwVar = null;
            }
        }
    }

    @Override // defpackage.pgc
    public final boolean l() {
        return this.e;
    }
}
