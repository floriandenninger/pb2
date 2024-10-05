package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.PipPaidProductBadgeOverlay;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import defpackage.aaea;
import defpackage.ahut;
import defpackage.ahuu;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.aswb;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.fhg;
import defpackage.fnp;
import defpackage.kfe;
import defpackage.kmp;
import defpackage.kmq;
import defpackage.shf;
import defpackage.whu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PipPaidProductBadgeOverlay implements fnp, ahuu, any {
    public boolean a;
    public boolean b;
    public boolean c;
    private final Context e;
    private final aioc f;
    private final Handler g;
    private final aaea h;
    private final shf k;
    private View l;
    private ahut m;
    private boolean o;
    private long p;
    private fhg n = fhg.NONE;
    private final ayqw i = new ayqw();
    private final Runnable j = new kmq(this);
    public long d = 10000;

    public PipPaidProductBadgeOverlay(Context context, aioc aiocVar, Handler handler, shf shfVar, aaea aaeaVar) {
        this.e = context;
        this.f = aiocVar;
        this.g = handler;
        this.k = shfVar;
        this.h = aaeaVar;
    }

    private final void k() {
        if (np()) {
            return;
        }
        View inflate = LayoutInflater.from(this.e).inflate(R.layout.pip_paid_product_badge_overlay, (ViewGroup) null);
        this.l = inflate;
        ahut ahutVar = this.m;
        if (ahutVar != null) {
            ahutVar.d(this, inflate);
        }
        this.a = inflate.getParent() != null;
        inflate.addOnAttachStateChangeListener(new kmp(this));
    }

    private final boolean m() {
        aswb aswbVar = this.h.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.aX;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void h() {
        if (this.o) {
            this.g.removeCallbacks(this.j);
            this.d = Math.max(0L, this.d - (this.k.c() - this.p));
            whu.I(this.l, false);
            this.o = false;
        }
    }

    public final void i() {
        if (!np() && this.n.e() && m()) {
            k();
        }
        if (np()) {
            if (!this.a || this.b || !this.c) {
                h();
                return;
            }
            if (this.o || this.d <= 0 || !m()) {
                return;
            }
            this.o = true;
            this.p = this.k.c();
            whu.I(this.l, true);
            this.g.postDelayed(this.j, this.d);
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.aivf
    public final View ld() {
        k();
        View view = this.l;
        view.getClass();
        return view;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.fnp
    public final boolean mY(fhg fhgVar) {
        return fhgVar.e();
    }

    @Override // defpackage.ahuu
    public final void mZ(ahut ahutVar) {
        this.m = ahutVar;
    }

    @Override // defpackage.fnp
    public final void nH(fhg fhgVar) {
        if (this.n == fhgVar) {
            return;
        }
        this.n = fhgVar;
        if (np()) {
            return;
        }
        i();
    }

    @Override // defpackage.ahuu
    public final boolean np() {
        return this.l != null;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.i.c();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.i.d(this.f.G().b.Y(new ayrs() { // from class: kmo
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                attc attcVar;
                PipPaidProductBadgeOverlay pipPaidProductBadgeOverlay = PipPaidProductBadgeOverlay.this;
                ahef ahefVar = (ahef) obj;
                if (ahefVar.c() == aign.NEW) {
                    pipPaidProductBadgeOverlay.h();
                    pipPaidProductBadgeOverlay.d = 10000L;
                }
                boolean z = false;
                pipPaidProductBadgeOverlay.b = ahefVar.c().a(aign.PLAYBACK_INTERRUPTED, aign.INTERSTITIAL_REQUESTED, aign.INTERSTITIAL_PLAYING);
                PlayerResponseModel b = ahefVar.b();
                if (b != null) {
                    arye aryeVar = b.a.B;
                    if (aryeVar == null) {
                        aryeVar = arye.a;
                    }
                    if (aryeVar.b == 130741768) {
                        attcVar = (attc) aryeVar.c;
                    } else {
                        attcVar = attc.a;
                    }
                    if (attcVar.g) {
                        z = true;
                    }
                }
                pipPaidProductBadgeOverlay.c = z;
                pipPaidProductBadgeOverlay.i();
            }
        }, kfe.l));
    }
}
