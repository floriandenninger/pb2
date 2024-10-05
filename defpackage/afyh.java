package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afyh implements ucc {
    private final ysl a;

    public afyh(ysl yslVar) {
        this.a = yslVar;
    }

    @Override // defpackage.ucc
    public final uch a(ucf ucfVar) {
        yjk.e();
        try {
            return (uch) anfq.h(this.a.b(new afyg(ucfVar)), afyf.a, angq.a).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ucg a = uch.a();
            a.e = e;
            return a.a();
        } catch (ExecutionException e2) {
            ucg a2 = uch.a();
            a2.e = e2;
            return a2.a();
        }
    }
}
