package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anbg extends anaf {
    public int a;
    public long b;
    public int c = 0;
    public boolean d = false;
    private int e;

    public anbg(int i) {
        this.a = i;
    }

    public final void cp(int i, long j) {
        long j2 = this.b;
        int i2 = this.e;
        this.b = ((j & 4294967295L) << i2) | j2;
        int i3 = i2 + (i * 8);
        this.e = i3;
        this.c += i;
        if (i3 >= 32) {
            this.a = (Integer.rotateLeft(anbh.cp((int) r7) ^ this.a, 13) * 5) - 430675100;
            this.b >>>= 32;
            this.e -= 32;
        }
    }

    @Override // defpackage.anaf
    public final void k(int i) {
        cp(4, i);
    }
}
