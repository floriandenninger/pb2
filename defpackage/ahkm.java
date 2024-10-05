package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahkm extends ahhi implements ahiz {
    public final ahnw a;
    public final ahja b;
    public final ahkv c;
    public final Set e;
    public final Set f;
    public boolean g;
    public float h;
    public float i;
    public boolean j;
    public int k;
    public ahix m;
    private final ahkv n;
    private final ahkv o;
    private final axfg p;
    private final float[] q;
    private final Set r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;

    public ahkm(Handler handler, ahod ahodVar, ahks ahksVar, float f, axfg axfgVar, ahla ahlaVar) {
        ahkv b = ahkv.b();
        this.c = b;
        ahkv b2 = ahkv.b();
        this.n = b2;
        ahkv b3 = ahkv.b();
        this.o = b3;
        this.q = new float[16];
        this.e = ConcurrentHashMap.newKeySet();
        this.f = new HashSet();
        this.r = new HashSet();
        this.k = 1;
        handler.getClass();
        ahksVar.getClass();
        this.p = axfgVar;
        ahnw ahnwVar = new ahnw(ahodVar, ahlaVar);
        this.a = ahnwVar;
        b.f(0.0f, 0.0f, ahkq.a);
        b.d(b2);
        ahja ahjaVar = new ahja(handler, b2, b3, ahksVar, this, ahnwVar, ahlaVar);
        this.b = ahjaVar;
        c(f);
        n(ahjaVar);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        Boolean bool = ahkt.a;
    }

    private final void w() {
        double tan = Math.tan(Math.toRadians((this.v + this.u) / 4.0f)) * 1.399999976158142d;
        double d = ahkq.a;
        Double.isNaN(d);
        float f = (float) (tan * d);
        double d2 = f + f;
        double atan = (float) Math.atan(1.0f / this.w);
        double sin = Math.sin(atan);
        Double.isNaN(d2);
        this.s = (float) Math.abs(sin * d2);
        double cos = Math.cos(atan);
        Double.isNaN(d2);
        this.t = (float) Math.abs(d2 * cos);
    }

    public final void a(ahkk ahkkVar) {
        this.e.add(ahkkVar);
    }

    public final void b(ahkl ahklVar) {
        this.r.add(ahklVar);
    }

    public final void c(float f) {
        this.w = f;
        w();
        k();
    }

    public final void g(ahkk ahkkVar) {
        this.e.remove(ahkkVar);
    }

    public final void h(ahkl ahklVar) {
        this.r.remove(ahklVar);
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public final void i() {
        this.a.e();
        super.i();
    }

    public final void j(float f) {
        this.b.c(f);
    }

    public final void k() {
        float f;
        float f2;
        float f3 = this.w;
        if (f3 < 1.0f) {
            f = this.t;
            f2 = f3 * f;
            this.h = f2;
            this.i = f;
        } else {
            float f4 = this.s;
            this.h = f4;
            float f5 = f4 / f3;
            this.i = f5;
            f = f5;
            f2 = f4;
        }
        if (this.g) {
            f2 *= 1.42f;
            this.h = f2;
            f *= 1.42f;
            this.i = f;
        }
        ahja ahjaVar = this.b;
        ahjaVar.k = f2;
        ahjaVar.m = f;
        if (ahjaVar.h == aapb.RECTANGULAR_2D || ahjaVar.h == aapb.RECTANGULAR_3D) {
            ahjaVar.g();
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((ahkl) it.next()).b(this.h, this.i);
        }
    }

    public final void m(int i) {
        ahja ahjaVar = this.b;
        if (i != ahjaVar.g.j()) {
            int i2 = i - 1;
            aapb aapbVar = aapb.RECTANGULAR_2D;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                ahjaVar.g = ahjaVar.e;
            } else if (i2 == 1) {
                ahjaVar.g = ahjaVar.f;
            }
            ahjaVar.g.g();
            ahjaVar.j = true;
        }
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public final void q(ahjq ahjqVar) {
        if (this.j) {
            t(ahjqVar);
            this.j = false;
        }
        super.q(ahjqVar);
        ahix ahixVar = this.m;
        if (ahixVar != null) {
            float[] fArr = ahjqVar.a;
            if (ahixVar.e) {
                ahiw ahiwVar = ahixVar.b;
                if (!ahiwVar.g) {
                    long j = ahiwVar.j;
                    long currentTimeMillis = (System.currentTimeMillis() - ahiwVar.k) + j;
                    long j2 = ahiwVar.l;
                    if (currentTimeMillis > j2) {
                        if (j <= j2) {
                            j = currentTimeMillis;
                        }
                        if (j <= 2000 + j2 || j2 == -1) {
                            ahiwVar.l = j;
                            Handler handler = ahiwVar.a;
                            if (handler != null) {
                                handler.post(new ahiu(ahiwVar, fArr, j));
                            }
                        }
                    }
                }
            }
        }
        Matrix.invertM(this.q, 0, ahjqVar.a, 0);
        this.p.b(this.q);
        GLES20.glClear(16640);
        Boolean bool = ahkt.a;
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public final void qC(ahko ahkoVar) {
        ahkp ahkpVar = ahkoVar.d;
        float f = ahkpVar.a + ahkpVar.c;
        float f2 = ahkpVar.b + ahkpVar.d;
        if (!ahkt.j(f, this.u, 0.1f) && !ahkt.j(f2, this.v, 0.1f)) {
            this.u = f;
            this.v = f2;
            ahix ahixVar = this.m;
            if (ahixVar != null && (f != ahixVar.c || f2 != ahixVar.d)) {
                ahixVar.a.post(new ahis(ahixVar, f, f2));
                ahixVar.c = f;
                ahixVar.d = f2;
            }
            w();
            k();
        }
        super.qC(ahkoVar);
    }

    public final void t(ahjq ahjqVar) {
        float[] fArr = ahjqVar.a;
        amkq.E(true);
        float f = fArr[6];
        float degrees = (float) Math.toDegrees(-(Math.sqrt((double) (1.0f - (f * f))) >= 0.009999999776482582d ? (float) Math.atan2(-fArr[2], fArr[10]) : 0.0f));
        double degrees2 = Math.toDegrees(-Math.asin(fArr[6]));
        this.n.c();
        this.n.i(degrees, 0.0f, 1.0f);
        this.n.i((float) degrees2, 1.0f, 0.0f);
        this.o.c();
        this.o.i(degrees, 0.0f, 1.0f);
    }
}
