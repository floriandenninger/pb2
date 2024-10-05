package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum asoj implements aonq {
    STARTUP_SIGNAL_TYPE_UNKNOWN(0),
    STARTUP_SIGNAL_TYPE_SIGNAL_STREAM_CREATED(1),
    STARTUP_SIGNAL_TYPE_SIGNAL_STREAM_STOPPED(2),
    STARTUP_SIGNAL_TYPE_FIRST_THUMBNAIL_LOADED(3),
    STARTUP_SIGNAL_TYPE_BROWSE_FEED_LOADED(4),
    STARTUP_SIGNAL_TYPE_AFTER_ONRESUME_LOADED(5);

    public final int g;

    asoj(int i) {
        this.g = i;
    }

    public static aons a() {
        return asje.o;
    }

    public static asoj b(int i) {
        if (i == 0) {
            return STARTUP_SIGNAL_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return STARTUP_SIGNAL_TYPE_SIGNAL_STREAM_CREATED;
        }
        if (i == 2) {
            return STARTUP_SIGNAL_TYPE_SIGNAL_STREAM_STOPPED;
        }
        if (i == 3) {
            return STARTUP_SIGNAL_TYPE_FIRST_THUMBNAIL_LOADED;
        }
        if (i == 4) {
            return STARTUP_SIGNAL_TYPE_BROWSE_FEED_LOADED;
        }
        if (i != 5) {
            return null;
        }
        return STARTUP_SIGNAL_TYPE_AFTER_ONRESUME_LOADED;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
