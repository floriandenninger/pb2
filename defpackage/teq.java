package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class teq {
    public int a = 0;
    public int b = 0;
    private int c = 0;
    private boolean d;

    private final void b(int i, boolean z) {
        int c;
        if ((this.b & c(i)) == 0 || z) {
            if ((this.b & c(i)) == 0 && z) {
                c = this.a | c(i);
            }
            this.b = c(i) | this.b;
        }
        c = this.a & (c(i) ^ (-1));
        this.a = c;
        this.b = c(i) | this.b;
    }

    private static final int c(int i) {
        return 1 << i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, boolean z) {
        int i2 = this.c;
        int i3 = (i2 + i) / 1000;
        if (i3 >= 32) {
            return;
        }
        b(i3, z);
        for (int i4 = i2 / 1000; i4 < i3; i4++) {
            b(i4, this.d);
        }
        this.c += i;
        this.d = z;
    }
}
