package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uct implements aonv {
    private final /* synthetic */ int a;

    public uct(int i) {
        this.a = i;
    }

    @Override // defpackage.aonv
    public final /* synthetic */ Object convert(Object obj) {
        switch (this.a) {
            case 0:
                aokm a = aokm.a(((Integer) obj).intValue());
                return a == null ? aokm.REGISTRATION_REASON_UNSPECIFIED : a;
            case 1:
                aokf a2 = aokf.a(((Integer) obj).intValue());
                return a2 == null ? aokf.FETCH_REASON_UNSPECIFIED : a2;
            case 2:
                alwb a3 = alwb.a(((Integer) obj).intValue());
                return a3 == null ? alwb.OWNER_USER_TYPE_UNKNOWN : a3;
            case 3:
                aosw b = aosw.b(((Integer) obj).intValue());
                return b == null ? aosw.SUBTYPE_NONE : b;
            case 4:
                aotk b2 = aotk.b(((Integer) obj).intValue());
                return b2 == null ? aotk.ABOUT_THIS_AD_CALLBACK_ACTION_UNSPECIFIED : b2;
            case 5:
                aotw b3 = aotw.b(((Integer) obj).intValue());
                return b3 == null ? aotw.ACCESSIBILITY_SERVICE_TYPES_UNSPECIFIED : b3;
            case 6:
                aovo b4 = aovo.b(((Integer) obj).intValue());
                return b4 == null ? aovo.REGISTERED_GAIA_SERVICES_UNSPECIFIED : b4;
            case 7:
                apcm b5 = apcm.b(((Integer) obj).intValue());
                return b5 == null ? apcm.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_UNKNOWN : b5;
            case 8:
                apdz b6 = apdz.b(((Integer) obj).intValue());
                return b6 == null ? apdz.ANDROID_NON_CRITICAL_SCHEDULER_INITIALIZATION_BLOCK_UNKNOWN : b6;
            case 9:
                apdz b7 = apdz.b(((Integer) obj).intValue());
                return b7 == null ? apdz.ANDROID_NON_CRITICAL_SCHEDULER_INITIALIZATION_BLOCK_UNKNOWN : b7;
            case 10:
                aphz b8 = aphz.b(((Integer) obj).intValue());
                return b8 == null ? aphz.BACKGROUND_PLAYBACK_BUTTON_TYPE_UNKNOWN : b8;
            case 11:
                aovo b9 = aovo.b(((Integer) obj).intValue());
                return b9 == null ? aovo.REGISTERED_GAIA_SERVICES_UNSPECIFIED : b9;
            case 12:
                atrx b10 = atrx.b(((Integer) obj).intValue());
                return b10 == null ? atrx.UNKNOWN_FORMAT_TYPE : b10;
            case 13:
                apue b11 = apue.b(((Integer) obj).intValue());
                return b11 == null ? apue.CONN_DEFAULT : b11;
            case 14:
                atfo b12 = atfo.b(((Integer) obj).intValue());
                return b12 == null ? atfo.MOBILE_CONNECTION_TYPE_UNKNOWN : b12;
            case 15:
                aqtl b13 = aqtl.b(((Integer) obj).intValue());
                return b13 == null ? aqtl.ENGAGEMENT_PANEL_SNAP_STATE_UNKNOWN : b13;
            case 16:
                aqux b14 = aqux.b(((Integer) obj).intValue());
                return b14 == null ? aqux.EXO_PLAYER_CONFIG_FEATURES_UNSPECIFIED : b14;
            case 17:
                aqva b15 = aqva.b(((Integer) obj).intValue());
                return b15 == null ? aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_UNSPECIFIED : b15;
            case 18:
                asnb b16 = asnb.b(((Integer) obj).intValue());
                return b16 == null ? asnb.UNKNOWN : b16;
            case 19:
                atqf b17 = atqf.b(((Integer) obj).intValue());
                return b17 == null ? atqf.OFFLINE_REFRESH_ACTION_UNKNOWN : b17;
            default:
                asum b18 = asum.b(((Integer) obj).intValue());
                return b18 == null ? asum.LOGGING_QUEUE_TYPE_UNKNOWN : b18;
        }
    }
}
