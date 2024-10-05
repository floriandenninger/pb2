package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aff implements Comparable {
    public static int a = 1;
    public boolean b;
    public float f;
    int n;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public boolean g = false;
    final float[] h = new float[9];
    final float[] i = new float[9];
    aez[] j = new aez[16];
    int k = 0;
    public int l = 0;
    boolean m = false;

    public aff(int i) {
        this.n = i;
    }

    public final void a(aez aezVar) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            if (i >= i2) {
                aez[] aezVarArr = this.j;
                int length = aezVarArr.length;
                if (i2 >= length) {
                    this.j = (aez[]) Arrays.copyOf(aezVarArr, length + length);
                }
                aez[] aezVarArr2 = this.j;
                int i3 = this.k;
                aezVarArr2[i3] = aezVar;
                this.k = i3 + 1;
                return;
            }
            if (this.j[i] == aezVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(aez aezVar) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == aezVar) {
                while (i2 < i - 1) {
                    aez[] aezVarArr = this.j;
                    int i3 = i2 + 1;
                    aezVarArr[i2] = aezVarArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.n = 5;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.m = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.b = false;
        Arrays.fill(this.i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c - ((aff) obj).c;
    }

    public final void d(afb afbVar, float f) {
        this.f = f;
        this.g = true;
        this.m = false;
        int i = this.k;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].c(afbVar, this, false);
        }
        this.k = 0;
    }

    public final void e(afb afbVar, aez aezVar) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].d(afbVar, aezVar, false);
        }
        this.k = 0;
    }

    public final String toString() {
        int i = this.c;
        StringBuilder sb = new StringBuilder(11);
        sb.append("");
        sb.append(i);
        return sb.toString();
    }
}
