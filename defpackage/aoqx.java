package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoqx {
    static {
        aone createBuilder = aoms.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aoms) createBuilder.instance).b = -315576000000L;
        createBuilder.copyOnWrite();
        ((aoms) createBuilder.instance).c = -999999999;
        aone createBuilder2 = aoms.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((aoms) createBuilder2.instance).b = 315576000000L;
        createBuilder2.copyOnWrite();
        ((aoms) createBuilder2.instance).c = 999999999;
        aone createBuilder3 = aoms.a.createBuilder();
        createBuilder3.copyOnWrite();
        ((aoms) createBuilder3.instance).b = 0L;
        createBuilder3.copyOnWrite();
        ((aoms) createBuilder3.instance).c = 0;
    }

    public static long a(aoms aomsVar) {
        d(aomsVar);
        return anaf.ar(anaf.as(aomsVar.b, 1000L), aomsVar.c / 1000000);
    }

    public static aoms b(long j) {
        return c(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static aoms c(long j, int i) {
        long j2 = i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = anaf.ar(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (j > 0 && i < 0) {
            i = (int) (i + 1000000000);
            j--;
        }
        if (j < 0 && i > 0) {
            i = (int) (i - 1000000000);
            j++;
        }
        aone createBuilder = aoms.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aoms) createBuilder.instance).b = j;
        createBuilder.copyOnWrite();
        ((aoms) createBuilder.instance).c = i;
        aoms aomsVar = (aoms) createBuilder.build();
        d(aomsVar);
        return aomsVar;
    }

    public static void d(aoms aomsVar) {
        long j = aomsVar.b;
        int i = aomsVar.c;
        if (j >= -315576000000L && j <= 315576000000L) {
            long j2 = i;
            if (j2 >= -999999999 && j2 < 1000000000) {
                if (j >= 0 && i >= 0) {
                    return;
                }
                if (j <= 0 && i <= 0) {
                    return;
                }
            }
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j), Integer.valueOf(i)));
    }
}
