package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atbg implements aonq {
    MDX_NOTIFICATION_GEL_TYPE_UNKNOWN(0),
    MDX_NOTIFICATION_GEL_TYPE_CONTENT_RECOMMENDATION_SINGLE_SCREEN(1),
    MDX_NOTIFICATION_GEL_TYPE_CONTENT_RECOMMENDATION_MULTI_SCREEN(2);

    public final int d;

    atbg(int i) {
        this.d = i;
    }

    public static aons a() {
        return asvv.o;
    }

    public static atbg b(int i) {
        if (i == 0) {
            return MDX_NOTIFICATION_GEL_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return MDX_NOTIFICATION_GEL_TYPE_CONTENT_RECOMMENDATION_SINGLE_SCREEN;
        }
        if (i != 2) {
            return null;
        }
        return MDX_NOTIFICATION_GEL_TYPE_CONTENT_RECOMMENDATION_MULTI_SCREEN;
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
