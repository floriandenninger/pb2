package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfn extends axks {
    public long a;
    public int b;
    public int c;
    public float d;
    public axnb e;
    public double f;
    public double g;
    private Date s;
    private Date t;
    private long u;

    public dfn() {
        super("tkhd");
        this.e = axnb.a;
    }

    @Override // defpackage.axkq
    protected final long h() {
        return (s() == 1 ? 36L : 24L) + 60;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if (s() == 1) {
            this.s = awxt.f(did.al(byteBuffer));
            this.t = awxt.f(did.al(byteBuffer));
            this.a = did.ak(byteBuffer);
            did.ak(byteBuffer);
            long j = byteBuffer.getLong();
            this.u = j;
            if (j < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.s = awxt.f(did.ak(byteBuffer));
            this.t = awxt.f(did.ak(byteBuffer));
            this.a = did.ak(byteBuffer);
            did.ak(byteBuffer);
            this.u = did.ak(byteBuffer);
        }
        did.ak(byteBuffer);
        did.ak(byteBuffer);
        this.b = did.ah(byteBuffer);
        this.c = did.ah(byteBuffer);
        this.d = did.af(byteBuffer);
        did.ah(byteBuffer);
        this.e = axnb.a(byteBuffer);
        this.f = did.ae(byteBuffer);
        this.g = did.ae(byteBuffer);
    }

    @Override // defpackage.axkq
    public final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (s() == 1) {
            byteBuffer.putLong(awxt.e(this.s));
            byteBuffer.putLong(awxt.e(this.t));
            did.aa(byteBuffer, this.a);
            did.aa(byteBuffer, 0L);
            byteBuffer.putLong(this.u);
        } else {
            did.aa(byteBuffer, awxt.e(this.s));
            did.aa(byteBuffer, awxt.e(this.t));
            did.aa(byteBuffer, this.a);
            did.aa(byteBuffer, 0L);
            did.aa(byteBuffer, this.u);
        }
        did.aa(byteBuffer, 0L);
        did.aa(byteBuffer, 0L);
        did.Y(byteBuffer, this.b);
        did.Y(byteBuffer, this.c);
        did.X(byteBuffer, this.d);
        did.Y(byteBuffer, 0);
        this.e.b(byteBuffer);
        did.W(byteBuffer, this.f);
        did.W(byteBuffer, this.g);
    }

    public final void k(Date date) {
        this.s = date;
        if (awxt.e(date) >= 4294967296L) {
            this.q = 1;
        }
    }

    public final void l(long j) {
        this.u = j;
        if (j >= 4294967296L) {
            this.r = 1;
        }
    }

    public final void m(boolean z) {
        if (z) {
            this.r = r() | 1;
        } else {
            this.r = r() & (-2);
        }
    }

    public final void n(boolean z) {
        if (z) {
            this.r = r() | 2;
        } else {
            this.r = r() & (-3);
        }
    }

    public final void o(Date date) {
        this.t = date;
        if (awxt.e(date) >= 4294967296L) {
            this.q = 1;
        }
    }

    public final String toString() {
        return "TrackHeaderBox[creationTime=" + this.s + ";modificationTime=" + this.t + ";trackId=" + this.a + ";duration=" + this.u + ";layer=" + this.b + ";alternateGroup=" + this.c + ";volume=" + this.d + ";matrix=" + this.e + ";width=" + this.f + ";height=" + this.g + "]";
    }
}
