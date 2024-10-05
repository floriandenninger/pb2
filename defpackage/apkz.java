package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum apkz implements aonq {
    BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_UNKNOWN(0),
    BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_ENGAGE_PANEL(1),
    BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_DIALOG(2);

    public final int d;

    apkz(int i) {
        this.d = i;
    }

    public static aons a() {
        return apld.b;
    }

    public static apkz b(int i) {
        if (i == 0) {
            return BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_ENGAGE_PANEL;
        }
        if (i != 2) {
            return null;
        }
        return BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_DIALOG;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
