package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pyo {
    public static final yxw a = new yxw("gads:dynamite_load:fail:sample_rate", 10000L, 2);
    public static final yxw b;
    public static final yxw c;
    public static final yxw d;
    public static final yxw e;

    static {
        yxw.c("gads:report_dynamite_crash_in_background_thread", false);
        b = yxw.b("gads:public_beta:traffic_multiplier", "1.0");
        c = yxw.b("gads:sdk_crash_report_class_prefix", "com.google.");
        d = yxw.c("gads:sdk_crash_report_enabled", false);
        e = yxw.c("gads:sdk_crash_report_full_stacktrace", false);
        new yxw("gads:trapped_exception_sample_rate", Double.valueOf(0.01d), 3);
    }
}
