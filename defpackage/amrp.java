package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amrp extends amrj {
    public amrp() {
        super(4);
    }

    @Override // defpackage.amrj, defpackage.amrk
    public final /* synthetic */ void c(Object obj) {
        super.b(obj);
    }

    public final amru g() {
        this.c = true;
        return amru.j(this.a, this.b);
    }

    public final void h(Object obj) {
        super.b(obj);
    }

    public final void i(Object... objArr) {
        super.d(objArr);
    }

    public final void j(Iterable iterable) {
        super.e(iterable);
    }

    public final void k(Iterator it) {
        while (it.hasNext()) {
            super.b(it.next());
        }
    }

    public amrp(int i) {
        super(i);
    }
}
