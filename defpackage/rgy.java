package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rgy implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ rff b;
    private final /* synthetic */ int c;

    public rgy(rff rffVar, AppMetadata appMetadata, int i) {
        this.c = i;
        this.b = rffVar;
        this.a = appMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.b.a.w();
            rki rkiVar = this.b.a;
            AppMetadata appMetadata = this.a;
            rkiVar.v();
            rkiVar.x();
            qip.ax(appMetadata.a);
            rkiVar.c(appMetadata);
            return;
        }
        if (i == 1) {
            this.b.a.w();
            this.b.a.H(this.a);
            return;
        }
        if (i != 2) {
            this.b.a.w();
            this.b.a.E(this.a);
            return;
        }
        this.b.a.w();
        rki rkiVar2 = this.b.a;
        AppMetadata appMetadata2 = this.a;
        rkiVar2.v();
        rkiVar2.x();
        qip.ax(appMetadata2.a);
        ren b = ren.b(appMetadata2.v);
        ren i2 = rkiVar2.i(appMetadata2.a);
        rkiVar2.aF().k.c("Setting consent, package, consent", appMetadata2.a, b);
        rkiVar2.J(appMetadata2.a, b);
        if (b.j(i2)) {
            rkiVar2.H(appMetadata2);
        }
    }
}
