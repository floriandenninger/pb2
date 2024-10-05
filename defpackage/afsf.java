package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afsf {
    final String a;
    public final aqji b;
    long c;

    public afsf(long j, String str, aqji aqjiVar) {
        this.a = str;
        this.c = aqjiVar != null ? j - TimeUnit.SECONDS.toMillis(aqjiVar.c) : 0L;
        this.b = aqjiVar;
    }
}
