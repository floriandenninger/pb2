package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class wgw implements ammy {
    private final /* synthetic */ int v;
    public static final /* synthetic */ wgw u = new wgw(20);
    public static final /* synthetic */ wgw t = new wgw(19);
    public static final /* synthetic */ wgw s = new wgw(18);
    public static final /* synthetic */ wgw r = new wgw(17);
    public static final /* synthetic */ wgw q = new wgw(16);
    public static final /* synthetic */ wgw p = new wgw(15);
    public static final /* synthetic */ wgw o = new wgw(14);
    public static final /* synthetic */ wgw n = new wgw(13);
    public static final /* synthetic */ wgw m = new wgw(12);
    public static final /* synthetic */ wgw l = new wgw(11);
    public static final /* synthetic */ wgw k = new wgw(10);
    public static final /* synthetic */ wgw j = new wgw(9);
    public static final /* synthetic */ wgw i = new wgw(8);
    public static final /* synthetic */ wgw h = new wgw(7);
    public static final /* synthetic */ wgw g = new wgw(6);
    public static final /* synthetic */ wgw f = new wgw(5);
    public static final /* synthetic */ wgw e = new wgw(4);
    public static final /* synthetic */ wgw d = new wgw(3);
    public static final /* synthetic */ wgw c = new wgw(2);
    public static final /* synthetic */ wgw b = new wgw(1);
    public static final /* synthetic */ wgw a = new wgw(0);

    private /* synthetic */ wgw(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ammy
    public final boolean a(Object obj) {
        apxf apxfVar;
        switch (this.v) {
            case 0:
                return ((String) obj).startsWith("incognito_promotion_already_shown");
            case 1:
                return stb.a.contains(((sym) obj).getClass());
            case 2:
                return ((axcq) obj).q();
            case 3:
                String str = (String) obj;
                return !TextUtils.isEmpty(str) && str.startsWith("VISITED_EFFECT_ID_");
            case 4:
                aqxz aqxzVar = (aqxz) obj;
                VideoStreamingData videoStreamingData = VideoStreamingData.a;
                return (aaov.d(aqxzVar.f) && aaoq.d().contains(Integer.valueOf(aqxzVar.d))) ? false : true;
            case 5:
                aqxz aqxzVar2 = (aqxz) obj;
                VideoStreamingData videoStreamingData2 = VideoStreamingData.a;
                return !aaov.d(aqxzVar2.f) || FormatStreamModel.g(aqxzVar2.i, aqxzVar2.j) <= 480;
            case 6:
                aqxz aqxzVar3 = (aqxz) obj;
                VideoStreamingData videoStreamingData3 = VideoStreamingData.a;
                return (aaov.d(aqxzVar3.f) && FormatStreamModel.I(aqxzVar3)) ? false : true;
            case 7:
                return yny.c((cnq) obj);
            case 8:
                String str2 = (String) obj;
                return "exo_cache_size_bytes_used".equals(str2) || str2.startsWith("av1_supported") || str2.startsWith("h264_main_profile_supported") || str2.startsWith("vp9_profile_2_hdr_10_plus_supported") || str2.startsWith("vp9_profile_2_supported") || str2.startsWith("vp9_secure_profile_2_supported") || str2.startsWith("vp9_secure_supported") || str2.startsWith("vp9_supported") || str2.startsWith("opus_supported") || str2.endsWith("last_manual_video_quality_selection_max") || str2.endsWith("last_manual_video_quality_selection_min") || str2.endsWith("last_manual_video_quality_selection_direction") || str2.endsWith("last_manual_video_quality_selection_timestamp") || str2.endsWith("last_playback_start_timestamp") || str2.equals(adyu.LIMIT_MOBILE_DATA_USAGE) || str2.equals("dcip3_supported") || "media_persisted_bandwidth_samples".equals(str2);
            case 9:
                return true;
            case 10:
                String str3 = (String) obj;
                return str3.startsWith("com.google.android.libraries.youtube.notification.badgecount.badgecount") || str3.startsWith("com.google.android.libraries.youtube.notification.pref.notification_channel_importance") || str3.startsWith("com.google.android.libraries.youtube.notification.pref.notification_channel_sound_enabled");
            case 11:
                return true;
            case 12:
                return false;
            case 13:
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) obj;
                return playerResponseModel != null && playerResponseModel.B();
            case 14:
                WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) obj;
                return (watchNextResponseModel == null || (apxfVar = watchNextResponseModel.c) == null || !apxfVar.pY(atrs.a)) ? false : true;
            case 15:
                int i2 = agsb.h;
                return true;
            case 16:
                int i3 = agsb.h;
                return true;
            case 17:
                String str4 = (String) obj;
                return (!TextUtils.isEmpty(str4) && str4.startsWith("playability_adult_confirmation_time_stamp:")) || aili.f(str4);
            case 18:
                apxf apxfVar2 = (apxf) obj;
                return apxfVar2.pY(WatchEndpointOuterClass.watchEndpoint) || apxfVar2.pY(WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint);
            case 19:
                Float f2 = (Float) obj;
                amru amruVar = ajhe.a;
                return f2.floatValue() >= 0.0f && f2.floatValue() <= 1.0f;
            default:
                ajpq ajpqVar = (ajpq) obj;
                if (ajpqVar != null) {
                    return (ajpqVar.a.isEmpty() && ajpqVar.b.isEmpty()) ? false : true;
                }
                return false;
        }
    }
}
