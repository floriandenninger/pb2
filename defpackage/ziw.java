package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ziw implements anhh {
    final /* synthetic */ azcc a;

    public ziw(azcc azccVar) {
        this.a = azccVar;
    }

    @Override // defpackage.anhh
    public final void b(Object obj) {
        ayqx ayqxVar;
        if (this.a.e()) {
            return;
        }
        if (obj != null) {
            this.a.c(obj);
            return;
        }
        azcc azccVar = this.a;
        if (azccVar.get() == ayrz.a || (ayqxVar = (ayqx) azccVar.getAndSet(ayrz.a)) == ayrz.a) {
            return;
        }
        try {
            azccVar.a.sh();
            if (ayqxVar != null) {
                ayqxVar.qc();
            }
        } catch (Throwable th) {
            if (ayqxVar != null) {
                ayqxVar.qc();
            }
            throw th;
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        if (this.a.e()) {
            return;
        }
        this.a.a(th);
    }
}
