package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atng implements aonq {
    BASIC_THUMBNAIL_LAYOUT_TYPE_UNKNOWN(0),
    BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END(1),
    BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START(7),
    BASIC_THUMBNAIL_LAYOUT_TYPE_MEDIUM_THUMBNAIL_END(2),
    BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_GRAY(3),
    BASIC_THUMBNAIL_LAYOUT_TYPE_MEDIUM_THUMBNAIL_END_GRAY(4),
    BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_USE_DEFAULT_HEADER(5),
    BASIC_THUMBNAIL_LAYOUT_TYPE_MEDIUM_THUMBNAIL_END_USE_DEFAULT_HEADER(6),
    BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START_MULTILINE_TITLE(8),
    BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START_MULTILINE_TEXT(9),
    BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_MULTILINE_TITLE(10),
    BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_MULTILINE_TEXT(11);

    private final int n;

    atng(int i) {
        this.n = i;
    }

    public static aons a() {
        return atmj.d;
    }

    public static atng b(int i) {
        switch (i) {
            case 0:
                return BASIC_THUMBNAIL_LAYOUT_TYPE_UNKNOWN;
            case 1:
                return BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END;
            case 2:
                return BASIC_THUMBNAIL_LAYOUT_TYPE_MEDIUM_THUMBNAIL_END;
            case 3:
                return BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_GRAY;
            case 4:
                return BASIC_THUMBNAIL_LAYOUT_TYPE_MEDIUM_THUMBNAIL_END_GRAY;
            case 5:
                return BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_USE_DEFAULT_HEADER;
            case 6:
                return BASIC_THUMBNAIL_LAYOUT_TYPE_MEDIUM_THUMBNAIL_END_USE_DEFAULT_HEADER;
            case 7:
                return BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START;
            case 8:
                return BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START_MULTILINE_TITLE;
            case 9:
                return BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START_MULTILINE_TEXT;
            case 10:
                return BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_MULTILINE_TITLE;
            case 11:
                return BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END_MULTILINE_TEXT;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
