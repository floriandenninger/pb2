package defpackage;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahir {
    public long A;
    public long B;
    public final float[] C = new float[5];
    public final float[] D = new float[5];
    public int E;
    private final Vibrator F;
    private final boolean G;
    private long H;
    private int I;
    public final amob a;
    public boolean b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public final float g;
    public final float h;
    public final float i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public long o;
    public final VibrationEffect p;
    public final VibrationEffect q;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public ahir(amob amobVar, Vibrator vibrator, boolean z) {
        boolean z2 = false;
        if (z && Build.VERSION.SDK_INT >= 26) {
            z2 = true;
        }
        this.G = z2;
        this.a = amobVar;
        this.F = vibrator;
        if (Build.VERSION.SDK_INT >= 26) {
            this.p = VibrationEffect.createOneShot(10L, 32);
            this.q = VibrationEffect.createOneShot(10L, 96);
        } else {
            this.p = null;
            this.q = null;
        }
        this.g = Math.max(0.2094395f, 0.0872665f) + 1.74533f;
        this.h = 1.74533f - Math.max(0.2094395f, 0.0872665f);
        this.i = 0.8726665f;
        d();
    }

    public final float a() {
        if (!this.b || Math.abs(this.e - 1.74533f) >= 0.2094395f) {
            return this.e;
        }
        return 1.74533f;
    }

    public final void b(float f) {
        float f2 = this.v;
        float f3 = this.t + f2;
        if (f3 > f) {
            this.t = f - f2;
            if (this.y > 0.0f) {
                this.y = 0.0f;
                return;
            }
            return;
        }
        float f4 = -f;
        if (f3 < f4) {
            this.t = f4 - f2;
            if (this.y < 0.0f) {
                this.y = 0.0f;
            }
        }
    }

    public final void c() {
        this.f = this.e;
        this.c = true;
        this.d = true;
        this.k = false;
        this.b = false;
        this.z = 0.0f;
        this.y = 0.0f;
        this.n = 0;
    }

    public final void d() {
        this.k = false;
        this.c = false;
        this.d = false;
        this.t = 0.0f;
        this.v = 0.0f;
        this.u = 0.0f;
        this.w = 0.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
        this.e = 1.74533f;
        this.f = 1.74533f;
        this.r = false;
        this.b = false;
        this.n = 0;
        this.j = false;
    }

    public final void e(int i, int i2, int i3, int i4) {
        long a = this.a.a();
        float a2 = a();
        float f = ((float) (a - this.H)) * 1.0E-9f;
        float f2 = i3;
        double tan = Math.tan(a2 / 2.0f);
        double d = i4;
        Double.isNaN(d);
        double d2 = tan * d;
        double d3 = f2;
        Double.isNaN(d3);
        float atan = (float) Math.atan(d2 / d3);
        int i5 = this.m;
        double d4 = ((i - this.l) * (-a2)) / f2;
        double d5 = ((i2 - i5) * (-(atan + atan))) / i4;
        double cos = Math.cos(this.x);
        Double.isNaN(d4);
        double sin = Math.sin(this.x);
        Double.isNaN(d5);
        float f3 = (float) ((cos * d4) - (sin * d5));
        double sin2 = Math.sin(this.x);
        Double.isNaN(d4);
        double d6 = d4 * sin2;
        double cos2 = Math.cos(this.x);
        Double.isNaN(d5);
        float f4 = (float) (d6 + (d5 * cos2));
        this.t += f4;
        this.u += f3;
        if (f > 0.0f) {
            float al = anaf.al(f4 / f, -18.84956f, 18.84956f);
            float al2 = anaf.al(f3 / f, -18.84956f, 18.84956f);
            float[] fArr = this.C;
            int i6 = this.I;
            fArr[i6] = al;
            this.D[i6] = al2;
            int i7 = i6 + 1;
            if (i7 >= 5) {
                i7 = 0;
            }
            this.I = i7;
            this.E = Math.min(this.E + 1, 5);
        }
        this.n += Math.abs(this.l - i) + Math.abs(this.m - i2);
        this.l = i;
        this.m = i2;
        this.H = a;
    }

    public final void f(VibrationEffect vibrationEffect) {
        if (this.G && this.r && vibrationEffect != null) {
            this.F.vibrate(vibrationEffect);
            this.r = false;
        }
    }

    public final void g(int i, int i2) {
        this.k = true;
        this.H = this.a.a();
        this.l = i;
        this.m = i2;
        this.z = 0.0f;
        this.y = 0.0f;
        Arrays.fill(this.C, 0.0f);
        Arrays.fill(this.D, 0.0f);
        this.I = 0;
        this.E = 0;
        this.n = 0;
    }
}
