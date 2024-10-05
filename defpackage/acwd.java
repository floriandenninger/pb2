package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acwd extends acwc {
    public String c = "";

    @Override // defpackage.acwc, defpackage.adtu
    public final void i(ysq ysqVar) {
        super.i(ysqVar);
        yso ysoVar = ysqVar.d;
        if (ysoVar == null) {
            zga.c(acwg.a, "Bind Channel: http response body is null");
            return;
        }
        try {
            this.c = ysoVar.c();
        } catch (IOException e) {
            this.b = e;
        }
    }
}
