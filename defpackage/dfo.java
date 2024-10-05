package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfo extends axkq {
    ByteBuffer a;

    public dfo(String str) {
        super(str);
    }

    @Override // defpackage.axkq
    protected final long h() {
        return this.a.limit();
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        this.a.rewind();
        byteBuffer.put(this.a);
    }

    public dfo() {
        super("sv3d");
    }
}
