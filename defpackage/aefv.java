package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aefv {
    private final aefu a;
    private int b = 0;
    private int c = 0;
    private final byte[] d = new byte[5];
    private int e = 0;
    private int f = 1;

    public aefv(aefu aefuVar) {
        this.a = aefuVar;
    }

    private final Integer c(ByteBuffer byteBuffer) {
        int a;
        if (this.e == 0 && byteBuffer.remaining() == 0) {
            return null;
        }
        if (this.e == 0) {
            a = aedn.a(byteBuffer.get(byteBuffer.position()));
        } else {
            a = aedn.a(this.d[0]) - this.e;
        }
        if (a <= 0) {
            throw new aefs(6, "Data present but parser claims unnecessary");
        }
        if (byteBuffer.remaining() >= a) {
            byteBuffer.get(this.d, this.e, a);
            this.e = 0;
            return aedn.b(ByteBuffer.wrap(this.d));
        }
        int remaining = byteBuffer.remaining();
        byteBuffer.get(this.d, this.e, byteBuffer.remaining());
        this.e += remaining;
        return null;
    }

    public final void a(ByteBuffer byteBuffer) {
        while (byteBuffer.remaining() > 0) {
            int i = this.f;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                Integer c = c(byteBuffer);
                if (c == null) {
                    return;
                }
                this.b = c.intValue();
                this.f = 2;
            } else if (i2 == 1) {
                Integer c2 = c(byteBuffer);
                if (c2 == null) {
                    return;
                }
                int intValue = c2.intValue();
                this.c = intValue;
                this.f = 3;
                if (intValue == 0) {
                    this.a.a(this.b, 0, ByteBuffer.allocate(0));
                    this.f = 1;
                }
            } else if (i2 != 2) {
                continue;
            } else if (this.c <= byteBuffer.remaining()) {
                ByteBuffer slice = byteBuffer.slice();
                this.a.a(this.b, 0, slice);
                this.c = 0;
                this.f = 1;
            } else {
                int remaining = this.c - byteBuffer.remaining();
                this.c = remaining;
                this.a.a(this.b, remaining, byteBuffer.slice());
                return;
            }
        }
    }

    public final boolean b() {
        return this.f == 1;
    }
}
