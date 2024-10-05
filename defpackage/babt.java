package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum babt implements aonq {
    PEER_DISTANCE_UNKNOWN(0),
    PEER_DISTANCE_IN_PROCESS(1),
    PEER_DISTANCE_INTER_PROCESS(2);

    public final int d;

    babt(int i) {
        this.d = i;
    }

    public static aons a() {
        return axcs.s;
    }

    public static babt b(int i) {
        if (i == 0) {
            return PEER_DISTANCE_UNKNOWN;
        }
        if (i == 1) {
            return PEER_DISTANCE_IN_PROCESS;
        }
        if (i != 2) {
            return null;
        }
        return PEER_DISTANCE_INTER_PROCESS;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
