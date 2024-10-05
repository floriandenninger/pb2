package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aunc implements aonq {
    SCROLL_DIRECTION_UNKNOWN(0),
    SCROLL_DIRECTION_FORWARD(1),
    SCROLL_DIRECTION_BACKWARDS(2);

    public final int d;

    aunc(int i) {
        this.d = i;
    }

    public static aons a() {
        return aukz.i;
    }

    public static aunc b(int i) {
        if (i == 0) {
            return SCROLL_DIRECTION_UNKNOWN;
        }
        if (i == 1) {
            return SCROLL_DIRECTION_FORWARD;
        }
        if (i != 2) {
            return null;
        }
        return SCROLL_DIRECTION_BACKWARDS;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
