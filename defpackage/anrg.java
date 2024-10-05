package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anrg implements anms {
    public final String a;
    public final Key b;
    private final ThreadLocal c;
    private final int d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public anrg(String str, Key key) {
        char c;
        int i;
        anrf anrfVar = new anrf(this);
        this.c = anrfVar;
        if (aobq.af(2)) {
            this.a = str;
            this.b = key;
            if (key.getEncoded().length < 16) {
                throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
            }
            switch (str.hashCode()) {
                case -1823053428:
                    if (str.equals("HMACSHA1")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 392315023:
                    if (str.equals("HMACSHA224")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 392315118:
                    if (str.equals("HMACSHA256")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 392316170:
                    if (str.equals("HMACSHA384")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 392317873:
                    if (str.equals("HMACSHA512")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                i = 20;
            } else if (c == 1) {
                i = 28;
            } else if (c == 2) {
                i = 32;
            } else {
                if (c != 3) {
                    if (c != 4) {
                        throw new NoSuchAlgorithmException(str.length() != 0 ? "unknown Hmac algorithm: ".concat(str) : new String("unknown Hmac algorithm: "));
                    }
                    this.d = 64;
                    anrfVar.get();
                    return;
                }
                i = 48;
            }
            this.d = i;
            anrfVar.get();
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // defpackage.anms
    public final byte[] a(byte[] bArr, int i) {
        if (i > this.d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.c.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.c.get()).doFinal(), i);
    }
}
