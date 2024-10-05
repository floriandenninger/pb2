package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amuj extends amui {
    final /* synthetic */ amuk a;

    public amuj(amuk amukVar) {
        this.a = amukVar;
    }

    @Override // defpackage.amui
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.a();
    }
}
