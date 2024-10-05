package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum auiu implements aonq {
    REACHABILITY_DETECTION_STRATEGY_TYPE_UNKNOWN(0),
    REACHABILITY_DETECTION_STRATEGY_TYPE_LOGGING(1),
    REACHABILITY_DETECTION_STRATEGY_TYPE_DELAYED(2),
    REACHABILITY_DETECTION_STRATEGY_TYPE_GEN204(3),
    REACHABILITY_DETECTION_STRATEGY_TYPE_ALWAYS_ON(4);

    public final int f;

    auiu(int i) {
        this.f = i;
    }

    public static aons a() {
        return aufb.u;
    }

    public static auiu b(int i) {
        if (i == 0) {
            return REACHABILITY_DETECTION_STRATEGY_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return REACHABILITY_DETECTION_STRATEGY_TYPE_LOGGING;
        }
        if (i == 2) {
            return REACHABILITY_DETECTION_STRATEGY_TYPE_DELAYED;
        }
        if (i == 3) {
            return REACHABILITY_DETECTION_STRATEGY_TYPE_GEN204;
        }
        if (i != 4) {
            return null;
        }
        return REACHABILITY_DETECTION_STRATEGY_TYPE_ALWAYS_ON;
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
