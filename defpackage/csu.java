package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csu implements Iterable {
    public final List a;

    public csu() {
        this(new ArrayList(2));
    }

    public csu(List list) {
        this.a = list;
    }

    public static cst b(dby dbyVar) {
        return new cst(dbyVar, ddh.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.a.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final csu c() {
        return new csu(new ArrayList(this.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(dby dbyVar) {
        return this.a.contains(b(dbyVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return this.a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
