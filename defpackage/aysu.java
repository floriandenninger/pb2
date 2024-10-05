package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aysu {
    public static final ayrv a = new aysp();
    public static final Runnable b = new aysm();
    public static final ayrm c = new aysk();
    public static final ayrs d = new aysl();
    public static final ayrs e = new ayss();
    public static final aype g = new aype();
    public static final ayrw f = new ayst(0);

    public static ayrv a(Class cls) {
        return new aysi(cls);
    }

    public static ayrv b(Object obj) {
        return new aysq(obj);
    }

    public static ayrv c(ayro ayroVar) {
        aysw.b(ayroVar, "f is null");
        return new ayse(ayroVar);
    }

    public static ayrv d(ayrt ayrtVar) {
        aysw.b(ayrtVar, "f is null");
        return new aysf(ayrtVar);
    }

    public static ayrv e(ayru ayruVar) {
        aysw.b(ayruVar, "f is null");
        return new aysg(ayruVar);
    }

    public static Callable f(Object obj) {
        return new aysq(obj);
    }
}
