package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afy extends afx {
    public int m;

    public afy(agg aggVar) {
        super(aggVar);
        this.l = aggVar instanceof agc ? 2 : 3;
    }

    @Override // defpackage.afx
    public final void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((afv) it.next()).f();
        }
    }
}
