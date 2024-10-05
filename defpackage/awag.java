package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum awag implements aonq {
    ALIGN_HORIZONTAL_UNSPECIFIED(0),
    ALIGN_HORIZONTAL_ALIGN_LEFT(1),
    ALIGN_HORIZONTAL_ALIGN_CENTER(2),
    ALIGN_HORIZONTAL_ALIGN_RIGHT(3);

    public final int e;

    awag(int i) {
        this.e = i;
    }

    public static aons a() {
        return avya.f;
    }

    public static awag b(int i) {
        if (i == 0) {
            return ALIGN_HORIZONTAL_UNSPECIFIED;
        }
        if (i == 1) {
            return ALIGN_HORIZONTAL_ALIGN_LEFT;
        }
        if (i == 2) {
            return ALIGN_HORIZONTAL_ALIGN_CENTER;
        }
        if (i != 3) {
            return null;
        }
        return ALIGN_HORIZONTAL_ALIGN_RIGHT;
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
