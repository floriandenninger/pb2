package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amrc implements Iterator, j$.util.Iterator {
    final /* synthetic */ amrd a;
    private int b;
    private int c;
    private int d;
    private int e;

    public amrc(amrd amrdVar) {
        this.a = amrdVar;
        amre amreVar = amrdVar.b;
        this.b = amreVar.e;
        this.c = -1;
        this.d = amreVar.d;
        this.e = amreVar.c;
    }

    private final void a() {
        if (this.a.b.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != -2 && this.e > 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a = this.a.a(this.b);
        int i = this.b;
        this.c = i;
        this.b = this.a.b.f[i];
        this.e--;
        return a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        a();
        amkq.s(this.c != -1);
        amre amreVar = this.a.b;
        int i = this.c;
        amreVar.j(i, amkq.bt(amreVar.a[i]));
        int i2 = this.b;
        amre amreVar2 = this.a.b;
        if (i2 == amreVar2.c) {
            this.b = this.c;
        }
        this.c = -1;
        this.d = amreVar2.d;
    }
}
