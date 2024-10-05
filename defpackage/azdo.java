package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azdo implements aypt {
    final aypt a;
    final AtomicReference b;
    private final /* synthetic */ int c;

    public azdo(aypt ayptVar, AtomicReference atomicReference, int i) {
        this.c = i;
        this.a = ayptVar;
        this.b = atomicReference;
    }

    public azdo(AtomicReference atomicReference, aypt ayptVar, int i) {
        this.c = i;
        this.b = atomicReference;
        this.a = ayptVar;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        int i = this.c;
        if (i == 0) {
            this.a.b(th);
            return;
        }
        if (i == 1) {
            this.a.b(th);
        } else if (i != 2) {
            this.a.b(th);
        } else {
            this.a.b(th);
        }
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        int i = this.c;
        if (i == 0) {
            this.a.sc(obj);
            return;
        }
        if (i == 1) {
            this.a.sc(obj);
        } else if (i != 2) {
            this.a.sc(obj);
        } else {
            this.a.sc(obj);
        }
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        int i = this.c;
        if (i == 0) {
            ayrz.g(this.b, ayqxVar);
            return;
        }
        if (i == 1) {
            ayrz.i(this.b, ayqxVar);
        } else if (i != 2) {
            ayrz.i(this.b, ayqxVar);
        } else {
            ayrz.g(this.b, ayqxVar);
        }
    }

    @Override // defpackage.aypt
    public final void sh() {
        int i = this.c;
        if (i == 0) {
            this.a.sh();
            return;
        }
        if (i == 1) {
            this.a.sh();
        } else if (i != 2) {
            this.a.sh();
        } else {
            this.a.sh();
        }
    }
}
