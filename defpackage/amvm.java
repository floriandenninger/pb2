package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amvm extends amsx {
    private final transient amrz a;
    private final transient amru b;

    public amvm(amrz amrzVar, amru amruVar) {
        this.a = amrzVar;
        this.b = amruVar;
    }

    @Override // defpackage.amrl
    public final int b(Object[] objArr, int i) {
        return this.b.b(objArr, i);
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // defpackage.amsx, defpackage.amrl
    public final amru g() {
        return this.b;
    }

    @Override // defpackage.amsx, defpackage.amrl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amxd listIterator() {
        return this.b.iterator();
    }

    @Override // defpackage.amrl
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
