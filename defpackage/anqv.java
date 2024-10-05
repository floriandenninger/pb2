package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anqv implements anke {
    private final byte[] a;

    public anqv(byte[] bArr) {
        if (!aobq.af(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        byte[] e = anqs.e(bArr);
        this.a = e;
        anqs.f(e);
    }
}
