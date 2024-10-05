package defpackage;

import java.lang.reflect.Array;
import java.math.BigInteger;
import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anqu {
    static final long[] a;
    static final long[] b;
    static final long[] c;
    static final anqp[][] d;
    static final anqp[] e;
    private static final BigInteger f;
    private static final BigInteger g;
    private static final BigInteger h;
    private static final BigInteger i;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(PrivateKeyType.INVALID).subtract(BigInteger.valueOf(19L));
        f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        g = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        h = mod2;
        BigInteger modPow = BigInteger.valueOf(2L).modPow(subtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), subtract);
        i = modPow;
        anqt anqtVar = new anqt();
        anqtVar.b = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        BigInteger bigInteger = anqtVar.b;
        BigInteger multiply = bigInteger.pow(2).subtract(BigInteger.ONE).multiply(mod.multiply(bigInteger.pow(2)).add(BigInteger.ONE).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        anqtVar.a = modPow2;
        a = anrb.h(c(mod));
        b = anrb.h(c(mod2));
        c = anrb.h(c(modPow));
        d = (anqp[][]) Array.newInstance((Class<?>) anqp.class, 32, 8);
        anqt anqtVar2 = anqtVar;
        for (int i2 = 0; i2 < 32; i2++) {
            anqt anqtVar3 = anqtVar2;
            for (int i3 = 0; i3 < 8; i3++) {
                d[i2][i3] = a(anqtVar3);
                anqtVar3 = b(anqtVar3, anqtVar2);
            }
            for (int i4 = 0; i4 < 8; i4++) {
                anqtVar2 = b(anqtVar2, anqtVar2);
            }
        }
        anqt b2 = b(anqtVar, anqtVar);
        e = new anqp[8];
        for (int i5 = 0; i5 < 8; i5++) {
            e[i5] = a(anqtVar);
            anqtVar = b(anqtVar, b2);
        }
    }

    private static anqp a(anqt anqtVar) {
        BigInteger add = anqtVar.b.add(anqtVar.a);
        BigInteger bigInteger = f;
        return new anqp(anrb.h(c(add.mod(bigInteger))), anrb.h(c(anqtVar.b.subtract(anqtVar.a).mod(bigInteger))), anrb.h(c(h.multiply(anqtVar.a).multiply(anqtVar.b).mod(bigInteger))));
    }

    private static anqt b(anqt anqtVar, anqt anqtVar2) {
        anqt anqtVar3 = new anqt();
        BigInteger multiply = g.multiply(anqtVar.a.multiply(anqtVar2.a).multiply(anqtVar.b).multiply(anqtVar2.b));
        BigInteger bigInteger = f;
        BigInteger mod = multiply.mod(bigInteger);
        anqtVar3.a = anqtVar.a.multiply(anqtVar2.b).add(anqtVar2.a.multiply(anqtVar.b)).multiply(BigInteger.ONE.add(mod).modInverse(bigInteger)).mod(bigInteger);
        anqtVar3.b = anqtVar.b.multiply(anqtVar2.b).add(anqtVar.a.multiply(anqtVar2.a)).multiply(BigInteger.ONE.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return anqtVar3;
    }

    private static byte[] c(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = (32 - i2) - 1;
            bArr[i2] = bArr[i3];
            bArr[i3] = b2;
        }
        return bArr;
    }
}
