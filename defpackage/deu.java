package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deu extends axks {
    public Date a;
    public Date b;
    public long c;
    public axnb d;
    public long e;
    private long f;
    private double g;
    private float s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;

    public deu() {
        super("mvhd");
        this.g = 1.0d;
        this.s = 1.0f;
        this.d = axnb.a;
    }

    @Override // defpackage.axkq
    protected final long h() {
        return (s() == 1 ? 32L : 20L) + 80;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if (s() == 1) {
            this.a = awxt.f(did.al(byteBuffer));
            this.b = awxt.f(did.al(byteBuffer));
            this.c = did.ak(byteBuffer);
            this.f = did.al(byteBuffer);
        } else {
            this.a = awxt.f(did.ak(byteBuffer));
            this.b = awxt.f(did.ak(byteBuffer));
            this.c = did.ak(byteBuffer);
            this.f = did.ak(byteBuffer);
        }
        this.g = did.ae(byteBuffer);
        this.s = did.af(byteBuffer);
        did.ah(byteBuffer);
        did.ak(byteBuffer);
        did.ak(byteBuffer);
        this.d = axnb.a(byteBuffer);
        this.t = byteBuffer.getInt();
        this.u = byteBuffer.getInt();
        this.v = byteBuffer.getInt();
        this.w = byteBuffer.getInt();
        this.x = byteBuffer.getInt();
        this.y = byteBuffer.getInt();
        this.e = did.ak(byteBuffer);
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (s() == 1) {
            byteBuffer.putLong(awxt.e(this.a));
            byteBuffer.putLong(awxt.e(this.b));
            did.aa(byteBuffer, this.c);
            byteBuffer.putLong(this.f);
        } else {
            did.aa(byteBuffer, awxt.e(this.a));
            did.aa(byteBuffer, awxt.e(this.b));
            did.aa(byteBuffer, this.c);
            did.aa(byteBuffer, this.f);
        }
        did.W(byteBuffer, this.g);
        did.X(byteBuffer, this.s);
        did.Y(byteBuffer, 0);
        did.aa(byteBuffer, 0L);
        did.aa(byteBuffer, 0L);
        this.d.b(byteBuffer);
        byteBuffer.putInt(this.t);
        byteBuffer.putInt(this.u);
        byteBuffer.putInt(this.v);
        byteBuffer.putInt(this.w);
        byteBuffer.putInt(this.x);
        byteBuffer.putInt(this.y);
        did.aa(byteBuffer, this.e);
    }

    public final void k(Date date) {
        this.a = date;
        if (awxt.e(date) >= 4294967296L) {
            this.q = 1;
        }
    }

    public final void l(long j) {
        this.f = j;
        if (j >= 4294967296L) {
            this.q = 1;
        }
    }

    public final void m(Date date) {
        this.b = date;
        if (awxt.e(date) >= 4294967296L) {
            this.q = 1;
        }
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.a + ";modificationTime=" + this.b + ";timescale=" + this.c + ";duration=" + this.f + ";rate=" + this.g + ";volume=" + this.s + ";matrix=" + this.d + ";nextTrackId=" + this.e + "]";
    }
}
