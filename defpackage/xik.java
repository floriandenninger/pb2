package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdClickCommandRendererOuterClass;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xik implements wnk {
    public final xig a;
    public final aahd b;
    public final xls c;
    CountDownTimer d;
    public apxf e;
    public aowg f;
    public aowg g;
    public aowg h;
    public long i;
    private final wno j;
    private final wyt k;
    private final wyn l;
    private final ajjz m;
    private final Handler n;
    private final acra o;
    private final zaz p;
    private asht q;
    private ykn r;
    private xeo s;
    private xgh t;
    private xev u;
    private long v;
    private wto w;

    public xik(xig xigVar, ajjz ajjzVar, aahd aahdVar, zaz zazVar, xls xlsVar, wno wnoVar, wyt wytVar, wyn wynVar, acra acraVar) {
        xigVar.getClass();
        this.a = xigVar;
        aahdVar.getClass();
        this.b = aahdVar;
        xlsVar.getClass();
        this.c = xlsVar;
        wnoVar.getClass();
        this.j = wnoVar;
        wytVar.getClass();
        this.k = wytVar;
        wynVar.getClass();
        this.l = wynVar;
        ajjzVar.getClass();
        this.m = ajjzVar;
        acraVar.getClass();
        this.o = acraVar;
        zazVar.getClass();
        this.p = zazVar;
        this.n = new Handler(Looper.getMainLooper());
        ((krq) xigVar).F = new xih(this);
    }

    private static aowg i(aulq aulqVar) {
        if (aulqVar.pY(AdClickCommandRendererOuterClass.adClickCommandRenderer)) {
            return (aowg) aulqVar.pX(AdClickCommandRendererOuterClass.adClickCommandRenderer);
        }
        return null;
    }

    private final void j() {
        f();
        ykn yknVar = this.r;
        if (yknVar != null) {
            yknVar.d();
            this.r = null;
        }
        this.i = 0L;
        this.v = 0L;
        this.a.e();
        this.e = null;
        this.w = null;
        this.p.j(false);
        this.f = null;
        this.g = null;
        this.h = null;
        this.q = null;
    }

    private final void k() {
        this.s = null;
        this.u = null;
        this.t = null;
    }

    private final void l(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.b.c((apxf) it.next(), null);
        }
    }

    private final void m(int i) {
        xev xevVar = this.u;
        if (xevVar != null) {
            this.j.f(this.s, this.t, xevVar, i);
            this.j.v(this.u);
        }
        xgh xghVar = this.t;
        if (xghVar != null) {
            this.j.m(this.s, xghVar);
            this.j.q(this.s, this.t);
        }
        k();
    }

    public final apxf a(apxf apxfVar) {
        if (this.q != null) {
            return apxfVar;
        }
        aong aongVar = (aong) apxfVar.toBuilder();
        aong aongVar2 = (aong) apxg.a.createBuilder();
        aongVar2.e(asit.a, this.q);
        apxg apxgVar = (apxg) aongVar2.build();
        aongVar.copyOnWrite();
        apxf apxfVar2 = (apxf) aongVar.instance;
        apxgVar.getClass();
        apxfVar2.e = apxgVar;
        apxfVar2.b |= 2;
        return (apxf) aongVar.build();
    }

    public final void b(xce xceVar) {
        this.p.j(false);
        this.a.f(false);
        if (this.w != null) {
            m(xev.a(xceVar));
            this.w.d(xceVar);
            this.w = null;
        }
        j();
    }

    @Override // defpackage.wnk
    public final void c() {
        j();
        m(4);
    }

    public final void d(aowg aowgVar) {
        if (aowgVar != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(aowgVar.d);
            if ((aowgVar.b & 1) != 0) {
                apxf apxfVar = aowgVar.c;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                arrayList.add(a(apxfVar));
            }
            this.b.d(arrayList, null);
        }
    }

    @Override // defpackage.wnk
    public final boolean e(wto wtoVar) {
        aozc aozcVar;
        aong aongVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        avgg avggVar;
        avgg avggVar2;
        aowm aowmVar;
        aozc aozcVar2;
        apxf apxfVar;
        aqyg aqygVar4;
        aqyg aqygVar5;
        aqyg aqygVar6;
        aqyg aqygVar7;
        avgg avggVar3;
        avgg avggVar4;
        aowm aowmVar2;
        if (wtoVar.a().i() == null) {
            return false;
        }
        aoyx i = wtoVar.a().i();
        this.s = xeo.a(wtoVar.c(), wtoVar.b());
        xgh b = this.k.b();
        this.t = b;
        this.u = this.l.f(b, i);
        this.j.p(this.s, this.t);
        this.j.g(this.s, this.t, this.u);
        j();
        this.w = wtoVar;
        ammv ammvVar = this.u.i;
        if (ammvVar.h()) {
            aone createBuilder = asht.a.createBuilder();
            ashd ashdVar = (ashd) ammvVar.c();
            createBuilder.copyOnWrite();
            asht ashtVar = (asht) createBuilder.instance;
            ashtVar.t = ashdVar;
            ashtVar.c |= 1024;
            this.q = (asht) createBuilder.build();
        }
        Iterator it = i.c.iterator();
        while (true) {
            aozcVar = null;
            if (!it.hasNext()) {
                aongVar = null;
                break;
            }
            aoyz aoyzVar = (aoyz) it.next();
            if (aoyzVar.b == 90451653) {
                aongVar = (aong) ((aoza) aoyzVar.c).toBuilder();
                break;
            }
        }
        if (aongVar == null || (((aoza) aongVar.instance).b & 512) == 0) {
            int size = i.c.size();
            int i2 = 0;
            while (i2 < size) {
                aone builder = ((aoyz) i.c.get(i2)).toBuilder();
                aoyz aoyzVar2 = (aoyz) builder.instance;
                if (aoyzVar2.b == 122556306) {
                    aong aongVar2 = (aong) ((aozb) aoyzVar2.c).toBuilder();
                    if ((((aozb) aongVar2.instance).b & 128) != 0) {
                        this.j.j(this.s, this.t);
                        this.j.b(this.s, this.t, this.u);
                        if (!aongVar2.pY(auuz.b) || !((Boolean) aongVar2.pX(auuz.b)).booleanValue()) {
                            l(Collections.unmodifiableList(((aozb) aongVar2.instance).m));
                            this.o.u(new acqx(((aozb) aongVar2.instance).q), this.q);
                            aongVar2.e(auuz.b, true);
                        }
                        aozb aozbVar = (aozb) aongVar2.instance;
                        if ((aozbVar.b & 4) != 0) {
                            aqygVar = aozbVar.e;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                        } else {
                            aqygVar = null;
                        }
                        Spanned b2 = ajcq.b(aqygVar);
                        aozb aozbVar2 = (aozb) aongVar2.instance;
                        if ((aozbVar2.b & 64) != 0) {
                            aqygVar2 = aozbVar2.i;
                            if (aqygVar2 == null) {
                                aqygVar2 = aqyg.a;
                            }
                        } else {
                            aqygVar2 = null;
                        }
                        Spanned b3 = ajcq.b(aqygVar2);
                        aozb aozbVar3 = (aozb) aongVar2.instance;
                        if ((aozbVar3.b & 16) != 0) {
                            aqygVar3 = aozbVar3.g;
                            if (aqygVar3 == null) {
                                aqygVar3 = aqyg.a;
                            }
                        } else {
                            aqygVar3 = null;
                        }
                        Spanned b4 = ajcq.b(aqygVar3);
                        aozb aozbVar4 = (aozb) aongVar2.instance;
                        if ((aozbVar4.b & 512) != 0) {
                            avgg avggVar5 = aozbVar4.n;
                            if (avggVar5 == null) {
                                avggVar5 = avgg.a;
                            }
                            avggVar = avggVar5;
                        } else {
                            avggVar = null;
                        }
                        aozb aozbVar5 = (aozb) aongVar2.instance;
                        if ((aozbVar5.b & 1) != 0) {
                            avgg avggVar6 = aozbVar5.c;
                            if (avggVar6 == null) {
                                avggVar6 = avgg.a;
                            }
                            avggVar2 = avggVar6;
                        } else {
                            avggVar2 = null;
                        }
                        aulq aulqVar = ((aozb) aongVar2.instance).p;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                        if (aulqVar.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
                            aulq aulqVar2 = ((aozb) aongVar2.instance).p;
                            if (aulqVar2 == null) {
                                aulqVar2 = aulq.a;
                            }
                            aowmVar = (aowm) aulqVar2.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
                        } else {
                            aowmVar = null;
                        }
                        Integer valueOf = Integer.valueOf(((aozb) aongVar2.instance).o);
                        aozb aozbVar6 = (aozb) aongVar2.instance;
                        if ((aozbVar6.b & 16384) != 0) {
                            aozc aozcVar3 = aozbVar6.r;
                            if (aozcVar3 == null) {
                                aozcVar3 = aozc.a;
                            }
                            aozcVar2 = aozcVar3;
                        } else {
                            aozcVar2 = null;
                        }
                        aozb aozbVar7 = (aozb) aongVar2.instance;
                        float f = aozbVar7.k;
                        if ((aozbVar7.b & 128) != 0) {
                            apxf apxfVar2 = aozbVar7.j;
                            if (apxfVar2 == null) {
                                apxfVar2 = apxf.a;
                            }
                            apxfVar = apxfVar2;
                        } else {
                            apxfVar = null;
                        }
                        aulq aulqVar3 = ((aozb) aongVar2.instance).d;
                        if (aulqVar3 == null) {
                            aulqVar3 = aulq.a;
                        }
                        aowg i3 = i(aulqVar3);
                        aulq aulqVar4 = ((aozb) aongVar2.instance).f;
                        if (aulqVar4 == null) {
                            aulqVar4 = aulq.a;
                        }
                        aowg i4 = i(aulqVar4);
                        aulq aulqVar5 = ((aozb) aongVar2.instance).h;
                        if (aulqVar5 == null) {
                            aulqVar5 = aulq.a;
                        }
                        aowg i5 = i(aulqVar5);
                        aozb aozbVar8 = (aozb) aongVar2.instance;
                        int i6 = i2;
                        n(b2, b3, b4, 0.0f, null, avggVar, avggVar2, aowmVar, valueOf, aozcVar2, 1, f, apxfVar, i3, i4, i5, (aozbVar8.b & 32768) != 0 ? Float.valueOf(aozbVar8.s) : null);
                        builder.copyOnWrite();
                        aoyz aoyzVar3 = (aoyz) builder.instance;
                        aozb aozbVar9 = (aozb) aongVar2.build();
                        aozbVar9.getClass();
                        aoyzVar3.c = aozbVar9;
                        aoyzVar3.b = 122556306;
                        aone builder2 = i.toBuilder();
                        builder2.copyOnWrite();
                        aoyx aoyxVar = (aoyx) builder2.instance;
                        aoyz aoyzVar4 = (aoyz) builder.build();
                        aoyzVar4.getClass();
                        aony aonyVar = aoyxVar.c;
                        if (!aonyVar.c()) {
                            aoyxVar.c = aonm.mutableCopy(aonyVar);
                        }
                        aoyxVar.c.set(i6, aoyzVar4);
                        return true;
                    }
                }
                i2++;
                i = i;
            }
            this.j.q(this.s, this.t);
            k();
            return false;
        }
        this.j.j(this.s, this.t);
        this.j.b(this.s, this.t, this.u);
        if (!aongVar.pY(apfo.b) || !((Boolean) aongVar.pX(apfo.b)).booleanValue()) {
            l(Collections.unmodifiableList(((aoza) aongVar.instance).p));
            this.o.u(new acqx(((aoza) aongVar.instance).o), this.q);
            aongVar.e(apfo.b, true);
        }
        aoza aozaVar = (aoza) aongVar.instance;
        if ((aozaVar.b & 4) != 0) {
            aqygVar4 = aozaVar.e;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
        } else {
            aqygVar4 = null;
        }
        Spanned b5 = ajcq.b(aqygVar4);
        aoza aozaVar2 = (aoza) aongVar.instance;
        if ((aozaVar2.b & 256) != 0) {
            aqygVar5 = aozaVar2.k;
            if (aqygVar5 == null) {
                aqygVar5 = aqyg.a;
            }
        } else {
            aqygVar5 = null;
        }
        Spanned b6 = ajcq.b(aqygVar5);
        aoza aozaVar3 = (aoza) aongVar.instance;
        if ((aozaVar3.b & 16) != 0) {
            aqygVar6 = aozaVar3.g;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
        } else {
            aqygVar6 = null;
        }
        Spanned b7 = ajcq.b(aqygVar6);
        aoza aozaVar4 = (aoza) aongVar.instance;
        float f2 = aozaVar4.h;
        if ((aozaVar4.b & 128) != 0) {
            aqygVar7 = aozaVar4.j;
            if (aqygVar7 == null) {
                aqygVar7 = aqyg.a;
            }
        } else {
            aqygVar7 = null;
        }
        Spanned b8 = ajcq.b(aqygVar7);
        aoza aozaVar5 = (aoza) aongVar.instance;
        if ((aozaVar5.b & 8192) != 0) {
            avggVar3 = aozaVar5.q;
            if (avggVar3 == null) {
                avggVar3 = avgg.a;
            }
        } else {
            avggVar3 = null;
        }
        aoza aozaVar6 = (aoza) aongVar.instance;
        if ((aozaVar6.b & 1) != 0) {
            avggVar4 = aozaVar6.c;
            if (avggVar4 == null) {
                avggVar4 = avgg.a;
            }
        } else {
            avggVar4 = null;
        }
        aoza aozaVar7 = (aoza) aongVar.instance;
        if ((aozaVar7.b & 65536) != 0) {
            aulq aulqVar6 = aozaVar7.t;
            if (aulqVar6 == null) {
                aulqVar6 = aulq.a;
            }
            aowmVar2 = (aowm) aulqVar6.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        } else {
            aowmVar2 = null;
        }
        Integer valueOf2 = Integer.valueOf(((aoza) aongVar.instance).r);
        aoza aozaVar8 = (aoza) aongVar.instance;
        if ((aozaVar8.b & 131072) != 0 && (aozcVar = aozaVar8.u) == null) {
            aozcVar = aozc.a;
        }
        aozc aozcVar4 = aozcVar;
        int bm = anaf.bm(((aoza) aongVar.instance).s);
        int i7 = bm == 0 ? 1 : bm;
        aoza aozaVar9 = (aoza) aongVar.instance;
        float f3 = aozaVar9.n;
        apxf apxfVar3 = aozaVar9.m;
        if (apxfVar3 == null) {
            apxfVar3 = apxf.a;
        }
        apxf apxfVar4 = apxfVar3;
        aulq aulqVar7 = ((aoza) aongVar.instance).d;
        if (aulqVar7 == null) {
            aulqVar7 = aulq.a;
        }
        aowg i8 = i(aulqVar7);
        aulq aulqVar8 = ((aoza) aongVar.instance).f;
        if (aulqVar8 == null) {
            aulqVar8 = aulq.a;
        }
        aowg i9 = i(aulqVar8);
        aulq aulqVar9 = ((aoza) aongVar.instance).i;
        if (aulqVar9 == null) {
            aulqVar9 = aulq.a;
        }
        n(b5, b6, b7, f2, b8, avggVar3, avggVar4, aowmVar2, valueOf2, aozcVar4, i7, f3, apxfVar4, i8, i9, i(aulqVar9), null);
        return true;
    }

    public final void f() {
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.d = null;
        }
    }

    public final void g(long j) {
        if (this.e == null) {
            return;
        }
        if (j > 0) {
            this.a.h(j, this.v);
        } else {
            b(xce.ENDCAP_ENDED);
        }
    }

    public final void h(long j) {
        xii xiiVar = new xii(this, j);
        this.d = xiiVar;
        xiiVar.start();
    }

    private final void n(Spanned spanned, CharSequence charSequence, Spanned spanned2, float f, CharSequence charSequence2, avgg avggVar, avgg avggVar2, aowm aowmVar, Integer num, aozc aozcVar, int i, float f2, apxf apxfVar, aowg aowgVar, aowg aowgVar2, aowg aowgVar3, Float f3) {
        int i2;
        this.e = apxfVar;
        Object obj = this.a;
        boolean z = aowgVar != null;
        boolean z2 = aowgVar2 != null;
        boolean z3 = aowgVar3 != null;
        krq krqVar = (krq) obj;
        if (krqVar.n == null) {
            krqVar.n = (ViewGroup) LayoutInflater.from(krqVar.a).inflate(R.layout.endcap_layout, (ViewGroup) obj);
            krqVar.t = krqVar.n.findViewById(R.id.endcap_layout);
            krqVar.d = (ImageView) krqVar.n.findViewById(R.id.background_image);
            krqVar.x = krqVar.n.findViewById(R.id.metadata_container);
            krqVar.e = (ImageView) krqVar.x.findViewById(R.id.ad_thumbnail);
            krqVar.f = (TextView) krqVar.x.findViewById(R.id.title);
            krqVar.g = krqVar.x.findViewById(R.id.action_button);
            krqVar.h = (TextView) krqVar.x.findViewById(R.id.action_button_text);
            krqVar.i = krqVar.x.findViewById(R.id.action_cta_button);
            krqVar.j = (TextView) krqVar.x.findViewById(R.id.ad_cta_button_text);
            krqVar.z = krqVar.x.findViewById(R.id.description_container);
            krqVar.A = (TextView) krqVar.z.findViewById(R.id.app_store_text);
            krqVar.B = krqVar.x.findViewById(R.id.action_description_container);
            krqVar.C = (TextView) krqVar.B.findViewById(R.id.action_description_text);
            krqVar.l = (TextView) krqVar.z.findViewById(R.id.ratings_count_text);
            krqVar.k = (TextView) krqVar.n.findViewById(R.id.ad_text);
            krqVar.m = krqVar.n.findViewById(R.id.skip_ad_button);
            krqVar.r = (TimeBar) krqVar.n.findViewById(R.id.time_bar);
            krqVar.s = new ahyg();
            krqVar.s.h = ControlsOverlayStyle.i.q;
            krqVar.s.k = ControlsOverlayStyle.i.r;
            krqVar.s.l = ControlsOverlayStyle.i.w;
            krqVar.s.m = ControlsOverlayStyle.i.s;
            krqVar.s.n = ControlsOverlayStyle.i.x;
            krqVar.r.y(krqVar.s);
            if (krqVar.u == null) {
                krqVar.u = krqVar.H.r(null, krqVar.i);
            }
            if (krqVar.w == null) {
                krqVar.w = new mfe(krqVar.x);
            }
            krqVar.E = ((ColorDrawable) krqVar.t.getBackground()).getColor();
            ((RelativeLayout.LayoutParams) krqVar.m.getLayoutParams()).bottomMargin += krqVar.c;
            ((LinearLayout.LayoutParams) krqVar.g.getLayoutParams()).bottomMargin += krqVar.c;
            krqVar.m.setOnClickListener(new krn(krqVar, 3, (byte[]) null));
            krqVar.m.setOnTouchListener(new kro(krqVar));
            krqVar.g.setOnClickListener(new krn(krqVar, 4, (char[]) null));
            krqVar.i.setOnClickListener(new krn(krqVar, 5, (short[]) null));
            krqVar.e.setOnClickListener(new krn(krqVar, 1));
            krqVar.f.setOnClickListener(new krn(krqVar, 0));
            krqVar.z.setOnClickListener(new krn(krqVar, 2));
        }
        krqVar.e();
        krqVar.q = spanned;
        krqVar.f.setText(spanned);
        krq.i(krqVar.f);
        krqVar.f.setClickable(z2);
        krqVar.A.setText(spanned2);
        krq.i(krqVar.A);
        krqVar.l.setText(charSequence2);
        krq.i(krqVar.l);
        krqVar.z.setClickable(z3);
        whu.I(krqVar.m, !TextUtils.isEmpty(krqVar.q));
        whu.I(krqVar.k, !TextUtils.isEmpty(krqVar.q));
        krqVar.r.setEnabled(!TextUtils.isEmpty(krqVar.q));
        krqVar.y = f;
        krqVar.G = i;
        krqVar.w.b(f, i);
        if (num.intValue() != 0) {
            krqVar.t.setBackgroundColor(num.intValue());
        }
        if (avggVar != null) {
            krqVar.b.h(krqVar.d, avggVar);
            krqVar.d.setVisibility(0);
            krqVar.d.setClickable(z);
            krqVar.d.setImageAlpha(63);
        } else {
            krqVar.d.setVisibility(8);
        }
        krqVar.v = aowmVar;
        aowm aowmVar2 = krqVar.v;
        if (aowmVar2 != null) {
            krqVar.u.a(aowmVar2, null);
        } else {
            krqVar.g.setVisibility(0);
            krqVar.h.setText(charSequence);
            krq.i(krqVar.h);
        }
        fhg fhgVar = krqVar.D;
        if ((fhgVar == null || fhgVar.i()) && aozcVar != null) {
            if (krqVar.n.isAttachedToWindow()) {
                krqVar.d(aozcVar);
            } else {
                krqVar.n.getViewTreeObserver().addOnGlobalLayoutListener(new krp(krqVar, aozcVar));
            }
        }
        if (f3 == null || f3.floatValue() <= 0.0f) {
            i2 = 0;
            krqVar.z.setVisibility(0);
            krqVar.B.setVisibility(8);
        } else {
            krqVar.z.setVisibility(8);
            krqVar.B.setVisibility(0);
            krqVar.C.setText(spanned2);
            ((LinearLayout.LayoutParams) krqVar.C.getLayoutParams()).weight = f3.floatValue();
            i2 = 0;
        }
        krqVar.setVisibility(i2);
        if (avggVar2 != null) {
            this.r = ykn.c(new xij(this));
            this.m.l(ahbw.B(avggVar2), ykt.c(this.n, this.r));
        }
        long convert = TimeUnit.MILLISECONDS.convert((int) f2, TimeUnit.SECONDS);
        this.v = convert;
        this.a.h(convert, convert);
        h(this.v);
        this.a.f(true);
        this.p.j(true);
        this.f = aowgVar;
        this.g = aowgVar2;
        this.h = aowgVar3;
        if (aowgVar != null) {
            this.o.u(new acqx(aowgVar.e), this.q);
        }
        aowg aowgVar4 = this.g;
        if (aowgVar4 != null) {
            this.o.u(new acqx(aowgVar4.e), this.q);
        }
        aowg aowgVar5 = this.h;
        if (aowgVar5 != null) {
            this.o.u(new acqx(aowgVar5.e), this.q);
        }
    }
}
