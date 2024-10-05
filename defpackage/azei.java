package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azei implements aypt, ayqx {
    final ayqk a;
    final Object b;
    ayqx c;

    public azei(ayqk ayqkVar, Object obj) {
        this.a = ayqkVar;
        this.b = obj;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        this.c = ayrz.a;
        this.a.b(th);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.c.qc();
        this.c = ayrz.a;
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        this.c = ayrz.a;
        this.a.sc(obj);
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.c, ayqxVar)) {
            this.c = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.aypt
    public final void sh() {
        this.c = ayrz.a;
        Object obj = this.b;
        if (obj != null) {
            this.a.sc(obj);
        } else {
            this.a.b(new NoSuchElementException("The MaybeSource is empty"));
        }
    }
}
