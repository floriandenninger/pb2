package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avwz implements aonq {
    TEXT_STICKER_FONT_NAME_UNKNOWN(0),
    TEXT_STICKER_FONT_NAME_CLASSIC(1),
    TEXT_STICKER_FONT_NAME_LIGHT(2),
    TEXT_STICKER_FONT_NAME_HEAVY(3),
    TEXT_STICKER_FONT_NAME_MARKER(4),
    TEXT_STICKER_FONT_NAME_BRUSH(5),
    TEXT_STICKER_FONT_NAME_TYPEWRITER(6);

    public final int h;

    avwz(int i2) {
        this.h = i2;
    }

    public static aons a() {
        return avts.s;
    }

    public static avwz b(int i2) {
        switch (i2) {
            case 0:
                return TEXT_STICKER_FONT_NAME_UNKNOWN;
            case 1:
                return TEXT_STICKER_FONT_NAME_CLASSIC;
            case 2:
                return TEXT_STICKER_FONT_NAME_LIGHT;
            case 3:
                return TEXT_STICKER_FONT_NAME_HEAVY;
            case 4:
                return TEXT_STICKER_FONT_NAME_MARKER;
            case 5:
                return TEXT_STICKER_FONT_NAME_BRUSH;
            case 6:
                return TEXT_STICKER_FONT_NAME_TYPEWRITER;
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
