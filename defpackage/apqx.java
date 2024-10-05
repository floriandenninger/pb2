package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum apqx implements aonq {
    CHANNEL_STATUS_UNKNOWN(0),
    CHANNEL_STATUS_UNREAD(1),
    CHANNEL_STATUS_LIVE(2);

    public final int d;

    apqx(int i) {
        this.d = i;
    }

    public static aons a() {
        return apqr.d;
    }

    public static apqx b(int i) {
        if (i == 0) {
            return CHANNEL_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return CHANNEL_STATUS_UNREAD;
        }
        if (i != 2) {
            return null;
        }
        return CHANNEL_STATUS_LIVE;
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
