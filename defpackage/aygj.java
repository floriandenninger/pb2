package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aygj implements aygl {
    private final /* synthetic */ int a;

    public aygj(int i) {
        this.a = i;
    }

    @Override // defpackage.aygm
    public final /* synthetic */ int a(aymb aymbVar, int i, Object obj, int i2) {
        int i3 = this.a;
        if (i3 == 0) {
            aymbVar.l(i);
            return 0;
        }
        if (i3 == 1) {
            return aymbVar.e();
        }
        if (i3 == 2) {
            aymbVar.k((byte[]) obj, i2, i);
            return i2 + i;
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int limit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + i);
        aymbVar.i(byteBuffer);
        byteBuffer.limit(limit);
        return 0;
    }
}
