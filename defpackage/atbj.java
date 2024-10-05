package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atbj implements aonq {
    MDX_SESSION_SOURCE_UNKNOWN(0),
    MDX_SESSION_SOURCE_ROUTE_BUTTON(1),
    MDX_SESSION_SOURCE_SMART_REMOTE_MEALBAR(2),
    MDX_SESSION_SOURCE_CONTENT_RECOMMENDATION_NOTIFICATION(3),
    MDX_SESSION_SOURCE_MEMENTO_MEALBAR(4),
    MDX_SESSION_SOURCE_LIVE_STREAM_MEALBAR(5),
    MDX_SESSION_SOURCE_SMART_PAIRING_SELECT_DEVICE(6),
    MDX_SESSION_SOURCE_TV_CODE(7),
    MDX_SESSION_SOURCE_AUTOCONNECT(8),
    MDX_SESSION_SOURCE_NITRATE_MEALBAR(9);

    public final int k;

    atbj(int i) {
        this.k = i;
    }

    public static aons a() {
        return asvv.t;
    }

    public static atbj b(int i) {
        switch (i) {
            case 0:
                return MDX_SESSION_SOURCE_UNKNOWN;
            case 1:
                return MDX_SESSION_SOURCE_ROUTE_BUTTON;
            case 2:
                return MDX_SESSION_SOURCE_SMART_REMOTE_MEALBAR;
            case 3:
                return MDX_SESSION_SOURCE_CONTENT_RECOMMENDATION_NOTIFICATION;
            case 4:
                return MDX_SESSION_SOURCE_MEMENTO_MEALBAR;
            case 5:
                return MDX_SESSION_SOURCE_LIVE_STREAM_MEALBAR;
            case 6:
                return MDX_SESSION_SOURCE_SMART_PAIRING_SELECT_DEVICE;
            case 7:
                return MDX_SESSION_SOURCE_TV_CODE;
            case 8:
                return MDX_SESSION_SOURCE_AUTOCONNECT;
            case 9:
                return MDX_SESSION_SOURCE_NITRATE_MEALBAR;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
