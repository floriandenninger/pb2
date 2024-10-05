package defpackage;

import android.net.Uri;
import java.util.Map;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bbh implements ate {
    private final ate a;
    private final int b;
    private final bbg c;
    private final byte[] d;
    private int e;

    public bbh(ate ateVar, int i, bbg bbgVar) {
        pse.e(i > 0);
        this.a = ateVar;
        this.b = i;
        this.c = bbgVar;
        this.d = new byte[1];
        this.e = i;
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
        int i3 = this.e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.a.g(this.d, 0, 1) != -1) {
                int i5 = (this.d[0] & PrivateKeyType.INVALID) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int g = this.a.g(bArr2, i4, i6);
                        if (g != -1) {
                            i4 += g;
                            i6 -= g;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        bbg bbgVar = this.c;
                        pth pthVar = new pth(bArr2, i5);
                        bci bciVar = (bci) bbgVar;
                        long max = !bciVar.g ? bciVar.c : Math.max(bciVar.h.j(), bciVar.c);
                        int a = pthVar.a();
                        bjc bjcVar = bciVar.f;
                        pse.c(bjcVar);
                        hp.e(bjcVar, pthVar, a);
                        bjcVar.v(max, 1, a, 0, null);
                        bciVar.g = true;
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int g2 = this.a.g(bArr, i, Math.min(i3, i2));
        if (g2 != -1) {
            this.e -= g2;
        }
        return g2;
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ate
    public final Uri i() {
        return this.a.i();
    }

    @Override // defpackage.ate
    public final void j() {
        throw new UnsupportedOperationException();
    }
}
