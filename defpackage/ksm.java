package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ksm implements aida, ahrj, ahyl, kig, ypd {
    private static final String j = aalt.f(168, "products_in_video");
    public final ksl a;
    public final axpg b;
    public final ajdw c;
    public final acra d;
    public final kih e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    private final sxd k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;

    public ksm(ksl kslVar, axpg axpgVar, ajdw ajdwVar, acra acraVar, sxd sxdVar, kih kihVar) {
        this.a = kslVar;
        this.b = axpgVar;
        this.c = ajdwVar;
        this.d = acraVar;
        this.k = sxdVar;
        this.e = kihVar;
        whu.I(kslVar, false);
    }

    private final void u(boolean z) {
        if (this.p != z) {
            this.p = z;
            b();
        }
    }

    private final void v(boolean z) {
        if (this.l != z) {
            this.l = z;
            t();
        }
    }

    @Override // defpackage.ahrj
    public final void a(boolean z) {
        if (this.m != z) {
            this.m = z;
            t();
        }
    }

    public final void b() {
        if (this.o) {
            aone createBuilder = aufq.a.createBuilder();
            boolean z = this.p;
            createBuilder.copyOnWrite();
            aufq aufqVar = (aufq) createBuilder.instance;
            aufqVar.b |= 4;
            aufqVar.d = z;
            boolean z2 = this.h;
            createBuilder.copyOnWrite();
            aufq aufqVar2 = (aufq) createBuilder.instance;
            aufqVar2.b |= 8;
            aufqVar2.e = z2;
            int i = this.i;
            createBuilder.copyOnWrite();
            aufq aufqVar3 = (aufq) createBuilder.instance;
            aufqVar3.b |= 2;
            aufqVar3.c = i;
            this.k.b(j, ((aufq) createBuilder.build()).toByteArray());
        }
    }

    @Override // defpackage.aida
    public final void d(int i, int i2, int i3) {
        v(i2 == 2);
    }

    @Override // defpackage.ahyl
    public final void h(int i, long j2) {
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (this.n != z) {
            this.n = z;
            t();
        }
    }

    @Override // defpackage.kig
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ypd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class[] kz(java.lang.Class r6, java.lang.Object r7, int r8) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksm.kz(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }

    @Override // defpackage.kig
    public final /* synthetic */ void m(fhg fhgVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
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
        v(f > 0.0f);
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nY(boolean z) {
    }

    @Override // defpackage.kig
    public final void nz(boolean z) {
        u(false);
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
        u(true);
    }

    public final void t() {
        boolean z = false;
        if (this.f && this.g && !this.l && !this.m && !this.n) {
            z = true;
        }
        if (this.o != z) {
            this.o = z;
            whu.I(this.a, z);
            b();
        }
    }
}
