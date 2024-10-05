package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fkm implements vfl {
    private final /* synthetic */ int v;
    public static final /* synthetic */ fkm u = new fkm(20);
    public static final /* synthetic */ fkm t = new fkm(19);
    public static final /* synthetic */ fkm s = new fkm(18);
    public static final /* synthetic */ fkm r = new fkm(17);
    public static final /* synthetic */ fkm q = new fkm(16);
    public static final /* synthetic */ fkm p = new fkm(15);
    public static final /* synthetic */ fkm o = new fkm(14);
    public static final /* synthetic */ fkm n = new fkm(13);
    public static final /* synthetic */ fkm m = new fkm(12);
    public static final /* synthetic */ fkm l = new fkm(11);
    public static final /* synthetic */ fkm k = new fkm(10);
    public static final /* synthetic */ fkm j = new fkm(9);
    public static final /* synthetic */ fkm i = new fkm(8);
    public static final /* synthetic */ fkm h = new fkm(7);
    public static final /* synthetic */ fkm g = new fkm(6);
    public static final /* synthetic */ fkm f = new fkm(5);
    public static final /* synthetic */ fkm e = new fkm(4);
    public static final /* synthetic */ fkm d = new fkm(3);
    public static final /* synthetic */ fkm c = new fkm(2);
    public static final /* synthetic */ fkm b = new fkm(1);
    public static final /* synthetic */ fkm a = new fkm(0);

    private /* synthetic */ fkm(int i2) {
        this.v = i2;
    }

    @Override // defpackage.vfl
    public final aooy a(vfm vfmVar, aooy aooyVar) {
        int i2 = 0;
        switch (this.v) {
            case 0:
                amsx amsxVar = fkr.a;
                aone builder = ((fkg) aooyVar).toBuilder();
                fkr.f(builder, new fkj(vfmVar, 3), new fkj(vfmVar, 2), new fkj(vfmVar, 0), new fko(vfmVar, 0));
                return (fkg) builder.build();
            case 1:
                amsx amsxVar2 = fkr.a;
                aone builder2 = ((fke) aooyVar).toBuilder();
                fkr.g(builder2, new fkj(vfmVar, 3), new fkj(vfmVar, 0), new fko(vfmVar, 0));
                return (fke) builder2.build();
            case 2:
                aone createBuilder = fnx.a.createBuilder();
                if (vfmVar.e(fav.AUTONAV_TOGGLE_USER_EDU_TRIGGERS_REMAINING)) {
                    int a2 = vfmVar.a(fav.AUTONAV_TOGGLE_USER_EDU_TRIGGERS_REMAINING, 1);
                    createBuilder.copyOnWrite();
                    fnx fnxVar = (fnx) createBuilder.instance;
                    fnxVar.b |= 1;
                    fnxVar.c = a2;
                }
                return (fnx) createBuilder.build();
            case 3:
                String[] strArr = fuh.a;
                return fuk.a;
            case 4:
                aone builder3 = ((idr) aooyVar).toBuilder();
                int a3 = vfmVar.a("TEXT_COLOR", 0);
                builder3.copyOnWrite();
                ((idr) builder3.instance).g = a3;
                int a4 = vfmVar.a("BACKGROUND_COLOR", 0);
                builder3.copyOnWrite();
                ((idr) builder3.instance).h = a4;
                int a5 = vfmVar.a("ALIGNMENT", 4);
                builder3.copyOnWrite();
                ((idr) builder3.instance).i = a5;
                int a6 = vfmVar.a("FONT_FAMILY", 0);
                builder3.copyOnWrite();
                ((idr) builder3.instance).j = a6;
                return (idr) builder3.build();
            case 5:
                aone builder4 = ((idr) aooyVar).toBuilder();
                String d2 = vfmVar.d("MOST_RECENT_PRESET_EFFECT_ID", null);
                builder4.copyOnWrite();
                idr idrVar = (idr) builder4.instance;
                d2.getClass();
                idrVar.k = d2;
                return (idr) builder4.build();
            case 6:
                aone builder5 = ((idr) aooyVar).toBuilder();
                String d3 = vfmVar.d("recent_stickers", null);
                builder5.copyOnWrite();
                idr idrVar2 = (idr) builder5.instance;
                d3.getClass();
                idrVar2.m = d3;
                return (idr) builder5.build();
            case 7:
                aone builder6 = ((idr) aooyVar).toBuilder();
                boolean f2 = vfmVar.f("REEL_WELCOME_V2_ALREADY_SEEN", false);
                builder6.copyOnWrite();
                ((idr) builder6.instance).n = f2;
                return (idr) builder6.build();
            case 8:
                lqu lquVar = (lqu) aooyVar;
                String[] strArr2 = lqv.a;
                aone builder7 = lquVar.toBuilder();
                lqt lqtVar = lquVar.c;
                if (lqtVar == null) {
                    lqtVar = lqt.a;
                }
                aone builder8 = lqtVar.toBuilder();
                if (vfmVar.e(fav.PIP_POLICY)) {
                    boolean f3 = vfmVar.f(fav.PIP_POLICY, true);
                    builder8.copyOnWrite();
                    lqt lqtVar2 = (lqt) builder8.instance;
                    lqtVar2.b |= 1;
                    lqtVar2.c = f3;
                }
                builder7.copyOnWrite();
                lqu lquVar2 = (lqu) builder7.instance;
                lqt lqtVar3 = (lqt) builder8.build();
                lqtVar3.getClass();
                lquVar2.c = lqtVar3;
                lquVar2.b |= 1;
                return (lqu) builder7.build();
            case 9:
                fkj fkjVar = new fkj(vfmVar, 4);
                fkj fkjVar2 = new fkj(vfmVar, 5);
                fko fkoVar = new fko(vfmVar, 2);
                amrw amrwVar = new amrw();
                amrwVar.g(oba.FLOATY_BAR_TUTORIAL_LAST_SHOWN_TIMESTAMP, new fkl(fkoVar, fkjVar2, 13));
                amrwVar.g(oba.FLOATY_BAR_TUTORIAL_SHOWN_COUNT, new fkl(fkoVar, fkjVar, 14));
                amsx amsxVar3 = oay.a;
                aone createBuilder2 = oaz.a.createBuilder();
                whl.r(amsxVar3, createBuilder2, amrwVar.c());
                return (oaz) createBuilder2.build();
            case 10:
                awul awulVar = (awul) aooyVar;
                String d4 = vfmVar.d("pre_incognito_signed_in_user_id", "");
                if (TextUtils.isEmpty(d4)) {
                    return awulVar;
                }
                aone builder9 = awulVar.toBuilder();
                builder9.copyOnWrite();
                awul awulVar2 = (awul) builder9.instance;
                d4.getClass();
                awulVar2.b |= 1;
                awulVar2.c = d4;
                return (awul) builder9.build();
            case 11:
                aone builder10 = ((awum) aooyVar).toBuilder();
                if (vfmVar.e("last_ad_time")) {
                    long b2 = vfmVar.b("last_ad_time", 0L);
                    builder10.copyOnWrite();
                    awum awumVar = (awum) builder10.instance;
                    awumVar.b = 1 | awumVar.b;
                    awumVar.c = b2;
                }
                if (vfmVar.e("last_ad_signals_adid")) {
                    String d5 = vfmVar.d("last_ad_signals_adid", null);
                    builder10.copyOnWrite();
                    awum awumVar2 = (awum) builder10.instance;
                    d5.getClass();
                    awumVar2.b = 2 | awumVar2.b;
                    awumVar2.d = d5;
                }
                if (vfmVar.e("last_ad_signals_lat")) {
                    boolean f4 = vfmVar.f("last_ad_signals_lat", false);
                    builder10.copyOnWrite();
                    awum awumVar3 = (awum) builder10.instance;
                    awumVar3.b = 4 | awumVar3.b;
                    awumVar3.e = f4;
                }
                if (vfmVar.e("last_ad_signals_timestamp")) {
                    long b3 = vfmVar.b("last_ad_signals_timestamp", 0L);
                    builder10.copyOnWrite();
                    awum awumVar4 = (awum) builder10.instance;
                    awumVar4.b |= 16;
                    awumVar4.g = b3;
                }
                if (vfmVar.e("last_ad_signals_identity")) {
                    String d6 = vfmVar.d("last_ad_signals_identity", null);
                    builder10.copyOnWrite();
                    awum awumVar5 = (awum) builder10.instance;
                    d6.getClass();
                    awumVar5.b |= 8;
                    awumVar5.f = d6;
                }
                return (awum) builder10.build();
            case 12:
                awuo awuoVar = (awuo) aooyVar;
                if (!vfmVar.e("preview_tooltip_image_preview_tool")) {
                    return awuoVar;
                }
                aone builder11 = awuoVar.toBuilder();
                long b4 = vfmVar.b("preview_tooltip_image_preview_tool", 0L);
                builder11.copyOnWrite();
                awuo awuoVar2 = (awuo) builder11.instance;
                awuoVar2.b |= 1;
                awuoVar2.c = b4;
                return (awuo) builder11.build();
            case 13:
                aosf aosfVar = (aosf) aooyVar;
                if (!vfmVar.e("com.google.android.libraries.youtube.innertube.pref.startup_uncaught_exception_count")) {
                    return aosfVar;
                }
                aone builder12 = aosfVar.toBuilder();
                int a7 = vfmVar.a("com.google.android.libraries.youtube.innertube.pref.startup_uncaught_exception_count", 0);
                builder12.copyOnWrite();
                aosf aosfVar2 = (aosf) builder12.instance;
                aosfVar2.b |= 1;
                aosfVar2.c = a7;
                return (aosf) builder12.build();
            case 14:
                aosg aosgVar = (aosg) aooyVar;
                if (!vfmVar.e("version")) {
                    return aosgVar;
                }
                aone builder13 = aosgVar.toBuilder();
                String d7 = vfmVar.d("version", "");
                builder13.copyOnWrite();
                aosg aosgVar2 = (aosg) builder13.instance;
                d7.getClass();
                aosgVar2.b |= 1;
                aosgVar2.c = d7;
                return (aosg) builder13.build();
            case 15:
                aone builder14 = ((zoh) aooyVar).toBuilder();
                int a8 = vfmVar.a("camera_facing", 0);
                builder14.copyOnWrite();
                ((zoh) builder14.instance).b = a8;
                return (zoh) builder14.build();
            case 16:
                aone builder15 = ((awus) aooyVar).toBuilder();
                if (vfmVar.e("innertube_safety_mode_enabled")) {
                    boolean f5 = vfmVar.f("innertube_safety_mode_enabled", false);
                    builder15.copyOnWrite();
                    awus awusVar = (awus) builder15.instance;
                    awusVar.b |= 1;
                    awusVar.c = f5;
                }
                return (awus) builder15.build();
            case 17:
                aone builder16 = ((aosc) aooyVar).toBuilder();
                String d8 = vfmVar.d("SHARED_PREF_STREAM_CONFIG_KEY", "");
                builder16.copyOnWrite();
                aosc aoscVar = (aosc) builder16.instance;
                d8.getClass();
                aoscVar.b |= 1;
                aoscVar.c = d8;
                boolean f6 = vfmVar.f("PREF_HAS_SEEN_ORIENTATION_TOOLTIP", false);
                builder16.copyOnWrite();
                aosc aoscVar2 = (aosc) builder16.instance;
                aoscVar2.b |= 8;
                aoscVar2.f = f6;
                boolean f7 = vfmVar.f("HAS_SEEN_SCREENCAST_TOOLTIP", false);
                builder16.copyOnWrite();
                aosc aoscVar3 = (aosc) builder16.instance;
                aoscVar3.b |= 2;
                aoscVar3.d = f7;
                boolean f8 = vfmVar.f("IS_FIRST_STREAM", true);
                builder16.copyOnWrite();
                aosc aoscVar4 = (aosc) builder16.instance;
                aoscVar4.b |= 4;
                aoscVar4.e = f8;
                int a9 = vfmVar.a("SHARED_PREF_PORTRAIT_COUNT_KEY", 0);
                builder16.copyOnWrite();
                aosc aoscVar5 = (aosc) builder16.instance;
                aoscVar5.b |= 16;
                aoscVar5.g = a9;
                long b5 = vfmVar.b("SHARED_PREF_LS_TIMESTAMP_KEY", 0L);
                builder16.copyOnWrite();
                aosc aoscVar6 = (aosc) builder16.instance;
                aoscVar6.b |= 32;
                aoscVar6.h = b5;
                return (aosc) builder16.build();
            case 18:
                aone builder17 = ((awuv) aooyVar).toBuilder();
                long b6 = vfmVar.b("interaction_logging_client_side_ve_counter", 10000L);
                builder17.copyOnWrite();
                awuv awuvVar = (awuv) builder17.instance;
                awuvVar.b |= 16;
                awuvVar.g = b6;
                return (awuv) builder17.build();
            case 19:
                aone builder18 = ((awuv) aooyVar).toBuilder();
                long b7 = vfmVar.b("foreground_heartbeat_index", -1L);
                builder18.copyOnWrite();
                awuv awuvVar2 = (awuv) builder18.instance;
                awuvVar2.b = 1 | awuvVar2.b;
                awuvVar2.c = b7;
                if (vfmVar.e("LastCrashException")) {
                    aomf x = aomf.x(Base64.decode(vfmVar.d("LastCrashException", ""), 0));
                    builder18.copyOnWrite();
                    awuv awuvVar3 = (awuv) builder18.instance;
                    awuvVar3.b |= 2;
                    awuvVar3.d = x;
                }
                if (vfmVar.e("LastCrashTimestamp")) {
                    long b8 = vfmVar.b("LastCrashTimestamp", -1L);
                    builder18.copyOnWrite();
                    awuv awuvVar4 = (awuv) builder18.instance;
                    awuvVar4.b |= 4;
                    awuvVar4.e = b8;
                }
                return (awuv) builder18.build();
            default:
                aone builder19 = ((aose) aooyVar).toBuilder();
                if (vfmVar.e("screenIds")) {
                    String[] split = vfmVar.d("screenIds", "").split(",");
                    String[] split2 = vfmVar.d("screenNames", "").split(",");
                    List h2 = amnm.b(',').h(vfmVar.d("deviceIds", ""));
                    while (i2 < split.length) {
                        String str = split[i2];
                        if (!TextUtils.isEmpty(str) && i2 < h2.size() && !TextUtils.isEmpty((CharSequence) h2.get(i2))) {
                            aone createBuilder3 = aosd.a.createBuilder();
                            createBuilder3.copyOnWrite();
                            aosd aosdVar = (aosd) createBuilder3.instance;
                            str.getClass();
                            aosdVar.b |= 1;
                            aosdVar.c = str;
                            String str2 = (String) h2.get(i2);
                            createBuilder3.copyOnWrite();
                            aosd aosdVar2 = (aosd) createBuilder3.instance;
                            str2.getClass();
                            aosdVar2.b |= 4;
                            aosdVar2.e = str2;
                            String str3 = i2 < split2.length ? split2[i2] : "";
                            createBuilder3.copyOnWrite();
                            aosd aosdVar3 = (aosd) createBuilder3.instance;
                            str3.getClass();
                            aosdVar3.b |= 2;
                            aosdVar3.d = str3;
                            aosd aosdVar4 = (aosd) createBuilder3.build();
                            builder19.copyOnWrite();
                            aose aoseVar = (aose) builder19.instance;
                            aosdVar4.getClass();
                            aoseVar.a();
                            aoseVar.b.add(aosdVar4);
                        }
                        i2++;
                    }
                }
                return (aose) builder19.build();
        }
    }
}
