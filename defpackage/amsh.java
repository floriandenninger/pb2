package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amsh extends amrl {
    public final amrz a;

    public amsh(amrz amrzVar) {
        this.a = amrzVar;
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        amxd listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (obj.equals(listIterator.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amrl
    public final amru g() {
        return new amsf(this.a.entrySet().g());
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amxd listIterator() {
        return new amse(this);
    }

    @Override // defpackage.amrl
    public final boolean l() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.amrl
    Object writeReplace() {
        return new amsg(this.a);
    }
}
