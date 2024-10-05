package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kjw implements kig {
    public final ayqw a;
    public final Rect b;
    public boolean c;
    public boolean d;
    public final kjp e;
    public final boolean f;
    public kjt g;
    public yzr h;
    private boolean i;
    private final aivb j;
    private final aicz k;
    private final koe l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;

    public kjw(aicz aiczVar, aivb aivbVar, axzg axzgVar, kjp kjpVar, koe koeVar, byte[] bArr, byte[] bArr2) {
        this.k = aiczVar;
        this.j = aivbVar;
        this.e = kjpVar;
        this.l = koeVar;
        this.f = axzgVar.b().booleanValue();
        aiczVar.c.a(new kjv(this));
        aivbVar.a(new kju(this));
        koeVar.a(new kjs(this));
        this.a = new ayqw();
        this.b = new Rect();
    }

    private final void e(boolean z) {
        t(b(), z);
    }

    private final void f(boolean z) {
        t(d(), z);
    }

    private final void t(boolean z, boolean z2) {
        if (z) {
            this.l.b();
        }
        yzr yzrVar = this.h;
        if (yzrVar == null) {
            return;
        }
        yzrVar.a(z, z2);
        this.h.b.setEnabled(!this.n);
    }

    private final boolean u() {
        return (this.d && this.f) ? false : true;
    }

    public final void a() {
        if (this.m) {
            f(false);
        } else {
            e(false);
        }
    }

    public final boolean b() {
        if (this.n) {
            return true;
        }
        return (this.o || this.p || !this.j.d() || this.c || !u()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        if (this.k.c.d() || this.c) {
            return false;
        }
        return (!this.i || this.d) && u();
    }

    @Override // defpackage.kig
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        a();
    }

    @Override // defpackage.kig
    public final void m(fhg fhgVar) {
        this.o = fhgVar.b();
        a();
    }

    @Override // defpackage.kig
    public final void nA(boolean z) {
        if (this.p != z) {
            this.p = z;
            a();
        }
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nC(boolean z) {
    }

    @Override // defpackage.kig
    public final void nD(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nF(ControlsState controlsState) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final void nY(boolean z) {
        if (this.n == z) {
            return;
        }
        this.n = z;
        a();
    }

    @Override // defpackage.kig
    public final void nz(boolean z) {
        this.m = false;
        e(z);
    }

    @Override // defpackage.kig
    public final void p(boolean z) {
        if (z == this.i) {
            return;
        }
        this.i = z;
        a();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final void r(boolean z) {
        if (z != this.d) {
            this.d = z;
            if (!z) {
                this.c = false;
            }
            a();
        }
    }

    @Override // defpackage.kig
    public final void s(boolean z) {
        this.m = true;
        f(z);
    }
}
