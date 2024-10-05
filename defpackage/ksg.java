package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.FullscreenEngagementViewPresenter;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.FullscreenEngagementOverlayRendererOuterClass;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataRendererOuterClass;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ksg implements ejr {
    private final nrp A;
    private final akht B;
    public final acra a;
    public final nng b;
    public final Rect c;
    public kse d;
    public boolean e;
    public boolean f;
    public int g;
    public aqzi h;
    public asht i;
    public aqzn j;
    private final Set k;
    private final int l;
    private final int m;
    private final int n;
    private final Context o;
    private final aicz p;
    private final aaea q;
    private View r;
    private View s;
    private View t;
    private TextView u;
    private RecyclerView v;
    private ksa w;
    private krr x;
    private fyh y;
    private yzr z;

    public ksg(Context context, acra acraVar, akht akhtVar, nrp nrpVar, nng nngVar, aicz aiczVar, aaea aaeaVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        acraVar.getClass();
        this.a = acraVar;
        this.B = akhtVar;
        this.A = nrpVar;
        this.b = nngVar;
        this.o = context;
        this.c = new Rect();
        this.k = Collections.newSetFromMap(new WeakHashMap());
        this.l = context.getResources().getDimensionPixelSize(R.dimen.fullscreen_engagement_header_height);
        this.m = context.getResources().getDimensionPixelSize(R.dimen.metadata_highlights_height);
        this.n = context.getResources().getDimensionPixelSize(R.dimen.metadata_highlights_max_top_margin);
        this.q = aaeaVar;
        this.p = aiczVar;
        aiczVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ksc
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ksg ksgVar = ksg.this;
                if (i2 == ksgVar.g) {
                    return;
                }
                ksgVar.g = i2;
                if (ksgVar.f) {
                    ksgVar.f();
                }
            }
        });
    }

    private final void j() {
        this.p.f.getClass();
        View inflate = LayoutInflater.from(this.o).inflate(R.layout.fullscreen_engagement_overlay, (ViewGroup) null);
        this.r = inflate;
        this.u = (TextView) inflate.findViewById(R.id.engagement_title);
        final int i = 1;
        this.r.findViewById(R.id.engagement_overflow_button).setOnClickListener(new View.OnClickListener(this) { // from class: ksb
            public final /* synthetic */ ksg a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i == 0) {
                    ksg ksgVar = this.a;
                    ksgVar.a.I(3, new acqx(acsb.c(51992)), null);
                    kse kseVar = ksgVar.d;
                    if (kseVar != null) {
                        FullscreenEngagementViewPresenter fullscreenEngagementViewPresenter = (FullscreenEngagementViewPresenter) kseVar;
                        if (fullscreenEngagementViewPresenter.b.c.d()) {
                            fullscreenEngagementViewPresenter.b.e(1);
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.a.b.g();
            }
        });
        this.s = this.r.findViewById(R.id.engagement_content);
        this.t = this.r.findViewById(R.id.engagement_header_background);
        this.v = (RecyclerView) this.r.findViewById(R.id.metadata_highlights);
        final int i2 = 0;
        this.y = new fyh(this.v, this.p.f);
        nrp nrpVar = this.A;
        RecyclerView recyclerView = this.v;
        ((Context) nrpVar.f.get()).getClass();
        krv krvVar = (krv) nrpVar.h.get();
        krvVar.getClass();
        krx krxVar = (krx) nrpVar.b.get();
        krxVar.getClass();
        krx krxVar2 = (krx) nrpVar.e.get();
        krxVar2.getClass();
        ajoy ajoyVar = (ajoy) nrpVar.c.get();
        ajoyVar.getClass();
        azrw azrwVar = nrpVar.a;
        axpg axpgVar = ((axqv) nrpVar.d).get();
        axpgVar.getClass();
        aaea aaeaVar = (aaea) nrpVar.g.get();
        aaeaVar.getClass();
        recyclerView.getClass();
        this.w = new ksa(krvVar, krxVar, krxVar2, ajoyVar, azrwVar, axpgVar, aaeaVar, recyclerView, null);
        akht akhtVar = this.B;
        ViewGroup viewGroup = (ViewGroup) this.r.findViewById(R.id.action_bar);
        View findViewById = this.r.findViewById(R.id.action_bar_background);
        acra acraVar = (acra) akhtVar.d.get();
        acraVar.getClass();
        ogx ogxVar = (ogx) akhtVar.b.get();
        ogxVar.getClass();
        oiy oiyVar = (oiy) akhtVar.a.get();
        oiyVar.getClass();
        mvg mvgVar = (mvg) akhtVar.e.get();
        mvgVar.getClass();
        muv muvVar = (muv) akhtVar.c.get();
        muvVar.getClass();
        viewGroup.getClass();
        findViewById.getClass();
        this.x = new krr(acraVar, ogxVar, oiyVar, mvgVar, muvVar, viewGroup, findViewById, null, null, null, null);
        this.r.findViewById(R.id.engagement_close_button).setOnClickListener(new View.OnClickListener(this) { // from class: ksb
            public final /* synthetic */ ksg a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 == 0) {
                    ksg ksgVar = this.a;
                    ksgVar.a.I(3, new acqx(acsb.c(51992)), null);
                    kse kseVar = ksgVar.d;
                    if (kseVar != null) {
                        FullscreenEngagementViewPresenter fullscreenEngagementViewPresenter = (FullscreenEngagementViewPresenter) kseVar;
                        if (fullscreenEngagementViewPresenter.b.c.d()) {
                            fullscreenEngagementViewPresenter.b.e(1);
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.a.b.g();
            }
        });
        yzr yzrVar = new yzr(this.r);
        this.z = yzrVar;
        yzrVar.d = 300L;
        yzrVar.e = 300L;
        yzrVar.h(new zch() { // from class: ksd
            @Override // defpackage.zch
            public final void nE(int i3, yzr yzrVar2) {
                ksg ksgVar = ksg.this;
                if (i3 == 2) {
                    aqzn aqznVar = ksgVar.j;
                    if (aqznVar != null) {
                        ksgVar.a.u(new acqx(aqznVar.d.I()), null);
                        ksgVar.a.u(new acqx(acsb.c(51992)), null);
                    }
                    i3 = 2;
                }
                ksgVar.c(i3, ksgVar.e);
            }
        });
        this.z.b(false);
        if (this.j != null) {
            k();
        }
        d();
        this.f = true;
    }

    private final void k() {
        int i;
        aqyg aqygVar;
        arej arejVar;
        aqyg aqygVar2;
        if (this.j != null) {
            this.a.D(new acqx(acsb.c(51992)));
            TextView textView = this.u;
            aqzn aqznVar = this.j;
            if (aqznVar == null || (aqznVar.b & 1) == 0) {
                aqygVar2 = null;
            } else {
                aqygVar2 = aqznVar.c;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            }
            textView.setText(ajcq.b(aqygVar2));
        }
        e();
        krr krrVar = this.x;
        aqzn aqznVar2 = this.j;
        krrVar.c.removeAllViews();
        mvf mvfVar = krrVar.g;
        if (mvfVar != null) {
            mvfVar.b();
        }
        mvf mvfVar2 = krrVar.h;
        if (mvfVar2 != null) {
            mvfVar2.b();
        }
        muu muuVar = krrVar.i;
        if (muuVar != null) {
            muuVar.b();
        }
        aqzj b = krr.b(aqznVar2);
        if (b != null && b.b.size() != 0) {
            for (aulq aulqVar : b.b) {
                if (!aulqVar.pY(SlimVideoMetadataRendererOuterClass.slimMetadataButtonRenderer)) {
                    if (aulqVar.pY(SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer)) {
                        auvr auvrVar = (auvr) aulqVar.pX(SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer);
                        if (auvrVar.c) {
                            if (krrVar.g == null) {
                                krrVar.g = krrVar.a();
                            }
                            krrVar.g.k(auvrVar);
                            krrVar.c.addView(krrVar.g.c);
                        } else if (auvrVar.d) {
                            if (krrVar.h == null) {
                                krrVar.h = krrVar.a();
                            }
                            krrVar.h.k(auvrVar);
                            krrVar.c.addView(krrVar.h.c);
                        }
                    }
                    if (!aulqVar.pY(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarSaveButtonRenderer)) {
                        if (aulqVar.pY(SlimVideoMetadataRendererOuterClass.slimMetadataAddToButtonRenderer)) {
                            auvn auvnVar = (auvn) aulqVar.pX(SlimVideoMetadataRendererOuterClass.slimMetadataAddToButtonRenderer);
                            if (krrVar.i == null) {
                                muv muvVar = krrVar.e;
                                ViewGroup viewGroup = krrVar.c;
                                mvo mvoVar = krr.a;
                                aahd aahdVar = (aahd) muvVar.a.get();
                                aahdVar.getClass();
                                ajut ajutVar = (ajut) muvVar.b.get();
                                ajutVar.getClass();
                                Context context = (Context) muvVar.c.get();
                                context.getClass();
                                ypa ypaVar = (ypa) muvVar.d.get();
                                ypaVar.getClass();
                                aahv aahvVar = (aahv) muvVar.e.get();
                                aahvVar.getClass();
                                aadw aadwVar = (aadw) muvVar.f.get();
                                aadwVar.getClass();
                                ayqi ayqiVar = (ayqi) muvVar.g.get();
                                ayqiVar.getClass();
                                ysy ysyVar = (ysy) muvVar.h.get();
                                ysyVar.getClass();
                                SharedPreferences sharedPreferences = (SharedPreferences) muvVar.i.get();
                                sharedPreferences.getClass();
                                krrVar.i = new muu(aahdVar, ajutVar, context, ypaVar, aahvVar, aadwVar, ayqiVar, ysyVar, sharedPreferences, viewGroup, R.layout.fullscreen_engagement_action_bar_button, mvoVar);
                            }
                            krrVar.i.n(auvnVar);
                            krrVar.c.addView(krrVar.i.c);
                        }
                    } else {
                        final aqzk aqzkVar = (aqzk) aulqVar.pX(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarSaveButtonRenderer);
                        if (krrVar.f == null) {
                            oiy oiyVar = krrVar.j;
                            ViewGroup viewGroup2 = krrVar.c;
                            Context context2 = (Context) oiyVar.d.get();
                            context2.getClass();
                            acra acraVar = (acra) oiyVar.f.get();
                            acraVar.getClass();
                            aahd aahdVar2 = (aahd) oiyVar.c.get();
                            aahdVar2.getClass();
                            ajut ajutVar2 = (ajut) oiyVar.e.get();
                            ajutVar2.getClass();
                            akbu akbuVar = (akbu) oiyVar.a.get();
                            akbuVar.getClass();
                            akpq akpqVar = (akpq) oiyVar.b.get();
                            akpqVar.getClass();
                            krrVar.f = new krt(context2, acraVar, aahdVar2, ajutVar2, akbuVar, akpqVar, viewGroup2, null);
                        }
                        final krt krtVar = krrVar.f;
                        if ((aqzkVar.b & 1) != 0) {
                            aulq aulqVar2 = aqzkVar.c;
                            if (aulqVar2 == null) {
                                aulqVar2 = aulq.a;
                            }
                            apmg apmgVar = (apmg) ahbj.n(aulqVar2, ButtonRendererOuterClass.buttonRenderer);
                            if (apmgVar != null) {
                                final HashMap hashMap = new HashMap();
                                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", krtVar);
                                krtVar.f.a(apmgVar, krtVar.g, hashMap);
                                krtVar.c.setOnLongClickListener(new View.OnLongClickListener() { // from class: krs
                                    @Override // android.view.View.OnLongClickListener
                                    public final boolean onLongClick(View view) {
                                        krt krtVar2 = krt.this;
                                        aqzk aqzkVar2 = aqzkVar;
                                        Map map = hashMap;
                                        if ((aqzkVar2.b & 2) == 0) {
                                            return false;
                                        }
                                        aahd aahdVar3 = krtVar2.h;
                                        apxf apxfVar = aqzkVar2.d;
                                        if (apxfVar == null) {
                                            apxfVar = apxf.a;
                                        }
                                        aahdVar3.c(apxfVar, map);
                                        return true;
                                    }
                                });
                                if ((apmgVar.b & 32) != 0) {
                                    ajut ajutVar3 = krtVar.a;
                                    arfs arfsVar = apmgVar.g;
                                    if (arfsVar == null) {
                                        arfsVar = arfs.a;
                                    }
                                    arfr b2 = arfr.b(arfsVar.c);
                                    if (b2 == null) {
                                        b2 = arfr.UNKNOWN;
                                    }
                                    i = ajutVar3.a(b2);
                                } else {
                                    i = 0;
                                }
                                Drawable a = i == 0 ? null : aii.a(krtVar.b, i);
                                if (a == null) {
                                    krtVar.d.setImageResource(0);
                                } else {
                                    Drawable mutate = gl.c(a).mutate();
                                    mutate.setTint(krtVar.j);
                                    krtVar.d.setImageDrawable(mutate);
                                }
                                TextView textView2 = krtVar.e;
                                if ((apmgVar.b & 256) != 0) {
                                    aqygVar = apmgVar.i;
                                    if (aqygVar == null) {
                                        aqygVar = aqyg.a;
                                    }
                                } else {
                                    aqygVar = null;
                                }
                                textView2.setText(ajcq.b(aqygVar));
                                arel arelVar = apmgVar.m;
                                if (arelVar == null) {
                                    arelVar = arel.a;
                                }
                                if (arelVar.b == 102716411) {
                                    akbu akbuVar2 = krtVar.i;
                                    arel arelVar2 = apmgVar.m;
                                    if (arelVar2 == null) {
                                        arelVar2 = arel.a;
                                    }
                                    if (arelVar2.b == 102716411) {
                                        arejVar = (arej) arelVar2.c;
                                    } else {
                                        arejVar = arej.a;
                                    }
                                    akbuVar2.b(arejVar, krtVar.c, apmgVar, krtVar.g);
                                }
                                krrVar.c.addView(krrVar.f.c);
                            }
                        }
                        krrVar.c.addView(krrVar.f.c);
                    }
                } else {
                    auvo auvoVar = (auvo) aulqVar.pX(SlimVideoMetadataRendererOuterClass.slimMetadataButtonRenderer);
                    ogx ogxVar = krrVar.k;
                    ViewGroup viewGroup3 = krrVar.c;
                    ajut ajutVar4 = (ajut) ogxVar.a.get();
                    ajutVar4.getClass();
                    akbu akbuVar3 = (akbu) ogxVar.d.get();
                    akbuVar3.getClass();
                    Context context3 = (Context) ogxVar.b.get();
                    context3.getClass();
                    akpq akpqVar2 = (akpq) ogxVar.c.get();
                    akpqVar2.getClass();
                    mkp mkpVar = new mkp(ajutVar4, akbuVar3, context3, akpqVar2, viewGroup3, R.layout.fullscreen_engagement_action_bar_button, R.attr.ytOverlayIconActiveOther, null);
                    mkpVar.c(auvoVar, krrVar.b, null);
                    krrVar.c.addView(mkpVar.a);
                }
            }
        }
        boolean z = krrVar.c.getChildCount() > 0;
        whu.I(krrVar.c, z);
        whu.I(krrVar.d, z);
    }

    public final View a() {
        if (!this.f) {
            j();
        }
        return this.r;
    }

    public final void b(ksf ksfVar) {
        this.k.add(ksfVar);
    }

    public final void c(int i, boolean z) {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((ksf) it.next()).g(i, z);
        }
    }

    public final void d() {
        this.s.setPadding(this.c.left, this.c.top, this.c.right, this.c.bottom);
        ksa ksaVar = this.w;
        Rect rect = this.c;
        if (!ksaVar.c.equals(rect)) {
            ksaVar.c.set(rect);
            ksaVar.a.setPadding(ksaVar.d + rect.left, 0, ksaVar.e + rect.right, 0);
            ksaVar.a.aa(0);
        }
        yny.z(this.t, yny.v(this.c.top), ViewGroup.MarginLayoutParams.class);
        f();
    }

    public final void e() {
        if (this.w == null) {
            return;
        }
        aswb aswbVar = this.q.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if (aswbVar.ag) {
            fyh fyhVar = this.y;
            if (!fyhVar.b) {
                if (fyhVar.c == null) {
                    fyhVar.c = new fyg(fyhVar.a);
                }
                RecyclerView[] recyclerViewArr = fyhVar.a;
                for (int i = 0; i < 2; i++) {
                    recyclerViewArr[i].aD(fyhVar.c);
                }
                fyhVar.b = true;
            }
        } else {
            fyh fyhVar2 = this.y;
            if (fyhVar2.b) {
                RecyclerView[] recyclerViewArr2 = fyhVar2.a;
                for (int i2 = 0; i2 < 2; i2++) {
                    recyclerViewArr2[i2].aF(fyhVar2.c);
                }
                fyhVar2.b = false;
            }
        }
        ksa ksaVar = this.w;
        aqzn aqznVar = this.j;
        aqzi aqziVar = this.h;
        asht ashtVar = this.i;
        ViewGroup viewGroup = (ViewGroup) ksaVar.a.findViewById(R.id.fullscreen_engagement_ad_container);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ksaVar.a.aa(0);
        ksaVar.h = null;
        ksaVar.b.clear();
        if (aqznVar != null && aqznVar.e.size() != 0) {
            for (aulq aulqVar : aqznVar.e) {
                if (aulqVar.pY(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementChannelRenderer)) {
                    ksaVar.b.add(aulqVar.pX(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementChannelRenderer));
                } else if (!aulqVar.pY(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementAdSlotRenderer) || aqziVar == null) {
                    if (aulqVar.pY(ElementRendererOuterClass.elementRenderer)) {
                        aqrf aqrfVar = (aqrf) aulqVar.pX(ElementRendererOuterClass.elementRenderer);
                        aswb aswbVar2 = ksaVar.g.a().e;
                        if (aswbVar2 == null) {
                            aswbVar2 = aswb.a;
                        }
                        if (aswbVar2.as) {
                            ajpd ajpdVar = ksaVar.b;
                            ajpdVar.add(ajds.a(aqrfVar));
                        } else {
                            ksaVar.b.add(aqrfVar);
                        }
                    }
                } else {
                    ksaVar.b.add(aqziVar);
                    ksaVar.h = ashtVar;
                }
            }
        }
        whu.I(ksaVar.a, ksaVar.b.size() > 0);
        ksaVar.b.l();
    }

    public final void f() {
        int i = this.c.top;
        int i2 = this.l;
        yny.z(this.v, yny.v(Math.min(this.n, Math.max(0, (this.g - ((i + i2) + this.m)) / 2)) + this.l + this.c.top), ViewGroup.MarginLayoutParams.class);
    }

    public final void g(aqzn aqznVar) {
        if (amkq.b(this.j, aqznVar)) {
            return;
        }
        this.j = aqznVar;
        if (this.f) {
            k();
        }
    }

    public final void h(boolean z, boolean z2, boolean z3) {
        if (!this.f) {
            if (!z) {
                return;
            } else {
                j();
            }
        }
        boolean z4 = this.e;
        this.e = z2;
        if (z == this.z.e() && z2 != z4) {
            c(this.z.c, z2);
        } else if (z) {
            this.z.c(z3);
        } else {
            this.z.b(z3);
        }
    }

    public final boolean i() {
        return this.f && this.z.c != 0;
    }
}
