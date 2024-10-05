package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerThreedRendererModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aapf {
    public static final aapf a;

    @Deprecated
    public static final aapf b;
    public static final zgd c;
    public static final zgd d;
    private final aape[] e;

    static {
        aapf aapfVar = new aapf(new aape[0]);
        a = aapfVar;
        b = aapfVar;
        c = new aapc();
        d = new aapd();
    }

    public aapf(aape... aapeVarArr) {
        this.e = aapeVarArr;
    }

    public static VideoStreamingData b(int i) {
        aone createBuilder = aryv.a.createBuilder();
        aong aongVar = (aong) aqxz.b.createBuilder();
        aongVar.copyOnWrite();
        aqxz aqxzVar = (aqxz) aongVar.instance;
        aqxzVar.c |= 1;
        aqxzVar.d = i;
        aongVar.copyOnWrite();
        aqxz aqxzVar2 = (aqxz) aongVar.instance;
        aqxzVar2.c |= 64;
        aqxzVar2.j = 144;
        createBuilder.copyOnWrite();
        aryv aryvVar = (aryv) createBuilder.instance;
        aqxz aqxzVar3 = (aqxz) aongVar.build();
        aqxzVar3.getClass();
        aryvVar.a();
        aryvVar.e.add(aqxzVar3);
        return a.d((aryv) createBuilder.build(), "zzzzzzzzzzz", -9223372036854775807L);
    }

    public static aryv c() {
        aone createBuilder = aryv.a.createBuilder();
        createBuilder.am(aand.DASH_FMP4_H264_2K.a());
        createBuilder.am(aand.DASH_FMP4_H264_1080P.a());
        createBuilder.am(aand.DASH_FMP4_H264_720P.a());
        createBuilder.am(aand.DASH_FMP4_H264_HIGH.a());
        createBuilder.am(aand.DASH_FMP4_H264_MED.a());
        createBuilder.am(aand.DASH_FMP4_H264_LOW.a());
        createBuilder.am(aand.DASH_FMP4_H264_ULTRALOW.a());
        createBuilder.am(aand.DASH_WEBM_VP9_2K.a());
        createBuilder.am(aand.DASH_WEBM_VP9_1080P.a());
        createBuilder.am(aand.DASH_WEBM_VP9_720P.a());
        createBuilder.am(aand.DASH_WEBM_VP9_HIGH.a());
        createBuilder.am(aand.DASH_WEBM_VP9_MED.a());
        createBuilder.am(aand.DASH_WEBM_VP9_LOW.a());
        createBuilder.am(aand.DASH_WEBM_VP9_ULTRALOW.a());
        createBuilder.am(aand.DASH_FMP4_AV1_2K.a());
        createBuilder.am(aand.DASH_FMP4_AV1_1080P.a());
        createBuilder.am(aand.DASH_FMP4_AV1_720P.a());
        createBuilder.am(aand.DASH_FMP4_AV1_HIGH.a());
        createBuilder.am(aand.DASH_FMP4_AV1_MED.a());
        createBuilder.am(aand.DASH_FMP4_AV1_LOW.a());
        createBuilder.am(aand.DASH_FMP4_AV1_ULTRALOW.a());
        createBuilder.am(aand.DASH_FMP4_HE_AAC_LOW.a());
        createBuilder.am(aand.DASH_FMP4_AAC_MED.a());
        createBuilder.am(aand.DASH_WEBM_OPUS_LOW.a());
        createBuilder.am(aand.DASH_WEBM_OPUS_MED.a());
        createBuilder.am(aand.DASH_WEBM_OPUS_HIGH.a());
        createBuilder.ap(aand.MP4_AVCBASE640_AAC.a());
        createBuilder.ap(aand.MP4_AVC720P_AAC.a());
        return (aryv) createBuilder.build();
    }

    public final VideoStreamingData a(aryv aryvVar, String str, String str2, long j, long j2, boolean z, boolean z2, boolean z3, int i, aszn asznVar, PlayerThreedRendererModel playerThreedRendererModel, String str3, PlayerConfigModel playerConfigModel) {
        VideoStreamingData videoStreamingData = new VideoStreamingData(aryvVar, str, j, j2, z, z2, z3, i, asznVar, playerThreedRendererModel, str3, playerConfigModel);
        aape[] aapeVarArr = this.e;
        int length = aapeVarArr.length;
        for (int i2 = 0; i2 < length; i2 = 1) {
            videoStreamingData = aapeVarArr[0].a(videoStreamingData, str2);
        }
        return videoStreamingData;
    }

    public final VideoStreamingData d(aryv aryvVar, String str, long j) {
        return a(aryvVar, str, null, j, 0L, false, false, false, 0, aszn.MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN, new PlayerThreedRendererModel(), "", PlayerConfigModel.b);
    }
}
