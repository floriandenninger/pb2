package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class awy extends awl {
    private static final int e = Float.floatToIntBits(Float.NaN);

    private static void n(int i, ByteBuffer byteBuffer) {
        double d = i;
        Double.isNaN(d);
        int floatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (floatToIntBits == e) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // defpackage.avr
    public final void e(ByteBuffer byteBuffer) {
        ByteBuffer j;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.b.d;
        if (i2 == 536870912) {
            j = j((i / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), j);
                position += 3;
            }
        } else if (i2 == 805306368) {
            j = j(i);
            while (position < limit) {
                n((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), j);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // defpackage.awl
    public final avp i(avp avpVar) {
        int i = avpVar.d;
        if (pts.T(i)) {
            return i != 4 ? new avp(avpVar.b, avpVar.c, 4) : avp.a;
        }
        throw new avq(avpVar);
    }
}
