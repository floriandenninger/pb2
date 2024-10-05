package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class blx implements bly {
    private final List a;
    private final bjc[] b;
    private boolean c;
    private int d;
    private int e;
    private long f = -9223372036854775807L;

    public blx(List list) {
        this.a = list;
        this.b = new bjc[list.size()];
    }

    private final boolean f(pth pthVar, int i) {
        if (pthVar.a() == 0) {
            return false;
        }
        if (pthVar.i() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    @Override // defpackage.bly
    public final void a(pth pthVar) {
        if (this.c) {
            if (this.d != 2 || f(pthVar, 32)) {
                if (this.d != 1 || f(pthVar, 0)) {
                    int i = pthVar.b;
                    int a = pthVar.a();
                    for (bjc bjcVar : this.b) {
                        pthVar.G(i);
                        bjcVar.t(pthVar, a);
                    }
                    this.e += a;
                }
            }
        }
    }

    @Override // defpackage.bly
    public final void b(bik bikVar, bmz bmzVar) {
        for (int i = 0; i < this.b.length; i++) {
            ztp ztpVar = (ztp) this.a.get(i);
            bmzVar.c();
            bjc n = bikVar.n(bmzVar.a(), 3);
            pmr pmrVar = new pmr();
            pmrVar.a = bmzVar.b();
            pmrVar.k = "application/dvbsubs";
            pmrVar.m = Collections.singletonList(ztpVar.a);
            pmrVar.c = ztpVar.b;
            n.rp(pmrVar.a());
            this.b[i] = n;
        }
    }

    @Override // defpackage.bly
    public final void c() {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                for (bjc bjcVar : this.b) {
                    bjcVar.v(this.f, 1, this.e, 0, null);
                }
            }
            this.c = false;
        }
    }

    @Override // defpackage.bly
    public final void d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.f = j;
        }
        this.e = 0;
        this.d = 2;
    }

    @Override // defpackage.bly
    public final void e() {
        this.c = false;
        this.f = -9223372036854775807L;
    }
}
