package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axly {
    final int a;
    int b;
    private final ByteBuffer c;

    public axly(ByteBuffer byteBuffer, byte[] bArr) {
        this.c = byteBuffer;
        this.a = byteBuffer.position();
    }

    public final void a(int i, int i2) {
        int i3 = this.b;
        int i4 = 8 - (i3 % 8);
        if (i2 <= i4) {
            int i5 = this.c.get(this.a + (i3 / 8));
            if (i5 < 0) {
                i5 += 256;
            }
            int i6 = i5 + (i << (i4 - i2));
            ByteBuffer byteBuffer = this.c;
            int i7 = this.a + (this.b / 8);
            if (i6 > 127) {
                i6 -= 256;
            }
            byteBuffer.put(i7, (byte) i6);
            this.b += i2;
        } else {
            int i8 = i2 - i4;
            a(i >> i8, i4);
            a(i & ((1 << i8) - 1), i8);
        }
        ByteBuffer byteBuffer2 = this.c;
        int i9 = this.a;
        int i10 = this.b;
        byteBuffer2.position(i9 + (i10 / 8) + (i10 % 8 <= 0 ? 0 : 1));
    }

    public final int b(int i) {
        int b;
        int i2 = this.c.get(this.a + (this.b / 8));
        if (i2 < 0) {
            i2 += 256;
        }
        int i3 = this.b;
        int i4 = i3 % 8;
        int i5 = 8 - i4;
        if (i <= i5) {
            b = ((i2 << i4) & PrivateKeyType.INVALID) >> (i4 + (i5 - i));
            this.b = i3 + i;
        } else {
            int i6 = i - i5;
            b = (b(i5) << i6) + b(i6);
        }
        ByteBuffer byteBuffer = this.c;
        int i7 = this.a;
        double d = this.b;
        Double.isNaN(d);
        byteBuffer.position(i7 + ((int) Math.ceil(d / 8.0d)));
        return b;
    }

    public final int c() {
        return (this.c.limit() * 8) - this.b;
    }

    public axly(ByteBuffer byteBuffer) {
        this.b = 0;
        this.c = byteBuffer;
        this.a = byteBuffer.position();
    }
}
