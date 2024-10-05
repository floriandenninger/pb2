package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atrv implements aonq {
    OFFLINEABILITY_AVAILABILITY_TYPE_UNKNOWN(0),
    OFFLINEABILITY_AVAILABILITY_TYPE_FREE(1),
    OFFLINEABILITY_AVAILABILITY_TYPE_PREMIUM_LOCKED(2),
    OFFLINEABILITY_AVAILABILITY_TYPE_PREMIUM_UNLOCKED(3);

    public final int e;

    atrv(int i) {
        this.e = i;
    }

    public static aons a() {
        return atqp.i;
    }

    public static atrv b(int i) {
        if (i == 0) {
            return OFFLINEABILITY_AVAILABILITY_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return OFFLINEABILITY_AVAILABILITY_TYPE_FREE;
        }
        if (i == 2) {
            return OFFLINEABILITY_AVAILABILITY_TYPE_PREMIUM_LOCKED;
        }
        if (i != 3) {
            return null;
        }
        return OFFLINEABILITY_AVAILABILITY_TYPE_PREMIUM_UNLOCKED;
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
