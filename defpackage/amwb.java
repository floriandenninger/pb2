package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amwb extends amoe {
    final Iterator a;
    final /* synthetic */ amwc b;

    public amwb(amwc amwcVar) {
        this.b = amwcVar;
        this.a = amwcVar.a.iterator();
    }

    @Override // defpackage.amoe
    protected final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (!this.b.b.contains(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
