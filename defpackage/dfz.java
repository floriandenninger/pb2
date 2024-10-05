package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfz extends axks {
    public int a;
    public dft b;
    public final List c;

    public dfz() {
        super("trun");
        this.c = new ArrayList();
    }

    @Override // defpackage.axkq
    protected final long h() {
        int r = r();
        long j = 1 != (r & 1) ? 8L : 12L;
        if ((r & 4) == 4) {
            j += 4;
        }
        long j2 = (r & 256) == 256 ? 4L : 0L;
        if ((r & 512) == 512) {
            j2 += 4;
        }
        if ((r & 1024) == 1024) {
            j2 += 4;
        }
        if ((r & 2048) == 2048) {
            j2 += 4;
        }
        return j + (j2 * this.c.size());
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        long ak = did.ak(byteBuffer);
        if ((r() & 1) == 1) {
            this.a = awxt.g(did.ak(byteBuffer));
        } else {
            this.a = -1;
        }
        if ((r() & 4) == 4) {
            this.b = new dft(byteBuffer);
        }
        for (int i = 0; i < ak; i++) {
            dfy dfyVar = new dfy();
            if ((r() & 256) == 256) {
                dfyVar.a = did.ak(byteBuffer);
            }
            if ((r() & 512) == 512) {
                dfyVar.b = did.ak(byteBuffer);
            }
            if ((r() & 1024) == 1024) {
                dfyVar.c = new dft(byteBuffer);
            }
            if ((r() & 2048) == 2048) {
                if (s() == 0) {
                    dfyVar.d = did.ak(byteBuffer);
                } else {
                    dfyVar.d = byteBuffer.getInt();
                }
            }
            this.c.add(dfyVar);
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        did.aa(byteBuffer, this.c.size());
        int r = r();
        if ((r & 1) == 1) {
            did.aa(byteBuffer, this.a);
        }
        if ((r & 4) == 4) {
            this.b.a(byteBuffer);
        }
        for (dfy dfyVar : this.c) {
            if ((r & 256) == 256) {
                did.aa(byteBuffer, dfyVar.a);
            }
            if ((r & 512) == 512) {
                did.aa(byteBuffer, dfyVar.b);
            }
            if ((r & 1024) == 1024) {
                dfyVar.c.a(byteBuffer);
            }
            if ((r & 2048) == 2048) {
                if (s() != 0) {
                    byteBuffer.putInt((int) dfyVar.d);
                } else {
                    did.aa(byteBuffer, dfyVar.d);
                }
            }
        }
    }

    public final long k() {
        return this.c.size();
    }

    public final boolean l() {
        return (r() & 1) == 1;
    }

    public final boolean m() {
        return (r() & 2048) == 2048;
    }

    public final boolean n() {
        return (r() & 256) == 256;
    }

    public final boolean o() {
        return (r() & 1024) == 1024;
    }

    public final boolean p() {
        return (r() & 512) == 512;
    }

    public final String toString() {
        return "TrackRunBox{sampleCount=" + this.c.size() + ", dataOffset=" + this.a + ", dataOffsetPresent=" + l() + ", sampleSizePresent=" + p() + ", sampleDurationPresent=" + n() + ", sampleFlagsPresentPresent=" + o() + ", sampleCompositionTimeOffsetPresent=" + m() + ", firstSampleFlags=" + this.b + '}';
    }
}
