package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rxb {
    public int a;
    public int[] b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public boolean h;

    public rxb(int i) {
        this.a = 0;
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.b = new int[i];
        this.c = new int[i];
        this.d = new int[i];
        this.e = new int[i];
    }

    public rxb(rxc rxcVar) {
        this.a = 0;
        this.h = false;
        this.b = rxcVar.a;
        int i = rxcVar.b;
        this.f = i;
        this.g = i;
    }

    public final void a(int i, int i2, int i3) {
        sbt.c(!b(), "Attempt to add target after animation is complete.");
        int[] iArr = this.b;
        int i4 = this.f;
        iArr[i4] = i2;
        this.d[i4] = i;
        this.e[i4] = i3;
        this.h = (i != i2) | this.h;
        this.c[i4] = i;
        this.f = i4 + 1;
        if (i3 != 0) {
            this.g++;
        }
    }

    public final boolean b() {
        return this.c == null;
    }

    public final void c() {
        this.a = 0;
        if (b()) {
            return;
        }
        System.arraycopy(this.d, 0, this.c, 0, this.f);
    }
}
