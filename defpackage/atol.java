package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atol implements aonq {
    DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN(0),
    DOWNLOAD_QUALITY_SETTINGS_ACTION_SAVE(1),
    DOWNLOAD_QUALITY_SETTINGS_ACTION_EXPIRING_SAVE(2),
    DOWNLOAD_QUALITY_SETTINGS_ACTION_DONT_SAVE(3),
    DOWNLOAD_QUALITY_SETTINGS_ACTION_ALREADY_SAVED(4);

    public final int f;

    atol(int i) {
        this.f = i;
    }

    public static aons a() {
        return atnn.d;
    }

    public static atol b(int i) {
        if (i == 0) {
            return DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN;
        }
        if (i == 1) {
            return DOWNLOAD_QUALITY_SETTINGS_ACTION_SAVE;
        }
        if (i == 2) {
            return DOWNLOAD_QUALITY_SETTINGS_ACTION_EXPIRING_SAVE;
        }
        if (i == 3) {
            return DOWNLOAD_QUALITY_SETTINGS_ACTION_DONT_SAVE;
        }
        if (i != 4) {
            return null;
        }
        return DOWNLOAD_QUALITY_SETTINGS_ACTION_ALREADY_SAVED;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
