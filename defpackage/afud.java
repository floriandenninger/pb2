package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afud implements Runnable {
    final /* synthetic */ afub a;
    final /* synthetic */ afuh b;

    public afud(afuh afuhVar, afub afubVar) {
        this.b = afuhVar;
        this.a = afubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.b(this.a);
        if (!this.b.b.o() || (this.b.c.i() && this.b.b.m())) {
            atej atejVar = this.b.d.a().k;
            if (atejVar == null) {
                atejVar = atej.a;
            }
            apcq apcqVar = atejVar.w;
            if (apcqVar == null) {
                apcqVar = apcq.a;
            }
            if (apcqVar.b) {
                this.b.e.b.e("ping_flush_one_off", afuj.a, false, 1, null, afuj.c, false);
                return;
            }
            return;
        }
        this.b.a.a();
    }
}
