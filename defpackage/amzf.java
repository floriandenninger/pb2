package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amzf implements Iterator, j$.util.Iterator {
    final /* synthetic */ amzg a;
    private int b = 0;

    public amzf(amzg amzgVar) {
        this.a = amzgVar;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.a.b;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        amzi amziVar = this.a.a;
        int[] iArr = amziVar.a;
        int i = this.b;
        this.b = i + 1;
        return amziVar.d(iArr[i] & 31);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
