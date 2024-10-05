package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum auxs implements aonq {
    STARTUP_SIGNAL_UNKNOWN(0),
    STARTUP_SIGNAL_FIRST_THUMBNAIL_LOADED(1),
    STARTUP_SIGNAL_BROWSE_FEED_LOADED(2),
    STARTUP_SIGNAL_ACTIVITY_ONRESUME_LOADED(3);

    private final int f;

    auxs(int i) {
        this.f = i;
    }

    public static aons a() {
        return auqy.s;
    }

    public static auxs b(int i) {
        if (i == 0) {
            return STARTUP_SIGNAL_UNKNOWN;
        }
        if (i == 1) {
            return STARTUP_SIGNAL_FIRST_THUMBNAIL_LOADED;
        }
        if (i == 2) {
            return STARTUP_SIGNAL_BROWSE_FEED_LOADED;
        }
        if (i != 3) {
            return null;
        }
        return STARTUP_SIGNAL_ACTIVITY_ONRESUME_LOADED;
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
