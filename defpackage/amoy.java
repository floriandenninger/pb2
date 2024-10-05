package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amoy implements Iterator, j$.util.Iterator {
    int b;
    int c = -1;
    int d;
    final /* synthetic */ amoz e;

    public amoy(amoz amozVar) {
        this.e = amozVar;
        this.b = amozVar.a.a();
        this.d = amozVar.a.d;
    }

    private final void b() {
        if (this.e.a.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        b();
        return this.b >= 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a = a(this.b);
        int i = this.b;
        this.c = i;
        this.b = this.e.a.e(i);
        return a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        b();
        amkq.s(this.c != -1);
        this.e.b -= r0.a.f(this.c);
        this.b--;
        this.c = -1;
        this.d = this.e.a.d;
    }
}
