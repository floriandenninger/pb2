package defpackage;

import java.security.cert.X509Certificate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cmy extends cmz {
    private final byte[] a;

    public cmy(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.a = bArr;
    }

    @Override // defpackage.cmz, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.a;
    }
}
