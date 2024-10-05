package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajrd {
    public final int a;
    public final int b;

    public ajrd(long j) {
        amkq.E(j >= 0);
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(j);
        this.a = minutes;
        this.b = (int) TimeUnit.MILLISECONDS.toSeconds(j - TimeUnit.MINUTES.toMillis(minutes));
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "%d:%02d", Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
