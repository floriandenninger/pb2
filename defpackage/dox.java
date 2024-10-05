package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dox implements Iterator, j$.util.Iterator {
    final /* synthetic */ doy a;
    private int b = -1;
    private boolean c;

    public dox(doy doyVar) {
        this.a = doyVar;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b + 1 < this.a.size();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.c = false;
        int i = this.b + 1;
        this.b = i;
        return this.a.a(i);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (this.c) {
            throw new IllegalStateException();
        }
        this.a.b(this.b);
        this.c = true;
        this.b--;
    }
}
