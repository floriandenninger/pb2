package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uta extends usr implements upq, uog {
    private static final amxj a = amxj.l("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricServiceImpl");
    private final uok b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final AtomicBoolean f = new AtomicBoolean();

    public uta(uok uokVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.b = uokVar;
        this.c = azrwVar;
        this.d = azrwVar2;
        this.e = azrwVar3;
    }

    private static long e(Long l, long j) {
        return l == null ? j : Math.min(l.longValue(), j);
    }

    private static babz f(uso usoVar) {
        aone createBuilder = babz.a.createBuilder();
        if (usoVar.a != null) {
            String str = usoVar.a;
            createBuilder.copyOnWrite();
            babz babzVar = (babz) createBuilder.instance;
            str.getClass();
            babzVar.b |= 1;
            babzVar.c = str;
        }
        if (usoVar.b != null) {
            long longValue = usoVar.b.longValue();
            createBuilder.copyOnWrite();
            babz babzVar2 = (babz) createBuilder.instance;
            babzVar2.b |= 2;
            babzVar2.d = longValue;
        }
        if (usoVar.c != null) {
            long longValue2 = usoVar.c.longValue();
            createBuilder.copyOnWrite();
            babz babzVar3 = (babz) createBuilder.instance;
            babzVar3.b |= 4;
            babzVar3.e = longValue2;
        }
        if (usoVar.d != null) {
            long longValue3 = usoVar.d.longValue();
            createBuilder.copyOnWrite();
            babz babzVar4 = (babz) createBuilder.instance;
            babzVar4.b |= 8;
            babzVar4.f = longValue3;
        }
        return (babz) createBuilder.build();
    }

    @Override // defpackage.upq, defpackage.uyo
    public final void a() {
        this.b.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d1  */
    @Override // defpackage.uog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.app.Activity r17) {
        /*
            Method dump skipped, instructions count: 1369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uta.d(android.app.Activity):void");
    }
}
