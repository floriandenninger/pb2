package defpackage;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anqj implements anke {
    public final ECPrivateKey a;
    public final String b;
    public final int c;

    public anqj(ECPrivateKey eCPrivateKey, int i, int i2) {
        if (aobq.af(2)) {
            this.a = eCPrivateKey;
            this.b = aobq.N(i);
            this.c = i2;
            return;
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
    }
}
