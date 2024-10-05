package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum bacq implements aonq {
    UNKNOWN(0),
    PRIMES_INITIALIZED(1),
    PRIMES_CRASH_MONITORING_INITIALIZED(2),
    PRIMES_FIRST_ACTIVITY_LAUNCHED(3),
    PRIMES_CUSTOM_LAUNCHED(4);

    private static final aonr f = new ancw(6);
    private final int h;

    bacq(int i) {
        this.h = i;
    }

    public static aons a() {
        return babw.f;
    }

    public static bacq b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PRIMES_INITIALIZED;
        }
        if (i == 2) {
            return PRIMES_CRASH_MONITORING_INITIALIZED;
        }
        if (i == 3) {
            return PRIMES_FIRST_ACTIVITY_LAUNCHED;
        }
        if (i != 4) {
            return null;
        }
        return PRIMES_CUSTOM_LAUNCHED;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
