package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum axch implements aonq {
    FONT_FAMILY_UNSPECIFIED(0),
    CLASSIC(1),
    LIGHT(2),
    HEAVY(3),
    MARKER(4),
    BRUSH(5),
    TYPEWRITER(6);

    public final int h;

    axch(int i2) {
        this.h = i2;
    }

    public static aons a() {
        return awwu.u;
    }

    public static axch b(int i2) {
        switch (i2) {
            case 0:
                return FONT_FAMILY_UNSPECIFIED;
            case 1:
                return CLASSIC;
            case 2:
                return LIGHT;
            case 3:
                return HEAVY;
            case 4:
                return MARKER;
            case 5:
                return BRUSH;
            case 6:
                return TYPEWRITER;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
