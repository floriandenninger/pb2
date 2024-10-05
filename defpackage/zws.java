package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zws {
    public static final long a = Duration.ofSeconds(1).toMillis();

    public static String a(long j) {
        long j2 = a;
        return j >= j2 ? zhq.i(((int) j) / j2) : "";
    }
}
