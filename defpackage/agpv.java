package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agpv implements ate {
    private final ate a;

    public agpv(ate ateVar) {
        this.a = ateVar;
    }

    @Override // defpackage.ate
    public final /* synthetic */ Map a() {
        return Collections.emptyMap();
    }

    @Override // defpackage.ate
    public final void b(att attVar) {
        this.a.b(attVar);
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        return this.a.g(bArr, i, i2);
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        Uri uri = athVar.a;
        if (uri == null || !wbs.an(uri)) {
            return this.a.h(athVar);
        }
        throw new afij();
    }

    @Override // defpackage.ate
    public final Uri i() {
        return this.a.i();
    }

    @Override // defpackage.ate
    public final void j() {
        this.a.j();
    }
}
