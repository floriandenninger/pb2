package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgm implements ate {
    private final ate a;
    private final byte[] b;
    private bgn c;

    public bgm(byte[] bArr, ate ateVar) {
        this.a = ateVar;
        this.b = bArr;
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
        if (i2 == 0) {
            return 0;
        }
        int g = this.a.g(bArr, i, i2);
        if (g == -1) {
            return -1;
        }
        bgn bgnVar = this.c;
        int i3 = pts.a;
        bgnVar.a(bArr, i, g, bArr, i);
        return g;
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        long h = this.a.h(athVar);
        long b = ayu.b(athVar.i);
        this.c = new bgn(2, this.b, b, athVar.g + athVar.b);
        return h;
    }

    @Override // defpackage.ate
    public final Uri i() {
        return this.a.i();
    }

    @Override // defpackage.ate
    public final void j() {
        this.c = null;
        this.a.j();
    }
}
