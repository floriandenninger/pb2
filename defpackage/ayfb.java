package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayfb {
    public final ByteBuffer a;

    public ayfb(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    public final int a() {
        return this.a.position();
    }

    public final int b() {
        return this.a.remaining();
    }

    public final void c(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }
}
