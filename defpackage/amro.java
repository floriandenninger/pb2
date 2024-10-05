package defpackage;

import java.util.EnumMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amro extends amrx {
    private final transient EnumMap b;

    public amro(EnumMap enumMap) {
        this.b = enumMap;
        amkq.E(!enumMap.isEmpty());
    }

    @Override // defpackage.amrx
    public final amxd a() {
        return new amug(this.b.entrySet().iterator());
    }

    @Override // defpackage.amrz, java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // defpackage.amrz, java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amro) {
            obj = ((amro) obj).b;
        }
        return this.b.equals(obj);
    }

    @Override // defpackage.amrz, java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        return this.b.get(obj);
    }

    @Override // defpackage.amrz
    public final amxd rZ() {
        Iterator it = this.b.keySet().iterator();
        it.getClass();
        if (it instanceof amxd) {
            return (amxd) it;
        }
        return new amtl(it);
    }

    @Override // defpackage.amrz
    public final void sa() {
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.amrz
    Object writeReplace() {
        return new amrn(this.b);
    }
}
