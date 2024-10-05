package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ahfr extends ahio implements ahgc, ahik, ahie {
    public final ahkv a;
    public boolean b;
    public ahgb e;
    protected final ahku f;
    public ahhp g;
    public boolean h;
    private final azrw i;
    private boolean o;
    private List p;
    private List q;
    private boolean n = true;
    public float d = 1.0f;
    public float c = 1.0f;
    private final float[] j = new float[16];
    private final float[] k = new float[16];
    private final String m = getClass().getSimpleName();

    public ahfr(ahku ahkuVar, ahkv ahkvVar, azrw azrwVar) {
        this.f = ahkuVar;
        this.a = ahkvVar;
        this.i = azrwVar;
    }

    public final void a(ahfq ahfqVar) {
        if (this.p == null) {
            this.p = new ArrayList();
        }
        this.p.add(ahfqVar);
    }

    public final void c(ahfq ahfqVar) {
        if (this.q == null) {
            this.q = new ArrayList();
        }
        this.q.add(ahfqVar);
    }

    @Override // defpackage.ahim
    public void i() {
        String valueOf = String.valueOf(this.m);
        if (valueOf.length() != 0) {
            "Shutting down renderer on ".concat(valueOf);
        }
        this.f.b();
    }

    @Override // defpackage.ahgc
    public final void j(boolean z) {
        this.n = z;
        this.c = z ? 1.0f : this.d;
    }

    @Override // defpackage.ahie
    public final void k(float f) {
        this.c = f;
    }

    @Override // defpackage.ahim
    public final void l(float f, float f2, float f3) {
        this.a.f(f, f2, f3);
    }

    protected boolean m() {
        throw null;
    }

    public abstract void n();

    public final void o() {
        this.o = true;
    }

    @Override // defpackage.ahim
    public void p(ahjq ahjqVar) {
        ahgb ahgbVar;
        if (!this.b || (ahgbVar = this.e) == null) {
            return;
        }
        ahgbVar.a();
    }

    @Override // defpackage.ahim
    public void q(ahjq ahjqVar) {
        if (v() || !this.n) {
            return;
        }
        List<ahfq> list = this.p;
        if (list != null) {
            for (ahfq ahfqVar : list) {
                boolean z = true;
                if (!this.b && !this.h) {
                    z = false;
                }
                ahfqVar.a(z, ahjqVar.b);
            }
        }
        List list2 = this.q;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((ahfq) it.next()).a(this.h, ahjqVar.b);
            }
        }
    }

    @Override // defpackage.ahim
    public void qC(ahko ahkoVar) {
        if (this.o) {
            Matrix.setIdentityM(this.k, 0);
            ahkoVar = new ahko(this.k, ahkoVar.b, ahkoVar.d, ahkoVar.e, ahkoVar.f);
        }
        ahno ahnoVar = (ahno) this.i.get();
        ahnoVar.j();
        ahnoVar.d();
        boolean m = m();
        if (m) {
            GLES20.glEnable(3042);
        }
        Matrix.multiplyMM(this.j, 0, ahkoVar.c, 0, this.a.a, 0);
        ahnoVar.l(this.j);
        GLES20.glUniform1f(ahnoVar.a, this.c);
        n();
        ahnoVar.c(this.f);
        ahnoVar.k();
        if (m) {
            GLES20.glDisable(3042);
        }
        Boolean bool = ahkt.a;
    }

    @Override // defpackage.ahim
    public final void qD(boolean z, ahjq ahjqVar) {
        this.b = z;
    }

    @Override // defpackage.ahim
    public boolean r(ahjq ahjqVar) {
        ahhp ahhpVar;
        return this.n && !v() && (ahhpVar = this.g) != null && ahhpVar.b(ahjqVar).b();
    }

    @Override // defpackage.ahik
    public final void rJ(float f, float f2, float f3) {
        ahkv ahkvVar = this.a;
        Matrix.setIdentityM(ahkvVar.d, 0);
        Matrix.scaleM(ahkvVar.d, 0, f, f2, f3);
        ahkvVar.g();
    }
}
