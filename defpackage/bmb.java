package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bmb {
    public static final byte[] a = {0, 0, 1};
    public boolean b;
    public int c;
    public int d;
    public int e;
    public byte[] f = new byte[128];

    public final void a(byte[] bArr, int i, int i2) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f;
            int length = bArr2.length;
            int i4 = this.d + i3;
            if (length < i4) {
                this.f = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f, this.d, i3);
            this.d += i3;
        }
    }

    public final void b() {
        this.b = false;
        this.d = 0;
        this.c = 0;
    }
}
