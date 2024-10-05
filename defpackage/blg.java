package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class blg {
    public final blh a = new blh();
    public final pth b = new pth(new byte[65025], 0);
    public int c = -1;
    public boolean d;
    private int e;

    private final int b(int i) {
        int i2;
        int i3 = 0;
        this.e = 0;
        do {
            int i4 = this.e;
            int i5 = i + i4;
            blh blhVar = this.a;
            if (i5 >= blhVar.c) {
                break;
            }
            int[] iArr = blhVar.f;
            this.e = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean a(bii biiVar) {
        pse.g(true);
        if (this.d) {
            this.d = false;
            this.b.C(0);
        }
        while (!this.d) {
            int i = this.c;
            if (i < 0) {
                if (!this.a.c(biiVar) || !this.a.b(biiVar, true)) {
                    return false;
                }
                blh blhVar = this.a;
                int i2 = blhVar.d;
                if ((blhVar.a & 1) == 1 && this.b.c == 0) {
                    i2 += b(0);
                    i = this.e;
                } else {
                    i = 0;
                }
                if (!bfa.e(biiVar, i2)) {
                    return false;
                }
                this.c = i;
            }
            int b = b(i);
            int i3 = this.c + this.e;
            if (b > 0) {
                pth pthVar = this.b;
                pthVar.z(pthVar.c + b);
                pth pthVar2 = this.b;
                if (!bfa.d(biiVar, pthVar2.a, pthVar2.c, b)) {
                    return false;
                }
                pth pthVar3 = this.b;
                pthVar3.F(pthVar3.c + b);
                this.d = this.a.f[i3 + (-1)] != 255;
            }
            if (i3 == this.a.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }
}
