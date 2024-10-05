package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avxa implements aonq {
    TEXT_STICKER_FONT_STYLE_UNKNOWN(0),
    TEXT_STICKER_FONT_STYLE_ROBOTO(1),
    TEXT_STICKER_FONT_STYLE_QUICK_SAND_REGULAR(2),
    TEXT_STICKER_FONT_STYLE_OSWALD_BOLD(3),
    TEXT_STICKER_FONT_STYLE_PERMANENT_MARKER(4),
    TEXT_STICKER_FONT_STYLE_TEXT_PACIFICO(5),
    TEXT_STICKER_FONT_STYLE_TEXT_CUTIVE(6);

    public final int h;

    avxa(int i2) {
        this.h = i2;
    }

    public static aons a() {
        return avts.t;
    }

    public static avxa b(int i2) {
        switch (i2) {
            case 0:
                return TEXT_STICKER_FONT_STYLE_UNKNOWN;
            case 1:
                return TEXT_STICKER_FONT_STYLE_ROBOTO;
            case 2:
                return TEXT_STICKER_FONT_STYLE_QUICK_SAND_REGULAR;
            case 3:
                return TEXT_STICKER_FONT_STYLE_OSWALD_BOLD;
            case 4:
                return TEXT_STICKER_FONT_STYLE_PERMANENT_MARKER;
            case 5:
                return TEXT_STICKER_FONT_STYLE_TEXT_PACIFICO;
            case 6:
                return TEXT_STICKER_FONT_STYLE_TEXT_CUTIVE;
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
