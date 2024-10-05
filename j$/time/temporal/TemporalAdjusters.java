package j$.time.temporal;

import j$.time.DayOfWeek;

/* loaded from: classes5.dex */
public abstract class TemporalAdjusters {
    public static TemporalAdjuster nextOrSame(DayOfWeek dayOfWeek) {
        final int value = dayOfWeek.getValue();
        return new TemporalAdjuster() { // from class: j$.time.temporal.TemporalAdjusters$$ExternalSyntheticLambda1
            @Override // j$.time.temporal.TemporalAdjuster
            public final Temporal adjustInto(Temporal temporal) {
                return TemporalAdjusters.lambda$nextOrSame$10(value, temporal);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Temporal lambda$nextOrSame$10(int i, Temporal temporal) {
        int i2 = temporal.get(ChronoField.DAY_OF_WEEK);
        if (i2 == i) {
            return temporal;
        }
        return temporal.plus(i2 - i >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
    }

    public static TemporalAdjuster previousOrSame(DayOfWeek dayOfWeek) {
        final int value = dayOfWeek.getValue();
        return new TemporalAdjuster() { // from class: j$.time.temporal.TemporalAdjusters$$ExternalSyntheticLambda3
            @Override // j$.time.temporal.TemporalAdjuster
            public final Temporal adjustInto(Temporal temporal) {
                return TemporalAdjusters.lambda$previousOrSame$12(value, temporal);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Temporal lambda$previousOrSame$12(int i, Temporal temporal) {
        int i2 = temporal.get(ChronoField.DAY_OF_WEEK);
        if (i2 == i) {
            return temporal;
        }
        return temporal.minus(i - i2 >= 0 ? 7 - r2 : -r2, ChronoUnit.DAYS);
    }
}
