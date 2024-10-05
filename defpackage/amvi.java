package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amvi extends amri {
    static final amvi b = new amvi();
    final transient Object[] c;
    public final transient int d;
    public final transient amvi e;
    private final transient Object f;
    private final transient int g;

    private amvi() {
        this.f = null;
        this.c = new Object[0];
        this.g = 0;
        this.d = 0;
        this.e = this;
    }

    private amvi(Object obj, Object[] objArr, int i, amvi amviVar) {
        this.f = obj;
        this.c = objArr;
        this.g = 1;
        this.d = i;
        this.e = amviVar;
    }

    public amvi(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
        this.g = 0;
        int f = i >= 2 ? amsx.f(i) : 0;
        this.f = amvo.r(objArr, i, f, 0);
        this.e = new amvi(amvo.r(objArr, i, f, 1), objArr, i, this);
    }

    @Override // defpackage.amri
    public final amri c() {
        return this.e;
    }

    @Override // defpackage.amrz
    public final amsx g() {
        return new amvm(this, new amvn(this.c, this.g, this.d));
    }

    @Override // defpackage.amrz, java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        Object s = amvo.s(this.f, this.c, this.d, this.g, obj);
        if (s == null) {
            return null;
        }
        return s;
    }

    @Override // defpackage.amrz
    public final amsx rY() {
        return new amvl(this, this.c, this.g, this.d);
    }

    @Override // defpackage.amrz
    public final void sa() {
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.d;
    }
}
