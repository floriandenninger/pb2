package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amvs extends amsx {
    public static final amvs a;
    private static final Object[] f;
    final transient Object[] b;
    public final transient int c;
    final transient Object[] d;
    public final transient int e;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        f = objArr;
        a = new amvs(objArr, 0, objArr, 0, 0);
    }

    public amvs(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = i;
        this.d = objArr2;
        this.g = i2;
        this.e = i3;
    }

    @Override // defpackage.amsx
    public final boolean a() {
        return true;
    }

    @Override // defpackage.amrl
    public final int b(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.e);
        return i + this.e;
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.d;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int bt = amkq.bt(obj);
        while (true) {
            int i = bt & this.g;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            bt = i + 1;
        }
    }

    @Override // defpackage.amrl
    public final int d() {
        return this.e;
    }

    @Override // defpackage.amrl
    public final int e() {
        return 0;
    }

    @Override // defpackage.amsx
    public final amru h() {
        return amru.j(this.b, this.e);
    }

    @Override // defpackage.amsx, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c;
    }

    @Override // defpackage.amsx, defpackage.amrl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amxd listIterator() {
        return g().iterator();
    }

    @Override // defpackage.amrl
    public final boolean l() {
        return false;
    }

    @Override // defpackage.amrl
    public final Object[] m() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
