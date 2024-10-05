package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ayye extends azpw {
    private static final long serialVersionUID = -2252972430506210021L;
    Iterator a;
    volatile boolean b;
    boolean c;

    public ayye(Iterator it) {
        this.a = it;
    }

    public abstract void b();

    @Override // defpackage.aytf
    public final void d() {
        this.a = null;
    }

    public abstract void f(long j);

    @Override // defpackage.aytf
    public final boolean j() {
        Iterator it = this.a;
        return it == null || !it.hasNext();
    }

    @Override // defpackage.banx
    public final void sd() {
        this.b = true;
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        return i & 1;
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j) && ayeq.j(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                b();
            } else {
                f(j);
            }
        }
    }

    @Override // defpackage.aytf
    public final Object sg() {
        Iterator it = this.a;
        if (it == null) {
            return null;
        }
        if (!this.c) {
            this.c = true;
        } else if (!it.hasNext()) {
            return null;
        }
        Object next = this.a.next();
        aysw.b(next, "Iterator.next() returned a null value");
        return next;
    }
}
