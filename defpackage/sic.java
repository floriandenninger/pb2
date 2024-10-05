package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sic extends anhf implements ania {
    private final long a;

    public sic(anhy anhyVar, long j) {
        super(anhyVar);
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        Delayed delayed2 = delayed;
        if (delayed2 == this) {
            return 0;
        }
        return (getDelay(TimeUnit.NANOSECONDS) > delayed2.getDelay(TimeUnit.NANOSECONDS) ? 1 : (getDelay(TimeUnit.NANOSECONDS) == delayed2.getDelay(TimeUnit.NANOSECONDS) ? 0 : -1));
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.a - System.nanoTime(), TimeUnit.NANOSECONDS);
    }
}
