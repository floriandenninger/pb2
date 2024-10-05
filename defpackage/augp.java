package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum augp implements aonq {
    PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN(0),
    PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_NOOP(1),
    PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_OPEN_AD(3);

    private final int e;

    augp(int i) {
        this.e = i;
    }

    public static aons a() {
        return aufb.g;
    }

    public static augp b(int i) {
        if (i == 0) {
            return PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_NOOP;
        }
        if (i != 3) {
            return null;
        }
        return PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_OPEN_AD;
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
