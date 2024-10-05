package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amvz extends amoe {
    final Iterator a;
    final /* synthetic */ amwa b;

    public amvz(amwa amwaVar) {
        this.b = amwaVar;
        this.a = amwaVar.a.iterator();
    }

    @Override // defpackage.amoe
    protected final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (this.b.b.contains(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
