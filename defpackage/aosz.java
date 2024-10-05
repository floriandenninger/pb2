package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aosz implements aonq {
    ONESIE_REQUEST_TARGET_UNKNOWN(0),
    ONESIE_REQUEST_TARGET_ENCRYPTED_PLAYER_SERVICE(1),
    ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE(2),
    ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE_PHASE_TWO(3);

    public final int e;

    aosz(int i) {
        this.e = i;
    }

    public static aons a() {
        return aokr.r;
    }

    public static aosz b(int i) {
        if (i == 0) {
            return ONESIE_REQUEST_TARGET_UNKNOWN;
        }
        if (i == 1) {
            return ONESIE_REQUEST_TARGET_ENCRYPTED_PLAYER_SERVICE;
        }
        if (i == 2) {
            return ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE;
        }
        if (i != 3) {
            return null;
        }
        return ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE_PHASE_TWO;
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
