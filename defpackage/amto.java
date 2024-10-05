package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amto extends amxd {
    boolean a;
    final /* synthetic */ Object b;

    public amto(Object obj) {
        this.b = obj;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (this.a) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b;
    }
}
