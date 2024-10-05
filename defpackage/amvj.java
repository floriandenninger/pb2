package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amvj extends amru {
    static final amru a = new amvj(new Object[0], 0);
    final transient Object[] b;
    public final transient int c;

    public amvj(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.amru, defpackage.amrl
    public final int b(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return i + this.c;
    }

    @Override // defpackage.amrl
    public final int d() {
        return this.c;
    }

    @Override // defpackage.amrl
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        amkq.V(i, this.c);
        Object obj = this.b[i];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.amrl
    public final boolean l() {
        return false;
    }

    @Override // defpackage.amrl
    public final Object[] m() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
