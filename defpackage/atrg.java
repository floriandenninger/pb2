package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atrg implements aonq {
    OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN(0),
    OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_ALL_DEDUPE(1),
    OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_IN_ORDER_DEDUPE(2),
    OFFLINE_VIDEO_SELECTION_STRATEGY_INTERLEAVING_REMOVE_ADD_IN_ORDER_DEDUPE(3);

    public final int e;

    atrg(int i) {
        this.e = i;
    }

    public static atrg a(int i) {
        if (i == 0) {
            return OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN;
        }
        if (i == 1) {
            return OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_ALL_DEDUPE;
        }
        if (i == 2) {
            return OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_IN_ORDER_DEDUPE;
        }
        if (i != 3) {
            return null;
        }
        return OFFLINE_VIDEO_SELECTION_STRATEGY_INTERLEAVING_REMOVE_ADD_IN_ORDER_DEDUPE;
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
