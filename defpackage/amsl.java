package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amsl extends amrl {
    private static final long serialVersionUID = 0;
    private final transient amsm a;

    public amsl(amsm amsmVar) {
        this.a = amsmVar;
    }

    @Override // defpackage.amrl
    public final int b(Object[] objArr, int i) {
        amxd listIterator = this.a.b.values().listIterator();
        while (listIterator.hasNext()) {
            i = ((amrl) listIterator.next()).b(objArr, i);
        }
        return i;
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.t(obj);
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amxd listIterator() {
        return new amsi(this.a);
    }

    @Override // defpackage.amrl
    public final boolean l() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.c;
    }
}
