package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ems {
    static final long a = TimeUnit.SECONDS.toMillis(72);
    static final long b = TimeUnit.SECONDS.toMillis(60);
    static final long c = TimeUnit.SECONDS.toMillis(36);
    static final long d = TimeUnit.SECONDS.toMillis(18);
    static final long e = TimeUnit.SECONDS.toMillis(3);
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors > 4) {
            return 3;
        }
        return availableProcessors <= 2 ? 1 : 2;
    }
}
