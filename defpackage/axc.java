package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axc extends awl {
    public boolean e;
    public long f;
    private int g;
    private byte[] h;
    private byte[] i;
    private int j;
    private int k;
    private int l;
    private boolean m;

    public axc() {
        pse.e(true);
        this.h = pts.f;
        this.i = pts.f;
    }

    private final int n(long j) {
        return (int) ((j * this.b.b) / 1000000);
    }

    private final int o(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i = this.g;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    private final void p(byte[] bArr, int i) {
        if (i > 0) {
            this.m = true;
        }
    }

    private final void q(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.l);
        int i2 = this.l - min;
        System.arraycopy(bArr, i - i2, this.i, 0, i2);
        byteBuffer.get(this.i, i2, min);
    }

    @Override // defpackage.avr
    public final void e(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.d.hasRemaining()) {
            int i = this.j;
            if (i == 0) {
                int limit = byteBuffer.limit();
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit2)) > 1024) {
                            int i2 = this.g;
                            position = ((limit2 / i2) * i2) + i2;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.j = 1;
                } else {
                    int remaining = byteBuffer.remaining();
                    if (remaining > 0) {
                        this.m = true;
                    }
                }
            } else if (i == 1) {
                int limit3 = byteBuffer.limit();
                int o = o(byteBuffer);
                int position2 = o - byteBuffer.position();
                byte[] bArr = this.h;
                int length = bArr.length;
                int i3 = this.k;
                int i4 = length - i3;
                if (o >= limit3 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.get(this.h, this.k, min);
                    int i5 = this.k + min;
                    this.k = i5;
                    byte[] bArr2 = this.h;
                    if (i5 == bArr2.length) {
                        if (this.m) {
                            p(bArr2, this.l);
                            long j = this.f;
                            int i6 = this.k;
                            int i7 = this.l;
                            this.f = j + ((i6 - (i7 + i7)) / this.g);
                            i5 = i6;
                        } else {
                            this.f += (i5 - this.l) / this.g;
                        }
                        q(byteBuffer, this.h, i5);
                        this.k = 0;
                        this.j = 2;
                    }
                } else {
                    p(bArr, i3);
                    this.k = 0;
                    this.j = 0;
                }
            } else {
                int limit4 = byteBuffer.limit();
                int o2 = o(byteBuffer);
                this.f += byteBuffer.remaining() / this.g;
                q(byteBuffer, this.i, this.l);
                if (o2 < limit4) {
                    p(this.i, this.l);
                    this.j = 0;
                }
            }
        }
    }

    @Override // defpackage.awl, defpackage.avr
    public final boolean g() {
        return this.e;
    }

    @Override // defpackage.awl
    public final avp i(avp avpVar) {
        if (avpVar.d == 2) {
            return this.e ? avpVar : avp.a;
        }
        throw new avq(avpVar);
    }

    @Override // defpackage.awl
    protected final void k() {
        if (this.e) {
            this.g = this.b.e;
            int n = n(150000L) * this.g;
            if (this.h.length != n) {
                this.h = new byte[n];
            }
            int n2 = n(20000L) * this.g;
            this.l = n2;
            if (this.i.length != n2) {
                this.i = new byte[n2];
            }
        }
        this.j = 0;
        this.f = 0L;
        this.k = 0;
        this.m = false;
    }

    @Override // defpackage.awl
    protected final void l() {
        int i = this.k;
        if (i > 0) {
            p(this.h, i);
        }
        if (this.m) {
            return;
        }
        this.f += this.l / this.g;
    }

    @Override // defpackage.awl
    protected final void m() {
        this.e = false;
        this.l = 0;
        this.h = pts.f;
        this.i = pts.f;
    }
}
