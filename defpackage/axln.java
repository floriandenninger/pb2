package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axln {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public axln() {
    }

    public axln(byte[] bArr) {
        this.d = 0;
    }

    static final int f(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 2 : 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return (this.b == 0 ? 2 : 0) + 7;
    }

    public final void b(int i) {
        this.d = i | this.d;
    }

    public final void c() {
        this.d = 0;
    }

    public final void d(int i, int i2, int i3, int i4) {
        this.c = i;
        this.a = i2;
        this.b = i3;
        this.e = i4;
    }

    public final boolean e() {
        int i = this.d;
        if ((i & 7) != 0 && (i & f(this.b, this.c)) == 0) {
            return false;
        }
        int i2 = this.d;
        if ((i2 & 112) != 0 && (i2 & (f(this.b, this.a) << 4)) == 0) {
            return false;
        }
        int i3 = this.d;
        if ((i3 & 1792) != 0 && (i3 & (f(this.e, this.c) << 8)) == 0) {
            return false;
        }
        int i4 = this.d;
        return (i4 & 28672) == 0 || (i4 & (f(this.e, this.a) << 12)) != 0;
    }
}
