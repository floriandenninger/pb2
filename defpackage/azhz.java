package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azhz extends ayti {
    final ayqd a;
    final Iterator b;
    volatile boolean c;
    boolean d;
    boolean e;
    boolean f;

    public azhz(ayqd ayqdVar, Iterator it) {
        this.a = ayqdVar;
        this.b = it;
    }

    @Override // defpackage.aytf
    public final void d() {
        this.e = true;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return this.e;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.c = true;
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        this.d = true;
        return 1;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        if (this.e) {
            return null;
        }
        if (!this.f) {
            this.f = true;
        } else if (!this.b.hasNext()) {
            this.e = true;
            return null;
        }
        Object next = this.b.next();
        aysw.b(next, "The iterator returned a null value");
        return next;
    }
}
