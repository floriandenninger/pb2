package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class biv {
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public final boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!biw.d(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i2;
        this.b = biw.a[3 - i3];
        int i6 = biw.b[i5];
        this.d = i6;
        if (i2 == 2) {
            this.d = i6 / 2;
        } else if (i2 == 0) {
            this.d = i6 / 4;
        }
        int i7 = (i >>> 9) & 1;
        this.g = biw.b(i2, i3);
        if (i3 == 3) {
            int i8 = i2 == 3 ? biw.c[i4 - 1] : biw.d[i4 - 1];
            this.f = i8;
            this.c = (((i8 * 12) / this.d) + i7) * 4;
        } else {
            if (i2 == 3) {
                int i9 = i3 == 2 ? biw.e[i4 - 1] : biw.f[i4 - 1];
                this.f = i9;
                this.c = ((i9 * 144) / this.d) + i7;
            } else {
                int i10 = biw.g[i4 - 1];
                this.f = i10;
                this.c = (((i3 == 1 ? 72 : 144) * i10) / this.d) + i7;
            }
        }
        this.e = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
