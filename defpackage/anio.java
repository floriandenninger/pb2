package defpackage;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anio {
    private String c = null;
    private Boolean d = null;
    public Integer a = null;
    public ThreadFactory b = null;

    public static String a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public static ThreadFactory b(anio anioVar) {
        String str = anioVar.c;
        Boolean bool = anioVar.d;
        Integer num = anioVar.a;
        ThreadFactory threadFactory = anioVar.b;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new anin(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num);
    }

    public final void c(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final void d(String str) {
        a(str, 0);
        this.c = str;
    }
}
