package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amsd extends amtg {
    private final amrz a;

    public amsd(amrz amrzVar) {
        this.a = amrzVar;
    }

    @Override // defpackage.amtg
    public final Object c(int i) {
        return ((Map.Entry) this.a.entrySet().g().get(i)).getKey();
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.amtg, defpackage.amsx, defpackage.amrl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* bridge */ /* synthetic */ Iterator listIterator() {
        return listIterator();
    }

    @Override // defpackage.amtg, defpackage.amsx, defpackage.amrl
    /* renamed from: k */
    public final amxd listIterator() {
        return this.a.rZ();
    }

    @Override // defpackage.amrl
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.amsx, defpackage.amrl
    Object writeReplace() {
        return new amsc(this.a);
    }
}
