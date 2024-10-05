package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amts implements Iterator, java.util.Iterator {
    public final java.util.Iterator a;
    public boolean b;
    public Object c;

    public amts(java.util.Iterator it) {
        it.getClass();
        this.a = it;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        return this.b || this.a.hasNext();
    }

    @Override // j$.util.Iterator
    public final Object next() {
        if (!this.b) {
            return this.a.next();
        }
        Object obj = this.c;
        this.b = false;
        this.c = null;
        return obj;
    }

    @Override // j$.util.Iterator
    public final void remove() {
        amkq.O(!this.b, "Can't remove after you've peeked at next");
        this.a.remove();
    }
}
