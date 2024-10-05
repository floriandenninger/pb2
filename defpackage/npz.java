package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class npz implements nqa {
    public final FrameLayout a;
    aqrf b;
    private final axpg c;
    private final ajdw d;
    private final ajok e;

    public npz(Context context, ajdw ajdwVar, axpg axpgVar, acra acraVar, asht ashtVar, npy npyVar) {
        this.d = ajdwVar;
        this.c = axpgVar;
        if (npyVar == null) {
            this.a = new FrameLayout(context);
        } else {
            this.a = new npx(context, npyVar);
        }
        this.a.setVisibility(8);
        this.a.addView(ajdwVar.a());
        ajok ajokVar = new ajok();
        this.e = ajokVar;
        ajokVar.g(new HashMap());
        ajokVar.a(acraVar);
        if (ashtVar != null) {
            ajokVar.c = ashtVar;
        }
    }

    public final void a(aqrm aqrmVar) {
        aqrf aqrfVar = null;
        if (aqrmVar != null) {
            aulq aulqVar = aqrmVar.c;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(ElementRendererOuterClass.elementRenderer)) {
                aulq aulqVar2 = aqrmVar.c;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                aqrfVar = (aqrf) aulqVar2.pX(ElementRendererOuterClass.elementRenderer);
            }
        }
        if (aqrfVar != null && !aqrfVar.equals(this.b)) {
            ajdw ajdwVar = this.d;
            ajok ajokVar = this.e;
            ajdwVar.oB(ajokVar, ajds.a(aqrfVar));
        }
        this.b = aqrfVar;
        f();
    }

    @Override // defpackage.nrg
    public final void d() {
        this.a.setVisibility(8);
    }

    public final void f() {
        if (this.b == null) {
            this.a.setVisibility(8);
            return;
        }
        yny.z(this.a, yny.y(-1, -2), FrameLayout.LayoutParams.class);
        yny.z(this.a, yny.m(80), FrameLayout.LayoutParams.class);
        this.a.setVisibility(0);
    }

    @Override // defpackage.nrg
    public final void h() {
        f();
    }

    @Override // defpackage.nrg
    public final void oS() {
        d();
    }

    @Override // defpackage.nrg
    public final void oT() {
        this.a.removeAllViews();
        this.a.setVisibility(8);
        this.d.b(null);
    }

    @Override // defpackage.nrg
    public final /* synthetic */ void oX() {
    }
}
