package defpackage;

import com.google.cardboard.sdk.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aqjw implements aonq {
    DETAILED_NETWORK_TYPE_UNKNOWN(0),
    DETAILED_NETWORK_TYPE_EDGE(101),
    DETAILED_NETWORK_TYPE_GPRS(102),
    DETAILED_NETWORK_TYPE_1_X_RTT(103),
    DETAILED_NETWORK_TYPE_CDMA(104),
    DETAILED_NETWORK_TYPE_EVDO_0(105),
    DETAILED_NETWORK_TYPE_EVDO_A(106),
    DETAILED_NETWORK_TYPE_HSDPA(107),
    DETAILED_NETWORK_TYPE_HSPA(108),
    DETAILED_NETWORK_TYPE_HSUPA(109),
    DETAILED_NETWORK_TYPE_IDEN(110),
    DETAILED_NETWORK_TYPE_UMTS(111),
    DETAILED_NETWORK_TYPE_EVDO_B(112),
    DETAILED_NETWORK_TYPE_EHRPD(113),
    DETAILED_NETWORK_TYPE_HSPAP(114),
    DETAILED_NETWORK_TYPE_LTE(115),
    DETAILED_NETWORK_TYPE_WIFI(116),
    DETAILED_NETWORK_TYPE_BLUETOOTH(117),
    DETAILED_NETWORK_TYPE_ETHERNET(118),
    DETAILED_NETWORK_TYPE_WIMAX(119),
    DETAILED_NETWORK_TYPE_MOBILE_UNKNOWN(120),
    DETAILED_NETWORK_TYPE_NON_MOBILE_UNKNOWN(121),
    DETAILED_NETWORK_TYPE_DISCONNECTED(122),
    DETAILED_NETWORK_TYPE_APP_WIFI_HOTSPOT(R.styleable.AppCompatTheme_windowFixedWidthMinor),
    DETAILED_NETWORK_TYPE_INTERNAL_WIFI_IMPAIRED(R.styleable.AppCompatTheme_windowMinWidthMajor),
    DETAILED_NETWORK_TYPE_NR_SA(R.styleable.AppCompatTheme_windowMinWidthMinor),
    DETAILED_NETWORK_TYPE_NR_NSA(R.styleable.AppCompatTheme_windowNoTitle);

    public final int B;

    aqjw(int i) {
        this.B = i;
    }

    public static aons a() {
        return apyu.u;
    }

    public static aqjw b(int i) {
        if (i == 0) {
            return DETAILED_NETWORK_TYPE_UNKNOWN;
        }
        switch (i) {
            case 101:
                return DETAILED_NETWORK_TYPE_EDGE;
            case 102:
                return DETAILED_NETWORK_TYPE_GPRS;
            case 103:
                return DETAILED_NETWORK_TYPE_1_X_RTT;
            case 104:
                return DETAILED_NETWORK_TYPE_CDMA;
            case 105:
                return DETAILED_NETWORK_TYPE_EVDO_0;
            case 106:
                return DETAILED_NETWORK_TYPE_EVDO_A;
            case 107:
                return DETAILED_NETWORK_TYPE_HSDPA;
            case 108:
                return DETAILED_NETWORK_TYPE_HSPA;
            case 109:
                return DETAILED_NETWORK_TYPE_HSUPA;
            case 110:
                return DETAILED_NETWORK_TYPE_IDEN;
            case 111:
                return DETAILED_NETWORK_TYPE_UMTS;
            case 112:
                return DETAILED_NETWORK_TYPE_EVDO_B;
            case 113:
                return DETAILED_NETWORK_TYPE_EHRPD;
            case 114:
                return DETAILED_NETWORK_TYPE_HSPAP;
            case 115:
                return DETAILED_NETWORK_TYPE_LTE;
            case 116:
                return DETAILED_NETWORK_TYPE_WIFI;
            case 117:
                return DETAILED_NETWORK_TYPE_BLUETOOTH;
            case 118:
                return DETAILED_NETWORK_TYPE_ETHERNET;
            case 119:
                return DETAILED_NETWORK_TYPE_WIMAX;
            case 120:
                return DETAILED_NETWORK_TYPE_MOBILE_UNKNOWN;
            case 121:
                return DETAILED_NETWORK_TYPE_NON_MOBILE_UNKNOWN;
            case 122:
                return DETAILED_NETWORK_TYPE_DISCONNECTED;
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return DETAILED_NETWORK_TYPE_APP_WIFI_HOTSPOT;
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return DETAILED_NETWORK_TYPE_INTERNAL_WIFI_IMPAIRED;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return DETAILED_NETWORK_TYPE_NR_SA;
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return DETAILED_NETWORK_TYPE_NR_NSA;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.B;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.B);
    }
}
