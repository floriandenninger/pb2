package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum apth implements aonq {
    STYLE_UNKNOWN(0),
    STYLE_DEFAULT(1),
    STYLE_PRIMARY(2),
    STYLE_SECONDARY(3),
    STYLE_LARGE_TRANSLUCENT_AND_SELECTED_WHITE(10),
    STYLE_RELATED(4),
    STYLE_INLINE_SURVEY_CHECKBOX(5),
    STYLE_HOME_FILTER(6),
    STYLE_HOME_FILTER_ATTRIBUTE(7),
    STYLE_PREMIUM_CHIP(8),
    STYLE_SEARCH_FILTER_CHIP(9),
    STYLE_SHORTS_CHIP(11),
    STYLE_EXPLORE_LAUNCHER_CHIP(12),
    STYLE_REFRESH_TO_NOVEL_CHIP(13),
    STYLE_TRANSPARENT(14);

    public final int p;

    apth(int i) {
        this.p = i;
    }

    public static aons a() {
        return apqr.g;
    }

    public static apth b(int i) {
        switch (i) {
            case 0:
                return STYLE_UNKNOWN;
            case 1:
                return STYLE_DEFAULT;
            case 2:
                return STYLE_PRIMARY;
            case 3:
                return STYLE_SECONDARY;
            case 4:
                return STYLE_RELATED;
            case 5:
                return STYLE_INLINE_SURVEY_CHECKBOX;
            case 6:
                return STYLE_HOME_FILTER;
            case 7:
                return STYLE_HOME_FILTER_ATTRIBUTE;
            case 8:
                return STYLE_PREMIUM_CHIP;
            case 9:
                return STYLE_SEARCH_FILTER_CHIP;
            case 10:
                return STYLE_LARGE_TRANSLUCENT_AND_SELECTED_WHITE;
            case 11:
                return STYLE_SHORTS_CHIP;
            case 12:
                return STYLE_EXPLORE_LAUNCHER_CHIP;
            case 13:
                return STYLE_REFRESH_TO_NOVEL_CHIP;
            case 14:
                return STYLE_TRANSPARENT;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
