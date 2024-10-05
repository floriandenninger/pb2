package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bga implements ate {
    private final ate a;
    private final ptk b;
    private final int c;

    public bga(ate ateVar, ptk ptkVar, int i) {
        pse.c(ateVar);
        this.a = ateVar;
        this.b = ptkVar;
        this.c = i;
    }

    @Override // defpackage.ate
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.ate
    public final void b(att attVar) {
        pse.c(attVar);
        this.a.b(attVar);
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        this.b.b(this.c);
        return this.a.g(bArr, i, i2);
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        this.b.b(this.c);
        return this.a.h(athVar);
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
