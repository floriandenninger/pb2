package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amse extends amxd {
    final amxd a;
    final /* synthetic */ amsh b;

    public amse(amsh amshVar) {
        this.b = amshVar;
        this.a = amshVar.a.entrySet().listIterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.a.next()).getValue();
    }
}
