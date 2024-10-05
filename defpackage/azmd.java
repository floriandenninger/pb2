package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azmd extends azmb {
    private static final long serialVersionUID = 1075119423897941642L;
    final aysx k;

    public azmd(aysx aysxVar, int i, azog azogVar, ayqh ayqhVar) {
        super(i, azogVar, ayqhVar);
        this.k = aysxVar;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.e, banxVar)) {
            this.e = banxVar;
            this.k.f(this);
            banxVar.sj(this.a);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        int i = this.j;
        azog azogVar = this.c;
        aysx aysxVar = this.k;
        int i2 = this.b;
        int i3 = 1;
        while (true) {
            long j = this.h.get();
            long j2 = 0;
            while (j2 != j) {
                if (this.i) {
                    azogVar.d();
                    return;
                }
                boolean z = this.f;
                if (!z || (th = this.g) == null) {
                    Object sg = azogVar.sg();
                    if (!z) {
                        if (sg == null) {
                            break;
                        }
                    } else if (sg == null) {
                        aysxVar.sh();
                        this.d.qc();
                        return;
                    }
                    if (aysxVar.e(sg)) {
                        j2++;
                    }
                    i++;
                    if (i == i2) {
                        this.e.sj(i);
                        i = 0;
                    }
                } else {
                    azogVar.d();
                    aysxVar.b(th);
                    this.d.qc();
                    return;
                }
            }
            if (j2 == j) {
                if (this.i) {
                    azogVar.d();
                    return;
                }
                if (this.f) {
                    Throwable th2 = this.g;
                    if (th2 == null) {
                        if (azogVar.j()) {
                            aysxVar.sh();
                            this.d.qc();
                            return;
                        }
                    } else {
                        azogVar.d();
                        aysxVar.b(th2);
                        this.d.qc();
                        return;
                    }
                }
            }
            if (j2 != 0 && j != Long.MAX_VALUE) {
                this.h.addAndGet(-j2);
            }
            int i4 = get();
            if (i4 == i3) {
                this.j = i;
                i3 = addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            } else {
                i3 = i4;
            }
        }
    }
}
