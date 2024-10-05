package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpu implements cwa, cpl {
    private final ajkn a;
    private final /* synthetic */ int b;

    public cpu(ajkn ajknVar, int i) {
        this.b = i;
        this.a = ajknVar;
    }

    @Override // defpackage.cpl
    public final Class a() {
        return this.b != 0 ? ByteBuffer.class : InputStream.class;
    }

    @Override // defpackage.cpl
    public final /* synthetic */ Object b(ByteBuffer byteBuffer) {
        return this.b != 0 ? byteBuffer : ddc.a(byteBuffer);
    }

    @Override // defpackage.cwa
    public final void d() {
    }

    @Override // defpackage.cwa
    public final cvz c(cwg cwgVar) {
        return this.b != 0 ? new cpv(this, this.a) : new cpv(this, this.a);
    }
}
