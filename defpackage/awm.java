package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class awm extends awl {
    public int[] e;
    private int[] f;

    @Override // defpackage.avr
    public final void e(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) pse.c(this.f);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j = j(((limit - position) / this.b.e) * this.c.e);
        while (position < limit) {
            for (int i : iArr) {
                j.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.b.e;
        }
    }

    @Override // defpackage.awl
    public final avp i(avp avpVar) {
        int[] iArr = this.e;
        if (iArr == null) {
            return avp.a;
        }
        if (avpVar.d != 2) {
            throw new avq(avpVar);
        }
        boolean z = avpVar.c != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new avp(avpVar.b, length, 2) : avp.a;
            }
            int i2 = iArr[i];
            if (i2 >= avpVar.c) {
                throw new avq(avpVar);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // defpackage.awl
    protected final void k() {
        this.f = this.e;
    }

    @Override // defpackage.awl
    protected final void m() {
        this.f = null;
        this.e = null;
    }
}
