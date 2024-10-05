package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atmk implements aonq {
    EFFECTIVE_CONNECTION_TYPE_UNKNOWN(0),
    EFFECTIVE_CONNECTION_TYPE_OFFLINE(1),
    EFFECTIVE_CONNECTION_TYPE_SLOW_2G(2),
    EFFECTIVE_CONNECTION_TYPE_2G(3),
    EFFECTIVE_CONNECTION_TYPE_3G(4),
    EFFECTIVE_CONNECTION_TYPE_4G(5);

    public final int g;

    atmk(int i) {
        this.g = i;
    }

    public static aons a() {
        return atmj.a;
    }

    public static atmk b(int i) {
        if (i == 0) {
            return EFFECTIVE_CONNECTION_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return EFFECTIVE_CONNECTION_TYPE_OFFLINE;
        }
        if (i == 2) {
            return EFFECTIVE_CONNECTION_TYPE_SLOW_2G;
        }
        if (i == 3) {
            return EFFECTIVE_CONNECTION_TYPE_2G;
        }
        if (i == 4) {
            return EFFECTIVE_CONNECTION_TYPE_3G;
        }
        if (i != 5) {
            return null;
        }
        return EFFECTIVE_CONNECTION_TYPE_4G;
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
