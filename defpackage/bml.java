package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bml {
    public boolean a;
    public byte[] b;
    public int c;
    private final int d;
    private boolean e;

    public bml(int i) {
        this.d = i;
        byte[] bArr = new byte[131];
        this.b = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.e) {
            int i3 = i2 - i;
            byte[] bArr2 = this.b;
            int length = bArr2.length;
            int i4 = this.c + i3;
            if (length < i4) {
                this.b = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.b, this.c, i3);
            this.c += i3;
        }
    }

    public final void b() {
        this.e = false;
        this.a = false;
    }

    public final void c(int i) {
        pse.g(!this.e);
        boolean z = i == this.d;
        this.e = z;
        if (z) {
            this.c = 3;
            this.a = false;
        }
    }

    public final boolean d(int i) {
        if (!this.e) {
            return false;
        }
        this.c -= i;
        this.e = false;
        this.a = true;
        return true;
    }
}
