package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amsi extends amxd {
    final Iterator a;
    Iterator b = amtp.a;
    final /* synthetic */ amsm c;

    public amsi(amsm amsmVar) {
        this.c = amsmVar;
        this.a = amsmVar.b.values().listIterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = ((amrl) this.a.next()).listIterator();
        }
        return this.b.next();
    }
}
