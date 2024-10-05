package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aarf {
    byte[] a;
    int b;
    byte c;
    byte d;

    public aarf(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            this.a = new byte[(int) file.length()];
            int i = 0;
            while (true) {
                byte[] bArr = this.a;
                int read = fileInputStream.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    break;
                } else {
                    i += read;
                }
            }
            fileInputStream.close();
            if (i >= 4) {
                byte[] bArr2 = this.a;
                if ((bArr2[0] & bArr2[1] & bArr2[2]) == -1) {
                    this.c = bArr2[3];
                    this.b += 4;
                }
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(OutputStream outputStream, aooy aooyVar) {
        if (aooyVar == null) {
            outputStream.write(0);
            outputStream.write(0);
            outputStream.write(0);
        } else {
            byte[] byteArray = aooyVar.toByteArray();
            int length = byteArray.length;
            outputStream.write(length & PrivateKeyType.INVALID);
            outputStream.write((length >> 8) & PrivateKeyType.INVALID);
            outputStream.write((length >> 16) & PrivateKeyType.INVALID);
            outputStream.write(byteArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r5v2, types: [aooy, java.lang.Object] */
    public final aooy a(aooy aooyVar) {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
        this.b = i + 3;
        ?? o = aooyVar.getParserForType().o(this.a, this.b, i2);
        this.b += i2;
        return o;
    }
}
