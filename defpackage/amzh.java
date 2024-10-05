package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amzh implements Iterator, j$.util.Iterator {
    final /* synthetic */ amzi a;
    private final amyc b;
    private int c;
    private int d;

    public amzh(amzi amziVar, amyc amycVar, int i) {
        this.a = amziVar;
        this.b = amycVar;
        int i2 = i & 31;
        this.c = i2;
        this.d = i >>> (i2 + 5);
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        Object d = this.b.d(this.a.e(this.c));
        int i = this.d;
        if (i != 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i) + 1;
            this.d >>>= numberOfTrailingZeros;
            this.c += numberOfTrailingZeros;
        } else {
            this.c = -1;
        }
        return d;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
