package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axlt extends axkq {
    public int a;
    public int b;

    public axlt() {
        super("pasp");
    }

    @Override // defpackage.axkq
    protected final long h() {
        return 8L;
    }

    @Override // defpackage.axkq
    protected final void i(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
    }
}
