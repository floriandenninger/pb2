package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amvk extends amru {
    final /* synthetic */ amvl a;

    public amvk(amvl amvlVar) {
        this.a = amvlVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        amkq.V(i, this.a.c);
        amvl amvlVar = this.a;
        Object[] objArr = amvlVar.a;
        int i2 = i + i;
        int i3 = amvlVar.b;
        Object obj = objArr[i2 + i3];
        obj.getClass();
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.amrl
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }
}
