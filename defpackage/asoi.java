package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum asoi implements aonq {
    STARTUP_SIGNAL_ERROR_UNKNOWN(0),
    STARTUP_SIGNAL_ERROR_FIRST_THUMBNAIL_TIMEOUT(1),
    STARTUP_SIGNAL_ERROR_BROWSE_FEED_TIMEOUT(2),
    STARTUP_SIGNAL_ERROR_AFTER_ONRESUME_TIMEOUT(3);

    public final int e;

    asoi(int i) {
        this.e = i;
    }

    public static aons a() {
        return asje.n;
    }

    public static asoi b(int i) {
        if (i == 0) {
            return STARTUP_SIGNAL_ERROR_UNKNOWN;
        }
        if (i == 1) {
            return STARTUP_SIGNAL_ERROR_FIRST_THUMBNAIL_TIMEOUT;
        }
        if (i == 2) {
            return STARTUP_SIGNAL_ERROR_BROWSE_FEED_TIMEOUT;
        }
        if (i != 3) {
            return null;
        }
        return STARTUP_SIGNAL_ERROR_AFTER_ONRESUME_TIMEOUT;
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
