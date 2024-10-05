package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeqm extends aeql implements azh {
    public aeqm(aeqg aeqgVar, Handler handler, aepw aepwVar) {
        super(aeqgVar, handler, aepwVar);
    }

    @Override // defpackage.azh
    public final byte[] b(ztp ztpVar) {
        try {
            return super.h(ztpVar.b, ztpVar.a);
        } catch (aeqe e) {
            atg atgVar = new atg();
            atgVar.b(ztpVar.b);
            atgVar.d = ztpVar.a;
            throw new azi(atgVar.a(), 0L, e);
        }
    }

    @Override // defpackage.azh
    public final byte[] c(ztp ztpVar) {
        try {
            return super.g(ztpVar.a);
        } catch (aeqe e) {
            atg atgVar = new atg();
            atgVar.b(ztpVar.b);
            atgVar.d = ztpVar.a;
            throw new azi(atgVar.a(), 0L, e);
        }
    }

    @Override // defpackage.aeql
    public final void f(String str, String str2, String str3, String str4, String str5) {
        super.f(str, str2, str3, str4, str5);
    }

    public aeqm(aeqg aeqgVar, aepw aepwVar) {
        super(aeqgVar, null, aepwVar);
    }
}
