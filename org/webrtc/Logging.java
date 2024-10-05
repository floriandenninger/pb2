package org.webrtc;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class Logging {
    private static final Logger a;
    private static volatile boolean b;

    static {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        a = logger;
    }

    public static void a(String str, String str2) {
        f(2, str, str2);
    }

    public static void b(String str, String str2) {
        f(4, str, str2);
    }

    public static void c(String str, String str2, Throwable th) {
        f(4, str, str2);
        f(4, str, th.toString());
        f(4, str, g(th));
    }

    public static void d(String str, String str2) {
        f(3, str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        f(3, str, str2);
        f(3, str, th.toString());
        f(3, str, g(th));
    }

    public static void f(int i, String str, String str2) {
        Level level;
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Logging tag or message may not be null.");
        }
        int i2 = i - 1;
        if (i2 == 2) {
            level = Level.WARNING;
        } else if (i2 != 3) {
            level = Level.INFO;
        } else {
            level = Level.SEVERE;
        }
        Logger logger = a;
        StringBuilder sb = new StringBuilder(str.length() + 2 + str2.length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        logger.logp(level, "org.webrtc.Logging", "log", sb.toString());
    }

    private static String g(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int i);

    private static native void nativeLog(int i, String str, String str2);
}
