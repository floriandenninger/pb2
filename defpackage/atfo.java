package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atfo implements aonq {
    MOBILE_CONNECTION_TYPE_UNKNOWN(0),
    MOBILE_CONNECTION_TYPE_OTHER(1),
    MOBILE_CONNECTION_TYPE_OFFLINE(2),
    MOBILE_CONNECTION_TYPE_WIFI(3),
    MOBILE_CONNECTION_TYPE_CELLULAR_2G(4),
    MOBILE_CONNECTION_TYPE_CELLULAR_3G(5),
    MOBILE_CONNECTION_TYPE_CELLULAR_4G(6),
    MOBILE_CONNECTION_TYPE_CELLULAR_UNKNOWN(7),
    MOBILE_CONNECTION_TYPE_DISCO(8),
    MOBILE_CONNECTION_TYPE_CELLULAR_5G(9),
    MOBILE_CONNECTION_TYPE_WIFI_METERED(10),
    MOBILE_CONNECTION_TYPE_CELLULAR_5G_SA(11),
    MOBILE_CONNECTION_TYPE_CELLULAR_5G_NSA(12);

    public final int n;

    atfo(int i) {
        this.n = i;
    }

    public static aons a() {
        return atbk.p;
    }

    public static atfo b(int i) {
        switch (i) {
            case 0:
                return MOBILE_CONNECTION_TYPE_UNKNOWN;
            case 1:
                return MOBILE_CONNECTION_TYPE_OTHER;
            case 2:
                return MOBILE_CONNECTION_TYPE_OFFLINE;
            case 3:
                return MOBILE_CONNECTION_TYPE_WIFI;
            case 4:
                return MOBILE_CONNECTION_TYPE_CELLULAR_2G;
            case 5:
                return MOBILE_CONNECTION_TYPE_CELLULAR_3G;
            case 6:
                return MOBILE_CONNECTION_TYPE_CELLULAR_4G;
            case 7:
                return MOBILE_CONNECTION_TYPE_CELLULAR_UNKNOWN;
            case 8:
                return MOBILE_CONNECTION_TYPE_DISCO;
            case 9:
                return MOBILE_CONNECTION_TYPE_CELLULAR_5G;
            case 10:
                return MOBILE_CONNECTION_TYPE_WIFI_METERED;
            case 11:
                return MOBILE_CONNECTION_TYPE_CELLULAR_5G_SA;
            case 12:
                return MOBILE_CONNECTION_TYPE_CELLULAR_5G_NSA;
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
