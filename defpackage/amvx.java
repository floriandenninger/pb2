package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amvx extends amoe {
    final Iterator a;
    final Iterator b;
    final /* synthetic */ amvy c;

    public amvx(amvy amvyVar) {
        this.c = amvyVar;
        this.a = amvyVar.a.iterator();
        this.b = ((amwf) amvyVar.b).listIterator();
    }

    @Override // defpackage.amoe
    protected final Object a() {
        if (this.a.hasNext()) {
            return this.a.next();
        }
        while (this.b.hasNext()) {
            Object next = this.b.next();
            if (!this.c.a.contains(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
