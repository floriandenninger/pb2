package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anpk implements ankf {
    private final ankb a;

    public anpk(ankb ankbVar) {
        this.a = ankbVar;
    }

    @Override // defpackage.ankf
    public final void a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("signature too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
        for (anjz anjzVar : this.a.a(copyOf)) {
            try {
                if (anjzVar.c != 4) {
                    ((ankf) anjzVar.a).a(copyOfRange, bArr2);
                    return;
                } else {
                    ((ankf) anjzVar.a).a(copyOfRange, aocz.av(bArr2, new byte[]{0}));
                    return;
                }
            } catch (GeneralSecurityException e) {
                Logger logger = anpl.a;
                Level level = Level.INFO;
                String valueOf = String.valueOf(e.toString());
                logger.logp(level, "com.google.crypto.tink.signature.PublicKeyVerifyWrapper$WrappedPublicKeyVerify", "verify", valueOf.length() != 0 ? "signature prefix matches a key, but cannot verify: ".concat(valueOf) : new String("signature prefix matches a key, but cannot verify: "));
            }
        }
        Iterator it = this.a.a(anjk.a).iterator();
        while (it.hasNext()) {
            try {
                ((ankf) ((anjz) it.next()).a).a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
