package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afjb extends afiz {
    private final byte[] a;
    private int b;
    private int c;

    public afjb(ate ateVar, int i) {
        super(ateVar);
        this.a = new byte[i];
    }

    @Override // defpackage.afiz, defpackage.atc
    public int g(byte[] bArr, int i, int i2) {
        int i3 = 0;
        pse.g(this.c <= this.b);
        int i4 = this.c;
        int i5 = this.b;
        if (i4 == i5) {
            byte[] bArr2 = this.a;
            int length = bArr2.length;
            if (i2 >= length) {
                return super.g(bArr, i, i2);
            }
            i5 = super.g(bArr2, 0, length);
            this.b = i5;
            if (i5 < 0) {
                return -1;
            }
            this.c = 0;
        } else {
            i3 = i4;
        }
        int min = Math.min(i2, i5 - i3);
        System.arraycopy(this.a, this.c, bArr, i, min);
        this.c += min;
        return min;
    }

    @Override // defpackage.afiz, defpackage.ate
    public long h(ath athVar) {
        this.b = 0;
        this.c = 0;
        return super.h(athVar);
    }
}
