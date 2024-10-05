package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ktg implements kts, kig {
    public final aioc a;
    public final ayqw b = new ayqw();
    public aypo c;
    public aypn d;
    public boolean e;
    public boolean f;
    private final avaz g;
    private final avax h;
    private final ayqi i;
    private final kih j;
    private boolean k;
    private boolean l;
    private boolean m;
    private ayqx n;

    public ktg(aioc aiocVar, kih kihVar, ayqi ayqiVar, avaz avazVar) {
        this.a = aiocVar;
        this.j = kihVar;
        this.g = avazVar;
        this.i = ayqiVar;
        avbb avbbVar = avazVar.g;
        this.h = (avax) (avbbVar == null ? avbb.a : avbbVar).pX(avax.b);
    }

    private final void f() {
        Object obj = this.n;
        if (obj == null) {
            return;
        }
        azqb.f((AtomicReference) obj);
        this.e = true;
    }

    @Override // defpackage.kts
    public final aypn a() {
        if (this.d == null) {
            this.d = aypn.k(new aypp() { // from class: ktc
                @Override // defpackage.aypp
                public final void a(aypo aypoVar) {
                    final ktg ktgVar = ktg.this;
                    ktgVar.c = aypoVar;
                    ktgVar.b.d(ktgVar.a.ao().G().E(ayqr.a()).Y(new kte(ktgVar, 1), ktf.a));
                    ktgVar.d();
                    aypoVar.si(aynu.e(new ayrm() { // from class: ktd
                        @Override // defpackage.ayrm
                        public final void a() {
                            ktg ktgVar2 = ktg.this;
                            ktgVar2.b.c();
                            ktgVar2.d = null;
                            ktgVar2.c = null;
                        }
                    }));
                }
            }, aypg.BUFFER);
        }
        return this.d;
    }

    @Override // defpackage.kts
    public final void b() {
        this.j.a(this);
    }

    public final void d() {
        aypo aypoVar = this.c;
        if (aypoVar == null) {
            return;
        }
        boolean z = this.h.d;
        int i = 1;
        boolean z2 = !(z || this.e) || this.k;
        if (!this.m) {
            this.m = z2;
        }
        avaz avazVar = this.g;
        if (z || this.e) {
            i = 0;
        } else if (!this.k) {
            i = 2;
        }
        aypoVar.d(kta.c(z2, avazVar, i));
    }

    public final void e() {
        if (this.h.d || this.e || !this.f || this.l) {
            return;
        }
        ayqx Y = aypn.R(r0.c, TimeUnit.MILLISECONDS, this.i).Y(new kte(this, 0), ktf.a);
        this.n = Y;
        this.b.d(Y);
    }

    @Override // defpackage.kig
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        if (this.l == ControlsOverlayStyle.a(controlsOverlayStyle)) {
            return;
        }
        boolean a = ControlsOverlayStyle.a(controlsOverlayStyle);
        this.l = a;
        if (!this.m || !a) {
            e();
        } else {
            f();
            d();
        }
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

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nY(boolean z) {
    }

    @Override // defpackage.kig
    public final void nz(boolean z) {
        if (this.k) {
            this.k = false;
            d();
        }
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
        if (this.k) {
            return;
        }
        this.k = true;
        d();
        if (this.m) {
            f();
        }
    }
}
