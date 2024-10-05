package defpackage;

import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajlr implements cwa {
    private final ajlu a;
    private final /* synthetic */ int b;

    public ajlr(ajlu ajluVar, int i) {
        this.b = i;
        this.a = ajluVar;
    }

    @Override // defpackage.cwa
    public final void d() {
    }

    @Override // defpackage.cwa
    public final cvz c(cwg cwgVar) {
        return this.b != 0 ? new ajls(this.a, cwgVar.a(File.class, ByteBuffer.class)) : new ajls(this.a, cwgVar.a(File.class, InputStream.class));
    }
}
