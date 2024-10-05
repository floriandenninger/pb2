package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class pdc {
    public static final int aA;
    public static final int aB;
    public static final int aC;
    public static final int aD;
    public static final int aE;
    public static final int aF;
    public static final int aG;
    public static final int aH;
    public static final int aI;
    public static final int aJ;
    public static final int aK;
    public static final int aL;
    public static final int aM;
    public static final int aN;
    public static final int aO;
    public static final int aP;
    public static final int an;
    public static final int ao;
    public static final int ap;
    public static final int aq;
    public static final int ar;
    public static final int as;
    public static final int at;
    public static final int au;
    public static final int av;
    public static final int aw;
    public static final int ax;
    public static final int ay;
    public static final int az;
    public final int aQ;
    public static final int d = pgz.c("ftyp");
    public static final int e = pgz.c("avc1");
    public static final int f = pgz.c("avc3");
    public static final int g = pgz.c("hvc1");
    public static final int h = pgz.c("hev1");
    public static final int i = pgz.c("s263");
    public static final int j = pgz.c("d263");
    public static final int k = pgz.c("mdat");
    public static final int l = pgz.c("mp4a");
    public static final int m = pgz.c(".mp3");
    public static final int n = pgz.c("wave");
    public static final int o = pgz.c("lpcm");
    public static final int p = pgz.c("sowt");
    public static final int q = pgz.c("ac-3");
    public static final int r = pgz.c("dac3");
    public static final int s = pgz.c("ec-3");
    public static final int t = pgz.c("dec3");
    public static final int u = pgz.c("dtsc");
    public static final int v = pgz.c("dtsh");
    public static final int w = pgz.c("dtsl");
    public static final int x = pgz.c("dtse");
    public static final int y = pgz.c("ddts");
    public static final int z = pgz.c("tfdt");
    public static final int A = pgz.c("tfhd");
    public static final int B = pgz.c("trex");
    public static final int C = pgz.c("trun");
    public static final int D = pgz.c("sidx");
    public static final int E = pgz.c("moov");
    public static final int F = pgz.c("mvhd");
    public static final int G = pgz.c("trak");
    public static final int H = pgz.c("mdia");
    public static final int I = pgz.c("minf");

    /* renamed from: J, reason: collision with root package name */
    public static final int f263J = pgz.c("stbl");
    public static final int K = pgz.c("avcC");
    public static final int L = pgz.c("hvcC");
    public static final int M = pgz.c("esds");
    public static final int N = pgz.c("moof");
    public static final int O = pgz.c("traf");
    public static final int P = pgz.c("mvex");
    public static final int Q = pgz.c("mehd");
    public static final int R = pgz.c("tkhd");
    public static final int S = pgz.c("edts");
    public static final int T = pgz.c("elst");
    public static final int U = pgz.c("mdhd");
    public static final int V = pgz.c("hdlr");
    public static final int W = pgz.c("stsd");
    public static final int X = pgz.c("pssh");
    public static final int Y = pgz.c("sinf");
    public static final int Z = pgz.c("schm");
    public static final int aa = pgz.c("schi");
    public static final int ab = pgz.c("tenc");
    public static final int ac = pgz.c("encv");
    public static final int ad = pgz.c("enca");
    public static final int ae = pgz.c("frma");
    public static final int af = pgz.c("saiz");
    public static final int ag = pgz.c("saio");
    public static final int ah = pgz.c("sbgp");
    public static final int ai = pgz.c("sgpd");
    public static final int aj = pgz.c("uuid");
    public static final int ak = pgz.c("senc");
    public static final int al = pgz.c("pasp");
    public static final int am = pgz.c("TTML");

    static {
        pgz.c("vmhd");
        an = pgz.c("mp4v");
        ao = pgz.c("stts");
        ap = pgz.c("stss");
        aq = pgz.c("ctts");
        ar = pgz.c("stsc");
        as = pgz.c("stsz");
        at = pgz.c("stz2");
        au = pgz.c("stco");
        av = pgz.c("co64");
        aw = pgz.c("tx3g");
        ax = pgz.c("wvtt");
        ay = pgz.c("stpp");
        az = pgz.c("samr");
        aA = pgz.c("sawb");
        aB = pgz.c("udta");
        aC = pgz.c("meta");
        aD = pgz.c("ilst");
        aE = pgz.c("mean");
        aF = pgz.c("name");
        aG = pgz.c("data");
        aH = pgz.c("emsg");
        aI = pgz.c("st3d");
        aJ = pgz.c("sv3d");
        aK = pgz.c("proj");
        aL = pgz.c("vp08");
        aM = pgz.c("vp09");
        aN = pgz.c("vpcC");
        aO = pgz.c("camm");
        aP = pgz.c("----");
    }

    public pdc(int i2) {
        this.aQ = i2;
    }

    public static int e(int i2) {
        return i2 & 16777215;
    }

    public static int f(int i2) {
        return (i2 >> 24) & PrivateKeyType.INVALID;
    }

    public static String g(int i2) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) (i2 >> 24));
        sb.append((char) ((i2 >> 16) & PrivateKeyType.INVALID));
        sb.append((char) ((i2 >> 8) & PrivateKeyType.INVALID));
        sb.append((char) (i2 & PrivateKeyType.INVALID));
        return sb.toString();
    }

    public String toString() {
        return g(this.aQ);
    }
}
