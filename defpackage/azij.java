package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azij implements ayqd, ayqx {
    final ayqd a;
    ayqx b;
    private final /* synthetic */ int c;

    public azij(ayqd ayqdVar, int i) {
        this.c = i;
        this.a = ayqdVar;
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                this.a.c(aypx.b(obj));
            } else {
                this.a.c(obj);
            }
        }
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        int i = this.c;
        if (i == 0) {
            this.a.b(th);
        } else {
            if (i == 1) {
                this.a.b(th);
                return;
            }
            this.a.c(aypx.a(th));
            this.a.sh();
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        int i = this.c;
        if (i != 0) {
            return i != 1 ? this.b.e() : this.b.e();
        }
        return this.b.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        int i = this.c;
        if (i == 0) {
            this.b.qc();
        } else if (i != 1) {
            this.b.qc();
        } else {
            this.b.qc();
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        int i = this.c;
        if (i == 0) {
            this.a.sh();
        } else {
            if (i == 1) {
                this.a.sh();
                return;
            }
            this.a.c(aypx.a);
            this.a.sh();
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        int i = this.c;
        if (i == 0) {
            this.b = ayqxVar;
            this.a.se(this);
        } else {
            if (i != 1) {
                if (ayrz.h(this.b, ayqxVar)) {
                    this.b = ayqxVar;
                    this.a.se(this);
                    return;
                }
                return;
            }
            if (ayrz.h(this.b, ayqxVar)) {
                this.b = ayqxVar;
                this.a.se(this);
            }
        }
    }
}
