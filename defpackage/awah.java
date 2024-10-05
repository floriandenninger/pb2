package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum awah implements aonq {
    FONT_FAMILY_UNSPECIFIED(0),
    FONT_FAMILY_CLASSIC(1),
    FONT_FAMILY_LIGHT(2),
    FONT_FAMILY_HEAVY(3),
    FONT_FAMILY_MARKER(4),
    FONT_FAMILY_BRUSH(5),
    FONT_FAMILY_TYPEWRITER(6);

    public final int h;

    awah(int i2) {
        this.h = i2;
    }

    public static aons a() {
        return avya.h;
    }

    public static awah b(int i2) {
        switch (i2) {
            case 0:
                return FONT_FAMILY_UNSPECIFIED;
            case 1:
                return FONT_FAMILY_CLASSIC;
            case 2:
                return FONT_FAMILY_LIGHT;
            case 3:
                return FONT_FAMILY_HEAVY;
            case 4:
                return FONT_FAMILY_MARKER;
            case 5:
                return FONT_FAMILY_BRUSH;
            case 6:
                return FONT_FAMILY_TYPEWRITER;
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
