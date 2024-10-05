package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sbh implements ListIterator, Iterator {
    final /* synthetic */ sbn a;
    final /* synthetic */ sbi b;

    public sbh(sbi sbiVar, sbn sbnVar) {
        this.b = sbiVar;
        this.a = sbnVar;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.c < this.b.a + (-1);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.c > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        sbn sbnVar = this.a;
        sbnVar.c++;
        return sbnVar;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.c + 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        r0.c--;
        return this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.c - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("ImmutableList");
    }
}
