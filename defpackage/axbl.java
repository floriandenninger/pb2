package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum axbl implements aonq {
    ALIGN_HORIZONTAL_UNSPECIFIED(0),
    ALIGN_LEFT(1),
    ALIGN_CENTER(2),
    ALIGN_RIGHT(3);

    public final int e;

    axbl(int i) {
        this.e = i;
    }

    public static aons a() {
        return awwu.o;
    }

    public static axbl b(int i) {
        if (i == 0) {
            return ALIGN_HORIZONTAL_UNSPECIFIED;
        }
        if (i == 1) {
            return ALIGN_LEFT;
        }
        if (i == 2) {
            return ALIGN_CENTER;
        }
        if (i != 3) {
            return null;
        }
        return ALIGN_RIGHT;
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
