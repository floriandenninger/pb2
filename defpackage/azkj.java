package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azkj implements ayqd {
    final ayqd a;
    final ayqb b;
    boolean d = true;
    final aysd c = new aysd();

    public azkj(ayqd ayqdVar, ayqb ayqbVar) {
        this.a = ayqdVar;
        this.b = ayqbVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.d) {
            this.d = false;
        }
        this.a.c(obj);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.f(this.c, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (!this.d) {
            this.a.sh();
        } else {
            this.d = false;
            this.b.aE(this);
        }
    }
}
