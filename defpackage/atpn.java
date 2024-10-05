package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpn implements aonv {
    private final /* synthetic */ int a;

    public atpn(int i) {
        this.a = i;
    }

    @Override // defpackage.aonv
    public final /* synthetic */ Object convert(Object obj) {
        switch (this.a) {
            case 0:
                atpl b = atpl.b(((Integer) obj).intValue());
                return b == null ? atpl.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_UNKNOWN : b;
            case 1:
                atay b2 = atay.b(((Integer) obj).intValue());
                return b2 == null ? atay.DAY_OF_WEEK_UNKNOWN : b2;
            case 2:
                apue b3 = apue.b(((Integer) obj).intValue());
                return b3 == null ? apue.CONN_DEFAULT : b3;
            case 3:
                apea b4 = apea.b(((Integer) obj).intValue());
                return b4 == null ? apea.ANDROID_ONESIE_HOT_CONFIG_FEATURES_UNKNOWN : b4;
            case 4:
                atwo b5 = atwo.b(((Integer) obj).intValue());
                return b5 == null ? atwo.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_UNKNOWN : b5;
            case 5:
                auan b6 = auan.b(((Integer) obj).intValue());
                return b6 == null ? auan.UNKNOWN : b6;
            case 6:
                auii b7 = auii.b(((Integer) obj).intValue());
                return b7 == null ? auii.QOE_HOT_CONFIG_FEATURES_UNSPECIFIED : b7;
            case 7:
                avwy b8 = avwy.b(((Integer) obj).intValue());
                return b8 == null ? avwy.EFFECTS_FEATURE_UNKNOWN : b8;
            case 8:
                avzp b9 = avzp.b(((Integer) obj).intValue());
                return b9 == null ? avzp.UNKNOWN : b9;
            case 9:
                axbs b10 = axbs.b(((Integer) obj).intValue());
                return b10 == null ? axbs.CHANNEL_MENTION_STYLE_UNSPECIFIED : b10;
            case 10:
                axbx b11 = axbx.b(((Integer) obj).intValue());
                return b11 == null ? axbx.COMMENT_STYLE_UNSPECIFIED : b11;
            case 11:
                axcb b12 = axcb.b(((Integer) obj).intValue());
                return b12 == null ? axcb.DAY_OF_WEEK_STYLE_UNSPECIFIED : b12;
            case 12:
                axcz b13 = axcz.b(((Integer) obj).intValue());
                return b13 == null ? axcz.LOCATION_STYLE_UNSPECIFIED : b13;
            default:
                autl b14 = autl.b(((Integer) obj).intValue());
                return b14 == null ? autl.SHORTS_CREATION_SURFACE_UNKNOWN : b14;
        }
    }
}
