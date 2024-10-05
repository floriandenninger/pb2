package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amwf extends amsx {
    final transient Object a;
    private transient int b;

    public amwf(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.amsx
    public final boolean a() {
        return this.b != 0;
    }

    @Override // defpackage.amrl
    public final int b(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.amsx
    public final amru h() {
        return amru.r(this.a);
    }

    @Override // defpackage.amsx, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.a.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    @Override // defpackage.amsx, defpackage.amrl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amxd listIterator() {
        return new amto(this.a);
    }

    @Override // defpackage.amrl
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.a.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    public amwf(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }
}
