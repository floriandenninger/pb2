package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ailz implements ate {
    public final ptk a;
    private final bga b;

    public ailz(ate ateVar, ptk ptkVar) {
        this.b = new bga(ateVar, ptkVar, 0);
        this.a = ptkVar;
    }

    private final void c() {
        new ailx(this).start();
    }

    @Override // defpackage.ate
    public final /* synthetic */ Map a() {
        return Collections.emptyMap();
    }

    @Override // defpackage.ate
    public final void b(att attVar) {
        this.b.b(attVar);
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        return this.b.g(bArr, i, i2);
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        this.a.a(0);
        return this.b.h(athVar);
    }

    @Override // defpackage.ate
    public final Uri i() {
        return this.b.i();
    }

    @Override // defpackage.ate
    public final void j() {
        try {
            this.b.j();
        } finally {
            c();
        }
    }
}
