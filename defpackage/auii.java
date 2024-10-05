package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum auii implements aonq {
    QOE_HOT_CONFIG_FEATURES_UNSPECIFIED(0),
    QOE_HOT_CONFIG_FEATURES_USE_STRING_FORMAT_FOR_ELAPSED_TIME(1),
    QOE_HOT_CONFIG_FEATURES_DISABLE_ECATCHER_PINGS(2),
    QOE_HOT_CONFIG_FEATURES_REMOVE_EXPIDS_AFTER_FIRST_PING(4),
    QOE_HOT_CONFIG_FEATURES_PUSH_DROPPED_FRAMES(5),
    QOE_HOT_CONFIG_FEATURES_PUSH_BUFFER_HEALTH(6),
    QOE_HOT_CONFIG_FEATURES_DO_NOT_CHANGE_FATAL_ERROR_CODE(8),
    UNRECOGNIZED(-1);

    private final int j;

    auii(int i2) {
        this.j = i2;
    }

    public static aons a() {
        return aufb.q;
    }

    public static auii b(int i2) {
        if (i2 == 0) {
            return QOE_HOT_CONFIG_FEATURES_UNSPECIFIED;
        }
        if (i2 == 1) {
            return QOE_HOT_CONFIG_FEATURES_USE_STRING_FORMAT_FOR_ELAPSED_TIME;
        }
        if (i2 == 2) {
            return QOE_HOT_CONFIG_FEATURES_DISABLE_ECATCHER_PINGS;
        }
        if (i2 == 4) {
            return QOE_HOT_CONFIG_FEATURES_REMOVE_EXPIDS_AFTER_FIRST_PING;
        }
        if (i2 == 5) {
            return QOE_HOT_CONFIG_FEATURES_PUSH_DROPPED_FRAMES;
        }
        if (i2 == 6) {
            return QOE_HOT_CONFIG_FEATURES_PUSH_BUFFER_HEALTH;
        }
        if (i2 != 8) {
            return null;
        }
        return QOE_HOT_CONFIG_FEATURES_DO_NOT_CHANGE_FATAL_ERROR_CODE;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
