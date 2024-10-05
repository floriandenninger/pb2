package defpackage;

import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ryg implements ryp {
    public final Calendar a = run.a();

    public static void d(int i) {
        sbt.a(i > 0, "tickIncrement must be greater than 0");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract long a(Calendar calendar, long j, int i);

    public final long b(Calendar calendar, long j, int i) {
        long c = c(calendar, j, i);
        return c == j ? c : a(calendar, c, i);
    }

    protected abstract long c(Calendar calendar, long j, int i);

    @Override // defpackage.ryp
    public final rye e(ryv ryvVar) {
        return new rye(this, ryvVar);
    }

    @Override // defpackage.ryp
    public final int f(ryv ryvVar) {
        d(1);
        long b = b(this.a, ((Double) ryvVar.a).longValue(), 1);
        long longValue = ((Double) ryvVar.b).longValue();
        int i = 0;
        while (b <= longValue) {
            i++;
            b = a(this.a, b, 1);
        }
        return i;
    }
}
