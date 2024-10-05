package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kiz implements kjb, kig, aida, kuw {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    public final fna a;
    public final boolean b;
    public final long c;
    public final Handler d;
    public final Runnable e;
    public final int g;
    public final azrs i;
    public final kih j;
    public final acra k;
    public final kje l;
    public final kli n;
    public float o;
    public float p;
    public boolean s;
    public long t;
    public boolean u;
    public final aadw v;
    public final axzg w;
    private final boolean x;
    private boolean y;
    private boolean z;
    public ammv q = amlr.a;
    public final Set f = new HashSet();
    public final Point h = new Point();
    public ammv r = amlr.a;
    public final Rect m = new Rect();

    public kiz(Context context, fna fnaVar, Handler handler, kih kihVar, azrs azrsVar, aadw aadwVar, acra acraVar, kje kjeVar, axzg axzgVar, kli kliVar, byte[] bArr, byte[] bArr2) {
        this.a = fnaVar;
        this.d = handler;
        this.i = azrsVar;
        this.j = kihVar;
        this.k = acraVar;
        this.l = kjeVar;
        this.v = aadwVar;
        this.w = axzgVar;
        this.n = kliVar;
        this.g = context.getResources().getDimensionPixelSize(R.dimen.easy_seek_vertical_dismiss_limit);
        asvu asvuVar = aadwVar.b().e;
        this.b = (asvuVar == null ? asvu.a : asvuVar).bD;
        this.c = (aadwVar.b().e == null ? asvu.a : r1).cv;
        asvu asvuVar2 = aadwVar.b().e;
        this.x = (asvuVar2 == null ? asvu.a : asvuVar2).cI;
        this.e = new kiy(this);
    }

    public final void a() {
        this.a.j(this.h);
        if (this.w.c().booleanValue()) {
            this.h.offset(-this.m.left, 0);
        }
    }

    @Override // defpackage.kjb
    public final void b() {
        if (this.x) {
            this.s = true;
            this.l.a();
            this.d.removeCallbacks(this.e);
            y();
            this.r = amlr.a;
        }
    }

    @Override // defpackage.aida
    public final void d(int i, int i2, int i3) {
    }

    @Override // defpackage.kuw
    public final void f() {
        this.D = true;
        y();
    }

    @Override // defpackage.kig
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        boolean z = true;
        if (!ControlsOverlayStyle.a(controlsOverlayStyle) && !ControlsOverlayStyle.c(controlsOverlayStyle)) {
            z = false;
        }
        this.C = z;
        if (z) {
            y();
        }
    }

    @Override // defpackage.kig
    public final /* synthetic */ void m(fhg fhgVar) {
    }

    @Override // defpackage.kig
    public final void nA(boolean z) {
        this.z = z;
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nC(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nD(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nF(ControlsState controlsState) {
    }

    @Override // defpackage.aida
    public final void nW(float f, boolean z) {
        boolean z2 = f > 0.0f;
        if (z2 == this.A) {
            return;
        }
        this.A = z2;
        y();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nY(boolean z) {
    }

    @Override // defpackage.kig
    public final void nz(boolean z) {
        this.y = false;
    }

    @Override // defpackage.kig
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // defpackage.kig
    public final void s(boolean z) {
        this.y = true;
    }

    @Override // defpackage.kuw
    public final void t(boolean z) {
        this.D = false;
    }

    @Override // defpackage.kuw
    public final void u(float f) {
    }

    public final void v(boolean z) {
        if (!this.q.h() || this.B == z) {
            return;
        }
        this.B = z;
        ((yzr) this.q.c()).a(z, true);
        if (z) {
            this.k.u(new acqx(acsb.c(119372)), null);
        } else {
            this.k.q(new acqx(acsb.c(119372)), null);
        }
    }

    public final void w() {
        if (!this.r.h()) {
            this.r = ammv.j(Boolean.valueOf(this.y));
        }
        this.u = true;
    }

    public final boolean x() {
        return this.A || this.C || this.z || this.D || this.s;
    }

    public final void y() {
        this.d.removeCallbacks(this.e);
        if (this.r.h()) {
            azrs azrsVar = this.i;
            tmf tmfVar = new tmf(kii.a());
            tmfVar.b(((Boolean) this.r.c()).booleanValue());
            tmfVar.c(false);
            azrsVar.c(tmfVar.a());
            this.r = amlr.a;
        }
        this.l.a();
        if (this.B) {
            v(false);
        }
    }
}
