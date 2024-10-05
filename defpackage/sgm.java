package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum sgm implements aonq {
    UNKNOWN(0),
    NAVIGATION_STATE_CHANGED(1),
    NIGHT_MODE_STATUS_CHANGED(2),
    SEND_CLIENT_INPUT(3),
    UI_SUPPRESSION_LEVEL_CHANGED(4),
    KEYGUARD_DISMISS_STATUS_CHANGED(5),
    UNBIND_INTEGRATION_SERVICE(100);

    public final int h;

    sgm(int i2) {
        this.h = i2;
    }

    public static sgm a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return NAVIGATION_STATE_CHANGED;
        }
        if (i2 == 2) {
            return NIGHT_MODE_STATUS_CHANGED;
        }
        if (i2 == 3) {
            return SEND_CLIENT_INPUT;
        }
        if (i2 == 4) {
            return UI_SUPPRESSION_LEVEL_CHANGED;
        }
        if (i2 == 5) {
            return KEYGUARD_DISMISS_STATUS_CHANGED;
        }
        if (i2 != 100) {
            return null;
        }
        return UNBIND_INTEGRATION_SERVICE;
    }

    public static aons b() {
        return dvg.u;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
