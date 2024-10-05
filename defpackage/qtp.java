package defpackage;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qtp {
    private static String a;
    private static int b;

    public static String a() {
        BufferedReader bufferedReader;
        if (a == null) {
            if (b == 0) {
                b = Process.myPid();
            }
            int i = b;
            String str = null;
            str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            if (i > 0) {
                try {
                    StringBuilder sb = new StringBuilder(25);
                    sb.append("/proc/");
                    sb.append(i);
                    sb.append("/cmdline");
                    String sb2 = sb.toString();
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(sb2));
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException unused) {
                    bufferedReader = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    String readLine = bufferedReader.readLine();
                    qip.an(readLine);
                    str = readLine.trim();
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    qtn.a(bufferedReader2);
                    throw th;
                }
                qtn.a(bufferedReader);
            }
            a = str;
        }
        return a;
    }
}
