package defpackage;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anqz implements anra {
    private final /* synthetic */ int a;

    public anqz(int i) {
        this.a = i;
    }

    @Override // defpackage.anra
    public final /* synthetic */ Object a(String str, Provider provider) {
        int i = this.a;
        if (i == 0) {
            if (provider == null) {
                return KeyAgreement.getInstance(str);
            }
            return KeyAgreement.getInstance(str, provider);
        }
        if (i == 1) {
            if (provider == null) {
                return Cipher.getInstance(str);
            }
            return Cipher.getInstance(str, provider);
        }
        if (i == 2) {
            if (provider == null) {
                return KeyFactory.getInstance(str);
            }
            return KeyFactory.getInstance(str, provider);
        }
        if (i == 3) {
            if (provider == null) {
                return KeyPairGenerator.getInstance(str);
            }
            return KeyPairGenerator.getInstance(str, provider);
        }
        if (i == 4) {
            if (provider == null) {
                return Mac.getInstance(str);
            }
            return Mac.getInstance(str, provider);
        }
        if (i != 5) {
            return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
        if (provider == null) {
            return MessageDigest.getInstance(str);
        }
        return MessageDigest.getInstance(str, provider);
    }
}
