package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.MiniPlayerErrorOverlay;
import com.google.android.youtube.R;
import defpackage.ahut;
import defpackage.ahuu;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.fhg;
import defpackage.fnp;
import defpackage.kfe;
import defpackage.kmh;
import defpackage.whu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MiniPlayerErrorOverlay implements fnp, ahuu, any {
    public boolean a;
    public boolean b;
    private final Context c;
    private final aioc d;
    private View f;
    private ahut g;
    private fhg h = fhg.NONE;
    private final ayqw e = new ayqw();

    public MiniPlayerErrorOverlay(Context context, aioc aiocVar) {
        this.c = context;
        this.d = aiocVar;
    }

    private final void i() {
        if (np()) {
            return;
        }
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.mini_player_error_view, (ViewGroup) null);
        this.f = inflate;
        ahut ahutVar = this.g;
        if (ahutVar != null) {
            ahutVar.d(this, inflate);
        }
        this.a = this.f.getParent() != null;
        this.f.addOnAttachStateChangeListener(new kmh(this));
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void h() {
        if (!np() && mY(this.h) && this.b) {
            i();
        }
        if (np()) {
            View view = this.f;
            boolean z = false;
            if (this.b && this.a) {
                z = true;
            }
            whu.I(view, z);
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.aivf
    public final View ld() {
        i();
        return this.f;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.fnp
    public final boolean mY(fhg fhgVar) {
        return fhgVar.k() || fhgVar == fhg.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED;
    }

    @Override // defpackage.ahuu
    public final void mZ(ahut ahutVar) {
        this.g = ahutVar;
    }

    @Override // defpackage.fnp
    public final void nH(fhg fhgVar) {
        if (this.h == fhgVar) {
            return;
        }
        this.h = fhgVar;
        if (np()) {
            return;
        }
        h();
    }

    @Override // defpackage.ahuu
    public final boolean np() {
        return this.f != null;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.e.c();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        final int i = 0;
        this.e.d(this.d.G().f.Y(new ayrs(this) { // from class: kmg
            public final /* synthetic */ MiniPlayerErrorOverlay a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    MiniPlayerErrorOverlay miniPlayerErrorOverlay = this.a;
                    boolean z = miniPlayerErrorOverlay.b;
                    boolean d = ahbl.d(((aigr) obj).i);
                    miniPlayerErrorOverlay.b = d;
                    if (z != d) {
                        miniPlayerErrorOverlay.h();
                        return;
                    }
                    return;
                }
                MiniPlayerErrorOverlay miniPlayerErrorOverlay2 = this.a;
                boolean z2 = miniPlayerErrorOverlay2.b;
                boolean z3 = ((ahej) obj).a() == 8;
                miniPlayerErrorOverlay2.b = z3;
                if (z2 != z3) {
                    miniPlayerErrorOverlay2.h();
                }
            }
        }, kfe.j));
        final int i2 = 1;
        this.e.d(this.d.G().i.Y(new ayrs(this) { // from class: kmg
            public final /* synthetic */ MiniPlayerErrorOverlay a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    MiniPlayerErrorOverlay miniPlayerErrorOverlay = this.a;
                    boolean z = miniPlayerErrorOverlay.b;
                    boolean d = ahbl.d(((aigr) obj).i);
                    miniPlayerErrorOverlay.b = d;
                    if (z != d) {
                        miniPlayerErrorOverlay.h();
                        return;
                    }
                    return;
                }
                MiniPlayerErrorOverlay miniPlayerErrorOverlay2 = this.a;
                boolean z2 = miniPlayerErrorOverlay2.b;
                boolean z3 = ((ahej) obj).a() == 8;
                miniPlayerErrorOverlay2.b = z3;
                if (z2 != z3) {
                    miniPlayerErrorOverlay2.h();
                }
            }
        }, kfe.j));
    }
}
