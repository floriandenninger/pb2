package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum asap implements aonq {
    INPUT_METHOD_UNKNOWN(0),
    KEYBOARD(1),
    PASTE(2),
    ON_SCREEN_KEYBOARD(3),
    IME(4),
    QUERY_BUILDER(5),
    SPEECH(6),
    HANDWRITING(7),
    TAB(8),
    GESTURE_DECODING_DYM_QUERY_BUILDER(9);

    public final int k;

    asap(int i) {
        this.k = i;
    }

    public static aons a() {
        return armv.u;
    }

    public static asap b(int i) {
        switch (i) {
            case 0:
                return INPUT_METHOD_UNKNOWN;
            case 1:
                return KEYBOARD;
            case 2:
                return PASTE;
            case 3:
                return ON_SCREEN_KEYBOARD;
            case 4:
                return IME;
            case 5:
                return QUERY_BUILDER;
            case 6:
                return SPEECH;
            case 7:
                return HANDWRITING;
            case 8:
                return TAB;
            case 9:
                return GESTURE_DECODING_DYM_QUERY_BUILDER;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
