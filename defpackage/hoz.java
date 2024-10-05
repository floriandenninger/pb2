package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hoz {
    public int a;
    public int b;
    public int c;
    public int d;
    public float e;

    public static final int d(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    public final int a() {
        return this.c - this.d;
    }

    public final int b() {
        float f = this.e;
        return (f == 0.0f || f >= 1.0f) ? this.a : Math.round(this.a / f);
    }

    public final boolean c() {
        return a() >= this.a;
    }
}
