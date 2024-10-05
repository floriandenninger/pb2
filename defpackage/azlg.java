package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azlg implements ayqd, ayqx {
    final ayqd a;
    ayqx b;
    Collection c;

    public azlg(ayqd ayqdVar, Collection collection) {
        this.a = ayqdVar;
        this.c = collection;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.c = null;
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.c.add(obj);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.b.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.b, ayqxVar)) {
            this.b = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        Collection collection = this.c;
        this.c = null;
        this.a.c(collection);
        this.a.sh();
    }
}
