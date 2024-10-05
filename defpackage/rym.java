package defpackage;

import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rym extends ryg {
    private final int[] b;

    public rym() {
        int[] iArr = {5, 10, 15, 20, 30};
        sbt.g(iArr, "allowedTickIncrements");
        sbt.a(true, "Must have at least one increment option in allowedTickIncrements");
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            sbt.a(i2 > 0 && i2 <= 60, "increment must be between 1 and 60 inclusive for allowedTickIncrements");
        }
        this.b = iArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ryg
    public final long a(Calendar calendar, long j, int i) {
        calendar.setTimeInMillis(j);
        calendar.add(12, i);
        return calendar.getTimeInMillis();
    }

    @Override // defpackage.ryg
    protected final long c(Calendar calendar, long j, int i) {
        calendar.setTimeInMillis(j);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.set(12, 0);
        calendar2.add(10, 1);
        int timeInMillis = (((int) (calendar2.getTimeInMillis() - calendar.getTimeInMillis())) / 60000) % i;
        calendar.add(12, -(timeInMillis != 0 ? i - timeInMillis : 0));
        return calendar.getTimeInMillis();
    }

    @Override // defpackage.ryp
    public final int[] g() {
        return this.b;
    }
}
