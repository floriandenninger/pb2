package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpr implements ajom, ggr, gmf {
    private final aahd a;
    private final azrw b;
    private final azrw c;
    private final FrameLayout d;
    private Object e;
    private gol f;
    private ajom g;
    private mkv h;
    private mpq i;

    public mpr(Context context, azrw azrwVar, azrw azrwVar2, aahd aahdVar) {
        this.d = new FrameLayout(context);
        this.b = azrwVar;
        this.c = azrwVar2;
        this.a = aahdVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ajom ajomVar = this.g;
        if (ajomVar != null) {
            ajomVar.b(ajosVar);
            this.g = null;
        }
        this.f = null;
        this.e = null;
    }

    @Override // defpackage.ggr
    public final View g() {
        ajom ajomVar = this.g;
        if (ajomVar == null) {
            return null;
        }
        return ((ggr) ajomVar).g();
    }

    @Override // defpackage.ggr
    public final void i(boolean z) {
        ajom ajomVar = this.g;
        if (ajomVar != null) {
            ((ggr) ajomVar).i(z);
        }
    }

    @Override // defpackage.ggr
    public final /* synthetic */ mhp j() {
        return null;
    }

    @Override // defpackage.gmf
    public final boolean oA(gmf gmfVar) {
        return (gmfVar instanceof mpr) && ((mpr) gmfVar).e == this.e;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        ajom ajomVar;
        jah jahVar = (jah) obj;
        this.e = jahVar.a;
        gol bp = evr.bp(jahVar);
        this.f = bp;
        if (bp == null || !evr.bu(bp)) {
            if (this.h == null) {
                this.h = (mkv) this.b.get();
            }
            ajomVar = this.h;
        } else {
            if (this.i == null) {
                this.i = (mpq) this.c.get();
            }
            ajomVar = this.i;
        }
        if (ajomVar != this.g) {
            this.d.removeAllViews();
            this.d.addView(ajomVar.a());
            this.g = ajomVar;
        }
        this.g.oB(ajokVar, jahVar);
        whl.I(this.a, jahVar.a.i, jahVar);
    }

    @Override // defpackage.gmf
    public final ayph oz(int i) {
        ajom ajomVar = this.g;
        if (ajomVar instanceof gmf) {
            return ((gmf) ajomVar).oz(i);
        }
        return ayph.f();
    }
}
