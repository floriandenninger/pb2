package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bri {
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private boolean f;
    private int g;
    private int h;
    private float[] i;

    public bri(int i, int i2) {
        this.c = Color.red(i);
        this.d = Color.green(i);
        this.e = Color.blue(i);
        this.a = i;
        this.b = i2;
    }

    private final void d() {
        int f;
        int f2;
        if (this.f) {
            return;
        }
        int d = fm.d(-1, this.a, 4.5f);
        int d2 = fm.d(-1, this.a, 3.0f);
        if (d == -1 || d2 == -1) {
            int d3 = fm.d(-16777216, this.a, 4.5f);
            int d4 = fm.d(-16777216, this.a, 3.0f);
            if (d3 == -1 || d4 == -1) {
                if (d != -1) {
                    f = fm.f(-1, d);
                } else {
                    f = fm.f(-16777216, d3);
                }
                this.h = f;
                if (d2 != -1) {
                    f2 = fm.f(-1, d2);
                } else {
                    f2 = fm.f(-16777216, d4);
                }
                this.g = f2;
                this.f = true;
                return;
            }
            this.h = fm.f(-16777216, d3);
            this.g = fm.f(-16777216, d4);
            this.f = true;
            return;
        }
        this.h = fm.f(-1, d);
        this.g = fm.f(-1, d2);
        this.f = true;
    }

    public final int a() {
        d();
        return this.h;
    }

    public final int b() {
        d();
        return this.g;
    }

    public final float[] c() {
        if (this.i == null) {
            this.i = new float[3];
        }
        fm.g(this.c, this.d, this.e, this.i);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bri briVar = (bri) obj;
            if (this.b == briVar.b && this.a == briVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return getClass().getSimpleName() + " [RGB: #" + Integer.toHexString(this.a) + "] [HSL: " + Arrays.toString(c()) + "] [Population: " + this.b + "] [Title Text: #" + Integer.toHexString(b()) + "] [Body Text: #" + Integer.toHexString(a()) + ']';
    }
}
