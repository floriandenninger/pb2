package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dep extends dea {
    private int a;
    private int b;
    private long c;
    private long d;

    public dep() {
        super("hmhd");
    }

    @Override // defpackage.axkq
    protected final long h() {
        return 20L;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.a = did.ah(byteBuffer);
        this.b = did.ah(byteBuffer);
        this.c = did.ak(byteBuffer);
        this.d = did.ak(byteBuffer);
        did.ak(byteBuffer);
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        did.Y(byteBuffer, this.a);
        did.Y(byteBuffer, this.b);
        did.aa(byteBuffer, this.c);
        did.aa(byteBuffer, this.d);
        did.aa(byteBuffer, 0L);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        long j = this.c;
        long j2 = this.d;
        StringBuilder sb = new StringBuilder(132);
        sb.append("HintMediaHeaderBox{maxPduSize=");
        sb.append(i);
        sb.append(", avgPduSize=");
        sb.append(i2);
        sb.append(", maxBitrate=");
        sb.append(j);
        sb.append(", avgBitrate=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
