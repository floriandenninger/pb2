package com.google.android.apps.youtube.app.player.overlay.suggestedactions;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.protos.youtube.api.innertube.SuggestedActionsRendererOuterClass;
import defpackage.aadw;
import defpackage.aahd;
import defpackage.acqx;
import defpackage.acra;
import defpackage.acsb;
import defpackage.ahew;
import defpackage.ahyl;
import defpackage.ahym;
import defpackage.aioc;
import defpackage.ajjz;
import defpackage.ajok;
import defpackage.ajut;
import defpackage.ajyw;
import defpackage.akht;
import defpackage.any;
import defpackage.aok;
import defpackage.aomf;
import defpackage.avaz;
import defpackage.avbc;
import defpackage.aypn;
import defpackage.aypy;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.azrh;
import defpackage.azrw;
import defpackage.gop;
import defpackage.ktf;
import defpackage.ktz;
import defpackage.kub;
import defpackage.kuf;
import defpackage.kuh;
import defpackage.ohg;
import defpackage.oiy;
import defpackage.ywr;
import defpackage.yzr;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SuggestedActionsMainController implements ahyl, any, ahew {
    public final ajok a;
    public final ayqw b;
    public final Set c;
    public final Set d;
    public final ahym e;
    public final ktz f;
    public boolean g;
    public ViewGroup h;
    public avbc i;
    public WatchNextResponseModel j;
    public int k;
    public azrw l;
    public String m;
    public aypn n;
    public yzr o;
    public final oiy p;
    public final akht q;
    public final c r;
    public final ajyw s;
    private final gop t;
    private final aioc u;
    private final ayqw v;
    private final Handler w;
    private final azrh x;
    private boolean y;
    private boolean z;

    public SuggestedActionsMainController(oiy oiyVar, c cVar, ajyw ajywVar, akht akhtVar, ohg ohgVar, acra acraVar, ahym ahymVar, gop gopVar, aioc aiocVar, Handler handler, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        ajok ajokVar = new ajok();
        this.a = ajokVar;
        this.e = ahymVar;
        ajokVar.a(acraVar);
        this.b = new ayqw();
        this.c = new HashSet();
        this.d = new HashSet();
        this.p = oiyVar;
        this.r = cVar;
        this.s = ajywVar;
        this.q = akhtVar;
        this.t = gopVar;
        this.u = aiocVar;
        this.w = handler;
        this.v = new ayqw();
        this.g = false;
        this.x = azrh.e();
        this.i = null;
        this.j = null;
        this.n = null;
        kuf kufVar = new kuf(this, 0);
        Context context = (Context) ohgVar.g.get();
        context.getClass();
        aahd aahdVar = (aahd) ohgVar.d.get();
        aahdVar.getClass();
        ajut ajutVar = (ajut) ohgVar.f.get();
        ajutVar.getClass();
        ajjz ajjzVar = (ajjz) ohgVar.c.get();
        ajjzVar.getClass();
        aadw aadwVar = (aadw) ohgVar.a.get();
        aadwVar.getClass();
        kuh kuhVar = (kuh) ohgVar.b.get();
        kuhVar.getClass();
        ywr ywrVar = (ywr) ohgVar.e.get();
        ywrVar.getClass();
        this.f = new ktz(context, aahdVar, ajutVar, ajjzVar, aadwVar, kuhVar, ywrVar, kufVar);
    }

    @Override // defpackage.ahew
    public final void a(boolean z) {
        if (this.z == z) {
            return;
        }
        this.z = z;
        o(!z, false);
    }

    public final ViewGroup g() {
        ViewGroup viewGroup = this.h;
        viewGroup.getClass();
        return viewGroup;
    }

    @Override // defpackage.ahyl
    public final void h(int i, long j) {
        boolean z = this.y;
        boolean z2 = i == 1 || i == 2;
        this.y = z2;
        if (z != z2) {
            o(!z2, true);
        }
    }

    public final aypy i() {
        return this.x.U();
    }

    public final void j() {
        if (this.c.isEmpty()) {
            return;
        }
        avaz avazVar = (avaz) this.c.iterator().next();
        l(avazVar);
        this.c.remove(avazVar);
    }

    public final void k(final Runnable runnable) {
        ViewGroup viewGroup = this.h;
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            o(false, true);
            this.w.postDelayed(new Runnable() { // from class: kue
                @Override // java.lang.Runnable
                public final void run() {
                    SuggestedActionsMainController suggestedActionsMainController = SuggestedActionsMainController.this;
                    Runnable runnable2 = runnable;
                    suggestedActionsMainController.g().removeAllViews();
                    suggestedActionsMainController.m();
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, this.k);
            g().setTouchDelegate(null);
        }
    }

    public final void l(final avaz avazVar) {
        k(new Runnable() { // from class: kud
            @Override // java.lang.Runnable
            public final void run() {
                final SuggestedActionsMainController suggestedActionsMainController = SuggestedActionsMainController.this;
                avaz avazVar2 = avazVar;
                if (suggestedActionsMainController.h == null) {
                    return;
                }
                final View a = suggestedActionsMainController.f.a();
                suggestedActionsMainController.g().addView(a);
                aypn aypnVar = suggestedActionsMainController.n;
                if (aypnVar != null) {
                    final ktz ktzVar = suggestedActionsMainController.f;
                    asvu asvuVar = ktzVar.k.b().e;
                    if (asvuVar == null) {
                        asvuVar = asvu.a;
                    }
                    if (asvuVar.bd) {
                        Object obj = ktzVar.i;
                        if (obj != null) {
                            azqb.f((AtomicReference) obj);
                        }
                        ktzVar.i = aypnVar.X(new ayrs() { // from class: ktv
                            @Override // defpackage.ayrs
                            public final void a(Object obj2) {
                                ktz ktzVar2 = ktz.this;
                                int intValue = ((Integer) obj2).intValue();
                                if (intValue == ktzVar2.h) {
                                    return;
                                }
                                ktzVar2.h = intValue;
                                ktzVar2.g(ktzVar2.g);
                            }
                        });
                    }
                }
                suggestedActionsMainController.f.oB(suggestedActionsMainController.a, avazVar2);
                ViewGroup viewGroup = suggestedActionsMainController.h;
                if (viewGroup != null) {
                    viewGroup.post(new Runnable() { // from class: kuc
                        @Override // java.lang.Runnable
                        public final void run() {
                            SuggestedActionsMainController suggestedActionsMainController2 = SuggestedActionsMainController.this;
                            View view = a;
                            Rect rect = new Rect();
                            float K = yjk.K(view.getResources().getDisplayMetrics(), 8);
                            view.getHitRect(rect);
                            rect.top = (int) (rect.top - K);
                            rect.bottom = (int) (rect.bottom + K);
                            suggestedActionsMainController2.g().setTouchDelegate(new TouchDelegate(rect, view));
                        }
                    });
                }
                suggestedActionsMainController.m();
                suggestedActionsMainController.o(true, true);
            }
        });
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

    public final void m() {
        azrh azrhVar = this.x;
        ViewGroup viewGroup = this.h;
        boolean z = false;
        if (viewGroup != null && viewGroup.getChildCount() > 0) {
            z = true;
        }
        azrhVar.c(Boolean.valueOf(z));
    }

    public final void n() {
        this.b.c();
        this.c.clear();
        this.d.clear();
        k(null);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.v.c();
    }

    public final void o(boolean z, boolean z2) {
        aomf d;
        aomf d2;
        yzr yzrVar = this.o;
        if (yzrVar == null || this.h == null) {
            return;
        }
        if (this.g || this.t.isInMultiWindowMode() || this.y || this.z) {
            z = false;
        }
        yzrVar.a(z, z2);
        if (g().getChildCount() != 0) {
            if (z) {
                ktz ktzVar = this.f;
                acra acraVar = ktzVar.f;
                if (acraVar == null || (d2 = ktzVar.d()) == null) {
                    return;
                }
                acraVar.u(new acqx(d2), null);
                acraVar.u(new acqx(acsb.c(87958)), null);
                return;
            }
            ktz ktzVar2 = this.f;
            acra acraVar2 = ktzVar2.f;
            if (acraVar2 == null || (d = ktzVar2.d()) == null) {
                return;
            }
            acraVar2.q(new acqx(d), null);
            acraVar2.q(new acqx(acsb.c(87958)), null);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        ayqw ayqwVar = this.v;
        aioc aiocVar = this.u;
        ayqwVar.g(aiocVar.ao().G().E(ayqr.a()).Y(new ayrs() { // from class: kua
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                atzr atzrVar;
                atzr atzrVar2;
                avbc avbcVar;
                kts ktsVar;
                SuggestedActionsMainController suggestedActionsMainController = SuggestedActionsMainController.this;
                ahdv ahdvVar = (ahdv) obj;
                if (ahdvVar.a() == null || amkq.b(suggestedActionsMainController.j, ahdvVar.a())) {
                    return;
                }
                WatchNextResponseModel a = ahdvVar.a();
                a.getClass();
                suggestedActionsMainController.j = a;
                suggestedActionsMainController.k(null);
                asfc asfcVar = a.a;
                aseo aseoVar = asfcVar.f;
                if (aseoVar == null) {
                    aseoVar = aseo.a;
                }
                if (aseoVar.b == 78882851) {
                    atzrVar = (atzr) aseoVar.c;
                } else {
                    atzrVar = atzr.a;
                }
                aulq aulqVar = atzrVar.p;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(SuggestedActionsRendererOuterClass.suggestedActionsRenderer)) {
                    aseo aseoVar2 = asfcVar.f;
                    if (aseoVar2 == null) {
                        aseoVar2 = aseo.a;
                    }
                    if (aseoVar2.b == 78882851) {
                        atzrVar2 = (atzr) aseoVar2.c;
                    } else {
                        atzrVar2 = atzr.a;
                    }
                    aulq aulqVar2 = atzrVar2.p;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    avbcVar = (avbc) aulqVar2.pX(SuggestedActionsRendererOuterClass.suggestedActionsRenderer);
                } else {
                    avbcVar = null;
                }
                if (avbcVar == null || amkq.b(avbcVar, suggestedActionsMainController.i)) {
                    return;
                }
                suggestedActionsMainController.i = avbcVar;
                aony aonyVar = avbcVar.b;
                suggestedActionsMainController.n();
                Iterator it = aonyVar.iterator();
                while (it.hasNext()) {
                    avaz avazVar = (avaz) ((aulq) it.next()).pX(SuggestedActionsRendererOuterClass.suggestedActionRenderer);
                    avbb avbbVar = avazVar.g;
                    if (avbbVar == null) {
                        avbbVar = avbb.a;
                    }
                    if (avbbVar.pY(avaw.b)) {
                        oiy oiyVar = suggestedActionsMainController.p;
                        fgq fgqVar = (fgq) oiyVar.f.get();
                        fgqVar.getClass();
                        aivb aivbVar = (aivb) oiyVar.a.get();
                        aivbVar.getClass();
                        kch kchVar = (kch) oiyVar.e.get();
                        kchVar.getClass();
                        gjp gjpVar = (gjp) oiyVar.b.get();
                        gjpVar.getClass();
                        fku fkuVar = (fku) oiyVar.c.get();
                        fkuVar.getClass();
                        kih kihVar = (kih) oiyVar.d.get();
                        kihVar.getClass();
                        avazVar.getClass();
                        ktsVar = new ktq(fgqVar, aivbVar, kchVar, gjpVar, fkuVar, kihVar, avazVar);
                    } else if (avbbVar.pY(avba.b)) {
                        c cVar = suggestedActionsMainController.r;
                        ypa ypaVar = (ypa) cVar.b.get();
                        ypaVar.getClass();
                        kih kihVar2 = (kih) cVar.a.get();
                        kihVar2.getClass();
                        avazVar.getClass();
                        ktsVar = new kuk(ypaVar, kihVar2, avazVar);
                    } else if (avbbVar.pY(avax.b)) {
                        ajyw ajywVar = suggestedActionsMainController.s;
                        aioc aiocVar2 = (aioc) ajywVar.b.get();
                        aiocVar2.getClass();
                        kih kihVar3 = (kih) ajywVar.a.get();
                        kihVar3.getClass();
                        Executor executor = (Executor) ajywVar.c.get();
                        executor.getClass();
                        avazVar.getClass();
                        ktsVar = new ktg(aiocVar2, kihVar3, azre.b(executor), avazVar);
                    } else if (avbbVar.pY(avay.b)) {
                        akht akhtVar = suggestedActionsMainController.q;
                        aioc aiocVar3 = (aioc) akhtVar.d.get();
                        aiocVar3.getClass();
                        kih kihVar4 = (kih) akhtVar.b.get();
                        kihVar4.getClass();
                        nqp nqpVar = (nqp) akhtVar.a.get();
                        nqpVar.getClass();
                        fgq fgqVar2 = (fgq) akhtVar.c.get();
                        fgqVar2.getClass();
                        ywr ywrVar = (ywr) akhtVar.e.get();
                        ywrVar.getClass();
                        avazVar.getClass();
                        ktsVar = new ktk(aiocVar3, kihVar4, nqpVar, fgqVar2, ywrVar, avazVar);
                    } else {
                        ktsVar = null;
                    }
                    if (ktsVar != null) {
                        ktsVar.b();
                        suggestedActionsMainController.b.d(ktsVar.a().Y(new kub(suggestedActionsMainController, 1), ktf.d));
                    }
                }
            }
        }, ktf.d), aiocVar.ab().Y(new kub(this, 0), ktf.d));
    }
}
