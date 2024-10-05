package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tsd implements axqr {
    private final tsb a;
    private final azrw b;
    private final azrw c;

    public tsd(tsb tsbVar, azrw azrwVar, azrw azrwVar2) {
        this.a = tsbVar;
        this.b = azrwVar;
        this.c = azrwVar2;
    }

    @Override // defpackage.azrw
    public final /* bridge */ /* synthetic */ Object get() {
        tsb tsbVar = this.a;
        Context context = ((trq) this.b).get();
        ammv ammvVar = (ammv) this.c.get();
        vda a = vdb.a(context);
        a.e("mdd_pds_config");
        a.f(rwh.aX("LoggingState", ammvVar));
        Uri a2 = a.a();
        vfe a3 = vff.a();
        a3.f(a2);
        a3.e(tlf.a);
        a3.g(false);
        return tsbVar.b.a(a3.a());
    }
}
