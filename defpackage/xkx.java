package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.ads.player.ui.BrandInteractionView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xkx extends xkt implements View.OnClickListener {
    public xla a;
    public boolean f;
    public boolean g;
    private final Context h;
    private final aahd i;
    private final acra j;
    private boolean k;
    private xkn l;
    private xkn m;
    private apmp n;
    private apmp o;

    public xkx(Context context, aahd aahdVar, acra acraVar) {
        super(xjy.b().a());
        this.h = context;
        aahdVar.getClass();
        this.i = aahdVar;
        acraVar.getClass();
        this.j = acraVar;
    }

    public static final boolean g(boolean z, boolean z2) {
        return (z || z2) ? false : true;
    }

    private final void h(aplp aplpVar) {
        this.j.n(new acqx(aplpVar.h));
        if (aplpVar.e.size() != 0) {
            amrz k = amrz.k("com.google.android.libraries.youtube.innertube.endpoint.tag", aplpVar);
            Iterator it = aplpVar.e.iterator();
            while (it.hasNext()) {
                this.i.c((apxf) it.next(), k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ImageButton a() {
        return ((BrandInteractionView) this.c).c;
    }

    @Override // defpackage.xkt
    public final /* synthetic */ void b(Object obj, boolean z) {
        apmp apmpVar;
        apmp apmpVar2;
        xkn xknVar;
        xjy xjyVar = (xjy) obj;
        aplp aplpVar = xjyVar.f;
        if (aplpVar == null) {
            return;
        }
        final int i = 1;
        final int i2 = 0;
        if (xjyVar.b) {
            if (!this.k) {
                this.k = true;
                BrandInteractionView brandInteractionView = (BrandInteractionView) this.c;
                Context context = this.h;
                boolean z2 = xjyVar.e;
                boolean z3 = xjyVar.c;
                boolean z4 = xjyVar.d;
                LayoutInflater.from(context).inflate(R.layout.brand_interaction, (ViewGroup) brandInteractionView, true);
                brandInteractionView.setOrientation(0);
                brandInteractionView.c = (ImageButton) brandInteractionView.findViewById(R.id.brand_interaction_thumbs_down);
                brandInteractionView.b = (ImageButton) brandInteractionView.findViewById(R.id.brand_interaction_thumbs_up);
                brandInteractionView.d = (LinearLayout) brandInteractionView.findViewById(R.id.brand_interaction_container);
                brandInteractionView.a(z3, z4, z2);
                xkn xknVar2 = new xkn(f(), this.i);
                this.l = xknVar2;
                xknVar2.a = new xkm(this) { // from class: xkw
                    public final /* synthetic */ xkx a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.xkm
                    public final void a() {
                        if (i == 0) {
                            xkx xkxVar = this.a;
                            xla xlaVar = xkxVar.a;
                            xlaVar.getClass();
                            xlaVar.c(false);
                            xkxVar.onClick(xkxVar.a());
                            return;
                        }
                        xkx xkxVar2 = this.a;
                        xla xlaVar2 = xkxVar2.a;
                        xlaVar2.getClass();
                        xlaVar2.c(true);
                        xkxVar2.onClick(xkxVar2.f());
                    }
                };
                xkn xknVar3 = new xkn(a(), this.i);
                this.m = xknVar3;
                xknVar3.a = new xkm(this) { // from class: xkw
                    public final /* synthetic */ xkx a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.xkm
                    public final void a() {
                        if (i2 == 0) {
                            xkx xkxVar = this.a;
                            xla xlaVar = xkxVar.a;
                            xlaVar.getClass();
                            xlaVar.c(false);
                            xkxVar.onClick(xkxVar.a());
                            return;
                        }
                        xkx xkxVar2 = this.a;
                        xla xlaVar2 = xkxVar2.a;
                        xlaVar2.getClass();
                        xlaVar2.c(true);
                        xkxVar2.onClick(xkxVar2.f());
                    }
                };
                h(aplpVar);
            } else if (!((xjy) this.b).b) {
                BrandInteractionView brandInteractionView2 = (BrandInteractionView) this.c;
                Context context2 = this.h;
                brandInteractionView2.a(xjyVar.c, xjyVar.d, xjyVar.e);
                ka kaVar = brandInteractionView2.e;
                if (kaVar != null) {
                    kaVar.a();
                    brandInteractionView2.e = null;
                }
                Resources resources = context2.getResources();
                brandInteractionView2.b.setAlpha(whu.u(resources, R.dimen.low_opacity));
                brandInteractionView2.c.setAlpha(whu.u(resources, R.dimen.low_opacity));
                brandInteractionView2.d.setAlpha(whu.u(resources, R.dimen.full_opacity));
                brandInteractionView2.d.setBackgroundColor(aih.d(context2, R.color.brand_interaction_background_color));
                brandInteractionView2.d.setVisibility(0);
                h(aplpVar);
            }
        }
        if (((xjy) this.b).c && !xjyVar.c) {
            ((BrandInteractionView) this.c).a(false, xjyVar.d, xjyVar.e);
        }
        boolean z5 = ((xjy) this.b).e;
        boolean z6 = xjyVar.e;
        if (z5 != z6) {
            BrandInteractionView brandInteractionView3 = (BrandInteractionView) this.c;
            boolean z7 = xjyVar.c;
            boolean z8 = xjyVar.d;
            ka kaVar2 = brandInteractionView3.e;
            if (kaVar2 != null) {
                kaVar2.a();
                brandInteractionView3.e = null;
            }
            brandInteractionView3.a(z7, z8, z6);
        }
        aulq aulqVar = aplpVar.f;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(ButtonRendererOuterClass.toggleButtonRenderer)) {
            aulq aulqVar2 = aplpVar.f;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            apmpVar = (apmp) aulqVar2.pX(ButtonRendererOuterClass.toggleButtonRenderer);
        } else {
            apmpVar = null;
        }
        aulq aulqVar3 = aplpVar.g;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        if (aulqVar3.pY(ButtonRendererOuterClass.toggleButtonRenderer)) {
            aulq aulqVar4 = aplpVar.g;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            apmpVar2 = (apmp) aulqVar4.pX(ButtonRendererOuterClass.toggleButtonRenderer);
        } else {
            apmpVar2 = null;
        }
        if (this.l != null && apmpVar != null && !apmpVar.equals(this.n)) {
            this.n = apmpVar;
            this.l.a(new xgs(apmpVar));
        }
        if (this.m != null && apmpVar2 != null && !apmpVar2.equals(this.o)) {
            this.o = apmpVar2;
            this.m.a(new xgs(apmpVar2));
        }
        boolean z9 = xjyVar.a;
        this.f = z9;
        int i3 = 8;
        if (z && g(z9, this.g)) {
            i3 = 0;
        }
        ((BrandInteractionView) this.c).setVisibility(i3);
        if (this.l == null || (xknVar = this.m) == null) {
            return;
        }
        int i4 = xjyVar.g;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        if (i5 == 0) {
            xknVar.b(false);
            this.l.b(false);
        } else if (i5 == 1) {
            xknVar.b(false);
            this.l.b(true);
        } else {
            if (i5 != 2) {
                return;
            }
            xknVar.b(true);
            this.l.b(false);
        }
    }

    @Override // defpackage.xkt
    public final void d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ImageButton f() {
        return ((BrandInteractionView) this.c).b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aplp aplpVar = ((xjy) this.b).f;
        if (aplpVar != null && (aplpVar.b & 65536) != 0) {
            this.j.I(3, new acqx(aplpVar.h.I()), null);
        }
        BrandInteractionView brandInteractionView = (BrandInteractionView) this.c;
        Context context = this.h;
        boolean z = ((xjy) this.b).e;
        brandInteractionView.d.setBackgroundColor(aih.d(context, R.color.brand_interaction_selected_background_color));
        view.setAlpha(whu.u(context.getResources(), R.dimen.full_opacity));
        ka q = jw.q(brandInteractionView.d);
        q.c(0.0f);
        q.d(brandInteractionView.a);
        q.g(500L);
        q.f(new xkj(brandInteractionView));
        brandInteractionView.e = q;
    }
}
