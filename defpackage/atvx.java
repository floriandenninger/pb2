package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atvx implements aonq {
    PIVOT_BAR_NAVIGATION_TYPE_UNKNOWN(0),
    PIVOT_BAR_NAVIGATION_TYPE_SELECT_TAB(1),
    PIVOT_BAR_NAVIGATION_TYPE_UNSELECTABLE_TAB(2);

    private final int e;

    atvx(int i) {
        this.e = i;
    }

    public static aons a() {
        return atqp.r;
    }

    public static atvx b(int i) {
        if (i == 0) {
            return PIVOT_BAR_NAVIGATION_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return PIVOT_BAR_NAVIGATION_TYPE_SELECT_TAB;
        }
        if (i != 2) {
            return null;
        }
        return PIVOT_BAR_NAVIGATION_TYPE_UNSELECTABLE_TAB;
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
