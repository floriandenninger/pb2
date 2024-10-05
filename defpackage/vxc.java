package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vxc extends awl {
    public int e;

    @Override // defpackage.avr
    public final void e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j = j(((limit - position) * this.c.c) / this.b.c);
        int i = this.b.c;
        if (i == 1) {
            if (this.c.c == 2) {
                while (position < limit) {
                    j.putShort(byteBuffer.getShort(position));
                    j.putShort(byteBuffer.getShort(position));
                    position += this.b.e;
                }
            }
        } else if (i == 2 && this.c.c == 1) {
            while (position < limit) {
                j.putShort((short) ((byteBuffer.getShort(position) + byteBuffer.getShort(position + 2)) / 2));
                position += this.b.e;
            }
        }
    }

    @Override // defpackage.awl
    public final avp i(avp avpVar) {
        int i;
        int i2 = this.e;
        if (i2 <= 0) {
            return avp.a;
        }
        if (avpVar.d != 2 || (i = avpVar.c) <= 0 || i > 2 || i2 > 2) {
            throw new avq(avpVar);
        }
        return i != i2 ? new avp(avpVar.b, i2, 2) : avp.a;
    }
}
