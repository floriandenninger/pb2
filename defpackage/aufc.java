package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aufc implements aonq {
    PRESENTATION_STYLE_UNKNOWN(0),
    PRESENTATION_STYLE_PUSH(1),
    PRESENTATION_STYLE_MODAL(2);

    private final int e;

    aufc(int i) {
        this.e = i;
    }

    public static aons a() {
        return aufb.a;
    }

    public static aufc b(int i) {
        if (i == 0) {
            return PRESENTATION_STYLE_UNKNOWN;
        }
        if (i == 1) {
            return PRESENTATION_STYLE_PUSH;
        }
        if (i != 2) {
            return null;
        }
        return PRESENTATION_STYLE_MODAL;
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
