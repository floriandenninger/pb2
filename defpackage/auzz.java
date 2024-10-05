package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum auzz implements aonq {
    SUBSCRIPTION_NOTIFICATION_SETTING_STATE_UNKNOWN(0),
    SUBSCRIPTION_NOTIFICATION_SETTING_STATE_ENABLED(1),
    SUBSCRIPTION_NOTIFICATION_SETTING_STATE_DISABLED(2);

    private final int e;

    auzz(int i) {
        this.e = i;
    }

    public static aons a() {
        return auye.j;
    }

    public static auzz b(int i) {
        if (i == 0) {
            return SUBSCRIPTION_NOTIFICATION_SETTING_STATE_UNKNOWN;
        }
        if (i == 1) {
            return SUBSCRIPTION_NOTIFICATION_SETTING_STATE_ENABLED;
        }
        if (i != 2) {
            return null;
        }
        return SUBSCRIPTION_NOTIFICATION_SETTING_STATE_DISABLED;
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
