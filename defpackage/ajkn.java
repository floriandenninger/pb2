package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajkn {
    public final axpg a;

    public ajkn(axpg axpgVar) {
        this.a = axpgVar;
    }

    public ajkn(axpg axpgVar, byte[] bArr) {
        this.a = axpgVar;
    }

    public ajkn(axpg axpgVar, byte[] bArr, byte[] bArr2) {
        this.a = axpgVar;
    }

    public ajkn(axpg axpgVar, char[] cArr) {
        this.a = axpgVar;
    }

    public static byte[] f(byte[] bArr, byte[] bArr2, Key key) {
        byte[] bArr3 = (byte[]) bArr2.clone();
        try {
            h(bArr3, bArr3.length, key, new IvParameterSpec(bArr), 2);
            return bArr3;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new RuntimeException("Unable to decrypt Disco key.", e);
        }
    }

    public static byte[] g(byte[] bArr, byte[] bArr2, Key key) {
        byte[] bArr3 = (byte[]) bArr2.clone();
        try {
            h(bArr3, bArr3.length, key, new IvParameterSpec(bArr), 1);
            return bArr3;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new RuntimeException("Unable to encrypt Disco key.", e);
        }
    }

    private static void h(byte[] bArr, int i, Key key, IvParameterSpec ivParameterSpec, int i2) {
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = bArr[i3];
        }
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        ByteBuffer wrap = ByteBuffer.wrap(ivParameterSpec.getIV());
        wrap.order(ByteOrder.BIG_ENDIAN);
        wrap.putLong(8, wrap.getLong(8));
        cipher.init(i2, key, new IvParameterSpec(wrap.array()));
        byte[] doFinal = cipher.doFinal(bArr2);
        for (int i4 = 0; i4 < i; i4++) {
            bArr[i4] = doFinal[i4];
        }
    }

    public final double a(double d, double d2) {
        amkq.E(d <= d2);
        return d + (((SecureRandom) this.a.get()).nextDouble() * (d2 - d));
    }

    public final String b(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) this.a.get()).nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    public final void c(ArrayList arrayList, int i) {
        int max;
        int size;
        if (this.a == null || (max = Math.max(1, 0)) >= i || (size = arrayList.size()) == 0 || max >= size) {
            return;
        }
        int min = Math.min(i, size) - max;
        while (true) {
            min--;
            if (min < 0) {
                return;
            }
            int i2 = min + max;
            int nextInt = ((SecureRandom) this.a.get()).nextInt(min + 1) + max;
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            arrayList.set(i2, (Integer) arrayList.get(nextInt));
            arrayList.set(nextInt, Integer.valueOf(intValue));
        }
    }

    public final Key d() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128, (SecureRandom) this.a.get());
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            zga.d("AES not recognized as a supported algorithm", e);
            return null;
        }
    }

    public final Key e(SharedPreferences sharedPreferences) {
        if (!sharedPreferences.contains("downloads_encryption_key")) {
            sharedPreferences.edit().putString("downloads_encryption_key", Base64.encodeToString(d().getEncoded(), 0)).apply();
        }
        return new SecretKeySpec(Base64.decode(sharedPreferences.getString("downloads_encryption_key", null), 0), "AES");
    }
}
