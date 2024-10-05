package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyi implements cqp {
    private final cxa a = new cxa(null);
    private final /* synthetic */ int b;

    public cyi(int i, byte[] bArr) {
        this.b = i;
    }

    public cyi(int i) {
        this.b = i;
    }

    @Override // defpackage.cqp
    public final /* synthetic */ boolean b(Object obj, cqn cqnVar) {
        if (this.b != 0) {
            return true;
        }
        return true;
    }

    @Override // defpackage.cqp
    public final /* synthetic */ ctd a(Object obj, int i, int i2, cqn cqnVar) {
        if (this.b == 0) {
            return this.a.a(ImageDecoder.createSource(ddc.c((InputStream) obj)), i, i2, cqnVar);
        }
        return this.a.a(ImageDecoder.createSource((ByteBuffer) obj), i, i2, cqnVar);
    }
}
