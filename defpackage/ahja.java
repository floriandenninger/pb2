package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahja extends ahjw {
    private static final float q = -ahkq.a;
    private int A;
    private int B;
    final ahkv c;
    final ahkv d;
    public final ahij e;
    public final ahkn f;
    public ahky g;
    public boolean i;
    public float k;
    public float m;
    public boolean n;
    public boolean o;
    public ahns p;
    private final ahiz r;
    private final ahnw s;
    private final float[] t;
    private ahjw u;
    private ahla w;
    private int x;
    private int z;
    public aapb h = aapb.NOOP;
    private int y = 1;
    public boolean j = true;
    final ahkv b = ahkv.b();
    private final AtomicReference v = new AtomicReference();
    final ahkv a = ahkv.b();

    /* JADX WARN: Type inference failed for: r3v7, types: [ahns, java.lang.Object] */
    public ahja(Handler handler, ahkv ahkvVar, ahkv ahkvVar2, ahks ahksVar, ahiz ahizVar, ahnw ahnwVar, ahla ahlaVar) {
        this.c = ahkvVar;
        this.d = ahkvVar2;
        this.r = ahizVar;
        this.s = ahnwVar;
        this.w = ahlaVar;
        ahij ahijVar = new ahij(handler, ahksVar);
        this.e = ahijVar;
        this.f = new ahkn(handler);
        ahijVar.g();
        this.g = ahijVar;
        this.i = true;
        k(aapb.NOOP, 1);
        this.t = new float[16];
        this.p = ahnwVar.g(this.g.j()).get();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ahns, java.lang.Object] */
    private final ahhz n(int i) {
        int i2;
        this.p = this.s.g(this.g.j()).get();
        if (this.o) {
            float f = -ahkq.a;
            double abs = Math.abs(Math.atan((this.k * 0.5f) / f));
            float f2 = (float) (abs + abs);
            float f3 = (this.m * f2) / this.k;
            if (f3 >= 1.5707964f) {
                f3 = 1.5707964f;
            }
            if (f2 >= 1.5707964f) {
                f2 = 1.5707964f;
            }
            this.a.f(0.0f, 0.0f, f);
            amkq.E(f > 0.0f);
            amkq.E(true);
            amkq.E(true);
            float[] fArr = new float[47880];
            float[] fArr2 = new float[31920];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < 399) {
                int i6 = i3 + 1;
                float f4 = i3 / 399.0f;
                float[] fArr3 = fArr2;
                double d = (f4 - 0.5f) * f3;
                float f5 = -f;
                float f6 = f3;
                float cos = ((float) Math.cos(d)) * f5;
                float f7 = i6 / 399.0f;
                int i7 = i4;
                double d2 = (f7 - 0.5f) * f6;
                float f8 = f;
                float cos2 = ((float) Math.cos(d2)) * f5;
                float sin = ((float) Math.sin(d)) * f5;
                float sin2 = f5 * ((float) Math.sin(d2));
                i4 = i7;
                i5 = i5;
                int i8 = 0;
                while (i8 <= 19) {
                    float f9 = (i3 % 2 == 0 ? i8 : 19 - i8) / 19.0f;
                    int i9 = i4 + 1;
                    fArr3[i4] = f9;
                    int i10 = i9 + 1;
                    fArr3[i9] = 1.0f - f4;
                    int i11 = i10 + 1;
                    fArr3[i10] = f9;
                    i4 = i11 + 1;
                    fArr3[i11] = 1.0f - f7;
                    float f10 = f4;
                    int i12 = i6;
                    double d3 = (0.5f - f9) * f2;
                    float f11 = f7;
                    float sin3 = ((float) Math.sin(d3)) * cos;
                    float f12 = f8;
                    float f13 = sin2;
                    float cos3 = (float) Math.cos(d3);
                    if (i3 == 0) {
                        int i13 = i5 + 1;
                        fArr[i5] = sin3;
                        int i14 = i13 + 1;
                        fArr[i13] = sin;
                        i2 = i14 + 1;
                        fArr[i14] = cos * cos3;
                    } else {
                        int i15 = i5 + 1;
                        int i16 = ((i8 * 4) + 1) * 3;
                        fArr[i5] = fArr[i5 - i16];
                        int i17 = i15 + 1;
                        fArr[i15] = fArr[i15 - i16];
                        i2 = i17 + 1;
                        fArr[i17] = fArr[i17 - i16];
                    }
                    int i18 = i2 + 1;
                    fArr[i2] = ((float) Math.sin(d3)) * cos2;
                    int i19 = i18 + 1;
                    fArr[i18] = f13;
                    i5 = i19 + 1;
                    fArr[i19] = cos3 * cos2;
                    i8++;
                    f7 = f11;
                    f8 = f12;
                    i6 = i12;
                    f4 = f10;
                    sin2 = f13;
                }
                f = f8;
                i3 = i6;
                fArr2 = fArr3;
                f3 = f6;
            }
            ahku ahkuVar = new ahku(fArr, fArr2, 5);
            ahky ahkyVar = this.g;
            return new ahhz(ahkuVar, ahkuVar, ahkyVar, i, this.a, this.s.g(ahkyVar.j()), this.w);
        }
        ahku a = ahku.a(this.k, this.m, ahku.a);
        ahky ahkyVar2 = this.g;
        return new ahhz(a, a, ahkyVar2, i, this.a, this.s.g(ahkyVar2.j()), this.w);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ahns, java.lang.Object] */
    private final void o(int i) {
        this.p = this.s.g(this.g.j()).get();
        float f = q;
        float[] fArr = ahku.a;
        float[] fArr2 = new float[9600];
        float[] fArr3 = new float[6400];
        int i2 = 0;
        while (true) {
            if (i2 < 40) {
                float f2 = i2 / 40.0f;
                int i3 = i2 + 1;
                float f3 = i3 / 40.0f;
                double d = f2 * 3.1415927f;
                float sin = ((float) Math.sin(d)) * f;
                double d2 = f3 * 3.1415927f;
                float sin2 = ((float) Math.sin(d2)) * f;
                float cos = ((float) Math.cos(d)) * f;
                float cos2 = ((float) Math.cos(d2)) * f;
                int i4 = i2 * 240;
                int i5 = i2 * 160;
                int i6 = 0;
                for (int i7 = 40; i6 < i7; i7 = 40) {
                    float f4 = i6 / 39.0f;
                    int i8 = i6 + i6;
                    int i9 = i4 + (i8 * 3);
                    int i10 = i8 + 1;
                    int i11 = i4 + (i10 * 3);
                    float f5 = f2;
                    double d3 = (f4 + f4) * 3.1415927f;
                    float f6 = f;
                    fArr2[i9] = ((float) Math.sin(d3)) * sin;
                    fArr2[i11] = ((float) Math.sin(d3)) * sin2;
                    fArr2[i9 + 1] = cos;
                    fArr2[i11 + 1] = cos2;
                    fArr2[i9 + 2] = ((float) Math.cos(d3)) * sin;
                    fArr2[i11 + 2] = ((float) Math.cos(d3)) * sin2;
                    int i12 = i5 + i8 + i8;
                    int i13 = i5 + i10 + i10;
                    float f7 = 1.0f - f4;
                    fArr3[i12] = f7;
                    fArr3[i13] = f7;
                    fArr3[i12 + 1] = 1.0f - f5;
                    fArr3[i13 + 1] = 1.0f - f3;
                    i6++;
                    f = f6;
                    f2 = f5;
                }
                i2 = i3;
            } else {
                ahku ahkuVar = new ahku(fArr2, fArr3, 5);
                ahky ahkyVar = this.g;
                this.u = new ahhz(ahkuVar, ahkuVar, ahkyVar, i, this.a, this.s.g(ahkyVar.j()), this.w);
                return;
            }
        }
    }

    @Override // defpackage.ahjw
    public final void a(ahla ahlaVar) {
        this.w = ahlaVar;
        ahjw ahjwVar = this.u;
        if (ahjwVar != null) {
            ahjwVar.a(ahlaVar);
        }
    }

    @Override // defpackage.ahjw
    public final void b() {
        ahjw ahjwVar = this.u;
        if (ahjwVar != null) {
            ahjwVar.b();
            this.u = null;
        }
    }

    @Override // defpackage.ahjw
    public final void c(float f) {
        ahjw ahjwVar = this.u;
        if (ahjwVar != null) {
            ahjwVar.c(f);
        }
    }

    public final void g() {
        this.j = true;
        k(this.h, this.y);
    }

    public final void h() {
        ahkv ahkvVar = this.c;
        aapb aapbVar = aapb.RECTANGULAR_2D;
        int i = this.y;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            ahkvVar = this.n ? this.d : this.b;
        } else if (i2 == 2) {
            ahkvVar = this.b;
        }
        this.a.d(ahkvVar);
    }

    @Override // defpackage.ahim
    public final void i() {
        ahjw ahjwVar = this.u;
        if (ahjwVar != null) {
            ahjwVar.i();
        }
        ahij ahijVar = this.e;
        SurfaceTexture surfaceTexture = ahijVar.c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            ahijVar.c = null;
            GLES20.glDeleteTextures(1, new int[]{ahijVar.a}, 0);
            Boolean bool = ahkt.a;
        }
        this.f.k();
    }

    public final void j(afld afldVar) {
        this.v.set(afldVar);
        this.j = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r10v13, types: [ahns, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20, types: [ahns, java.lang.Object] */
    public final void k(aapb aapbVar, int i) {
        if (aapbVar == this.h && i == this.y && !this.j) {
            return;
        }
        boolean z = false;
        this.j = false;
        this.h = aapbVar;
        this.y = i;
        ahjw ahjwVar = this.u;
        if (ahjwVar != null) {
            ahjwVar.i();
            this.u.b();
            this.u = null;
        }
        h();
        ahkv ahkvVar = this.a;
        Matrix.setIdentityM(ahkvVar.b, 0);
        ahkvVar.h();
        aapb aapbVar2 = aapb.RECTANGULAR_2D;
        int ordinal = aapbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                o(0);
            } else if (ordinal == 2) {
                o(1);
            } else if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        afld afldVar = (afld) this.v.get();
                        if (afldVar != null) {
                            this.p = this.s.g(this.g.j()).get();
                            aflc g = afldVar.c.g();
                            ahku ahkuVar = new ahku(g.b, g.c, g.a);
                            vak vakVar = afldVar.d;
                            if (vakVar != null) {
                                aflc g2 = vakVar.g();
                                ahku ahkuVar2 = new ahku(g2.b, g2.c, g2.a);
                                ahky ahkyVar = this.g;
                                this.u = new ahhz(ahkuVar, ahkuVar2, ahkyVar, afldVar.b, this.a, this.s.g(ahkyVar.j()), this.w);
                            } else {
                                ahky ahkyVar2 = this.g;
                                this.u = new ahhz(ahkuVar, ahkuVar, ahkyVar2, afldVar.b, this.a, this.s.g(ahkyVar2.j()), this.w);
                            }
                        }
                    } else {
                        throw new UnsupportedOperationException("VideoScene type not supported");
                    }
                }
            } else if (this.n) {
                this.a.f(0.0f, 0.0f, ahkq.a);
                this.u = n(2);
                z = true;
            } else {
                this.u = new ahih(new ahnv(this.s, this.g.j(), 0), this.g, this.w);
            }
        } else if (this.n) {
            this.a.f(0.0f, 0.0f, ahkq.a);
            this.u = n(0);
            z = true;
        }
        if (this.u == null) {
            this.p = this.s.f(this.g.j()).get();
            this.u = new ahid(this.s.f(this.g.j()), this.g, this.w);
        }
        Iterator it = ((ahkm) this.r).f.iterator();
        while (it.hasNext()) {
            ((ahkj) it.next()).a(z);
        }
        this.p.a(true, null, 0L, 0L);
        this.p.b(this.z, this.A, this.x, this.B);
    }

    public final void m(int i, int i2, int i3, int i4) {
        this.z = i;
        this.A = i2;
        this.x = i3;
        this.B = i4;
        this.p.b(i, i2, i3, i4);
    }

    @Override // defpackage.ahjw, defpackage.ahim
    public final void q(ahjq ahjqVar) {
        ahjw ahjwVar = this.u;
        if (ahjwVar != null) {
            ahjwVar.q(ahjqVar);
        }
    }

    @Override // defpackage.ahim
    public final void qC(ahko ahkoVar) {
        if (this.j) {
            k(this.h, this.y);
        }
        if (this.i) {
            if (aapb.MESH.equals(this.h)) {
                System.arraycopy(ahkoVar.a, 0, this.t, 0, 16);
                float[] fArr = this.t;
                fArr[12] = 0.0f;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                ahkoVar = new ahko(fArr, ahkoVar.b, ahkoVar.d, ahkoVar.e, ahkoVar.f);
            }
            ahjw ahjwVar = this.u;
            if (ahjwVar != null) {
                ahjwVar.qC(ahkoVar);
            }
        }
    }
}
