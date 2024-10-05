package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azli implements ayqd, ayqx {
    final ayqk a;
    Collection b;
    ayqx c;

    public azli(ayqk ayqkVar, Collection collection) {
        this.a = ayqkVar;
        this.b = collection;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.b = null;
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.b.add(obj);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.c.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.c, ayqxVar)) {
            this.c = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        Collection collection = this.b;
        this.b = null;
        this.a.sc(collection);
    }
}
