package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.CarouselItemRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kzr implements ajom {
    public final gnx a;
    private final Context b;
    private final ajyg c;
    private final acqz d;
    private final ajos e;
    private final ajtk f;
    private final aahd g;
    private final View h;
    private final ViewGroup i;
    private final TextView j;
    private ajyf k;

    public kzr(Context context, ajos ajosVar, gnx gnxVar, ajyg ajygVar, acqz acqzVar, ajtk ajtkVar, aahd aahdVar) {
        this.b = context;
        this.a = gnxVar;
        this.c = ajygVar;
        this.e = ajosVar;
        this.d = acqzVar;
        this.f = ajtkVar;
        this.g = aahdVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.full_screen_overlay_layout, (ViewGroup) null, false);
        this.h = inflate;
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.j = (TextView) inflate.findViewById(R.id.dismiss_button);
        this.i = (ViewGroup) inflate.findViewById(R.id.overlay_content);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.h;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        View childAt = this.i.getChildCount() > 0 ? this.i.getChildAt(0) : null;
        if (childAt != null) {
            this.i.removeView(childAt);
            ahbw.t(childAt, this.e);
            this.e.b(childAt);
        }
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aulq aulqVar;
        aulq aulqVar2;
        ajom ajomVar;
        aqzh aqzhVar = (aqzh) obj;
        this.i.removeAllViews();
        if ((aqzhVar.b & 1) != 0) {
            aulq aulqVar3 = aqzhVar.e;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            if (aulqVar3.pY(CarouselItemRendererOuterClass.carouselItemRenderer)) {
                ajtk ajtkVar = this.f;
                aulq aulqVar4 = aqzhVar.e;
                if (aulqVar4 == null) {
                    aulqVar4 = aulq.a;
                }
                Object a = ajtkVar.a(aulqVar4.pX(CarouselItemRendererOuterClass.carouselItemRenderer));
                View view = null;
                if (a != null && (ajomVar = (ajom) ahbw.s(this.e, a, this.i).f()) != null) {
                    View a2 = ajomVar.a();
                    ajok p = ahbw.p(a2);
                    if (p == null) {
                        p = new ajok();
                        ahbw.v(a2, p);
                    }
                    p.h();
                    p.a(this.d.mM());
                    ajomVar.oB(p, a);
                    view = ajomVar.a();
                }
                this.i.addView(view);
                if (aqzhVar.f.size() > 0) {
                    whl.I(this.g, aqzhVar.f, aqzhVar);
                }
            }
        }
        acra acraVar = ajokVar.a;
        if (aqzhVar.c == 14) {
            aulqVar = (aulq) aqzhVar.d;
        } else {
            aulqVar = aulq.a;
        }
        if (!aulqVar.pY(ButtonRendererOuterClass.buttonRenderer) || zev.e(this.b)) {
            whu.I(this.j, false);
            return;
        }
        if (aqzhVar.c == 14) {
            aulqVar2 = (aulq) aqzhVar.d;
        } else {
            aulqVar2 = aulq.a;
        }
        apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
        if (this.k == null) {
            ajyf a3 = this.c.a(this.j);
            this.k = a3;
            a3.c = new ajyc() { // from class: kzq
                @Override // defpackage.ajyc
                public final void oC(aong aongVar) {
                    kzr.this.a.a();
                }
            };
        }
        this.k.b(apmgVar, acraVar);
    }
}
