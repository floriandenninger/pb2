package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agrk {
    public final String a;
    public final long b;

    public agrk(atqg atqgVar, long j) {
        this.a = atqgVar.b;
        this.b = j + TimeUnit.SECONDS.toMillis(atqgVar.d);
    }

    public agrk(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
