package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfx extends axks {
    public long a;
    public long b;
    public long c;
    public long d;
    public dft e;
    private long f;
    private boolean g;
    private boolean s;

    public dfx() {
        super("tfhd");
        this.b = -1L;
        this.c = -1L;
        this.d = -1L;
    }

    @Override // defpackage.axkq
    protected final long h() {
        int r = r();
        long j = 1 != (r & 1) ? 8L : 16L;
        if ((r & 2) == 2) {
            j += 4;
        }
        if ((r & 8) == 8) {
            j += 4;
        }
        if ((r & 16) == 16) {
            j += 4;
        }
        return (r & 32) == 32 ? j + 4 : j;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.a = did.ak(byteBuffer);
        if ((r() & 1) == 1) {
            this.b = did.al(byteBuffer);
        }
        if ((r() & 2) == 2) {
            this.f = did.ak(byteBuffer);
        }
        if ((r() & 8) == 8) {
            this.c = did.ak(byteBuffer);
        }
        if ((r() & 16) == 16) {
            this.d = did.ak(byteBuffer);
        }
        if ((r() & 32) == 32) {
            this.e = new dft(byteBuffer);
        }
        if ((r() & 65536) == 65536) {
            this.g = true;
        }
        if ((r() & 131072) == 131072) {
            this.s = true;
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        did.aa(byteBuffer, this.a);
        if ((r() & 1) == 1) {
            byteBuffer.putLong(this.b);
        }
        if ((r() & 2) == 2) {
            did.aa(byteBuffer, this.f);
        }
        if ((r() & 8) == 8) {
            did.aa(byteBuffer, this.c);
        }
        if ((r() & 16) == 16) {
            did.aa(byteBuffer, this.d);
        }
        if ((r() & 32) == 32) {
            this.e.a(byteBuffer);
        }
    }

    public final String toString() {
        return "TrackFragmentHeaderBox{trackId=" + this.a + ", baseDataOffset=" + this.b + ", sampleDescriptionIndex=" + this.f + ", defaultSampleDuration=" + this.c + ", defaultSampleSize=" + this.d + ", defaultSampleFlags=" + this.e + ", durationIsEmpty=" + this.g + ", defaultBaseIsMoof=" + this.s + '}';
    }
}
