package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaoq {
    private static final zgd bN;
    private static final zgd bO;
    private static final zgd bP;
    private static final zgd bQ;
    private static final zgd bR;
    private static final zgd bS;
    private static final zgd bT;
    private static final zgd bU;
    private static final zgd bV;
    private static final zgd bW;
    private static final zgd bX;
    public static final zgd br;
    public static final zgd bs;
    public static final zgd bt;
    public static final zgd bu;
    public static final zgd bv;
    public static final zgd bw;
    public static final zgd bx;
    public static final zgd by;
    public static final int a = aand.INVALID_VIDEO_FORMAT.bG;
    public static final int b = aand.MP4_AVCBASE640_AAC.bG;
    public static final int c = aand.MP4_H264_AAC_DVD.bG;
    public static final int d = aand.MP4_H264_AAC_HIGH.bG;
    public static final int e = aand.MP4_AVC720P_AAC.bG;
    public static final int f = aand.THREEGPP_MPEG4SP_AAC.bG;
    public static final int g = aand.THREEGPP_MPEG4SP_AAC_HIGH.bG;
    public static final int h = aand.DASH_FMP4_AV1_ULTRALOW.bG;
    public static final int i = aand.DASH_FMP4_AV1_LOW.bG;
    public static final int j = aand.DASH_FMP4_AV1_MED.bG;
    public static final int k = aand.DASH_FMP4_AV1_HIGH.bG;
    public static final int l = aand.DASH_FMP4_AV1_720P.bG;
    public static final int m = aand.DASH_FMP4_AV1_1080P.bG;
    public static final int n = aand.DASH_FMP4_AV1_2K.bG;
    public static final int o = aand.DASH_FMP4_AV1_4K.bG;
    public static final int p = aand.DASH_FMP4_AV1_8K.bG;
    public static final int q = aand.DASH_FMP4_AV1_HIGHRES.bG;
    public static final int r = aand.DASH_FMP4_AV1_ULTRALOW_HDR.bG;
    public static final int s = aand.DASH_FMP4_AV1_LOW_HDR.bG;
    public static final int t = aand.DASH_FMP4_AV1_MED_HDR.bG;
    public static final int u = aand.DASH_FMP4_AV1_HIGH_HDR.bG;
    public static final int v = aand.DASH_FMP4_AV1_720P_HDR.bG;
    public static final int w = aand.DASH_FMP4_AV1_1080P_HDR.bG;
    public static final int x = aand.DASH_FMP4_AV1_2K_HDR.bG;
    public static final int y = aand.DASH_FMP4_AV1_4K_HDR.bG;
    public static final int z = aand.DASH_FMP4_AV1_8K_HDR.bG;
    public static final int A = aand.DASH_FMP4_AV1_HIGHRES_HDR.bG;
    public static final int B = aand.DASH_WEBM_VP9_ULTRALOW_LQ.bG;
    public static final int C = aand.DASH_WEBM_VP9_ULTRALOW.bG;
    public static final int D = aand.DASH_WEBM_VP9_LOW.bG;
    public static final int E = aand.DASH_WEBM_VP9_MED.bG;
    public static final int F = aand.DASH_WEBM_VP9_HIGH.bG;
    public static final int G = aand.DASH_WEBM_VP9_720P.bG;
    public static final int H = aand.DASH_WEBM_VP9_720P_MQ.bG;
    public static final int I = aand.DASH_WEBM_VP9_720P_HFR.bG;

    /* renamed from: J, reason: collision with root package name */
    public static final int f22J = aand.DASH_WEBM_VP9_720P_MQ_HFR.bG;
    public static final int K = aand.DASH_WEBM_VP9_1080P.bG;
    public static final int L = aand.DASH_WEBM_VP9_1080P_MQ.bG;
    public static final int M = aand.DASH_WEBM_VP9_1080P_HFR.bG;
    public static final int N = aand.DASH_WEBM_VP9_1080P_MQ_HFR.bG;
    public static final int O = aand.DASH_WEBM_VP9_2K.bG;
    public static final int P = aand.DASH_WEBM_VP9_2K_HFR.bG;
    public static final int Q = aand.DASH_WEBM_VP9_4K.bG;
    public static final int R = aand.DASH_WEBM_VP9_4K_HFR.bG;
    public static final int S = aand.DASH_WEBM_VP9_HIGHRES.bG;
    public static final int T = aand.DASH_WEBM_OPUS_ULTRALOW_LQ.bG;
    public static final int U = aand.DASH_WEBM_OPUS_LOW.bG;
    public static final int V = aand.DASH_WEBM_OPUS_MED.bG;
    public static final int W = aand.DASH_WEBM_OPUS_HIGH.bG;
    public static final int X = aand.DASH_WEBM_OPUS_AMBISONICS.bG;
    public static final int Y = aand.DASH_WEBM_VORBIS_AMBISONICS.bG;
    public static final int Z = aand.DASH_WEBM_VP9_HDR_ULTRALOW.bG;
    public static final int aa = aand.DASH_WEBM_VP9_HDR_LOW.bG;
    public static final int ab = aand.DASH_WEBM_VP9_HDR_MED.bG;
    public static final int ac = aand.DASH_WEBM_VP9_HDR_HIGH.bG;
    public static final int ad = aand.DASH_WEBM_VP9_HDR_720P.bG;
    public static final int ae = aand.DASH_WEBM_VP9_HDR_1080P.bG;
    public static final int af = aand.DASH_WEBM_VP9_HDR_2K.bG;
    public static final int ag = aand.DASH_WEBM_VP9_HDR_4K.bG;
    public static final int ah = aand.DASH_WEBM_VP9_LOW_ENC.bG;
    public static final int ai = aand.DASH_WEBM_VP9_MED_ENC.bG;
    public static final int aj = aand.DASH_WEBM_VP9_HIGH_ENC.bG;
    public static final int ak = aand.DASH_WEBM_VP9_HIGH_MQ_ENC.bG;
    public static final int al = aand.DASH_WEBM_VP9_HIGH_HQ_ENC.bG;
    public static final int am = aand.DASH_WEBM_VP9_720P_ENC.bG;
    public static final int an = aand.DASH_WEBM_VP9_720P_MQ_ENC.bG;
    public static final int ao = aand.DASH_WEBM_VP9_720P_HQ_ENC.bG;
    public static final int ap = aand.DASH_WEBM_VP9_720P_HFR_ENC.bG;
    public static final int aq = aand.DASH_WEBM_VP9_720P_MQ_HFR_ENC.bG;
    public static final int ar = aand.DASH_WEBM_VP9_1080P_ENC.bG;
    public static final int as = aand.DASH_WEBM_VP9_1080P_MQ_ENC.bG;
    public static final int at = aand.DASH_WEBM_VP9_1080P_HQ_ENC.bG;
    public static final int au = aand.DASH_WEBM_VP9_1080P_HFR_ENC.bG;
    public static final int av = aand.DASH_WEBM_VP9_1080P_MQ_HFR_ENC.bG;
    public static final int aw = aand.DASH_WEBM_VP9_2K_ENC.bG;
    public static final int ax = aand.DASH_WEBM_VP9_2K_HFR_ENC.bG;
    public static final int ay = aand.DASH_WEBM_VP9_4K_ENC.bG;
    public static final int az = aand.DASH_WEBM_VP9_4K_HFR_ENC.bG;
    public static final int aA = aand.DASH_FMP4_H264_ULTRALOW_LQ.bG;
    public static final int aB = aand.DASH_FMP4_H264_ULTRALOW.bG;
    public static final int aC = aand.DASH_FMP4_H264_LOW.bG;
    public static final int aD = aand.DASH_FMP4_H264_MED.bG;
    public static final int aE = aand.DASH_FMP4_H264_HIGH.bG;
    public static final int aF = aand.DASH_FMP4_H264_720P.bG;
    public static final int aG = aand.DASH_FMP4_H264_720P_MQ.bG;
    public static final int aH = aand.DASH_FMP4_H264_720P_HFR.bG;
    public static final int aI = aand.DASH_FMP4_H264_720P_MQ_HFR.bG;
    public static final int aJ = aand.DASH_FMP4_H264_1080P.bG;
    public static final int aK = aand.DASH_FMP4_H264_1080P_MQ.bG;
    public static final int aL = aand.DASH_FMP4_H264_1080P_HFR.bG;
    public static final int aM = aand.DASH_FMP4_H264_1080P_MQ_HFR.bG;
    public static final int aN = aand.DASH_FMP4_H264_2K.bG;
    public static final int aO = aand.DASH_FMP4_H264_2K_HFR.bG;
    public static final int aP = aand.DASH_FMP4_H264_4K.bG;
    public static final int aQ = aand.DASH_FMP4_H264_4K_HFR.bG;
    public static final int aR = aand.DASH_FMP4_HE_AAC_ULTRALOW_LQ.bG;
    public static final int aS = aand.DASH_FMP4_HE_AAC_LOW.bG;
    public static final int aT = aand.DASH_FMP4_AAC_MED.bG;
    public static final int aU = aand.DASH_FMP4_AAC_HIGH.bG;
    public static final int aV = aand.DASH_FMP4_H264_ULTRALOW_CENC.bG;
    public static final int aW = aand.DASH_FMP4_H264_LOW_CENC.bG;
    public static final int aX = aand.DASH_FMP4_H264_MED_CENC.bG;
    public static final int aY = aand.DASH_FMP4_H264_HIGH_CENC.bG;
    public static final int aZ = aand.DASH_FMP4_H264_HIGH_MQ_CENC.bG;
    public static final int ba = aand.DASH_FMP4_H264_HIGH_HQ_CENC.bG;
    public static final int bb = aand.DASH_FMP4_H264_720P_CENC.bG;
    public static final int bc = aand.DASH_FMP4_H264_720P_MQ_CENC.bG;
    public static final int bd = aand.DASH_FMP4_H264_720P_HFR_CENC.bG;
    public static final int be = aand.DASH_FMP4_H264_720P_MQ_HFR_CENC.bG;
    public static final int bf = aand.DASH_FMP4_H264_720P_HQ_CENC.bG;
    public static final int bg = aand.DASH_FMP4_H264_1080P_CENC.bG;
    public static final int bh = aand.DASH_FMP4_H264_1080P_MQ_CENC.bG;
    public static final int bi = aand.DASH_FMP4_H264_1080P_HFR_CENC.bG;
    public static final int bj = aand.DASH_FMP4_H264_1080P_MQ_HFR_CENC.bG;
    public static final int bk = aand.DASH_FMP4_H264_1080P_HQ_CENC.bG;
    public static final int bl = aand.DASH_FMP4_HE_AAC_LOW_CENC.bG;
    public static final int bm = aand.DASH_FMP4_AAC_MED_CENC.bG;
    public static final int bn = aand.bF.bG;
    private static final zgd bz = new aanp();
    private static final zgd bA = new aaoa();
    private static final zgd bB = new aaoj();
    private static final zgd bC = new aaok();
    private static final zgd bD = new aaol();
    private static final zgd bE = new aaom();
    private static final zgd bF = new aaon();
    private static final zgd bG = new aaoo();
    private static final zgd bH = new aaop();
    private static final zgd bI = new aanf();
    public static final zgd bo = new aang();
    private static final zgd bJ = new aanh();
    private static final zgd bK = new aani();
    public static final zgd bp = new aanj();
    private static final zgd bL = new aank();
    public static final zgd bq = new aanl();
    private static final zgd bM = new aanm();

    static {
        new aann();
        br = new aano();
        bs = new aanq();
        bt = new aanr();
        bN = new aans();
        bO = new aant();
        bP = new aanu();
        bQ = new aanv();
        bR = new aanw();
        bS = new aanx();
        bT = new aany();
        bU = new aanz();
        bu = new aaob();
        bV = new aaoc();
        bW = new aaod();
        bv = new aaoe();
        bX = new aaof();
        bw = new aaog();
        bx = new aaoh();
        by = new aaoi();
    }

    public static Set a() {
        return (Set) bS.get();
    }

    public static Set b() {
        return (Set) bT.get();
    }

    public static Set c() {
        return (Set) bL.get();
    }

    public static Set d() {
        return (Set) bG.get();
    }

    public static Set e() {
        return (Set) bI.get();
    }

    public static Set f(boolean z2) {
        return (Set) (z2 ? bU : bu).get();
    }

    public static Set g() {
        return (Set) bM.get();
    }

    public static Set h() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(i());
        hashSet.addAll(j());
        return Collections.unmodifiableSet(hashSet);
    }

    public static Set i() {
        return (Set) bJ.get();
    }

    public static Set j() {
        return (Set) bC.get();
    }

    public static Set k() {
        return (Set) bF.get();
    }

    public static Set l() {
        return (Set) bH.get();
    }

    public static Set m() {
        return (Set) bz.get();
    }

    public static Set n() {
        return (Set) bA.get();
    }

    public static Set o() {
        return (Set) bB.get();
    }

    public static Set p() {
        return (Set) bK.get();
    }

    public static Set q() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(z());
        hashSet.addAll(e());
        return Collections.unmodifiableSet(hashSet);
    }

    public static Set r() {
        return (Set) bX.get();
    }

    public static Set s() {
        return (Set) bO.get();
    }

    public static Set t() {
        return (Set) bR.get();
    }

    public static Set u(boolean z2) {
        return (Set) (z2 ? bP : bQ).get();
    }

    public static Set v() {
        return (Set) bV.get();
    }

    public static Set w() {
        return (Set) bW.get();
    }

    public static Set x() {
        return (Set) bN.get();
    }

    public static Set y() {
        return (Set) bD.get();
    }

    public static Set z() {
        return (Set) bE.get();
    }
}
