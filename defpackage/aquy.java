package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aquy implements aonq {
    MANIFESTLESS_SEQUENCE_METHOD_UNKNOWN(0),
    MANIFESTLESS_SEQUENCE_METHOD_LIVE_HEAD(1),
    UNRECOGNIZED(-1);

    private final int e;

    aquy(int i) {
        this.e = i;
    }

    public static aons a() {
        return aquw.c;
    }

    public static aquy b(int i) {
        if (i == 0) {
            return MANIFESTLESS_SEQUENCE_METHOD_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return MANIFESTLESS_SEQUENCE_METHOD_LIVE_HEAD;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
