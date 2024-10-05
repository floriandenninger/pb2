package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anqw implements ankf {
    private final anrc a;

    public anqw(byte[] bArr) {
        if (!aobq.af(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.a = anrc.a(bArr);
    }

    @Override // defpackage.ankf
    public final void a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
        }
        if (!anqs.d(bArr2, bArr, this.a.b())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }
}
