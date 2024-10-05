package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class aywe extends AtomicLong implements aypo, banx {
    private static final long serialVersionUID = 7326289992464377023L;
    final banw a;
    final aysd b = new aysd();

    public aywe(banw banwVar) {
        this.a = banwVar;
    }

    @Override // defpackage.aypm
    public final void a() {
        throw null;
    }

    @Override // defpackage.aypo
    public final void b(ayrr ayrrVar) {
        si(new ayrx(ayrrVar));
    }

    @Override // defpackage.aypm
    public final void c(Throwable th) {
        if (k(th)) {
            return;
        }
        aynu.j(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f() {
        if (j()) {
            return;
        }
        try {
            this.a.sh();
        } finally {
            ayrz.c(this.b);
        }
    }

    public void g() {
    }

    public void h() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean i(Throwable th) {
        if (j()) {
            return false;
        }
        try {
            this.a.b(th);
            ayrz.c(this.b);
            return true;
        } catch (Throwable th2) {
            ayrz.c(this.b);
            throw th2;
        }
    }

    public final boolean j() {
        return this.b.e();
    }

    public boolean k(Throwable th) {
        return i(th);
    }

    @Override // defpackage.banx
    public final void sd() {
        ayrz.c(this.b);
        h();
    }

    @Override // defpackage.aypo
    public final void si(ayqx ayqxVar) {
        ayrz.f(this.b, ayqxVar);
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this, j);
            g();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
    }
}
