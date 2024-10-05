package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acwf extends acwc {
    String c;

    @Override // defpackage.acwc, defpackage.adtu
    public final void a(IOException iOException) {
        this.b = iOException;
        this.a = iOException instanceof yri ? 505 : 500;
    }

    @Override // defpackage.acwc, defpackage.adtu
    public final void i(ysq ysqVar) {
        super.i(ysqVar);
        yso ysoVar = ysqVar.d;
        if (ysoVar != null) {
            try {
                this.c = ysoVar.c();
            } catch (IOException e) {
                a(e);
            }
        }
    }
}
