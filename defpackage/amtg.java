package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amtg extends amsx {
    @Override // defpackage.amrl
    public final int b(Object[] objArr, int i) {
        return g().b(objArr, i);
    }

    public abstract Object c(int i);

    @Override // defpackage.amsx
    public final amru h() {
        return new amtf(this);
    }

    @Override // defpackage.amsx, defpackage.amrl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public amxd listIterator() {
        return g().iterator();
    }
}
