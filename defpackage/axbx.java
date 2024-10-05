package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum axbx implements aonq {
    COMMENT_STYLE_UNSPECIFIED(0),
    COMMENT_NORMAL(1),
    COMMENT_LIGHT(2);

    public final int d;

    axbx(int i) {
        this.d = i;
    }

    public static aons a() {
        return awwu.r;
    }

    public static axbx b(int i) {
        if (i == 0) {
            return COMMENT_STYLE_UNSPECIFIED;
        }
        if (i == 1) {
            return COMMENT_NORMAL;
        }
        if (i != 2) {
            return null;
        }
        return COMMENT_LIGHT;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
