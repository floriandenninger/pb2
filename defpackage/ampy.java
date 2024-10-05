package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ampy implements Iterator, j$.util.Iterator {
    int a;
    int b;
    int c = -1;
    final /* synthetic */ ampz d;

    public ampy(ampz ampzVar) {
        this.d = ampzVar;
        this.a = ampzVar.b;
        this.b = ampzVar.a();
    }

    private final void a() {
        if (this.d.b != this.a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        a();
        if (hasNext()) {
            int i = this.b;
            this.c = i;
            Object c = this.d.c(i);
            this.b = this.d.b(this.b);
            return c;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        a();
        amkq.s(this.c >= 0);
        this.a += 32;
        ampz ampzVar = this.d;
        ampzVar.remove(ampzVar.c(this.c));
        this.b--;
        this.c = -1;
    }
}
