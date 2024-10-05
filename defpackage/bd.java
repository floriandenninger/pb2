package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bd {
    public static long a(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    public static long b(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length() - 22;
            if (length < 0) {
                throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
            }
            long j = (-65536) + length;
            if (j < 0) {
                j = 0;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    be beVar = new be();
                    beVar.b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    beVar.a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    CRC32 crc32 = new CRC32();
                    long j2 = beVar.b;
                    randomAccessFile.seek(beVar.a);
                    byte[] bArr = new byte[16384];
                    int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j2));
                    while (read != -1) {
                        crc32.update(bArr, 0, read);
                        j2 -= read;
                        if (j2 == 0) {
                            break;
                        }
                        read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j2));
                    }
                    long value = crc32.getValue();
                    randomAccessFile.close();
                    return value == -1 ? value - 1 : value;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static SharedPreferences c(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0212, code lost:
    
        r13 = r13 + 1;
        r12 = r11.getEntry("classes" + r13 + ".dex");
        r1 = r18;
        r6 = r2;
        r2 = r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List d(java.io.File r17, java.io.File r18) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd.d(java.io.File, java.io.File):java.util.List");
    }

    public static void e(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    public static void f(Context context, long j, long j2, List list) {
        SharedPreferences.Editor edit = c(context).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            bc bcVar = (bc) it.next();
            edit.putLong("dex.crc." + i, bcVar.a);
            edit.putLong("dex.time." + i, bcVar.lastModified());
            i++;
        }
        edit.commit();
    }
}
