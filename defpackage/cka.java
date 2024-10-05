package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cka {
    private final kna a;

    public cka(kna knaVar, byte[] bArr) {
        this.a = knaVar;
    }

    public static String c(String str, cjz cjzVar, boolean z) {
        String replaceAll = str.replaceAll("\\W+", "");
        String str2 = cjzVar.c;
        if (z) {
            String valueOf = String.valueOf(str2);
            str2 = valueOf.length() != 0 ? ".temp".concat(valueOf) : new String(".temp");
        }
        StringBuilder sb = new StringBuilder(String.valueOf(replaceAll).length() + 13 + String.valueOf(str2).length());
        sb.append("lottie_cache_");
        sb.append(replaceAll);
        sb.append(str2);
        return sb.toString();
    }

    public final File a() {
        File file = new File(this.a.a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File b(String str, InputStream inputStream, cjz cjzVar) {
        File file = new File(a(), c(str, cjzVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }
}
