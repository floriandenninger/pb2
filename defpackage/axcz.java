package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum axcz implements aonq {
    LOCATION_STYLE_UNSPECIFIED(0),
    LOCATION_NORMAL(1),
    LOCATION_LIGHT(2);

    public final int d;

    axcz(int i) {
        this.d = i;
    }

    public static aons a() {
        return axcs.c;
    }

    public static axcz b(int i) {
        if (i == 0) {
            return LOCATION_STYLE_UNSPECIFIED;
        }
        if (i == 1) {
            return LOCATION_NORMAL;
        }
        if (i != 2) {
            return null;
        }
        return LOCATION_LIGHT;
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
