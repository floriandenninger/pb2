package defpackage;

import android.os.Build;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bze extends bzi {
    public bze(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        cda cdaVar = this.c;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            ajbh.X();
            ajbh.W(cda.a, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            millis = 900000;
        }
        cdaVar.b(millis, millis);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bzj a() {
        if (!this.a || Build.VERSION.SDK_INT < 23 || !this.c.k.c) {
            return new bzj(this.b, this.c, this.d);
        }
        throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
    }

    public bze(Class cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        super(cls);
        this.c.b(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
    }
}
