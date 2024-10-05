package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum astk implements aonq {
    LIVESTREAM_CONNECTION_STATE_UNKNOWN(0),
    LIVESTREAM_CONNECTION_STATE_NEVER_CONNECTED(1),
    LIVESTREAM_CONNECTION_STATE_DISCONNECTED(2),
    LIVESTREAM_CONNECTION_STATE_RECONNECTING(3),
    LIVESTREAM_CONNECTION_STATE_ACTIVE(4);

    public final int f;

    astk(int i) {
        this.f = i;
    }

    public static aons a() {
        return assi.k;
    }

    public static astk b(int i) {
        if (i == 0) {
            return LIVESTREAM_CONNECTION_STATE_UNKNOWN;
        }
        if (i == 1) {
            return LIVESTREAM_CONNECTION_STATE_NEVER_CONNECTED;
        }
        if (i == 2) {
            return LIVESTREAM_CONNECTION_STATE_DISCONNECTED;
        }
        if (i == 3) {
            return LIVESTREAM_CONNECTION_STATE_RECONNECTING;
        }
        if (i != 4) {
            return null;
        }
        return LIVESTREAM_CONNECTION_STATE_ACTIVE;
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
