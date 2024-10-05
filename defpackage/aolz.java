package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class aolz implements Iterator, aomb {
    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    @Override // j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
