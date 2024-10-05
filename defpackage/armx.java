package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum armx implements aonq {
    UNKNOWN_FORM_FACTOR(0),
    SMALL_FORM_FACTOR(1),
    LARGE_FORM_FACTOR(2),
    AUTOMOTIVE_FORM_FACTOR(3),
    WEARABLE_FORM_FACTOR(4);

    public final int f;

    armx(int i) {
        this.f = i;
    }

    public static aons a() {
        return armv.c;
    }

    public static armx b(int i) {
        if (i == 0) {
            return UNKNOWN_FORM_FACTOR;
        }
        if (i == 1) {
            return SMALL_FORM_FACTOR;
        }
        if (i == 2) {
            return LARGE_FORM_FACTOR;
        }
        if (i == 3) {
            return AUTOMOTIVE_FORM_FACTOR;
        }
        if (i != 4) {
            return null;
        }
        return WEARABLE_FORM_FACTOR;
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
