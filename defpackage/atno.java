package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atno implements aonq {
    NOTIFICATION_OS_SETTING_STATE_UNKNOWN(0),
    NOTIFICATION_OS_SETTING_STATE_ENABLED(1),
    NOTIFICATION_OS_SETTING_STATE_DISABLED(2),
    NOTIFICATION_OS_SETTING_STATE_ONLY_CHANNEL_DISABLED(3);

    public final int e;

    atno(int i) {
        this.e = i;
    }

    public static aons a() {
        return atnn.a;
    }

    public static atno b(int i) {
        if (i == 0) {
            return NOTIFICATION_OS_SETTING_STATE_UNKNOWN;
        }
        if (i == 1) {
            return NOTIFICATION_OS_SETTING_STATE_ENABLED;
        }
        if (i == 2) {
            return NOTIFICATION_OS_SETTING_STATE_DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return NOTIFICATION_OS_SETTING_STATE_ONLY_CHANNEL_DISABLED;
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
