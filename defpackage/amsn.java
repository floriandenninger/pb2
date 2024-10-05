package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amsn extends amxd {
    int a;
    Object b;
    final /* synthetic */ Iterator c;

    public amsn(Iterator it) {
        this.c = it;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i <= 0) {
            amux amuxVar = (amux) this.c.next();
            this.b = amuxVar.a;
            i = amuxVar.a();
        }
        this.a = i - 1;
        Object obj = this.b;
        obj.getClass();
        return obj;
    }
}
