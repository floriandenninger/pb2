package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aedu implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;

    public aedu(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
    }

    public static ywp b(Context context, azrw azrwVar, anib anibVar, azrw azrwVar2) {
        vda a = vdb.a(context);
        a.e("media");
        a.f("media.pb");
        Uri a2 = a.a();
        vfe a3 = vff.a();
        a3.e(awvr.a);
        a3.f(a2);
        ywu d = ywv.d(azrwVar, anibVar);
        d.a = wgw.i;
        d.c = abea.t;
        d.b(adpv.i);
        d.b = adpv.h;
        a3.b(d.a());
        vfk d2 = vfn.d(context, anibVar);
        d2.d("last_manual_quality_selection_cpn");
        d2.e(adgt.e);
        a3.b(d2.a());
        return new ywp(agcm.e(((vfg) azrwVar2.get()).a(a3.a())), awvr.a);
    }

    public static aedu c(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aedu(azrwVar, azrwVar2, azrwVar3, azrwVar4);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ywp get() {
        return b((Context) ((axqs) this.a).a, this.b, (anib) this.c.get(), this.d);
    }
}
