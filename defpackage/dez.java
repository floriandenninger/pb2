package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dez extends axks {
    public long[] a;
    int b;
    private long c;

    public dez() {
        super("stsz");
        this.a = new long[0];
    }

    @Override // defpackage.axkq
    protected final long h() {
        return (this.c == 0 ? this.a.length * 4 : 0) + 12;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.c = did.ak(byteBuffer);
        int g = awxt.g(did.ak(byteBuffer));
        this.b = g;
        if (this.c == 0) {
            this.a = new long[g];
            for (int i = 0; i < this.b; i++) {
                this.a[i] = did.ak(byteBuffer);
            }
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        did.aa(byteBuffer, this.c);
        if (this.c == 0) {
            did.aa(byteBuffer, this.a.length);
            for (long j : this.a) {
                did.aa(byteBuffer, j);
            }
            return;
        }
        did.aa(byteBuffer, this.b);
    }

    public final long k() {
        return this.c > 0 ? this.b : this.a.length;
    }

    public final long l(int i) {
        long j = this.c;
        return j > 0 ? j : this.a[i];
    }

    public final String toString() {
        long j = this.c;
        long k = k();
        StringBuilder sb = new StringBuilder(79);
        sb.append("SampleSizeBox[sampleSize=");
        sb.append(j);
        sb.append(";sampleCount=");
        sb.append(k);
        sb.append("]");
        return sb.toString();
    }
}
