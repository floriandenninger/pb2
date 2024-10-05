package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kri implements kqt {
    public final ajdw a;
    public aqrf b;
    public ViewGroup c;
    public aqrj d;
    public ajds e;
    private final axpg f;
    private final acra g;

    public kri(axpg axpgVar, ajdw ajdwVar, acra acraVar) {
        axpgVar.getClass();
        this.f = axpgVar;
        this.a = ajdwVar;
        this.g = acraVar;
    }

    @Override // defpackage.kqt
    public final void b(View view) {
        if (this.c != null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) whu.z(view, R.id.elements_ad_cta_overlay_stub, R.id.elements_ad_cta_overlay);
        this.c = viewGroup;
        viewGroup.setVisibility(8);
    }

    @Override // defpackage.kqt
    public final void c() {
        aqrf aqrfVar;
        aqrj aqrjVar = this.d;
        if (aqrjVar == null || this.c == null) {
            return;
        }
        aulq aulqVar = aqrjVar.b;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(ElementRendererOuterClass.elementRenderer)) {
            aulq aulqVar2 = this.d.b;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            aqrfVar = (aqrf) aulqVar2.pX(ElementRendererOuterClass.elementRenderer);
        } else {
            aqrfVar = null;
        }
        this.b = aqrfVar;
        this.c.addView(this.a.a());
    }

    @Override // defpackage.kqt
    public final void d() {
        throw null;
    }

    @Override // defpackage.kqt
    public final void e(boolean z) {
    }

    @Override // defpackage.kqt
    public final void f(woq woqVar) {
    }

    @Override // defpackage.kqt
    public final void g(int i, boolean z) {
        ViewGroup viewGroup = this.c;
        if (viewGroup == null) {
            return;
        }
        if (i != 2) {
            viewGroup.setVisibility(8);
            return;
        }
        if (this.b == null) {
            viewGroup.setVisibility(8);
            return;
        }
        if (this.e != null) {
            viewGroup.setVisibility(0);
            return;
        }
        viewGroup.setVisibility(0);
        ajok ajokVar = new ajok();
        ajokVar.g(new HashMap());
        ajokVar.a(this.g);
        ajds a = ajds.a(this.b);
        this.e = a;
        this.a.oB(ajokVar, a);
    }
}
