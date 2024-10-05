package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class roy implements Runnable {
    final /* synthetic */ rpt a;
    final /* synthetic */ roz b;

    public roy(roz rozVar, rpt rptVar) {
        this.b = rozVar;
        this.a = rptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((rpx) this.a).c) {
            this.b.b.u();
            return;
        }
        try {
            this.b.b.t(this.b.a.a(this.a));
        } catch (rpr e) {
            if (e.getCause() instanceof Exception) {
                this.b.b.s((Exception) e.getCause());
            } else {
                this.b.b.s(e);
            }
        } catch (Exception e2) {
            this.b.b.s(e2);
        }
    }
}
