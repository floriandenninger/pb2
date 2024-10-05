package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aund implements aonq {
    SCROLL_ORIENTATION_UNKNOWN(0),
    SCROLL_ORIENTATION_HORIZONTAL(1),
    SCROLL_ORIENTATION_VERTICAL(2);

    public final int d;

    aund(int i) {
        this.d = i;
    }

    public static aons a() {
        return aukz.j;
    }

    public static aund b(int i) {
        if (i == 0) {
            return SCROLL_ORIENTATION_UNKNOWN;
        }
        if (i == 1) {
            return SCROLL_ORIENTATION_HORIZONTAL;
        }
        if (i != 2) {
            return null;
        }
        return SCROLL_ORIENTATION_VERTICAL;
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
