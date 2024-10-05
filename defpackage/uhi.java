package defpackage;

import android.content.Context;
import com.google.android.libraries.onegoogle.accountmanagement.AccountsModelUpdater;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uhi {
    public final dd a;
    public final ci b;
    private final Context c;
    private final uhh d;

    public uhi(Context context, dd ddVar, uhh uhhVar, ci ciVar) {
        this.c = context.getApplicationContext();
        this.a = ddVar;
        this.d = uhhVar;
        this.b = ciVar;
        uhf b = b(ddVar);
        if (b != null) {
            a(b);
        }
    }

    public static final uhf b(dd ddVar) {
        return (uhf) ddVar.f(uhf.ae);
    }

    public final void a(uhf uhfVar) {
        Context context = this.c;
        uhh uhhVar = this.d;
        uik uikVar = uhhVar.a;
        uim uimVar = uhhVar.b;
        AccountsModelUpdater accountsModelUpdater = (AccountsModelUpdater) uhhVar.c.f();
        uhfVar.ag = uikVar;
        if (uimVar.a.f.h()) {
            uhfVar.aj = ((uio) uimVar.a.f.c()).b;
        } else {
            uhfVar.aj = omm.g;
            uil uilVar = new uil(uimVar);
            uir uirVar = new uir(uimVar.a);
            uirVar.b(tyo.K(context, uhfVar.aj));
            uilVar.a = uirVar.a();
            uimVar = uilVar.a();
        }
        uhfVar.ah = uimVar;
        uhfVar.ai = accountsModelUpdater;
        final ugt ugtVar = uhfVar.af;
        amkq.O(ugtVar.b.b(), "Object was not initialized");
        tyo.M(new Runnable() { // from class: ugr
            @Override // java.lang.Runnable
            public final void run() {
                ugt.this.a();
            }
        });
    }
}
