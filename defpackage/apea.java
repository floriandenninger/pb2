package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum apea implements aonq {
    ANDROID_ONESIE_HOT_CONFIG_FEATURES_UNKNOWN(0),
    ANDROID_ONESIE_HOT_CONFIG_FEATURES_USE_VIDEO_ID_IN_DATA_SOURCE(2),
    ANDROID_ONESIE_HOT_CONFIG_FEATURES_HANDLE_RESPONSE_STALENESS(3),
    ANDROID_ONESIE_HOT_CONFIG_FEATURES_PREWARM_FROM_PLAYERLIB(4),
    ANDROID_ONESIE_HOT_CONFIG_FEATURES_DISABLE_CANCEL_FROM_MEDIAPLAYER(5),
    ANDROID_ONESIE_HOT_CONFIG_FEATURES_ENCRYPT_FROM_PREPARER(6),
    UNRECOGNIZED(-1);

    private final int i;

    apea(int i) {
        this.i = i;
    }

    public static aons a() {
        return apaf.q;
    }

    public static apea b(int i) {
        if (i == 0) {
            return ANDROID_ONESIE_HOT_CONFIG_FEATURES_UNKNOWN;
        }
        if (i == 2) {
            return ANDROID_ONESIE_HOT_CONFIG_FEATURES_USE_VIDEO_ID_IN_DATA_SOURCE;
        }
        if (i == 3) {
            return ANDROID_ONESIE_HOT_CONFIG_FEATURES_HANDLE_RESPONSE_STALENESS;
        }
        if (i == 4) {
            return ANDROID_ONESIE_HOT_CONFIG_FEATURES_PREWARM_FROM_PLAYERLIB;
        }
        if (i == 5) {
            return ANDROID_ONESIE_HOT_CONFIG_FEATURES_DISABLE_CANCEL_FROM_MEDIAPLAYER;
        }
        if (i != 6) {
            return null;
        }
        return ANDROID_ONESIE_HOT_CONFIG_FEATURES_ENCRYPT_FROM_PREPARER;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
