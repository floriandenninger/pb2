package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avav implements aonq {
    SUGGEST_EDITABLE_TEXT_ACTION_UNKNOWN(0),
    SUGGEST_EDITABLE_TEXT_ACTION_INSERT(1),
    SUGGEST_EDITABLE_TEXT_ACTION_BACKSPACE(2);

    private final int e;

    avav(int i) {
        this.e = i;
    }

    public static aons a() {
        return auye.k;
    }

    public static avav b(int i) {
        if (i == 0) {
            return SUGGEST_EDITABLE_TEXT_ACTION_UNKNOWN;
        }
        if (i == 1) {
            return SUGGEST_EDITABLE_TEXT_ACTION_INSERT;
        }
        if (i != 2) {
            return null;
        }
        return SUGGEST_EDITABLE_TEXT_ACTION_BACKSPACE;
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
