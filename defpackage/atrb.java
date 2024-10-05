package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atrb implements aonq {
    OFFLINE_VIDEO_POLICY_ACTION_UNKNOWN(0),
    OFFLINE_VIDEO_POLICY_ACTION_OK(1),
    OFFLINE_VIDEO_POLICY_ACTION_DISABLE(2),
    OFFLINE_VIDEO_POLICY_ACTION_DOWNLOAD_FAILED(3);

    public final int e;

    atrb(int i) {
        this.e = i;
    }

    public static aons a() {
        return atqp.h;
    }

    public static atrb b(int i) {
        if (i == 0) {
            return OFFLINE_VIDEO_POLICY_ACTION_UNKNOWN;
        }
        if (i == 1) {
            return OFFLINE_VIDEO_POLICY_ACTION_OK;
        }
        if (i == 2) {
            return OFFLINE_VIDEO_POLICY_ACTION_DISABLE;
        }
        if (i != 3) {
            return null;
        }
        return OFFLINE_VIDEO_POLICY_ACTION_DOWNLOAD_FAILED;
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
