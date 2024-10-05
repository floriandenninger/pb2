package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nou implements nqb {
    private final Context a;
    private final axpg b;
    private final ajdw c;
    private final acra d;
    private final asht e;
    private final apbq f;
    private aqrf g;
    private ViewGroup h;
    private ajds i;

    public nou(Context context, ajdw ajdwVar, axpg axpgVar, acra acraVar, asht ashtVar, apbq apbqVar) {
        this.a = context;
        this.b = axpgVar;
        this.c = ajdwVar;
        this.d = acraVar;
        this.f = apbqVar;
        this.e = ashtVar;
    }

    private final void n() {
        if (this.h != null) {
            return;
        }
        this.h = (ViewGroup) LayoutInflater.from(this.a).inflate(R.layout.ads_engagement_panel_elements_header, (ViewGroup) null, false);
    }

    @Override // defpackage.nqb
    public final View a() {
        return null;
    }

    @Override // defpackage.nqb
    public final View b() {
        n();
        return this.h;
    }

    @Override // defpackage.nqb
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.nqb
    public final void d() {
        acra acraVar = this.d;
        aulq aulqVar = this.f.b;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        acraVar.D(new acqx(((aqrf) aulqVar.pX(ElementRendererOuterClass.elementRenderer)).e));
        if (this.i != null) {
            return;
        }
        n();
        aulq aulqVar2 = this.f.b;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        if (!aulqVar2.pY(ElementRendererOuterClass.elementRenderer)) {
            this.h.setVisibility(8);
            return;
        }
        aulq aulqVar3 = this.f.b;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        this.g = (aqrf) aulqVar3.pX(ElementRendererOuterClass.elementRenderer);
        this.h.setVisibility(0);
        this.i = ajds.a(this.g);
        ajok ajokVar = new ajok();
        ajokVar.g(new HashMap());
        ajokVar.a(this.d);
        asht ashtVar = this.e;
        if (ashtVar != null) {
            ajokVar.c = ashtVar;
        }
        this.h.addView(this.c.a());
        this.c.oB(ajokVar, this.i);
    }

    @Override // defpackage.nqb
    public final void e(boolean z) {
    }

    @Override // defpackage.nqb
    public final void f(boolean z) {
    }

    @Override // defpackage.nqb
    public final void g(auwh auwhVar) {
    }

    @Override // defpackage.nqb
    public final void h(nqe nqeVar) {
    }

    @Override // defpackage.nqb
    public final void i(nqc nqcVar) {
    }

    @Override // defpackage.nqb
    public final void j(CharSequence charSequence) {
    }

    @Override // defpackage.nqb
    public final void k(CharSequence charSequence) {
    }

    @Override // defpackage.nqb
    public final boolean l() {
        return false;
    }

    @Override // defpackage.nqb
    public final void m(nqr nqrVar) {
    }
}
