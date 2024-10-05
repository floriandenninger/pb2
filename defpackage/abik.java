package defpackage;

import android.app.Activity;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abik implements aaha {
    private final Activity a;
    private final afsy b;
    private final aftn c;

    public abik(Activity activity, afsy afsyVar, aftn aftnVar) {
        this.a = activity;
        this.b = afsyVar;
        this.c = aftnVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (!this.b.t()) {
            this.c.c(this.a, null, null);
            return;
        }
        asrh asrhVar = (asrh) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", asrh.class);
        dd supportFragmentManager = ((ci) this.a).getSupportFragmentManager();
        ce f = supportFragmentManager.f("purchase_dialog_fragment");
        if (f == null) {
            adyu.dd(apxfVar, asrhVar, null).qh(supportFragmentManager, "purchase_dialog_fragment");
        } else {
            ((abkm) f).aH(adyu.de(apxfVar, asrhVar, null));
        }
    }
}
