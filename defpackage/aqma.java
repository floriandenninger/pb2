package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aqma implements aonq {
    DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_UNKNOWN(0),
    DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_CANCEL(1),
    DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_CONFIRM(2),
    DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_GET_PREMIUM(3);

    private final int f;

    aqma(int i) {
        this.f = i;
    }

    public static aons a() {
        return aqkw.e;
    }

    public static aqma b(int i) {
        if (i == 0) {
            return DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_UNKNOWN;
        }
        if (i == 1) {
            return DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_CANCEL;
        }
        if (i == 2) {
            return DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_CONFIRM;
        }
        if (i != 3) {
            return null;
        }
        return DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_GET_PREMIUM;
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
