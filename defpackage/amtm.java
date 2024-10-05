package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amtm extends amoe {
    final /* synthetic */ Iterator a;
    final /* synthetic */ ammy b;

    public amtm(Iterator it, ammy ammyVar) {
        this.a = it;
        this.b = ammyVar;
    }

    @Override // defpackage.amoe
    protected final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (this.b.a(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
