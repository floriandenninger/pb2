package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class njb extends njq {
    public final ViewGroup a;
    public final ViewGroup b;
    public final LinearLayout c;
    public final LinearLayout d;
    public boolean e = false;
    public final bwk f;
    public final aahd g;
    private final ajos h;
    private final ajjz i;
    private final ViewGroup m;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final ImageView q;
    private final View r;
    private final bwd s;
    private final Handler t;
    private final aahv u;
    private final ayqw v;

    public njb(Handler handler, Context context, ajos ajosVar, aahd aahdVar, ajjz ajjzVar, aahv aahvVar) {
        this.g = aahdVar;
        this.t = handler;
        this.h = ajosVar;
        this.i = ajjzVar;
        this.u = aahvVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.slim_channel_metadata, (ViewGroup) null);
        this.a = viewGroup;
        this.m = (ViewGroup) viewGroup.findViewById(R.id.container);
        this.b = (ViewGroup) viewGroup.findViewById(R.id.inner_container);
        this.n = (TextView) viewGroup.findViewById(R.id.header_text);
        this.r = viewGroup.findViewById(R.id.expansion_icon);
        this.d = (LinearLayout) viewGroup.findViewById(R.id.slim_owners_container_for_expanded);
        this.c = (LinearLayout) viewGroup.findViewById(R.id.container_for_collapsed);
        this.q = (ImageView) viewGroup.findViewById(R.id.channel_owner_avatar);
        this.o = (TextView) viewGroup.findViewById(R.id.channel_name);
        this.p = (TextView) viewGroup.findViewById(R.id.collapsed_label);
        ((ViewGroup) viewGroup.findViewById(R.id.container_for_navigation_when_collapsed)).setOnClickListener(new niw(this, 0));
        bwk bwkVar = new bwk();
        fxy fxyVar = new fxy();
        fxyVar.y(R.id.container);
        bwkVar.f(fxyVar);
        bvx bvxVar = new bvx();
        bvxVar.y(R.id.container_for_collapsed);
        bvxVar.y(R.id.slim_owners_container_for_expanded);
        bwkVar.f(bvxVar);
        fyj fyjVar = new fyj();
        fyjVar.y(R.id.expansion_icon);
        bwkVar.f(fyjVar);
        this.s = bwkVar;
        bwk bwkVar2 = new bwk();
        fxy fxyVar2 = new fxy();
        fxyVar2.y(R.id.slim_owners_transition_container_for_expanded);
        fxyVar2.y(R.id.container);
        bwkVar2.f(fxyVar2);
        bwk bwkVar3 = new bwk(null);
        bwkVar3.K();
        bwkVar2.f(bwkVar3);
        bwkVar2.C(400L);
        this.f = bwkVar2;
        this.v = new ayqw();
    }

    private final void h() {
        while (this.d.getChildCount() > 0) {
            View childAt = this.d.getChildAt(0);
            this.d.removeView(childAt);
            ahbw.t(childAt, this.h);
        }
    }

    private final boolean i() {
        auvk auvkVar = (auvk) this.k;
        return auvkVar.c && (auvkVar.b & 4) != 0;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.njq
    protected final void d() {
        this.j.a.u(new acqx(((auvk) this.k).g), null);
        acra acraVar = this.j.a;
        acraVar.D(new acqx(acsb.c(87402)));
        acraVar.D(new acqx(acsb.c(87401)));
        auvk auvkVar = (auvk) this.k;
        if ((auvkVar.b & 2) == 0) {
            this.n.setVisibility(8);
        } else {
            TextView textView = this.n;
            aqyg aqygVar = auvkVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
            this.n.setVisibility(0);
        }
        auvk auvkVar2 = (auvk) this.k;
        if ((auvkVar2.b & 1) == 0 || !auvkVar2.c) {
            f(true);
        } else {
            f(false);
        }
        if (i()) {
            this.m.setOnClickListener(new niw(this, 1));
        } else {
            this.m.setOnClickListener(null);
            this.m.setClickable(false);
        }
        auvk auvkVar3 = (auvk) this.k;
        if (auvkVar3.c) {
            return;
        }
        auvm auvmVar = auvkVar3.e;
        if (auvmVar == null) {
            auvmVar = auvm.a;
        }
        for (aulq aulqVar : auvmVar.b) {
            if (aulqVar.pY(SlimVideoMetadataRendererOuterClass.slimOwnerRenderer)) {
                auvs auvsVar = (auvs) aulqVar.pX(SlimVideoMetadataRendererOuterClass.slimOwnerRenderer);
                auvt auvtVar = auvsVar.p;
                if (auvtVar == null) {
                    auvtVar = auvt.a;
                }
                if ((auvtVar.b & 1) != 0) {
                    auvt auvtVar2 = auvsVar.p;
                    if (auvtVar2 == null) {
                        auvtVar2 = auvt.a;
                    }
                    this.v.d(this.u.c().h(auvtVar2.c, true).L(niy.a).Y(mmt.f).k(aphm.class).ab(ayqr.a()).ax(new ayrs() { // from class: nix
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            boolean z;
                            njb njbVar = njb.this;
                            aphm aphmVar = (aphm) obj;
                            String d = aphmVar.d();
                            apho visibilityState = aphmVar.getVisibilityState();
                            bwh.b(njbVar.a, njbVar.f);
                            int i = visibilityState == apho.AUTOTAG_VISIBILITY_STATE_VISIBLE ? 0 : 8;
                            View findViewWithTag = njbVar.d.findViewWithTag(d);
                            if (findViewWithTag != null) {
                                findViewWithTag.setVisibility(i);
                            }
                            int i2 = 0;
                            while (true) {
                                if (i2 >= njbVar.d.getChildCount()) {
                                    z = true;
                                    break;
                                } else {
                                    if (njbVar.d.getChildAt(i2).getVisibility() == 0) {
                                        z = false;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            njbVar.b.setVisibility(true != z ? 0 : 8);
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.njq
    public final void e() {
        bwh.c(this.a);
        this.i.e(this.q);
        h();
        this.v.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r10) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njb.f(boolean):void");
    }
}
