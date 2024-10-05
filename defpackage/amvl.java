package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amvl extends amsx {
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient amrz d;

    public amvl(amrz amrzVar, Object[] objArr, int i, int i2) {
        this.d = amrzVar;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.amrl
    public final int b(Object[] objArr, int i) {
        return g().b(objArr, i);
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amsx
    public final amru h() {
        return new amvk(this);
    }

    @Override // defpackage.amsx, defpackage.amrl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amxd listIterator() {
        return g().iterator();
    }

    @Override // defpackage.amrl
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }
}
