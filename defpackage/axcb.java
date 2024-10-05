package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum axcb implements aonq {
    DAY_OF_WEEK_STYLE_UNSPECIFIED(0),
    DAY_OF_WEEK_NORMAL(1),
    DAY_OF_WEEK_LIGHT(2);

    public final int d;

    axcb(int i) {
        this.d = i;
    }

    public static aons a() {
        return awwu.s;
    }

    public static axcb b(int i) {
        if (i == 0) {
            return DAY_OF_WEEK_STYLE_UNSPECIFIED;
        }
        if (i == 1) {
            return DAY_OF_WEEK_NORMAL;
        }
        if (i != 2) {
            return null;
        }
        return DAY_OF_WEEK_LIGHT;
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
