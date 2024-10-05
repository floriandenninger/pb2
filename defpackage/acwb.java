package defpackage;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acwb implements adtu {
    final /* synthetic */ adtu a;
    final /* synthetic */ acwg b;

    public acwb(acwg acwgVar, adtu adtuVar) {
        this.b = acwgVar;
        this.a = adtuVar;
    }

    @Override // defpackage.adtu
    public final void a(IOException iOException) {
        this.a.a(iOException);
    }

    @Override // defpackage.adtu
    public final void i(ysq ysqVar) {
        if (ysqVar.a == 200) {
            this.b.k++;
        }
        this.a.i(ysqVar);
    }
}
