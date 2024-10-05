package defpackage;

import java.io.BufferedReader;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dob {
    public static int a = -2;
    public static final FileFilter b = new zfp(1);

    public static int a(String str) {
        FileInputStream fileInputStream = null;
        int i = -1;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2));
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                if (readLine != null && readLine.matches("0-[\\d]+$")) {
                    i = Integer.valueOf(readLine.substring(2)).intValue() + 1;
                }
                try {
                    fileInputStream2.close();
                } catch (IOException unused) {
                }
                return i;
            } catch (IOException unused2) {
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return -1;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
