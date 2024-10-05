package defpackage;

import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dli {
    private static dli a;
    private final Configuration b;

    public dli(Configuration configuration) {
        this.b = configuration;
        new aef(500);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized dli a(Configuration configuration) {
        dli dliVar;
        synchronized (dli.class) {
            dli dliVar2 = a;
            if (dliVar2 == null || !dliVar2.b.equals(configuration)) {
                a = new dli(new Configuration(configuration));
            }
            dliVar = a;
        }
        return dliVar;
    }
}
