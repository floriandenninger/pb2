package com.google.android.apps.youtube.app.offline;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.offline.OfflineModeChangedMealbarController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import defpackage.aadw;
import defpackage.acqx;
import defpackage.acqz;
import defpackage.acra;
import defpackage.acsb;
import defpackage.acsc;
import defpackage.adyu;
import defpackage.ainy;
import defpackage.aioc;
import defpackage.akbw;
import defpackage.akbx;
import defpackage.akby;
import defpackage.ammx;
import defpackage.any;
import defpackage.aok;
import defpackage.aplt;
import defpackage.apxf;
import defpackage.awav;
import defpackage.aypn;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azqb;
import defpackage.bue;
import defpackage.evr;
import defpackage.fad;
import defpackage.faq;
import defpackage.fgq;
import defpackage.fjs;
import defpackage.gje;
import defpackage.gva;
import defpackage.izw;
import defpackage.jgy;
import defpackage.jha;
import defpackage.lkb;
import defpackage.ofa;
import defpackage.oja;
import defpackage.ojb;
import defpackage.ojg;
import defpackage.rxm;
import defpackage.ypa;
import defpackage.ysy;
import defpackage.zga;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OfflineModeChangedMealbarController implements any, faq {
    public final gva a;
    public final ysy b;
    public final fgq c;
    public final ojg d;
    public int f;
    public boolean g;
    private final Context h;
    private final ainy i;
    private final gje j;
    private final akbw k;
    private final acqz l;
    private final fjs m;
    private final oja n;
    private final ypa o;
    private final aioc p;
    private ayqx s;
    private akby t;
    private awav u;
    private int v;
    private final aadw w;
    private final lkb x;
    private final jha q = new jha(this);
    private final jgy r = new jgy(this);
    public final Handler e = new Handler(Looper.getMainLooper());

    public OfflineModeChangedMealbarController(Context context, ainy ainyVar, gje gjeVar, gva gvaVar, rxm rxmVar, akbw akbwVar, acqz acqzVar, ysy ysyVar, fgq fgqVar, fjs fjsVar, oja ojaVar, ojg ojgVar, ypa ypaVar, aioc aiocVar, aadw aadwVar, lkb lkbVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.h = context;
        this.i = ainyVar;
        this.j = gjeVar;
        this.a = gvaVar;
        this.k = akbwVar;
        this.l = acqzVar;
        this.b = ysyVar;
        this.c = fgqVar;
        this.m = fjsVar;
        this.n = ojaVar;
        this.d = ojgVar;
        this.o = ypaVar;
        this.p = aiocVar;
        this.w = aadwVar;
        this.x = lkbVar;
        rxmVar.a(this);
    }

    private final akbx k() {
        akbx e = this.k.m().e(R.drawable.ic_offline_no_content);
        e.c = this.h.getString(R.string.offline_no_content_title_offline_eligible_and_no_content);
        e.l = acsb.c(38869);
        e.i(false);
        return e;
    }

    private final awav l(acsc acscVar) {
        this.v++;
        return this.l.mM().j(Integer.valueOf(this.v), acscVar, this.v);
    }

    @Override // defpackage.faq
    public final void a(boolean z) {
        if (z) {
            if (this.c.g().h() && this.i.d()) {
                return;
            }
            j(g());
            return;
        }
        h();
    }

    public final akby g() {
        apxf e;
        PaneDescriptor d = this.j.d();
        if (!this.m.h() || d == null || this.g) {
            return null;
        }
        final int i = 3;
        if (this.c.g().h()) {
            ojb ojbVar = this.n.a;
            if (ojbVar != null) {
                if (ojbVar.k() == 3) {
                    return null;
                }
                ofa l = ojbVar.l();
                if (l != null) {
                    String c = l.h.c();
                    if (!ammx.e(c) && this.m.l(c)) {
                        return null;
                    }
                }
            }
        } else {
            bue f = this.j.f();
            if (((f instanceof fad) && ((fad) f).a()) || this.x.h(d) || (e = d.e()) == null || ((aplt) e.pX(BrowseEndpointOuterClass.browseEndpoint)).c.equals("FElibrary")) {
                return null;
            }
        }
        if (!this.m.e()) {
            akbx k = k();
            k.d = this.h.getString(R.string.offline_navigate_to_downloads_detail_text);
            final int i2 = 2;
            return k.a(this.h.getString(R.string.offline_navigate_to_downloads_action_text), new View.OnClickListener(this) { // from class: jgw
                public final /* synthetic */ OfflineModeChangedMealbarController a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    if (i3 == 0) {
                        this.a.i(51769);
                        return;
                    }
                    if (i3 == 1) {
                        OfflineModeChangedMealbarController offlineModeChangedMealbarController = this.a;
                        offlineModeChangedMealbarController.i(51770);
                        offlineModeChangedMealbarController.a.c(fia.a, null);
                    } else {
                        if (i3 != 2) {
                            this.a.i(38870);
                            return;
                        }
                        OfflineModeChangedMealbarController offlineModeChangedMealbarController2 = this.a;
                        offlineModeChangedMealbarController2.i(38871);
                        offlineModeChangedMealbarController2.a.c(fia.a, null);
                    }
                }
            }).c(this.h.getString(R.string.offline_navigate_to_downloads_dismiss_text), new View.OnClickListener(this) { // from class: jgw
                public final /* synthetic */ OfflineModeChangedMealbarController a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i;
                    if (i3 == 0) {
                        this.a.i(51769);
                        return;
                    }
                    if (i3 == 1) {
                        OfflineModeChangedMealbarController offlineModeChangedMealbarController = this.a;
                        offlineModeChangedMealbarController.i(51770);
                        offlineModeChangedMealbarController.a.c(fia.a, null);
                    } else {
                        if (i3 != 2) {
                            this.a.i(38870);
                            return;
                        }
                        OfflineModeChangedMealbarController offlineModeChangedMealbarController2 = this.a;
                        offlineModeChangedMealbarController2.i(38871);
                        offlineModeChangedMealbarController2.a.c(fia.a, null);
                    }
                }
            }).f();
        }
        boolean n = this.m.n();
        final int i3 = 1;
        int i4 = true != n ? R.string.offline_no_content_body_text_has_both_downloads_and_recommendations : R.string.offline_no_content_body_text_has_download_recommendations;
        int i5 = true != n ? R.string.offline_no_content_title_offline_eligible_and_has_content : R.string.offline_no_content_title_has_download_recommendations;
        akbx e2 = k().e(R.drawable.ic_download_default);
        e2.c = this.h.getString(i5);
        e2.d = this.h.getString(i4);
        final int i6 = 0;
        akbx c2 = e2.a(this.h.getString(R.string.offline_no_content_button_text_has_download_recommendations), new View.OnClickListener(this) { // from class: jgw
            public final /* synthetic */ OfflineModeChangedMealbarController a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                if (i32 == 0) {
                    this.a.i(51769);
                    return;
                }
                if (i32 == 1) {
                    OfflineModeChangedMealbarController offlineModeChangedMealbarController = this.a;
                    offlineModeChangedMealbarController.i(51770);
                    offlineModeChangedMealbarController.a.c(fia.a, null);
                } else {
                    if (i32 != 2) {
                        this.a.i(38870);
                        return;
                    }
                    OfflineModeChangedMealbarController offlineModeChangedMealbarController2 = this.a;
                    offlineModeChangedMealbarController2.i(38871);
                    offlineModeChangedMealbarController2.a.c(fia.a, null);
                }
            }
        }).c(this.h.getString(R.string.offline_navigate_to_downloads_dismiss_text), new View.OnClickListener(this) { // from class: jgw
            public final /* synthetic */ OfflineModeChangedMealbarController a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i6;
                if (i32 == 0) {
                    this.a.i(51769);
                    return;
                }
                if (i32 == 1) {
                    OfflineModeChangedMealbarController offlineModeChangedMealbarController = this.a;
                    offlineModeChangedMealbarController.i(51770);
                    offlineModeChangedMealbarController.a.c(fia.a, null);
                } else {
                    if (i32 != 2) {
                        this.a.i(38870);
                        return;
                    }
                    OfflineModeChangedMealbarController offlineModeChangedMealbarController2 = this.a;
                    offlineModeChangedMealbarController2.i(38871);
                    offlineModeChangedMealbarController2.a.c(fia.a, null);
                }
            }
        });
        c2.l = acsb.c(51768);
        return c2.f();
    }

    public final void h() {
        akby akbyVar = this.t;
        if (akbyVar != null) {
            this.k.n(akbyVar);
            this.t = null;
        }
    }

    public final void i(int i) {
        if (this.u == null) {
            zga.l("Missing offline mealbar visual element");
        }
        this.l.mM().I(3, new acqx(acsb.c(i)), null);
    }

    public final void j(akby akbyVar) {
        acsc c;
        acsc c2;
        if (akbyVar != null) {
            this.k.o(akbyVar);
            this.g = true;
            this.t = akbyVar;
            acsc acscVar = akbyVar.l;
            if (acscVar != null) {
                this.u = l(acscVar);
                this.l.mM().n(adyu.ce(this.u));
                awav awavVar = this.u;
                if (awavVar == null) {
                    zga.l("Missing offline mealbar visual element");
                    return;
                }
                if (this.m.e()) {
                    c = acsb.c(51770);
                } else {
                    c = acsb.c(38871);
                }
                awav l = l(c);
                if (this.m.e()) {
                    c2 = acsb.c(51769);
                } else {
                    c2 = acsb.c(38870);
                }
                awav l2 = l(c2);
                acra mM = this.l.mM();
                mM.o(adyu.ce(l), adyu.ce(awavVar));
                mM.o(adyu.ce(l2), adyu.ce(awavVar));
            }
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        if (evr.au(this.w)) {
            Object obj = this.s;
            if (obj != null) {
                azqb.f((AtomicReference) obj);
                this.s = null;
            }
        } else {
            this.o.m(this.q);
        }
        this.o.m(this.r);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (evr.au(this.w)) {
            aypn aypnVar = this.p.G().i;
            final jha jhaVar = this.q;
            jhaVar.getClass();
            this.s = aypnVar.Y(new ayrs() { // from class: jgx
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    jha.this.a((ahej) obj);
                }
            }, izw.d);
        } else {
            this.o.g(this.q);
        }
        this.o.g(this.r);
    }
}
