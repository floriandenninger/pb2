package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aapd extends zgd {
    public aapd() {
        super("VideoStreamingDataFactory.Lazy<VideoStreamingData>.create()");
    }

    @Override // defpackage.zgd
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized VideoStreamingData a() {
        aapf aapfVar;
        aone createBuilder;
        aapfVar = aapf.a;
        createBuilder = aryv.a.createBuilder();
        createBuilder.an(aapf.c().e);
        createBuilder.am(aand.DASH_FMP4_H264_ULTRALOW_CENC.a());
        createBuilder.am(aand.DASH_FMP4_H264_LOW_CENC.a());
        createBuilder.am(aand.DASH_FMP4_H264_MED_CENC.a());
        createBuilder.am(aand.DASH_FMP4_H264_HIGH_CENC.a());
        createBuilder.am(aand.DASH_FMP4_H264_HIGH_MQ_CENC.a());
        createBuilder.am(aand.DASH_FMP4_H264_HIGH_HQ_CENC.a());
        createBuilder.am(aand.DASH_WEBM_VP9_LOW_ENC.a());
        createBuilder.am(aand.DASH_WEBM_VP9_MED_ENC.a());
        createBuilder.am(aand.DASH_WEBM_VP9_HIGH_ENC.a());
        createBuilder.am(aand.DASH_WEBM_VP9_HIGH_MQ_ENC.a());
        createBuilder.am(aand.DASH_WEBM_VP9_HIGH_HQ_ENC.a());
        createBuilder.am(aand.DASH_FMP4_HE_AAC_LOW_CENC.a());
        createBuilder.am(aand.DASH_FMP4_AAC_MED_CENC.a());
        return aapfVar.d((aryv) createBuilder.build(), "zzzzzzzzzzz", 60000L);
    }
}
