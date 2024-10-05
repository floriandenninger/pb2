package defpackage;

import android.opengl.GLES20;
import android.os.Build;
import android.util.Range;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahnr {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public int e;
    byte[] h;
    boolean k;
    public final int[] l;
    private final int q;
    private final int r;
    private ahlj s;
    private ahlh t;
    private final ahnq u = new ahnq();
    private final ArrayDeque v = new ArrayDeque();
    private final ArrayDeque w = new ArrayDeque();
    long f = -1;
    long g = -1;
    long i = -1;
    long j = 0;
    public int n = 3;
    public int o = 3;
    public int m = 500;
    public int p = 3;

    public ahnr(ahnt ahntVar) {
        this.l = r1;
        int[] iArr = {0};
        this.q = ahntVar.f("uColorPrimaryTransform");
        this.r = ahntVar.f("uLuminanceTransform");
        this.a = ahntVar.f("uInputLut");
        this.b = ahntVar.f("uOutputLut");
        this.c = ahntVar.f("uKneeLut");
        this.d = ahntVar.f("uLutSize");
        GLES20.glGenTextures(3, iArr, 0);
        for (int i = 0; i < 3; i++) {
            ahkt.g(this.l[i]);
        }
    }

    private static void f(ahlh ahlhVar, ahnq ahnqVar, long j) {
        float f = ahnqVar.b / 4095.0f;
        ahlhVar.f = f;
        float f2 = ahnqVar.c / 4095.0f;
        ahlhVar.g = f2;
        ahlhVar.h = ahnqVar.d;
        int i = ahnqVar.g;
        if (i <= 0) {
            i = ahnqVar.f;
        }
        float f3 = i * 0.1f;
        ahlhVar.d = f3;
        float f4 = ahlhVar.e;
        StringBuilder sb = new StringBuilder(129);
        sb.append("Knee = ");
        sb.append((int) (f * f3));
        sb.append("x");
        sb.append((int) (f2 * f4));
        sb.append(", MaxDisplayLuma = ");
        sb.append(f4);
        sb.append(", MaxSceneLuma = ");
        sb.append(f3);
        sb.append(", Time = ");
        double d = j;
        Double.isNaN(d);
        sb.append(d / 1000000.0d);
        float l = ahkt.l(ahlhVar.d);
        ahlhVar.d = l;
        if (ahlhVar.f >= 1.0f || l < ahlhVar.e) {
            ahlhVar.h = 0;
            return;
        }
        float[] fArr = ahlhVar.i;
        if (fArr == null || fArr.length < ahlhVar.h) {
            ahlhVar.i = new float[ahlhVar.h];
        }
        float f5 = 1.0f - ahlhVar.g;
        String str = "";
        for (int i2 = 0; i2 < ahlhVar.h; i2++) {
            ahlhVar.i[i2] = ahlhVar.g + ((ahnqVar.e[i2] / 1023.0f) * f5);
            String valueOf = String.valueOf(str);
            float f6 = ahlhVar.i[i2];
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb2.append(valueOf);
            sb2.append(f6);
            sb2.append(",");
            str = sb2.toString();
        }
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() != 0) {
            "Bezier =".concat(valueOf2);
        }
    }

    private final void g(ByteBuffer byteBuffer, int i, int i2) {
        a(i, i2);
        GLES20.glPixelStorei(3317, 1);
        GLES20.glTexImage2D(3553, 0, 6410, 1, byteBuffer.capacity() / 2, 0, 6410, 5121, byteBuffer);
        Boolean bool = ahkt.a;
    }

    public final void a(int i, int i2) {
        GLES20.glActiveTexture(33988 + i);
        GLES20.glBindTexture(3553, this.l[i]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glUniform1i(i2, i + 4);
        Boolean bool = ahkt.a;
    }

    public final void b(boolean z, byte[] bArr, long j, long j2) {
        long j3;
        if (this.f <= j) {
            if (z) {
                z = true;
            }
            j3 = this.i;
            if (j3 != -1 && Math.abs(j3 - j2) > 100000) {
                this.j = this.i - j2;
            }
            this.v.add(bArr);
            this.w.add(Long.valueOf(j));
            this.f = j;
        }
        this.v.clear();
        this.w.clear();
        this.u.a = false;
        if (z) {
            this.k = true;
            this.e = 0;
            this.i = -1L;
            this.j = 0L;
            return;
        }
        j3 = this.i;
        if (j3 != -1) {
            this.j = this.i - j2;
        }
        this.v.add(bArr);
        this.w.add(Long.valueOf(j));
        this.f = j;
    }

    public final void c(ahky ahkyVar) {
        ByteBuffer e = ahkyVar.e();
        if (e != null && e.hasRemaining()) {
            int remaining = e.remaining();
            byte[] bArr = new byte[remaining + 1];
            bArr[0] = 0;
            e.get(bArr, 1, remaining);
            b(false, bArr, ahkyVar.c(), ahkyVar.c());
        }
        long c = ahkyVar.c() - this.j;
        if (!this.w.isEmpty() && this.g != c) {
            this.g = c;
            long j = 0;
            byte[] bArr2 = null;
            while (!this.w.isEmpty() && c >= ((Long) this.w.getFirst()).longValue()) {
                j = ((Long) this.w.removeFirst()).longValue();
                bArr2 = (byte[]) this.v.removeFirst();
            }
            if (bArr2 != null && !Arrays.equals(bArr2, this.h)) {
                this.h = bArr2;
                ahnq ahnqVar = this.u;
                ahnqVar.a = false;
                try {
                    pgw pgwVar = new pgw(bArr2);
                    pgwVar.e(8);
                    int a = pgwVar.a(8);
                    int a2 = pgwVar.a(16);
                    int a3 = pgwVar.a(16);
                    if (a == 181 && a2 == 60 && a3 == 1) {
                        pgwVar.e(16);
                        if (pgwVar.a(2) <= 1) {
                            pgwVar.a(27);
                            if (pgwVar.a(1) <= 0) {
                                ahnqVar.f = 0;
                                for (int i = 0; i < 3; i++) {
                                    ahnqVar.f = Math.max(pgwVar.a(17), ahnqVar.f);
                                }
                                pgwVar.e(17);
                                ahnqVar.g = 0;
                                int a4 = pgwVar.a(4);
                                while (true) {
                                    int i2 = a4 - 1;
                                    if (a4 <= 0) {
                                        break;
                                    }
                                    int a5 = pgwVar.a(7);
                                    int a6 = pgwVar.a(17);
                                    if (a5 >= 75) {
                                        ahnqVar.g = Math.max(ahnqVar.g, a6);
                                    }
                                    a4 = i2;
                                }
                                pgwVar.a(10);
                                if (pgwVar.a(1) <= 0) {
                                    if (pgwVar.a(1) > 0) {
                                        ahnqVar.b = pgwVar.a(12);
                                        ahnqVar.c = pgwVar.a(12);
                                        ahnqVar.d = pgwVar.a(4);
                                        for (int i3 = 0; i3 < ahnqVar.d; i3++) {
                                            ahnqVar.e[i3] = pgwVar.a(10);
                                        }
                                    }
                                    if (pgwVar.a(1) > 0) {
                                        pgwVar.a(6);
                                    }
                                    ahnqVar.a = true;
                                    if (this.e == 0) {
                                        e(null);
                                    } else {
                                        f(this.t, this.u, j);
                                        try {
                                            this.s.a(this.t);
                                            g(ByteBuffer.wrap(this.s.b()), 2, this.c);
                                            Boolean bool = ahkt.a;
                                        } catch (Exception e2) {
                                            String.valueOf(String.valueOf(e2)).length();
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        Boolean bool2 = ahkt.a;
    }

    public final void d(ahky ahkyVar, int i, ahlp ahlpVar, boolean z) {
        if (z || this.k) {
            this.e = 0;
            if (i == 3 || (ahlpVar != null && ahlpVar.c() != null)) {
                e(ahlpVar);
            }
            GLES20.glUniform1f(this.d, this.e);
            this.k = false;
        }
        c(ahkyVar);
    }

    public final void e(ahlp ahlpVar) {
        final double d;
        if (this.s == null) {
            this.s = new ahlj();
            this.t = new ahlh();
        }
        ahlh ahlhVar = this.t;
        ahlhVar.j = 1;
        ahlhVar.e = 500.0f;
        ahlhVar.b = 6;
        ahlhVar.c = 1000.0f;
        ahlhVar.d = 0.0f;
        ahlhVar.l = 2;
        ahlhVar.k = 3;
        ahlhVar.f = 0.75f;
        ahlhVar.g = 0.75f;
        ahlhVar.h = 0;
        ahlhVar.e = this.m;
        if (ahlpVar != null) {
            if (ahlpVar.a() != -1) {
                this.t.b = ahlpVar.a();
            }
            if (ahlpVar.b() != -1) {
                ahlh ahlhVar2 = this.t;
                int b = ahlpVar.b();
                ahlhVar2.j = b == 6 ? 1 : b == 7 ? 2 : 3;
            }
            if (ahlpVar.c() != null) {
                ByteBuffer order = ByteBuffer.wrap(ahlpVar.c(), 17, 8).order(ByteOrder.LITTLE_ENDIAN);
                short s = order.getShort();
                order.getShort();
                short s2 = order.getShort();
                this.t.c = s2 > 0 ? s2 : s;
            }
        } else {
            ahlhVar.j = this.p;
        }
        ahlh ahlhVar3 = this.t;
        ahlhVar3.l = this.n;
        ahlhVar3.k = this.o;
        ahnq ahnqVar = this.u;
        if (ahnqVar.a) {
            f(ahlhVar3, ahnqVar, 0L);
        }
        int i = this.t.b;
        String o = adyu.o(this.n);
        String b2 = adyu.b(this.t.j);
        String b3 = adyu.b(this.o);
        ahlh ahlhVar4 = this.t;
        float f = ahlhVar4.d;
        float f2 = ahlhVar4.c;
        StringBuilder sb = new StringBuilder(o.length() + 143 + b2.length() + b3.length());
        sb.append("Video Primaries = ");
        sb.append(i);
        sb.append(", Display Primaries = ");
        sb.append(o);
        sb.append(", Video Transfer = ");
        sb.append(b2);
        sb.append(", Display Transfer = ");
        sb.append(b3);
        sb.append(", MaxSCL = ");
        sb.append(f);
        sb.append(", MaxCLL = ");
        sb.append(f2);
        try {
            final ahlj ahljVar = this.s;
            ahlh ahlhVar5 = this.t;
            if (Build.VERSION.SDK_INT < 24) {
                return;
            }
            int i2 = ahlhVar5.j;
            if (i2 == 1) {
                ahljVar.a = new ahlc(2);
            } else if (i2 != 2) {
                return;
            } else {
                ahljVar.a = new ahlc(0);
            }
            int i3 = ahlhVar5.k;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 0) {
                ahljVar.b = new ahlc(2);
            } else if (i4 != 2) {
                return;
            } else {
                ahljVar.b = new ahlc(1);
            }
            int i5 = ahlhVar5.b;
            if (i5 == 6) {
                ahljVar.c = new ahlb(ahlb.a);
            } else if (i5 != 1) {
                return;
            } else {
                ahljVar.c = new ahlb(ahlb.b);
            }
            ahljVar.f = ahljVar.c.d;
            int i6 = ahlhVar5.l;
            int i7 = i6 - 1;
            if (i6 != 0) {
                if (i7 == 0) {
                    ahljVar.d = new ahlb(ahlb.a);
                } else if (i7 == 1) {
                    ahljVar.d = new ahlb(ahlb.c);
                } else if (i7 == 2) {
                    ahljVar.d = new ahlb(ahlb.b);
                }
                ahljVar.g = ahljVar.d.e;
                ahljVar.h = new axfg(null);
                axfg.e(ahljVar.g, ahljVar.f, ahljVar.h);
                ahljVar.e = new Range(Double.valueOf(0.0d), Double.valueOf(10000.0d));
                int i8 = ahlhVar5.a;
                ahljVar.i = new anrc(256, new ahli() { // from class: ahle
                    @Override // defpackage.ahli
                    public final double a(int i9, double d2) {
                        ahlj ahljVar2 = ahlj.this;
                        Range range = ahljVar2.e;
                        ahld ahldVar = ahljVar2.a;
                        double d3 = i9;
                        Double.isNaN(d3);
                        return ((Double) range.clamp(Double.valueOf(ahldVar.c(d3 / d2) * ahljVar2.a.b()))).doubleValue() / 10000.0d;
                    }
                });
                if (ahljVar.b.d()) {
                    double d2 = ahlhVar5.e;
                    double b4 = ahljVar.b.b();
                    Double.isNaN(d2);
                    d = d2 / b4;
                } else {
                    d = 1.0d;
                }
                int i9 = ahlhVar5.a;
                ahljVar.j = new anrc(1024, new ahli() { // from class: ahlf
                    @Override // defpackage.ahli
                    public final double a(int i10, double d3) {
                        ahlj ahljVar2 = ahlj.this;
                        double d4 = d;
                        ahld ahldVar = ahljVar2.b;
                        double d5 = i10;
                        Double.isNaN(d5);
                        return Math.min(1.0d, ahldVar.a((d5 / d3) * d4));
                    }
                });
                ahljVar.a(ahlhVar5);
                ByteBuffer wrap = ByteBuffer.wrap(this.s.i.a);
                ByteBuffer wrap2 = ByteBuffer.wrap(this.s.j.a);
                ByteBuffer wrap3 = ByteBuffer.wrap(this.s.b());
                ahlj ahljVar2 = this.s;
                float[] fArr = ahljVar2.h.a;
                float[] fArr2 = ahljVar2.f.a;
                int capacity = wrap.capacity() / 2;
                this.e = capacity;
                GLES20.glUniform1f(this.d, capacity);
                g(wrap, 0, this.a);
                g(wrap3, 2, this.c);
                g(wrap2, 1, this.b);
                GLES20.glUniformMatrix3fv(this.q, 1, true, fArr, 0);
                GLES20.glUniform3fv(this.r, 1, fArr2, 3);
                Boolean bool = ahkt.a;
                return;
            }
            throw null;
        } catch (Exception e) {
            String.valueOf(String.valueOf(e)).length();
        }
    }
}
