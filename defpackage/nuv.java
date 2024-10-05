package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nuv implements aiva, obo {
    public final aypn a;
    public nuu b;
    private final Context c;
    private final aivb d;
    private final azqv e;
    private final azqv f;
    private final azqv g;

    public nuv(Context context, oel oelVar, fgq fgqVar, aivb aivbVar, aadw aadwVar) {
        this.c = context;
        this.d = aivbVar;
        azqv aq = azqv.aq(false);
        this.e = aq;
        azqv aq2 = azqv.aq(false);
        this.f = aq2;
        azqv aq3 = azqv.aq(false);
        this.g = aq3;
        aivbVar.a(this);
        final boolean aI = evr.aI(aadwVar);
        oelVar.h(this);
        this.a = aypn.g(fgqVar.h().i(aypg.LATEST), aq, aq3, aq2, new ayru() { // from class: nut
            @Override // defpackage.ayru
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                fhg fhgVar = (fhg) obj;
                Boolean bool = (Boolean) obj2;
                Boolean bool2 = (Boolean) obj3;
                Boolean bool3 = (Boolean) obj4;
                if (!aI || fhgVar != fhg.WATCH_WHILE_FULLSCREEN) {
                    return nuu.PORTRAIT_WATCH_PANEL;
                }
                if (!bool.booleanValue() || bool2.booleanValue() || bool3.booleanValue()) {
                    return nuu.PORTRAIT_WATCH_PANEL;
                }
                return nuu.LANDSCAPE_PLAYER_OVERLAY;
            }
        }).q(new ayrs() { // from class: nus
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                nuv.this.b = (nuu) obj;
            }
        }).n().h(ntu.d);
    }

    @Override // defpackage.aiva
    public final void d(int i, int i2) {
        this.g.c(Boolean.valueOf(this.d.b));
    }

    @Override // defpackage.obo
    public final void pa(obp obpVar) {
        Rect t = obpVar.t();
        boolean z = t.width() >= t.height();
        this.e.c(Boolean.valueOf(z));
        this.f.c(Boolean.valueOf(z && t.width() < this.c.getResources().getDimensionPixelSize(R.dimen.minimum_player_width_for_landscape_engagement_panel)));
    }
}
