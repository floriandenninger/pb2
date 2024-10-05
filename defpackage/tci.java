package defpackage;

import android.support.rastermill.FrameSequence;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tci implements cqp {
    private final ctm a;

    public tci(ctm ctmVar) {
        this.a = ctmVar;
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ ctd a(Object obj, int i, int i2, cqn cqnVar) {
        return c((InputStream) obj);
    }

    @Override // defpackage.cqp
    public final /* synthetic */ boolean b(Object obj, cqn cqnVar) {
        int i = tck.c;
        byte[] bArr = new byte[21];
        if (((InputStream) obj).read(bArr) < 21) {
            return false;
        }
        return tck.a(bArr);
    }

    public final ctd c(InputStream inputStream) {
        return new tcj(FrameSequence.decodeStream(inputStream), this.a);
    }
}
