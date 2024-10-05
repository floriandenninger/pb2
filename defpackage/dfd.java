package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfd extends dea {
    private float a;

    public dfd() {
        super("smhd");
    }

    @Override // defpackage.axkq
    protected final long h() {
        return 8L;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.a = did.af(byteBuffer);
        did.ah(byteBuffer);
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        did.X(byteBuffer, this.a);
        did.Y(byteBuffer, 0);
    }

    public final String toString() {
        float f = this.a;
        StringBuilder sb = new StringBuilder(44);
        sb.append("SoundMediaHeaderBox[balance=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
