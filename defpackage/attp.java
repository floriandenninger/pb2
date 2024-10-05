package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum attp implements aonq {
    PARTICIPANT_JOIN_STATE_UNKNOWN(0),
    PARTICIPANT_JOIN_STATE_PREJOIN(1),
    PARTICIPANT_JOIN_STATE_WAITING(2),
    PARTICIPANT_JOIN_STATE_REFUSED(3),
    PARTICIPANT_JOIN_STATE_APPROVED(4);

    public final int f;

    attp(int i) {
        this.f = i;
    }

    public static aons a() {
        return atqp.l;
    }

    public static attp b(int i) {
        if (i == 0) {
            return PARTICIPANT_JOIN_STATE_UNKNOWN;
        }
        if (i == 1) {
            return PARTICIPANT_JOIN_STATE_PREJOIN;
        }
        if (i == 2) {
            return PARTICIPANT_JOIN_STATE_WAITING;
        }
        if (i == 3) {
            return PARTICIPANT_JOIN_STATE_REFUSED;
        }
        if (i != 4) {
            return null;
        }
        return PARTICIPANT_JOIN_STATE_APPROVED;
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
