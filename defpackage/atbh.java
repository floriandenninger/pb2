package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atbh implements aonq {
    MDX_SESSION_CAST_EVENT_TYPE_UNKNOWN(0),
    MDX_SESSION_CAST_EVENT_TYPE_CAST_CONTEXT_INITIALIZED(1),
    MDX_SESSION_CAST_EVENT_TYPE_CAST_STARTING(2),
    MDX_SESSION_CAST_EVENT_TYPE_SCREEN_APP_LAUNCHED(3),
    MDX_SESSION_CAST_EVENT_TYPE_CAST_START_FAILED(4),
    MDX_SESSION_CAST_EVENT_TYPE_RECONNECTING(5),
    MDX_SESSION_CAST_EVENT_TYPE_RECONNECTED(6),
    MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_FAILED(7),
    MDX_SESSION_CAST_EVENT_TYPE_SUSPENDED(8),
    MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_MISMATCH(9),
    MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_SKIPPED(10),
    MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_NOT_RECOVERY(11);

    public final int m;

    atbh(int i) {
        this.m = i;
    }

    public static aons a() {
        return asvv.r;
    }

    public static atbh b(int i) {
        switch (i) {
            case 0:
                return MDX_SESSION_CAST_EVENT_TYPE_UNKNOWN;
            case 1:
                return MDX_SESSION_CAST_EVENT_TYPE_CAST_CONTEXT_INITIALIZED;
            case 2:
                return MDX_SESSION_CAST_EVENT_TYPE_CAST_STARTING;
            case 3:
                return MDX_SESSION_CAST_EVENT_TYPE_SCREEN_APP_LAUNCHED;
            case 4:
                return MDX_SESSION_CAST_EVENT_TYPE_CAST_START_FAILED;
            case 5:
                return MDX_SESSION_CAST_EVENT_TYPE_RECONNECTING;
            case 6:
                return MDX_SESSION_CAST_EVENT_TYPE_RECONNECTED;
            case 7:
                return MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_FAILED;
            case 8:
                return MDX_SESSION_CAST_EVENT_TYPE_SUSPENDED;
            case 9:
                return MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_MISMATCH;
            case 10:
                return MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_SKIPPED;
            case 11:
                return MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_NOT_RECOVERY;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
