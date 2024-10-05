package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum asyu implements aonq {
    SYNC_MODE_UNKNOWN(0),
    SYNC_MODE_USER_BROWSING(1),
    SYNC_MODE_SYNCED_WITH_VIDEO(2);

    public final int d;

    asyu(int i) {
        this.d = i;
    }

    public static aons a() {
        return asvv.g;
    }

    public static asyu b(int i) {
        if (i == 0) {
            return SYNC_MODE_UNKNOWN;
        }
        if (i == 1) {
            return SYNC_MODE_USER_BROWSING;
        }
        if (i != 2) {
            return null;
        }
        return SYNC_MODE_SYNCED_WITH_VIDEO;
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
