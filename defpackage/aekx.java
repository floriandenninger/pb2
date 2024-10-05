package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aekx implements aelb {
    private final byte[] a;
    private final SecretKeySpec b;
    private final SecretKeySpec c;

    public aekx(aelc aelcVar) {
        afki.d(1 == ((aelcVar.a.length & 1) ^ 1));
        byte[] bArr = aelcVar.a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length >> 1);
        byte[] bArr2 = aelcVar.a;
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr2.length >> 1, 32);
        this.a = aelcVar.b;
        this.b = new SecretKeySpec(copyOf, "AES");
        this.c = new SecretKeySpec(copyOfRange, "HmacSHA256");
    }

    static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.aelb
    public final aekz a(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        aome u = aomf.u(bArr.length);
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            try {
                gZIPOutputStream = new GZIPOutputStream(u);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        } catch (IllegalArgumentException e2) {
            e = e2;
        }
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            byte[] I = u.b().I();
            b(u);
            b(gZIPOutputStream);
            try {
                Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
                cipher.init(1, this.b);
                Mac mac = Mac.getInstance("HmacSHA256");
                mac.init(this.c);
                byte[] iv = cipher.getIV();
                byte[] doFinal = cipher.doFinal(I);
                mac.update(doFinal);
                return new aekz(aomf.x(doFinal), aomf.x(mac.doFinal(iv)), aomf.x(iv), aomf.x(this.a));
            } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e3) {
                throw new aela(e3);
            }
        } catch (IOException e4) {
            e = e4;
            throw new aela(e);
        } catch (IllegalArgumentException e5) {
            e = e5;
            throw new aela(e);
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            b(u);
            b(gZIPOutputStream2);
            throw th;
        }
    }

    @Override // defpackage.aelb
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        Throwable th;
        InputStream inputStream;
        Exception e;
        InputStream m;
        InputStream gZIPInputStream;
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(this.c);
            mac.update(bArr);
            byte[] doFinal = mac.doFinal(bArr3);
            if (doFinal.length == bArr2.length) {
                boolean z = false;
                for (int i2 = 0; i2 < doFinal.length; i2++) {
                    z |= doFinal[i2] != bArr2[i2];
                }
                if (z) {
                    throw new aela("HMAC value mismatch");
                }
                Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
                cipher.init(2, this.b, new IvParameterSpec(bArr3));
                byte[] doFinal2 = cipher.doFinal(bArr);
                aome u = aomf.u(80000);
                InputStream inputStream2 = null;
                try {
                    m = aomf.x(doFinal2).m();
                } catch (IOException e2) {
                    e = e2;
                    e = e;
                    inputStream = null;
                    try {
                        throw new aela(e);
                    } catch (Throwable th2) {
                        th = th2;
                        b(u);
                        b(inputStream2);
                        b(inputStream);
                        throw th;
                    }
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    e = e;
                    inputStream = null;
                    throw new aela(e);
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                }
                try {
                    if (i == 3) {
                        gZIPInputStream = new aniy(m);
                    } else {
                        gZIPInputStream = new GZIPInputStream(m);
                    }
                    inputStream2 = gZIPInputStream;
                    byte[] bArr4 = new byte[80000];
                    while (true) {
                        int read = inputStream2.read(bArr4, 0, 80000);
                        if (read != -1) {
                            u.write(bArr4, 0, read);
                        } else {
                            byte[] I = u.b().I();
                            b(u);
                            b(m);
                            b(inputStream2);
                            return I;
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                    InputStream inputStream3 = inputStream2;
                    inputStream2 = m;
                    inputStream = inputStream3;
                    throw new aela(e);
                } catch (IllegalArgumentException e5) {
                    e = e5;
                    InputStream inputStream32 = inputStream2;
                    inputStream2 = m;
                    inputStream = inputStream32;
                    throw new aela(e);
                } catch (Throwable th4) {
                    th = th4;
                    InputStream inputStream4 = inputStream2;
                    inputStream2 = m;
                    inputStream = inputStream4;
                    b(u);
                    b(inputStream2);
                    b(inputStream);
                    throw th;
                }
            } else {
                throw new aela("HMAC length mismatch");
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e6) {
            throw new aela(e6);
        }
    }
}
