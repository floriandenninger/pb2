package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amln extends amob {
    @Override // defpackage.amob
    public final long a() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}
