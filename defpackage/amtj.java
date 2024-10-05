package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amtj implements Iterator, j$.util.Iterator {
    boolean a = true;
    final /* synthetic */ Iterator b;

    public amtj(Iterator it) {
        this.b = it;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        Object next = this.b.next();
        this.a = false;
        return next;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        amkq.s(!this.a);
        this.b.remove();
    }
}
