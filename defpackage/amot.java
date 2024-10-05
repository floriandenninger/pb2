package defpackage;

import j$.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amot extends amor implements ListIterator, Iterator {
    final /* synthetic */ amou d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amot(amou amouVar) {
        super(amouVar);
        this.d = amouVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.d.isEmpty();
        b().add(obj);
        amou amouVar = this.d;
        amouVar.f.b++;
        if (isEmpty) {
            amouVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amot(amou amouVar, int i) {
        super(amouVar, amouVar.d().listIterator(i));
        this.d = amouVar;
    }
}
