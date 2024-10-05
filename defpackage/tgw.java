package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tgw implements Runnable {
    public final /* synthetic */ tgy a;
    private final /* synthetic */ int b;

    public /* synthetic */ tgw(tgy tgyVar, int i) {
        this.b = i;
        this.a = tgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.a();
            return;
        }
        final tgy tgyVar = this.a;
        tgyVar.g = null;
        amil l = amjw.l("GIL:AutoProcessLogBatch");
        try {
            tgyVar.a.c(new tfm() { // from class: tgv
                @Override // defpackage.tfm
                public final List a() {
                    return tgy.this.b.c();
                }
            });
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
