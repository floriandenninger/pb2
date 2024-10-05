package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeky {
    public final Cipher a;

    public final byte[] a() {
        try {
            return this.a.doFinal();
        } catch (BadPaddingException | IllegalBlockSizeException unused) {
            return null;
        }
    }

    public aeky(byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.a = cipher;
            cipher.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(new byte[bArr.length]));
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new aeld(e);
        }
    }
}
