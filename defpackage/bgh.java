package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgh implements ate {
    public long a;
    public Uri b;
    private final ate c;

    public bgh(ate ateVar) {
        pse.c(ateVar);
        this.c = ateVar;
        this.b = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // defpackage.ate
    public final Map a() {
        return this.c.a();
    }

    @Override // defpackage.ate
    public final void b(att attVar) {
        pse.c(attVar);
        this.c.b(attVar);
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        int g = this.c.g(bArr, i, i2);
        if (g != -1) {
            this.a += g;
        }
        return g;
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        this.b = athVar.a;
        Collections.emptyMap();
        long h = this.c.h(athVar);
        Uri i = i();
        pse.c(i);
        this.b = i;
        a();
        return h;
    }

    @Override // defpackage.ate
    public final Uri i() {
        return this.c.i();
    }

    @Override // defpackage.ate
    public final void j() {
        this.c.j();
    }
}
