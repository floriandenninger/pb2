package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vwm implements oxk {
    public final oxk a;
    public boolean b;
    public int c;
    public final CopyOnWriteArraySet d;

    public vwm() {
        oxk r = opn.r(5, 0, 0);
        this.d = new CopyOnWriteArraySet();
        this.a = r;
        this.c = 5;
    }

    private final void q(boolean z) {
        this.a.l(z);
        this.b = false;
    }

    private final boolean r() {
        for (int i = 0; i < this.c; i++) {
            if (this.a.b(i) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.oxk
    public final int a() {
        return ((oxm) this.a).e;
    }

    @Override // defpackage.oxk
    public final int b(int i) {
        throw null;
    }

    @Override // defpackage.oxk
    public final long c() {
        return this.a.c();
    }

    @Override // defpackage.oxk
    public final long d() {
        throw null;
    }

    @Override // defpackage.oxk
    public final void e(oxj oxjVar) {
        this.a.e(oxjVar);
    }

    @Override // defpackage.oxk
    public final void f(oxi oxiVar, int i, Object obj) {
        throw null;
    }

    @Override // defpackage.oxk
    public final void g(oyx... oyxVarArr) {
        throw null;
    }

    @Override // defpackage.oxk
    public final void h() {
        throw null;
    }

    @Override // defpackage.oxk
    public final void i(oxj oxjVar) {
        this.a.i(oxjVar);
    }

    @Override // defpackage.oxk
    public final void j(long j) {
        this.a.j(j);
    }

    @Override // defpackage.oxk
    public final void k(oxi oxiVar, int i, Object obj) {
        this.a.k(oxiVar, i, obj);
    }

    @Override // defpackage.oxk
    public final void l(boolean z) {
        this.b = z;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((vwt) it.next()).a.a();
        }
        if (!z || r()) {
            q(z);
        }
    }

    @Override // defpackage.oxk
    public final void m(int i, int i2) {
        this.a.m(i, i2);
        if (this.b && r()) {
            q(true);
        }
    }

    @Override // defpackage.oxk
    public final void n() {
        throw null;
    }

    @Override // defpackage.oxk
    public final boolean o() {
        return this.b || ((oxm) this.a).d;
    }

    @Deprecated
    public final void p(boolean z) {
        m(4, true != z ? -1 : 0);
    }
}
