package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aora {
    static {
        aone createBuilder = aoqa.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aoqa) createBuilder.instance).b = -62135596800L;
        createBuilder.copyOnWrite();
        ((aoqa) createBuilder.instance).c = 0;
        aone createBuilder2 = aoqa.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((aoqa) createBuilder2.instance).b = 253402300799L;
        createBuilder2.copyOnWrite();
        ((aoqa) createBuilder2.instance).c = 999999999;
        aone createBuilder3 = aoqa.a.createBuilder();
        createBuilder3.copyOnWrite();
        ((aoqa) createBuilder3.instance).b = 0L;
        createBuilder3.copyOnWrite();
        ((aoqa) createBuilder3.instance).c = 0;
        new aoqy();
    }

    public static int a(aoqa aoqaVar, aoqa aoqaVar2) {
        return aoqz.a.compare(aoqaVar, aoqaVar2);
    }

    public static long b(aoqa aoqaVar) {
        g(aoqaVar);
        return anaf.ar(anaf.as(aoqaVar.b, 1000L), aoqaVar.c / 1000000);
    }

    public static aoqa c(long j) {
        return e(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static aoqa d(long j) {
        return e(j / 1000000000, (int) (j % 1000000000));
    }

    public static aoqa e(long j, int i) {
        long j2 = i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = anaf.ar(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        long j3 = j;
        if (i < 0) {
            i = (int) (i + 1000000000);
            long j4 = (-1) + j3;
            anaf.ap(((1 ^ j3) >= 0) | ((j3 ^ j4) >= 0), "checkedSubtract", j3, 1L);
            j3 = j4;
        }
        aone createBuilder = aoqa.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aoqa) createBuilder.instance).b = j3;
        createBuilder.copyOnWrite();
        ((aoqa) createBuilder.instance).c = i;
        aoqa aoqaVar = (aoqa) createBuilder.build();
        g(aoqaVar);
        return aoqaVar;
    }

    public static Comparator f() {
        return aoqz.a;
    }

    public static void g(aoqa aoqaVar) {
        long j = aoqaVar.b;
        int i = aoqaVar.c;
        if (j < -62135596800L || j > 253402300799L || i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(j), Integer.valueOf(i)));
        }
    }
}
