package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azne extends AtomicLong implements ayqk, aypq, banx {
    private static final long serialVersionUID = 7759721921468635667L;
    final banw a;
    final ayrv b;
    final AtomicReference c = new AtomicReference();
    ayqx d;

    public azne(banw banwVar, ayrv ayrvVar) {
        this.a = banwVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        azqb.j(this.c, this, banxVar);
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        try {
            banv banvVar = (banv) this.b.a(obj);
            aysw.b(banvVar, "the mapper returned a null Publisher");
            banvVar.ab(this);
        } catch (Throwable th) {
            aynu.c(th);
            this.a.b(th);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        this.d.qc();
        azqb.f(this.c);
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        this.d = ayqxVar;
        this.a.f(this);
    }

    @Override // defpackage.banw
    public final void sh() {
        this.a.sh();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        azqb.a(this.c, this, j);
    }
}
