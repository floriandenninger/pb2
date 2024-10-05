package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tch implements cqp {
    private final tci a;

    public tch(ctm ctmVar) {
        this.a = new tci(ctmVar);
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ ctd a(Object obj, int i, int i2, cqn cqnVar) {
        return this.a.c(ddc.a((ByteBuffer) obj));
    }

    @Override // defpackage.cqp
    public final /* synthetic */ boolean b(Object obj, cqn cqnVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int i = tck.c;
        if (byteBuffer.limit() < 21) {
            return false;
        }
        byte[] bArr = new byte[21];
        byteBuffer.get(bArr);
        return tck.a(bArr);
    }
}
