package com.google.android.libraries.youtube.player.features.iv;

import android.content.Context;
import android.os.Handler;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import defpackage.aahd;
import defpackage.acqx;
import defpackage.acra;
import defpackage.acud;
import defpackage.afuh;
import defpackage.afxf;
import defpackage.ahqy;
import defpackage.ahrb;
import defpackage.ahrd;
import defpackage.ahre;
import defpackage.ahrg;
import defpackage.ahri;
import defpackage.ahrj;
import defpackage.ahrk;
import defpackage.ahrm;
import defpackage.ahrp;
import defpackage.ahrq;
import defpackage.ahry;
import defpackage.ahsc;
import defpackage.ahsd;
import defpackage.ahvr;
import defpackage.ainy;
import defpackage.aixh;
import defpackage.aixi;
import defpackage.aixm;
import defpackage.ajjz;
import defpackage.any;
import defpackage.aok;
import defpackage.apxf;
import defpackage.aqte;
import defpackage.aqtg;
import defpackage.kgl;
import defpackage.kiq;
import defpackage.zaz;
import defpackage.zev;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CreatorEndscreenOverlayPresenter implements View.OnLayoutChangeListener, any, ahrp, ahsc, ahrb, ahqy {
    private final ahry A;
    private boolean B;
    private boolean C;
    private ahri D;
    private aixi E;
    public final Context a;
    public final ajjz b;
    public final ainy c;
    public final acud d;
    public final Set e;
    public final Handler f;
    public final ahrd g;
    public boolean i;
    public boolean j;
    public boolean k;
    public ahsd l;
    public aixh m;
    public aqtg p;
    public Vibrator q;
    public final ahrm r;
    public final ahrk s;
    public final zaz t;
    public final kiq u;
    public kgl v;
    private final aahd w;
    private final ahvr x;
    private final ViewGroup y;
    private final acra z;
    public final List h = new ArrayList(6);
    public String n = "";
    public String o = "";
    private final Runnable F = new ahrg(this, 1);

    public CreatorEndscreenOverlayPresenter(Context context, ahrd ahrdVar, kgl kglVar, ajjz ajjzVar, aahd aahdVar, ahvr ahvrVar, ViewGroup viewGroup, kiq kiqVar, ainy ainyVar, afuh afuhVar, afxf afxfVar, acra acraVar, zaz zazVar) {
        this.a = context;
        this.v = kglVar;
        ajjzVar.getClass();
        this.b = ajjzVar;
        aahdVar.getClass();
        this.w = aahdVar;
        ahvrVar.getClass();
        this.x = ahvrVar;
        viewGroup.getClass();
        this.y = viewGroup;
        this.u = kiqVar;
        this.c = ainyVar;
        this.d = new acud(afuhVar, afxfVar, "iv");
        this.z = acraVar;
        ahrdVar.getClass();
        this.g = ahrdVar;
        ahrdVar.a = this;
        ahrdVar.addOnLayoutChangeListener(this);
        this.f = new Handler(context.getMainLooper());
        this.A = new ahry(context, this);
        zazVar.getClass();
        this.t = zazVar;
        this.e = Collections.newSetFromMap(new WeakHashMap());
        afxfVar.e(new ahre(this));
        this.r = new ahrm(this);
        this.s = new ahrk(this);
    }

    public static void j(Animation animation, Animation.AnimationListener animationListener) {
        animation.setAnimationListener(null);
        animation.cancel();
        animation.setAnimationListener(animationListener);
    }

    private final void v() {
        ahsd ahsdVar = this.l;
        if (ahsdVar == null) {
            return;
        }
        ahsdVar.a(true);
        zev.d(this.y.getRootView());
    }

    private final void w(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        this.z.u(new acqx(bArr), null);
    }

    private final void x() {
        if (t()) {
            this.f.post(this.F);
        }
    }

    @Override // defpackage.ahqy
    public final void g(boolean z) {
        this.g.e(z);
    }

    @Override // defpackage.ahqy
    public final void h(boolean z) {
        if (this.B == z) {
            return;
        }
        this.B = z;
        s();
    }

    @Override // defpackage.ahrb
    public final void i(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            if (this.c.d()) {
                this.c.a();
            } else {
                this.c.b();
            }
        }
    }

    @Override // defpackage.ahrp
    public final void k(ahrq ahrqVar) {
        ahrqVar.c().clearAnimation();
        ahrqVar.c().startAnimation(ahrqVar.i);
    }

    public final void l(boolean z) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((ahrj) it.next()).a(z);
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        q();
    }

    @Override // defpackage.ahsc
    public final void m() {
        this.d.a(this.l.c.b.x);
        v();
        if (this.C) {
            this.c.b();
            this.x.nf();
        }
    }

    @Override // defpackage.ahsc
    public final void n(ahrq ahrqVar) {
        aqte aqteVar = ahrqVar.b;
        if ((aqteVar.b & 524288) != 0) {
            aahd aahdVar = this.w;
            apxf apxfVar = aqteVar.t;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
            v();
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.ahrp
    public final void o(ahrq ahrqVar) {
        if (ahrqVar.i()) {
            this.C = this.c.d();
            this.c.L();
            this.d.a(ahrqVar.b.w);
            if (this.l == null) {
                this.l = new ahsd(this.a, this, this.y);
            }
            ahsd ahsdVar = this.l;
            ahsdVar.c = ahrqVar;
            ahsdVar.b.k.setVisibility(8);
            ahsdVar.b.l.setVisibility(8);
            ahsdVar.b.j.setVisibility(8);
            ahsdVar.b.h.setVisibility(8);
            ahsdVar.b.h.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            ahsdVar.b.g.setVisibility(8);
            ahsdVar.b.m.setVisibility(8);
            ahrqVar.g(ahsdVar.b);
            if (ahsdVar.b.a.getParent() == null) {
                ahsdVar.b.a.clearAnimation();
                ahsdVar.e.reset();
                ahsdVar.a.addView(ahsdVar.b.a);
                ahsdVar.b.a.startAnimation(ahsdVar.d);
            }
            ahsdVar.c();
            this.f.post(new ahrg(this, 0));
            return;
        }
        n(ahrqVar);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.i) {
            if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
                return;
            }
            x();
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0140 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.aixh r10, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r11) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter.p(aixh, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel):void");
    }

    public final void q() {
        aixh aixhVar = this.m;
        if (aixhVar != null) {
            aixm d = aixhVar.d();
            if (d != null) {
                ahri ahriVar = this.D;
                if (ahriVar != null) {
                    d.i(ahriVar);
                    this.D = null;
                }
                aixi aixiVar = this.E;
                if (aixiVar != null) {
                    d.i(aixiVar);
                    this.E = null;
                }
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    ((ahrq) it.next()).n();
                }
                d.j(ahrq.class);
            }
            this.m = null;
        }
        ahsd ahsdVar = this.l;
        if (ahsdVar != null) {
            ahsdVar.a(false);
        }
        this.h.clear();
        this.g.d();
        if (this.i) {
            this.i = false;
            s();
            l(false);
        }
    }

    @Override // defpackage.ahrp
    public final void r(ahrq ahrqVar) {
        ahrd ahrdVar = this.g;
        j(ahrqVar.i, ahrqVar.g);
        if (ahrqVar.c().getParent() == null) {
            ahrdVar.addView(ahrqVar.c());
            ahrqVar.c().startAnimation(ahrqVar.h);
        }
        this.d.a(ahrqVar.b.v);
        w(ahrqVar.b.y.I());
    }

    public final boolean t() {
        return !this.u.a().isEmpty();
    }

    @Override // defpackage.ahrp
    public final void u() {
        v();
        if (this.C) {
            this.c.b();
            this.x.nf();
        }
    }

    public final void s() {
        if (!this.i || this.j || this.k || this.B) {
            ahrd ahrdVar = this.g;
            if (ahrdVar.getVisibility() != 0) {
                return;
            }
            if (ahrdVar.c.hasEnded() || !ahrdVar.c.hasStarted()) {
                ahrd.a(ahrdVar);
                ahrdVar.startAnimation(ahrdVar.c);
                return;
            }
            return;
        }
        ahrd ahrdVar2 = this.g;
        j(ahrdVar2.c, ahrdVar2.d);
        ahrdVar2.setVisibility(0);
        if (ahrdVar2.b.hasEnded() || !ahrdVar2.b.hasStarted()) {
            ahrdVar2.startAnimation(ahrdVar2.b);
        }
        x();
        w(this.p.f.I());
    }
}
