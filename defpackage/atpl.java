package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atpl implements aonq {
    OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_UNKNOWN(0),
    OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NONE(1),
    OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK(2),
    OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK_WIFI(3);

    public final int e;

    atpl(int i) {
        this.e = i;
    }

    public static aons a() {
        return atnn.m;
    }

    public static atpl b(int i) {
        if (i == 0) {
            return OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_UNKNOWN;
        }
        if (i == 1) {
            return OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NONE;
        }
        if (i == 2) {
            return OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK;
        }
        if (i != 3) {
            return null;
        }
        return OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK_WIFI;
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
