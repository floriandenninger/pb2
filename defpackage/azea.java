package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azea implements ayqk {
    final ayqk a;
    final AtomicReference b;
    private final /* synthetic */ int c;

    public azea(ayqk ayqkVar, AtomicReference atomicReference, int i) {
        this.c = i;
        this.a = ayqkVar;
        this.b = atomicReference;
    }

    public azea(AtomicReference atomicReference, ayqk ayqkVar, int i) {
        this.c = i;
        this.b = atomicReference;
        this.a = ayqkVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        int i = this.c;
        if (i == 0) {
            this.a.b(th);
        } else if (i != 1) {
            this.a.b(th);
        } else {
            this.a.b(th);
        }
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        int i = this.c;
        if (i == 0) {
            this.a.sc(obj);
        } else if (i != 1) {
            this.a.sc(obj);
        } else {
            this.a.sc(obj);
        }
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        int i = this.c;
        if (i == 0) {
            ayrz.g(this.b, ayqxVar);
        } else if (i != 1) {
            ayrz.i(this.b, ayqxVar);
        } else {
            ayrz.i(this.b, ayqxVar);
        }
    }
}
