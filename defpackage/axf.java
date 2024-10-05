package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axf extends awl {
    public int e;
    public int f;
    public long g;
    private boolean h;
    private int i;
    private byte[] j = pts.f;
    private int k;

    @Override // defpackage.awl, defpackage.avr
    public final ByteBuffer b() {
        int i;
        if (super.h() && (i = this.k) > 0) {
            this.k = 0;
        }
        return super.b();
    }

    @Override // defpackage.avr
    public final void e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.i);
        this.g += min / this.b.e;
        this.i -= min;
        if (this.i > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.k + i2) - this.j.length;
        ByteBuffer j = j(length);
        int c = pts.c(length, 0, this.k);
        j.put(this.j, 0, c);
        int c2 = pts.c(length - c, 0, i2);
        j.put(byteBuffer);
        int i3 = i2 - c2;
        int i4 = this.k - c;
        this.k = i4;
        byte[] bArr = this.j;
        System.arraycopy(bArr, c, bArr, 0, i4);
        byteBuffer.get(this.j, this.k, i3);
        this.k += i3;
    }

    @Override // defpackage.awl, defpackage.avr
    public final boolean h() {
        return super.h() && this.k == 0;
    }

    @Override // defpackage.awl
    public final avp i(avp avpVar) {
        if (avpVar.d == 2) {
            this.h = true;
            return (this.e == 0 && this.f == 0) ? avp.a : avpVar;
        }
        throw new avq(avpVar);
    }

    @Override // defpackage.awl
    protected final void k() {
        if (this.h) {
            this.h = false;
            int i = this.f;
            int i2 = this.b.e;
            this.j = new byte[i * i2];
            this.i = this.e * i2;
        }
        this.k = 0;
    }

    @Override // defpackage.awl
    protected final void l() {
        if (this.h) {
            if (this.k > 0) {
                this.g += r0 / this.b.e;
            }
            this.k = 0;
        }
    }

    @Override // defpackage.awl
    protected final void m() {
        this.j = pts.f;
    }
}
