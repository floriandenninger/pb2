package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aujq implements aonq {
    REEL_LOOP_BEHAVIOR_UNKNOWN(0),
    REEL_LOOP_BEHAVIOR_SINGLE_PLAY(1),
    REEL_LOOP_BEHAVIOR_REPEAT(2);

    private final int e;

    aujq(int i) {
        this.e = i;
    }

    public static aons a() {
        return aujj.g;
    }

    public static aujq b(int i) {
        if (i == 0) {
            return REEL_LOOP_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return REEL_LOOP_BEHAVIOR_SINGLE_PLAY;
        }
        if (i != 2) {
            return null;
        }
        return REEL_LOOP_BEHAVIOR_REPEAT;
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
