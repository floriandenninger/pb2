package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pej {
    public boolean a;
    public int b;
    public int c;
    public byte[] d = new byte[128];

    public final void a(byte[] bArr, int i, int i2) {
        if (this.a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i4 = this.b + i3;
            if (length < i4) {
                this.d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.d, this.b, i3);
            this.b += i3;
        }
    }
}
