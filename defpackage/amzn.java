package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amzn {
    private static String a = "amzx";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] d = {"amzx", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int a() {
        return ((anba) anba.a.get()).b;
    }

    public static long b() {
        return amzl.a.c();
    }

    public static amyp d(String str) {
        return amzl.a.e(str);
    }

    public static amyt f() {
        return i().a();
    }

    public static amzm g() {
        return amzl.a.h();
    }

    public static anaf i() {
        return amzl.a.j();
    }

    public static anam k() {
        return i().b();
    }

    public static String l() {
        return amzl.a.m();
    }

    public static boolean n(String str, Level level, boolean z) {
        i().c(str, level, z);
        return false;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract amyp e(String str);

    protected abstract amzm h();

    protected anaf j() {
        return anah.a;
    }

    protected abstract String m();
}
