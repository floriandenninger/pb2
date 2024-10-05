package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import defpackage.aahd;
import defpackage.acqz;
import defpackage.ahds;
import defpackage.aheg;
import defpackage.aigj;
import defpackage.aioa;
import defpackage.aioc;
import defpackage.ajut;
import defpackage.ajyw;
import defpackage.akbl;
import defpackage.any;
import defpackage.aok;
import defpackage.aone;
import defpackage.aong;
import defpackage.apxf;
import defpackage.aqwl;
import defpackage.aupf;
import defpackage.aupg;
import defpackage.avbq;
import defpackage.avbr;
import defpackage.avbt;
import defpackage.avci;
import defpackage.avcn;
import defpackage.ayqd;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.ayqx;
import defpackage.azrw;
import defpackage.eoo;
import defpackage.fav;
import defpackage.fgk;
import defpackage.fgm;
import defpackage.fgp;
import defpackage.fgq;
import defpackage.fhf;
import defpackage.fhg;
import defpackage.fiv;
import defpackage.gbh;
import defpackage.gbr;
import defpackage.gbs;
import defpackage.gbu;
import defpackage.gct;
import defpackage.gcu;
import defpackage.gdk;
import defpackage.xae;
import defpackage.xaf;
import defpackage.xag;
import defpackage.xfn;
import defpackage.xjj;
import defpackage.xjl;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HatsController implements any, fgk, fgp, akbl, aioa, xjj {
    public final aahd a;
    public gcu b;
    public aheg d;
    public ahds e;
    public long f;
    private final gbh g;
    private final azrw h;
    private final azrw i;
    private final xjl j;
    private final Handler k;
    private gdk n;
    private gcu o;
    private final aioc p;
    private final acqz r;
    private boolean s;
    private boolean t;
    private final ajyw u;
    private final ayqw q = new ayqw();
    public final Map c = new HashMap();
    private volatile boolean m = false;
    private final Object l = new Object();

    public HatsController(gbh gbhVar, aahd aahdVar, azrw azrwVar, azrw azrwVar2, ajyw ajywVar, aioc aiocVar, acqz acqzVar, xjl xjlVar, Handler handler, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.g = gbhVar;
        this.a = aahdVar;
        this.h = azrwVar;
        this.i = azrwVar2;
        this.u = ajywVar;
        this.p = aiocVar;
        this.r = acqzVar;
        this.j = xjlVar;
        this.k = handler;
    }

    public static boolean l(avcn avcnVar) {
        avci avciVar = avcnVar.c;
        if (avciVar == null) {
            avciVar = avci.a;
        }
        for (avbr avbrVar : avciVar.l) {
            if (avbrVar.b == 1) {
                avbt b = avbt.b(((avbq) avbrVar.c).b);
                if (b == null) {
                    b = avbt.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_UNSPECIFIED;
                }
                if (b == avbt.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_CONTENT_VIDEO_START) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void p() {
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = 0L;
        this.s = false;
        this.t = false;
    }

    @Override // defpackage.xjj
    public final /* synthetic */ void a(xae xaeVar) {
    }

    @Override // defpackage.xjj
    public final void b(xag xagVar) {
        xaf xafVar = xaf.AD_INTERRUPT_ACQUIRED;
        aigj aigjVar = aigj.PLAYBACK_PENDING;
        int ordinal = xagVar.a().ordinal();
        if (ordinal == 2) {
            if (this.b != null && xagVar.b() == xfn.PRE_ROLL) {
                gcu gcuVar = this.b;
                gcuVar.getClass();
                avci avciVar = gcuVar.e.c;
                if (avciVar == null) {
                    avciVar = avci.a;
                }
                for (avbr avbrVar : avciVar.l) {
                    if (avbrVar.b == 1) {
                        avbt b = avbt.b(((avbq) avbrVar.c).b);
                        if (b == null) {
                            b = avbt.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_UNSPECIFIED;
                        }
                        if (b == avbt.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PREROLL_AD_START) {
                            gcu gcuVar2 = this.b;
                            gcuVar2.getClass();
                            i(gcuVar2.d(xagVar.e()));
                            return;
                        }
                    }
                }
            }
            if (this.b == null || xagVar.b() != xfn.MID_ROLL) {
                return;
            }
            gcu gcuVar3 = this.b;
            gcuVar3.getClass();
            avci avciVar2 = gcuVar3.e.c;
            if (avciVar2 == null) {
                avciVar2 = avci.a;
            }
            for (avbr avbrVar2 : avciVar2.l) {
                if (avbrVar2.b == 1) {
                    avbt b2 = avbt.b(((avbq) avbrVar2.c).b);
                    if (b2 == null) {
                        b2 = avbt.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_UNSPECIFIED;
                    }
                    if (b2 == avbt.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_MIDROLL_AD_START) {
                        gcu gcuVar4 = this.b;
                        gcuVar4.getClass();
                        i(gcuVar4.d(xagVar.e()));
                        return;
                    }
                }
            }
            return;
        }
        if (ordinal != 3) {
            return;
        }
        if (this.b != null && xagVar.b() == xfn.PRE_ROLL) {
            gcu gcuVar5 = this.b;
            gcuVar5.getClass();
            avci avciVar3 = gcuVar5.e.c;
            if (avciVar3 == null) {
                avciVar3 = avci.a;
            }
            for (avbr avbrVar3 : avciVar3.l) {
                if (avbrVar3.b == 1) {
                    avbt b3 = avbt.b(((avbq) avbrVar3.c).b);
                    if (b3 == null) {
                        b3 = avbt.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_UNSPECIFIED;
                    }
                    if (b3 == avbt.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PREROLL_AD_FINISH) {
                        gcu gcuVar6 = this.b;
                        gcuVar6.getClass();
                        i(gcuVar6.d(xagVar.e()));
                        return;
                    }
                }
            }
        }
        if (this.b == null || xagVar.b() != xfn.MID_ROLL) {
            return;
        }
        gcu gcuVar7 = this.b;
        gcuVar7.getClass();
        avci avciVar4 = gcuVar7.e.c;
        if (avciVar4 == null) {
            avciVar4 = avci.a;
        }
        for (avbr avbrVar4 : avciVar4.l) {
            if (avbrVar4.b == 1) {
                avbt b4 = avbt.b(((avbq) avbrVar4.c).b);
                if (b4 == null) {
                    b4 = avbt.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_UNSPECIFIED;
                }
                if (b4 == avbt.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_MIDROLL_AD_FINISH) {
                    gcu gcuVar8 = this.b;
                    gcuVar8.getClass();
                    i(gcuVar8.d(xagVar.e()));
                    return;
                }
            }
        }
    }

    @Override // defpackage.fgk
    public final void g(fhf fhfVar) {
        gcu gcuVar = this.b;
        if (gcuVar == null || !l(gcuVar.e)) {
            return;
        }
        p();
    }

    public final void h(avcn avcnVar) {
        BottomUiContainer a;
        if (avcnVar == null) {
            return;
        }
        gcu gcuVar = this.b;
        if (gcuVar == null || !gcuVar.e(avcnVar)) {
            gcu gcuVar2 = this.o;
            if (gcuVar2 == null || !gcuVar2.e(avcnVar) || (a = this.g.a()) == null) {
                return;
            }
            a.i(3);
            return;
        }
        this.b = null;
    }

    public final void i(gcu gcuVar) {
        if (this.s) {
            this.t = true;
            return;
        }
        BottomUiContainer a = this.g.a();
        if (a == null) {
            return;
        }
        gct f = gcuVar.f();
        f.k = new gbu(this, gcuVar);
        gcu a2 = f.a();
        if (this.g.j(a2)) {
            this.g.e(a2);
            if (this.n == null) {
                ajyw ajywVar = this.u;
                HatsContainer g = a.g();
                ajut ajutVar = (ajut) ajywVar.b.get();
                ajutVar.getClass();
                aahd aahdVar = (aahd) ajywVar.a.get();
                aahdVar.getClass();
                ayqd ayqdVar = (ayqd) ajywVar.c.get();
                ayqdVar.getClass();
                g.getClass();
                this.n = new gdk(ajutVar, aahdVar, ayqdVar, g);
            }
            a.o(a2, this.n, BottomUiContainer.m(this, a2));
            p();
        }
    }

    public final void j(avcn avcnVar) {
        k(avcnVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r3 == 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.avcn r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.common.ui.bottomui.HatsController.k(avcn, boolean):void");
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.ae(gbr.b, gbr.a).G().E(ayqr.a()).Y(new gbs(this, 0), eoo.r)};
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

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
        this.g.f();
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0123 A[ORIG_RETURN, RETURN] */
    @Override // defpackage.akbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void lj(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.common.ui.bottomui.HatsController.lj(java.lang.Object):void");
    }

    public final void m(gcu gcuVar, apxf apxfVar) {
        if (apxfVar.pY(FeedbackEndpointOuterClass.feedbackEndpoint)) {
            aone builder = ((aqwl) apxfVar.pX(FeedbackEndpointOuterClass.feedbackEndpoint)).toBuilder();
            if (TextUtils.isEmpty(gcuVar.l)) {
                builder.copyOnWrite();
                aqwl aqwlVar = (aqwl) builder.instance;
                aqwlVar.b &= -5;
                aqwlVar.g = aqwl.a.g;
            } else {
                String str = gcuVar.l;
                builder.copyOnWrite();
                aqwl aqwlVar2 = (aqwl) builder.instance;
                str.getClass();
                aqwlVar2.b |= 4;
                aqwlVar2.g = str;
            }
            aone createBuilder = aupf.a.createBuilder();
            String k = this.r.mM().k();
            createBuilder.copyOnWrite();
            aupf aupfVar = (aupf) createBuilder.instance;
            k.getClass();
            aupfVar.b |= 1;
            aupfVar.c = k;
            aupf aupfVar2 = (aupf) createBuilder.build();
            aong aongVar = (aong) apxfVar.toBuilder();
            aongVar.e(FeedbackEndpointOuterClass.feedbackEndpoint, (aqwl) builder.build());
            aongVar.e(aupg.b, aupfVar2);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.q.c();
        ((fgq) this.h.get()).j(this);
        ((fgm) this.i.get()).h(this);
        this.j.k(this);
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (fhgVar.k()) {
            this.b = null;
            return;
        }
        if (fhgVar.b()) {
            this.s = true;
            return;
        }
        if (fhgVar == fhg.WATCH_WHILE_MAXIMIZED) {
            if (this.s && this.t) {
                this.s = false;
                this.k.postDelayed(new Runnable() { // from class: gbt
                    @Override // java.lang.Runnable
                    public final void run() {
                        HatsController hatsController = HatsController.this;
                        gcu gcuVar = hatsController.b;
                        if (gcuVar != null) {
                            hatsController.i(gcuVar);
                        }
                    }
                }, 750L);
            }
            this.s = false;
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.q.g(kI(this.p));
        this.q.g(this.p.ab().M(fiv.m).G().E(ayqr.a()).Y(new gbs(this, 1), eoo.r));
    }
}
