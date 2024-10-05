package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum auit implements aonq {
    REACHABILITY_DETECTION_EVENT_TYPE_UNKNOWN(0),
    REACHABILITY_DETECTION_EVENT_TYPE_SUCCESSFUL_REQUEST(1),
    REACHABILITY_DETECTION_EVENT_TYPE_FAILED_REQUEST(2),
    REACHABILITY_DETECTION_EVENT_TYPE_REFRESH(3);

    public final int e;

    auit(int i) {
        this.e = i;
    }

    public static aons a() {
        return aufb.t;
    }

    public static auit b(int i) {
        if (i == 0) {
            return REACHABILITY_DETECTION_EVENT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return REACHABILITY_DETECTION_EVENT_TYPE_SUCCESSFUL_REQUEST;
        }
        if (i == 2) {
            return REACHABILITY_DETECTION_EVENT_TYPE_FAILED_REQUEST;
        }
        if (i != 3) {
            return null;
        }
        return REACHABILITY_DETECTION_EVENT_TYPE_REFRESH;
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
