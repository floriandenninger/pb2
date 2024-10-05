package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum augo implements aonq {
    PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN(0),
    PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_NOOP(1),
    PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_TOGGLE_STATE(2),
    PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_OPEN_AD(3);

    private final int f;

    augo(int i) {
        this.f = i;
    }

    public static aons a() {
        return aufb.f;
    }

    public static augo b(int i) {
        if (i == 0) {
            return PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_NOOP;
        }
        if (i == 2) {
            return PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_TOGGLE_STATE;
        }
        if (i != 3) {
            return null;
        }
        return PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_OPEN_AD;
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
