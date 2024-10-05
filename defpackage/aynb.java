package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aynb {
    final boolean a;
    final List b;
    final Collection c;
    final Collection d;
    final int e;
    final aynj f;
    final boolean g;
    final boolean h;

    public aynb(List list, Collection collection, Collection collection2, aynj aynjVar, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        collection.getClass();
        this.c = collection;
        this.f = aynjVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        amkq.O(!z2 || list == null, "passThrough should imply buffer is null");
        amkq.O((z2 && aynjVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        amkq.O(!z2 || (collection.size() == 1 && collection.contains(aynjVar)) || (collection.size() == 0 && aynjVar.b), "passThrough should imply winningSubstream is drained");
        amkq.O((z && aynjVar == null) ? false : true, "cancelled should imply committed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aynb a(aynj aynjVar) {
        Collection unmodifiableCollection;
        amkq.O(!this.h, "hedging frozen");
        amkq.O(this.f == null, "already committed");
        Collection collection = this.d;
        if (collection == null) {
            unmodifiableCollection = Collections.singleton(aynjVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(aynjVar);
            unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new aynb(this.b, this.c, unmodifiableCollection, this.f, this.g, this.a, this.h, this.e + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aynb b() {
        return this.h ? this : new aynb(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }
}
