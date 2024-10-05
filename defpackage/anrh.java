package defpackage;

import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anrh implements anjy {
    private final anms a;
    private final int b;

    public anrh(anms anmsVar, int i) {
        this.a = anmsVar;
        this.b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        anmsVar.a(new byte[0], i);
    }

    @Override // defpackage.anjy
    public final byte[] a(byte[] bArr) {
        return this.a.a(bArr, this.b);
    }
}
