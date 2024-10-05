package defpackage;

import j$.nio.charset.StandardCharsets;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awzt {
    public final awzq a;
    public final String b;
    public int c;

    static {
        " ".codePointAt(0);
    }

    public awzt(String str, int i) {
        byte[] bArr = new byte[2];
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            try {
                randomAccessFile.readFully(bArr);
                this.a = new awzq(bArr);
                randomAccessFile.close();
                this.b = str;
                this.c = i;
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException | IllegalArgumentException e) {
            String valueOf = String.valueOf(str);
            throw new IOException(valueOf.length() != 0 ? "Wrong index file: ".concat(valueOf) : new String("Wrong index file: "), e);
        }
    }

    public static final String b(RandomAccessFile randomAccessFile) {
        int readByte = randomAccessFile.readByte() & 255;
        if (readByte == 0) {
            return null;
        }
        byte[] bArr = new byte[readByte];
        randomAccessFile.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static final int c(int i, RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[i];
        randomAccessFile.readFully(bArr);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 |= (bArr[i3] & 255) << (i3 * 8);
        }
        return i2;
    }

    public final void a(ArrayList arrayList, awzs awzsVar) {
        int i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            } else if (((awzs) arrayList.get(size)).c >= awzsVar.c) {
                i = size + 1;
                break;
            }
        }
        arrayList.add(i, awzsVar);
        if (arrayList.size() > this.c) {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
