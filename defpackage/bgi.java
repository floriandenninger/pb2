package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgi implements ate {
    private final ate a;
    private final bfe b;
    private boolean c;
    private long d;

    public bgi(ate ateVar, bfe bfeVar) {
        pse.c(ateVar);
        this.a = ateVar;
        this.b = bfeVar;
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
        if (this.d == 0) {
            return -1;
        }
        int g = this.a.g(bArr, i, i2);
        if (g > 0) {
            this.b.c(bArr, i, g);
            long j = this.d;
            if (j != -1) {
                this.d = j - g;
            }
        }
        return g;
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        long h = this.a.h(athVar);
        this.d = h;
        if (h == 0) {
            return 0L;
        }
        if (athVar.h == -1 && h != -1) {
            athVar = athVar.c(0L, h);
        }
        this.c = true;
        this.b.b(athVar);
        return this.d;
    }

    @Override // defpackage.ate
    public final Uri i() {
        return this.a.i();
    }

    @Override // defpackage.ate
    public final void j() {
        try {
            this.a.j();
            if (this.c) {
                this.c = false;
                this.b.a();
            }
        } catch (Throwable th) {
            if (this.c) {
                this.c = false;
                this.b.a();
            }
            throw th;
        }
    }
}
