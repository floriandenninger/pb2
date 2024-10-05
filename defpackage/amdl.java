package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum amdl {
    DONT_CARE(Long.MAX_VALUE),
    SAME_WEEK(TimeUnit.MILLISECONDS.convert(7, TimeUnit.DAYS)),
    SAME_DAY(TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS)),
    FEW_HOURS(TimeUnit.MILLISECONDS.convert(4, TimeUnit.HOURS)),
    ONE_HOUR(TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS)),
    HALF_HOUR(TimeUnit.MILLISECONDS.convert(30, TimeUnit.MINUTES)),
    TEN_MINUTES(TimeUnit.MILLISECONDS.convert(10, TimeUnit.MINUTES)),
    FEW_MINUTES(TimeUnit.MILLISECONDS.convert(4, TimeUnit.MINUTES)),
    ONE_MINUTE(TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES)),
    FEW_SECONDS(TimeUnit.MILLISECONDS.convert(4, TimeUnit.SECONDS));

    final long k;

    amdl(long j) {
        this.k = j;
    }
}
