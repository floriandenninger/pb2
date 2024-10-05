package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avcw implements aonq {
    SURVEY_STATE_TYPE_UNKNOWN(0),
    SURVEY_STATE_TYPE_SELECTED(1),
    SURVEY_STATE_TYPE_DISMISSED(2),
    SURVEY_STATE_TYPE_SUBMITTED(3);

    private final int f;

    avcw(int i) {
        this.f = i;
    }

    public static aons a() {
        return avcl.c;
    }

    public static avcw b(int i) {
        if (i == 0) {
            return SURVEY_STATE_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return SURVEY_STATE_TYPE_SELECTED;
        }
        if (i == 2) {
            return SURVEY_STATE_TYPE_DISMISSED;
        }
        if (i != 3) {
            return null;
        }
        return SURVEY_STATE_TYPE_SUBMITTED;
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
