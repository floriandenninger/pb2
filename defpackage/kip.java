package defpackage;

import android.os.Handler;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kip implements fne, kig {
    public fnd a;
    public fnd b;
    public yzr d;
    public yzr e;
    public kpf f;
    private final Handler g;
    private boolean i;
    private boolean j;
    private boolean k;
    public long c = 500;
    private final Runnable h = new Runnable() { // from class: kim
        @Override // java.lang.Runnable
        public final void run() {
            kip kipVar = kip.this;
            kipVar.d(null);
            kipVar.e(true);
        }
    };

    public kip(Handler handler) {
        this.g = handler;
    }

    private final void f(fnd fndVar) {
        yzr yzrVar;
        if (this.b == fndVar) {
            return;
        }
        this.b = fndVar;
        if (fndVar == null || (yzrVar = this.e) == null) {
            return;
        }
        ((TextView) yzrVar.b).setText(fndVar.a);
    }

    @Override // defpackage.fne
    public final void a(fnd fndVar) {
        if (fndVar != null) {
            if (fndVar == this.b || fndVar == this.a) {
                if (fndVar == this.a) {
                    d(null);
                } else {
                    f(null);
                }
                e(true);
            }
        }
    }

    @Override // defpackage.fne
    public final void b(fnd fndVar) {
        if (fndVar == null) {
            return;
        }
        if (fndVar.b().h()) {
            d(fndVar);
        } else {
            f(fndVar);
        }
        e(true);
    }

    public final void d(fnd fndVar) {
        yzr yzrVar;
        if (this.a == fndVar) {
            return;
        }
        this.a = fndVar;
        this.g.removeCallbacks(this.h);
        fnd fndVar2 = this.a;
        if (fndVar2 != null && fndVar2.b().h()) {
            this.g.postDelayed(this.h, ((Integer) this.a.b().c()).intValue());
        }
        fnd fndVar3 = this.a;
        if (fndVar3 != null && (yzrVar = this.d) != null) {
            ((TextView) yzrVar.b).setText(fndVar3.a);
        }
        kpf kpfVar = this.f;
        if (kpfVar != null) {
            kpfVar.a(this.a != null);
        }
    }

    public final void e(boolean z) {
        long j;
        boolean z2;
        fnd fndVar;
        if (this.d == null || this.e == null) {
            return;
        }
        if (!this.i || this.j || this.k || ((fndVar = this.a) == null && this.b == null)) {
            j = this.c;
            d(null);
            z2 = false;
        } else {
            z2 = fndVar == null;
            r1 = fndVar != null;
            j = 500;
        }
        yzr yzrVar = this.d;
        yzrVar.d = j;
        yzrVar.a(r1, z);
        yzr yzrVar2 = this.e;
        yzrVar2.d = j;
        yzrVar2.a(z2, z);
    }

    @Override // defpackage.kig
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
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
    public final void nC(boolean z) {
        if (this.j == z) {
            return;
        }
        this.j = z;
        e(false);
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
        if (this.i) {
            this.i = false;
            e(z);
        }
    }

    @Override // defpackage.kig
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final void r(boolean z) {
        if (this.k == z) {
            return;
        }
        this.k = z;
        e(false);
    }

    @Override // defpackage.kig
    public final void s(boolean z) {
        if (this.i) {
            return;
        }
        this.i = true;
        e(z);
    }
}
