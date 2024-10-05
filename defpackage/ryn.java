package defpackage;

import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ryn extends ryg {
    private final int[] b;

    public ryn() {
        int[] iArr = {1, 2, 3, 4, 6, 12};
        sbt.g(iArr, "allowedTickIncrements");
        sbt.a(true, "Must have at least one increment option in allowedTickIncrements");
        for (int i = 0; i < 6; i++) {
            sbt.a(iArr[i] > 0, "increment must be >= 1 for allowedTickIncrements");
        }
        this.b = iArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ryg
    public final long a(Calendar calendar, long j, int i) {
        calendar.setTimeInMillis(j);
        calendar.add(2, i);
        return calendar.getTimeInMillis();
    }

    @Override // defpackage.ryg
    protected final long c(Calendar calendar, long j, int i) {
        calendar.setTimeInMillis(j);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(2, -(calendar.get(2) % i));
        return calendar.getTimeInMillis();
    }

    @Override // defpackage.ryp
    public final int[] g() {
        return this.b;
    }
}
