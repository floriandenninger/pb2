package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amwy extends amuk {
    final Iterable a;
    final /* synthetic */ amxa b;

    public amwy(amxa amxaVar, Iterable iterable) {
        this.b = amxaVar;
        this.a = iterable;
    }

    @Override // defpackage.amuk
    public final Iterator a() {
        return this.a.iterator();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof amvf)) {
            return null;
        }
        amvf amvfVar = (amvf) obj;
        amwz amwzVar = (amwz) this.b.a.get(amvfVar.b);
        if (amwzVar == null || !amwzVar.a.equals(amvfVar)) {
            return null;
        }
        return amwzVar.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b.a.size();
    }
}
