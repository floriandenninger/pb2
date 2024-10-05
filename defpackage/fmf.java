package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class fmf {
    public final ahyj a;
    public final ahyg b;
    final fng c;
    public aidv d;

    public fmf(ahyj ahyjVar, fng fngVar) {
        ahyg ahygVar = new ahyg();
        ahyjVar.getClass();
        this.a = ahyjVar;
        this.c = fngVar;
        this.b = ahygVar;
        this.d = null;
    }

    public static CharSequence a(long j) {
        return zhq.i(TimeUnit.MILLISECONDS.toSeconds(j + 500));
    }

    public void b(boolean z) {
        this.c.a(z);
    }

    public final void c(long j) {
        ahyf.K(this.b, j);
    }

    public void g() {
        this.b.l();
        nU();
        this.a.y(this.b);
    }

    public final void h(ahyl ahylVar) {
        this.a.kR(ahylVar);
    }

    public void i(ControlsOverlayStyle controlsOverlayStyle) {
        ahyg ahygVar = this.b;
        ahygVar.h = controlsOverlayStyle.q;
        ahygVar.k = controlsOverlayStyle.r;
        ahygVar.m = controlsOverlayStyle.s;
        ahygVar.l = controlsOverlayStyle.w;
        ahygVar.n = controlsOverlayStyle.x;
        ahygVar.o = controlsOverlayStyle.y;
        ahygVar.m(controlsOverlayStyle.z);
        this.a.y(this.b);
        this.c.c(ControlsOverlayStyle.b(controlsOverlayStyle));
        this.c.ny(controlsOverlayStyle.s);
        this.c.d(this.b.l);
    }

    public void j(long j, long j2, long j3, long j4) {
        ahyg ahygVar = this.b;
        if (ahygVar.c == j && ahygVar.d == j2 && ahygVar.a == j3 && ahygVar.b == j4) {
            return;
        }
        ahygVar.n(j, j2, j3, j4);
        this.a.y(this.b);
        l();
        nS();
    }

    public void k(boolean z) {
        this.c.f(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l() {
        fng fngVar = this.c;
        ahyg ahygVar = this.b;
        fngVar.g(ahbj.d(ahygVar.c, ahygVar.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void nS() {
        if (this.b.a <= 0) {
            return;
        }
        this.c.e(a(this.a.kJ()), a(this.b.a - this.a.kJ()), a(this.b.a));
    }

    public final void nT() {
        if (this.a.kK() == 0) {
            return;
        }
        ahyg ahygVar = this.b;
        ahygVar.b = 0L;
        this.a.y(ahygVar);
    }

    public final void nU() {
        this.a.kP();
        aidv aidvVar = this.d;
        if (aidvVar != null) {
            aidvVar.g(false);
        }
    }
}
