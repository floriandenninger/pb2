package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axng extends axks {
    public long[] a;
    private String b;
    private String c;

    public axng() {
        super("saio");
        this.a = new long[0];
    }

    @Override // defpackage.axkq
    protected final long h() {
        return (s() == 0 ? this.a.length * 4 : this.a.length * 8) + 8 + (1 != (r() & 1) ? 0 : 8);
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if ((r() & 1) == 1) {
            this.b = did.am(byteBuffer);
            this.c = did.am(byteBuffer);
        }
        int g = awxt.g(did.ak(byteBuffer));
        this.a = new long[g];
        for (int i = 0; i < g; i++) {
            if (s() == 0) {
                this.a[i] = did.ak(byteBuffer);
            } else {
                this.a[i] = did.al(byteBuffer);
            }
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if ((r() & 1) == 1) {
            byteBuffer.put(ddz.b(this.b));
            byteBuffer.put(ddz.b(this.c));
        }
        did.aa(byteBuffer, this.a.length);
        for (long j : this.a) {
            Long valueOf = Long.valueOf(j);
            if (s() == 0) {
                did.aa(byteBuffer, valueOf.longValue());
            } else {
                byteBuffer.putLong(valueOf.longValue());
            }
        }
    }
}
