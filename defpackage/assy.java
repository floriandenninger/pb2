package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum assy implements aonq {
    LIVE_ONLY_PEG_STRATEGY_UNKNOWN(0),
    LIVE_ONLY_PEG_STRATEGY_DO_NOT_PEG(1),
    LIVE_ONLY_PEG_STRATEGY_SEEK_ON_RESUME(3),
    LIVE_ONLY_PEG_STRATEGY_SEEK_ON_REBUFFER_ESTIMATE_DURATION(6);

    private final int f;

    assy(int i) {
        this.f = i;
    }

    public static aons a() {
        return assi.h;
    }

    public static assy b(int i) {
        if (i == 0) {
            return LIVE_ONLY_PEG_STRATEGY_UNKNOWN;
        }
        if (i == 1) {
            return LIVE_ONLY_PEG_STRATEGY_DO_NOT_PEG;
        }
        if (i == 3) {
            return LIVE_ONLY_PEG_STRATEGY_SEEK_ON_RESUME;
        }
        if (i != 6) {
            return null;
        }
        return LIVE_ONLY_PEG_STRATEGY_SEEK_ON_REBUFFER_ESTIMATE_DURATION;
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
