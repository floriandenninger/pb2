package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axmy implements Iterator, j$.util.Iterator {
    int a = 0;
    final /* synthetic */ axmz b;

    public axmy(axmz axmzVar) {
        this.b = axmzVar;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a.size() || this.b.b.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (this.a < this.b.a.size()) {
            List list = this.b.a;
            int i = this.a;
            this.a = i + 1;
            return list.get(i);
        }
        axmz axmzVar = this.b;
        axmzVar.a.add(axmzVar.b.next());
        return next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
