package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aehb implements ate {
    private final ate a;
    private final adyu b;

    public aehb(ate ateVar, adyu adyuVar, afhs afhsVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = ateVar;
        this.b = adyuVar;
        boolean z = afhsVar.o().G;
        afjv afjvVar = afhsVar.i;
    }

    @Override // defpackage.ate
    public final Map a() {
        return this.a.a();
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
        this.b.bI();
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
