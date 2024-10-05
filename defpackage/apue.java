package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum apue implements aonq {
    CONN_DEFAULT(0),
    CONN_UNKNOWN(1),
    CONN_NONE(2),
    CONN_WIFI(3),
    CONN_CELLULAR_2G(4),
    CONN_CELLULAR_3G(5),
    CONN_CELLULAR_4G(6),
    CONN_CELLULAR_UNKNOWN(7),
    CONN_DISCO(8),
    CONN_CELLULAR_5G(9),
    CONN_WIFI_METERED(10),
    CONN_CELLULAR_5G_SA(11),
    CONN_CELLULAR_5G_NSA(12),
    CONN_INVALID(31);

    public final int o;

    apue(int i) {
        this.o = i;
    }

    public static aons a() {
        return apqr.m;
    }

    public static apue b(int i) {
        if (i == 31) {
            return CONN_INVALID;
        }
        switch (i) {
            case 0:
                return CONN_DEFAULT;
            case 1:
                return CONN_UNKNOWN;
            case 2:
                return CONN_NONE;
            case 3:
                return CONN_WIFI;
            case 4:
                return CONN_CELLULAR_2G;
            case 5:
                return CONN_CELLULAR_3G;
            case 6:
                return CONN_CELLULAR_4G;
            case 7:
                return CONN_CELLULAR_UNKNOWN;
            case 8:
                return CONN_DISCO;
            case 9:
                return CONN_CELLULAR_5G;
            case 10:
                return CONN_WIFI_METERED;
            case 11:
                return CONN_CELLULAR_5G_SA;
            case 12:
                return CONN_CELLULAR_5G_NSA;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
