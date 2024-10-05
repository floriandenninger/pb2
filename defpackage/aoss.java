package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aoss implements aonq {
    UNKNOWN_COMPONENT_STYLE(0),
    LEGACY_COMPONENT_STYLE(1),
    GLIF_COMPONENT_STYLE(2),
    GM_COMPONENT_STYLE(3);

    public final int e;

    aoss(int i) {
        this.e = i;
    }

    public static aons a() {
        return aokr.l;
    }

    public static aoss b(int i) {
        if (i == 0) {
            return UNKNOWN_COMPONENT_STYLE;
        }
        if (i == 1) {
            return LEGACY_COMPONENT_STYLE;
        }
        if (i == 2) {
            return GLIF_COMPONENT_STYLE;
        }
        if (i != 3) {
            return null;
        }
        return GM_COMPONENT_STYLE;
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
