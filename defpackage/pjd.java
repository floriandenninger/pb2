package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pjd {
    public final pth a = new pth(8);
    public int b;

    public final long a(bii biiVar) {
        int i = 0;
        biiVar.j(this.a.a, 0, 1);
        int i2 = this.a.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (i3 ^ (-1));
        biiVar.j(this.a.a, 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.a.a[i] & 255) + (i5 << 8);
        }
        this.b += i4 + 1;
        return i5;
    }
}
