package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dyb implements Iterator {
    final /* synthetic */ Iterator a;
    final /* synthetic */ Iterator b;

    public dyb(Iterator it, Iterator it2) {
        this.a = it;
        this.b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a.hasNext()) {
            return true;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.a.hasNext()) {
            return new dyq(((Integer) this.a.next()).toString());
        }
        if (this.b.hasNext()) {
            return new dyq((String) this.b.next());
        }
        throw new NoSuchElementException();
    }
}
