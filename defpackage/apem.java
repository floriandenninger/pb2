package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum apem implements aonq {
    ICON_IMAGE_STYLE_DEFAULT(0),
    ICON_IMAGE_STYLE_SCALE(1),
    ICON_IMAGE_STYLE_CROP(2);

    private final int e;

    apem(int i) {
        this.e = i;
    }

    public static aons a() {
        return apaf.u;
    }

    public static apem b(int i) {
        if (i == 0) {
            return ICON_IMAGE_STYLE_DEFAULT;
        }
        if (i == 1) {
            return ICON_IMAGE_STYLE_SCALE;
        }
        if (i != 2) {
            return null;
        }
        return ICON_IMAGE_STYLE_CROP;
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
