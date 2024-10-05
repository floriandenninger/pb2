package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class knq implements kig {
    public final Handler a;
    public final kih b;
    public final Runnable c;
    public final knm d;
    public final acra e;
    public final int f;
    public ammv g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    private final azrs m;

    public knq(Handler handler, kih kihVar, azrs azrsVar, aadw aadwVar, acra acraVar, knm knmVar) {
        this.a = handler;
        this.b = kihVar;
        this.m = azrsVar;
        this.e = acraVar;
        this.d = knmVar;
        asvu asvuVar = aadwVar.b().e;
        this.f = (asvuVar == null ? asvu.a : asvuVar).bL;
        this.g = amlr.a;
        this.c = new knp(this);
    }

    public final void a() {
        b(false);
        this.a.removeCallbacks(this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r4 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r4) {
        /*
            r3 = this;
            ammv r0 = r3.g
            boolean r0 = r0.h()
            if (r0 == 0) goto L56
            boolean r0 = r3.j
            if (r0 != r4) goto Ld
            goto L56
        Ld:
            r3.j = r4
            ammv r0 = r3.g
            java.lang.Object r0 = r0.c()
            yzr r0 = (defpackage.yzr) r0
            r1 = 1
            r0.a(r4, r1)
            knm r0 = r3.d
            boolean r0 = r0.a()
            r1 = 0
            r2 = 119372(0x1d24c, float:1.67276E-40)
            if (r0 == 0) goto L37
            if (r4 == 0) goto L48
            boolean r4 = r3.k
            if (r4 != 0) goto L39
            azrs r4 = r3.m
            kii r0 = defpackage.kii.a()
            r4.c(r0)
            goto L39
        L37:
            if (r4 == 0) goto L48
        L39:
            acra r4 = r3.e
            acqx r0 = new acqx
            acsc r2 = defpackage.acsb.c(r2)
            r0.<init>(r2)
            r4.u(r0, r1)
            return
        L48:
            acra r4 = r3.e
            acqx r0 = new acqx
            acsc r2 = defpackage.acsb.c(r2)
            r0.<init>(r2)
            r4.q(r0, r1)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knq.b(boolean):void");
    }

    @Override // defpackage.kig
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        boolean z = true;
        if (!ControlsOverlayStyle.a(controlsOverlayStyle) && !ControlsOverlayStyle.c(controlsOverlayStyle)) {
            z = false;
        }
        this.h = z;
        if (z) {
            a();
        }
    }

    @Override // defpackage.kig
    public final void m(fhg fhgVar) {
        this.l = fhgVar.b();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final void nC(boolean z) {
        this.i = z;
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nD(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nF(ControlsState controlsState) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nY(boolean z) {
    }

    @Override // defpackage.kig
    public final void nz(boolean z) {
        this.k = false;
        a();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final void r(boolean z) {
        if (z) {
            a();
        }
    }

    @Override // defpackage.kig
    public final void s(boolean z) {
        this.k = true;
    }
}
