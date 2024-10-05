package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amsb extends amsx {
    final /* synthetic */ amrx a;

    public amsb(amrx amrxVar) {
        this.a = amrxVar;
    }

    @Override // defpackage.amsx
    public final boolean a() {
        return false;
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.a.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amsx, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.amsx, defpackage.amrl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amxd listIterator() {
        return this.a.a();
    }

    @Override // defpackage.amrl
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.amsx, defpackage.amrl
    Object writeReplace() {
        return new amsa(this.a);
    }

    public amsb() {
    }
}
