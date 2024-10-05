package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum apky implements aonq {
    BEDTIME_REMINDER_EVENT_TYPE_UNKNOWN(0),
    BEDTIME_REMINDER_EVENT_TYPE_IMPRESSION(1),
    BEDTIME_REMINDER_EVENT_TYPE_DISMISS(2),
    BEDTIME_REMINDER_EVENT_TYPE_SNOOZE(3);

    public final int e;

    apky(int i) {
        this.e = i;
    }

    public static aons a() {
        return apew.u;
    }

    public static apky b(int i) {
        if (i == 0) {
            return BEDTIME_REMINDER_EVENT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return BEDTIME_REMINDER_EVENT_TYPE_IMPRESSION;
        }
        if (i == 2) {
            return BEDTIME_REMINDER_EVENT_TYPE_DISMISS;
        }
        if (i != 3) {
            return null;
        }
        return BEDTIME_REMINDER_EVENT_TYPE_SNOOZE;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
