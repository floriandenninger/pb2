package defpackage;

import android.opengl.Matrix;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahiq extends ahhi {
    public static final float a = ahkt.a(25.0f);
    public static final float b = ahkt.a(9.0f);
    public static final float c = ahkt.a(3.0f);
    public final ahgd[] e;
    public final ahga f;
    public float g;
    public float h;
    private final ahgd i;
    private final ahfp j;
    private final ahhp k;
    private final float[] m;
    private final ahip n;
    private final ahif o;
    private float p;
    private float[] q;
    private boolean r;

    public ahiq(azrw azrwVar, int[] iArr, float f, ahkv ahkvVar, ahip ahipVar) {
        amkq.E(true);
        this.h = f;
        this.n = ahipVar;
        this.j = new ahfp();
        ahkv clone = ahkvVar.clone();
        this.k = new ahhp(clone, this.h, 1.0f);
        this.f = new ahga(new ahhp(clone, this.h, a));
        ahku a2 = ahku.a(1.0f, 1.0f, ahku.c);
        int length = iArr.length;
        this.e = new ahgd[length];
        float[] fArr = new float[length];
        this.q = fArr;
        this.m = new float[length];
        fArr[0] = 1.0f;
        for (int i = 0; i < iArr.length; i++) {
            this.e[i] = new ahgd(a2, ahkvVar.clone(), ahgd.s(ahgd.h(iArr[i]), a2.f), azrwVar);
        }
        g(this.q);
        ahku a3 = ahku.a(ahkt.a(1.0f), b, ahku.c);
        ahgd ahgdVar = new ahgd(a3, ahkvVar.clone(), ahgd.s(new float[]{1.0f, 1.0f, 1.0f, 1.0f}, a3.f), azrwVar);
        this.i = ahgdVar;
        ahgdVar.l((-this.h) / 2.0f, 0.0f, 0.0f);
        this.o = new ahif(ahgdVar, 1.0f, 0.0f);
        for (ahgd ahgdVar2 : this.e) {
            this.f.n(ahgdVar2);
        }
        n(this.f);
        n(this.i);
    }

    public final void a() {
        int i = 0;
        float f = 0.0f;
        while (true) {
            ahgd[] ahgdVarArr = this.e;
            if (i >= ahgdVarArr.length) {
                return;
            }
            float f2 = (((this.q[i] / 2.0f) + f) - 0.5f) * this.h;
            this.m[i] = f2;
            ahgdVarArr[i].l(f2, 0.0f, 0.0f);
            f += this.q[i];
            i++;
        }
    }

    public final void b() {
        int i = 0;
        while (true) {
            ahgd[] ahgdVarArr = this.e;
            if (i >= ahgdVarArr.length) {
                return;
            }
            ahgdVarArr[i].l(-this.m[i], 0.0f, 0.0f);
            i++;
        }
    }

    public final void c(boolean z) {
        this.f.j(z);
    }

    public final void g(float[] fArr) {
        float f = 0.0f;
        for (float f2 : fArr) {
            f += f2;
        }
        double d = f;
        if (d >= 1.01d || d <= 0.99d) {
            String valueOf = String.valueOf(Arrays.toString(fArr));
            zga.b(valueOf.length() != 0 ? "Invalid sized widths!".concat(valueOf) : new String("Invalid sized widths!"));
        } else {
            b();
            this.q = fArr;
            a();
        }
    }

    public final void h(float f) {
        ahgd ahgdVar = this.i;
        float f2 = this.h;
        ahkv ahkvVar = ((ahfr) ahgdVar).a;
        Matrix.setIdentityM(ahkvVar.c, 0);
        Matrix.translateM(ahkvVar.c, 0, f2 * f, 0.0f, 0.0f);
        ahkvVar.h();
    }

    public final boolean j() {
        return !v() && this.f.b;
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public final void p(ahjq ahjqVar) {
        if (this.f.b) {
            this.n.c(this.k.b(ahjqVar).a());
        }
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public final void q(ahjq ahjqVar) {
        if (!v()) {
            boolean j = j();
            if (this.r && !j) {
                this.n.b();
            }
            this.r = j;
            this.j.b(j, ahjqVar.b);
            float f = b;
            float f2 = c;
            this.p = ((f - f2) * this.j.a()) + f2;
            this.o.a(!j, ahjqVar.b);
            if (j) {
                float a2 = this.k.b(ahjqVar).a();
                this.g = a2;
                h(a2);
                this.n.a(this.g);
            }
            int i = 0;
            while (true) {
                ahgd[] ahgdVarArr = this.e;
                if (i >= ahgdVarArr.length) {
                    break;
                }
                ahgdVarArr[i].rJ(this.q[i] * this.h, this.p, 1.0f);
                i++;
            }
        }
        super.q(ahjqVar);
    }
}
