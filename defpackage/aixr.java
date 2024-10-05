package defpackage;

import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aixr implements Iterable {
    public final TreeSet a;
    public final TreeSet b;

    public aixr() {
        aixq aixqVar = new aixq();
        this.b = new TreeSet(aixqVar.a);
        this.a = new TreeSet(aixqVar);
    }

    public final Iterator a(long j) {
        return this.b.tailSet(aixo.r(j)).iterator();
    }

    public final void b(aixo... aixoVarArr) {
        for (int i = 0; i <= 0; i++) {
            aixo aixoVar = aixoVarArr[i];
            this.a.add(aixoVar);
            this.b.add(aixoVar.n);
            this.b.add(aixoVar.o);
        }
    }

    public final boolean c(aixo aixoVar) {
        return this.a.contains(aixoVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
