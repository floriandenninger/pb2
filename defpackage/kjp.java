package defpackage;

import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kjp {
    public final acra c;
    public final azrw d;
    public final azrh a = azrh.aN(false);
    public final azrh b = azrh.aN(false);
    public ImageView e = null;

    public kjp(aivb aivbVar, aadw aadwVar, acra acraVar, azrw azrwVar) {
        this.c = acraVar;
        this.d = azrwVar;
        asvu asvuVar = aadwVar.b().e;
        boolean z = (asvuVar == null ? asvu.a : asvuVar).cH;
        if (evr.aP(aadwVar) || z) {
            aivbVar.a(new kjo(this));
        }
    }
}
