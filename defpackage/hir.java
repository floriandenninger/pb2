package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hir extends awl {
    public int e;
    public int f;
    public int g;
    public int h;
    boolean i;
    axe j;
    private final hiq k;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private hip u;
    private int t = 0;
    private ByteBuffer l = avr.a;

    public hir(hiq hiqVar) {
        this.k = hiqVar;
    }

    private final void r() {
        this.r = false;
        this.s = false;
        this.l = avr.a;
        this.p = false;
        this.q = false;
        this.t = 0;
        this.i = false;
    }

    @Override // defpackage.avr
    public final synchronized void e(ByteBuffer byteBuffer) {
        int i;
        this.t = 0;
        if (!this.p && this.u != null) {
            int i2 = this.m;
            int i3 = i2 + i2;
            int i4 = this.g;
            int i5 = i4 + i4;
            int remaining = byteBuffer.remaining() / i3;
            int remaining2 = this.l.remaining() / i5;
            if (this.q) {
                i = byteBuffer.remaining();
            } else {
                int max = Math.max(remaining, remaining2) * this.e;
                i = max + max;
            }
            ByteBuffer j = j(i);
            hip hipVar = this.u;
            hio hioVar = hipVar.c;
            if (hioVar == null) {
                hipVar.c = new hio(hipVar);
                hioVar = hipVar.c;
            }
            while (byteBuffer.remaining() >= i3 && (this.l.remaining() >= i5 || this.q || this.i)) {
                for (int i6 = 0; i6 < this.e; i6++) {
                    j.putShort((short) (((short) Math.round(s(i6, this.n, byteBuffer, hioVar, i3) * this.k.a)) + ((short) Math.round(s(i6, this.o, this.l, hioVar, i5) * (1.0f - this.k.a)))));
                }
                if (this.l.remaining() >= i5) {
                    ByteBuffer byteBuffer2 = this.l;
                }
            }
            this.l.compact();
        }
    }

    @Override // defpackage.awl
    public final avp i(avp avpVar) {
        if (avpVar.d != 2) {
            throw new avq(avpVar);
        }
        if (avpVar.b != this.h) {
            zga.b("Primary input source sample rate does not equal output sample rate");
            return avp.a;
        }
        this.m = avpVar.c;
        o();
        return this.f >= 2 ? new avp(this.h, this.e, avpVar.d) : avp.a;
    }

    @Override // defpackage.awl
    protected final synchronized void k() {
        this.r = true;
        if (this.s) {
            r();
        }
    }

    @Override // defpackage.awl
    protected final synchronized void l() {
        this.p = true;
    }

    @Override // defpackage.awl
    protected final void m() {
        this.l = avr.a;
        this.p = false;
        this.q = false;
        this.j = null;
        this.t = 0;
        this.i = false;
    }

    public final synchronized void n() {
        this.s = true;
        if (this.r) {
            r();
        }
    }

    public final void o() {
        if (this.m <= 0 || this.g <= 0) {
            return;
        }
        int i = this.e;
        if (i > 2 || i <= 0) {
            throw new UnsupportedOperationException("StereoChannelMapper should have no more than 2 output audio tracks");
        }
        hip hipVar = new hip(i);
        this.u = hipVar;
        this.n = hipVar.a(this.m);
        this.o = this.u.a(this.g);
    }

    public final synchronized void p() {
        this.q = true;
    }

    public final synchronized void q(ByteBuffer byteBuffer, boolean z) {
        if (this.g > 0 && !this.q) {
            int remaining = this.l.remaining();
            int i = this.g;
            if (remaining > i + i) {
                if (this.p) {
                    this.t = 0;
                    return;
                }
                int i2 = this.t;
                if (i2 < 50) {
                    this.t = i2 + 1;
                    return;
                } else {
                    zga.b("TwoTrackAMAP: Too many calls to queueSecondaryBuffer were not accepted, forcing a flush");
                    r();
                    return;
                }
            }
            axe axeVar = this.j;
            if (axeVar != null) {
                axeVar.e(byteBuffer);
                byteBuffer = this.j.b();
            }
            int remaining2 = byteBuffer.remaining() - this.l.remaining();
            if (remaining2 > 0) {
                ByteBuffer order = ByteBuffer.allocateDirect(remaining2 + this.l.capacity()).order(ByteOrder.nativeOrder());
                order.put(this.l);
                this.l = order;
            }
            this.l.put(byteBuffer);
            this.t = 0;
            this.i = z;
        }
    }

    private static short s(int i, int i2, ByteBuffer byteBuffer, hio hioVar, int i3) {
        hip hipVar = hioVar.a;
        int[] iArr = null;
        if (i2 >= 0 && i2 <= 1 && i >= 0 && i <= 1) {
            iArr = new int[1];
            if (((Integer) hipVar.b.get(i2)).intValue() == 1) {
                iArr[0] = 0;
            } else {
                iArr[0] = i;
            }
        }
        if (byteBuffer.remaining() < i3 || iArr == null) {
            return (short) 0;
        }
        short s = 0;
        for (int i4 = 0; i4 <= 0; i4++) {
            int i5 = iArr[i4];
            s = (short) (s + byteBuffer.getShort(byteBuffer.position() + i5 + i5));
        }
        return s;
    }
}
