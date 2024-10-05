package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
@axmb(a = 64, b = {5})
/* loaded from: classes2.dex */
public final class axlw extends axlx {
    public static final Map a;
    public static final Map b;
    int A;
    int B;
    int C;
    boolean D;
    int E;
    int F;
    int G;
    int H;
    int I;

    /* renamed from: J, reason: collision with root package name */
    int f140J;
    int K;
    int L;
    int M;
    int N;
    int O;
    int P;
    int Q;
    int R;
    boolean S;
    byte[] c;
    public int d;
    public int e;
    int f;
    public int g;
    int h;
    int i;
    int j;
    int k;
    int l;
    int m;
    int n;
    int o;
    int p;
    int q;
    int r;
    int s;
    int t;
    int u;
    int v;
    int w;
    int x;
    int y;
    int z;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap.put(0, 96000);
        hashMap.put(1, 88200);
        hashMap.put(2, 64000);
        hashMap.put(3, 48000);
        hashMap.put(4, 44100);
        hashMap.put(5, 32000);
        hashMap.put(6, 24000);
        hashMap.put(7, 22050);
        hashMap.put(8, 16000);
        hashMap.put(9, 12000);
        hashMap.put(10, 11025);
        hashMap.put(11, 8000);
        hashMap2.put(1, "AAC main");
        hashMap2.put(2, "AAC LC");
        hashMap2.put(3, "AAC SSR");
        hashMap2.put(4, "AAC LTP");
        hashMap2.put(5, "SBR");
        hashMap2.put(6, "AAC Scalable");
        hashMap2.put(7, "TwinVQ");
        hashMap2.put(8, "CELP");
        hashMap2.put(9, "HVXC");
        hashMap2.put(10, "(reserved)");
        hashMap2.put(11, "(reserved)");
        hashMap2.put(12, "TTSI");
        hashMap2.put(13, "Main synthetic");
        hashMap2.put(14, "Wavetable synthesis");
        hashMap2.put(15, "General MIDI");
        hashMap2.put(16, "Algorithmic Synthesis and Audio FX");
        hashMap2.put(17, "ER AAC LC");
        hashMap2.put(18, "(reserved)");
        hashMap2.put(19, "ER AAC LTP");
        hashMap2.put(20, "ER AAC Scalable");
        hashMap2.put(21, "ER TwinVQ");
        hashMap2.put(22, "ER BSAC");
        hashMap2.put(23, "ER AAC LD");
        hashMap2.put(24, "ER CELP");
        hashMap2.put(25, "ER HVXC");
        hashMap2.put(26, "ER HILN");
        hashMap2.put(27, "ER Parametric");
        hashMap2.put(28, "SSC");
        hashMap2.put(29, "PS");
        hashMap2.put(30, "MPEG Surround");
        hashMap2.put(31, "(escape)");
        hashMap2.put(32, "Layer-1");
        hashMap2.put(33, "Layer-2");
        hashMap2.put(34, "Layer-3");
        hashMap2.put(35, "DST");
        hashMap2.put(36, "ALS");
        hashMap2.put(37, "SLS");
        hashMap2.put(38, "SLS non-core");
        hashMap2.put(39, "ER AAC ELD");
        hashMap2.put(40, "SMR Simple");
        hashMap2.put(41, "SMR Main");
    }

    private static final int d(axly axlyVar) {
        int b2 = axlyVar.b(5);
        return b2 == 31 ? axlyVar.b(6) + 32 : b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x019f  */
    @Override // defpackage.axlx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.nio.ByteBuffer r15) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlw.a(java.nio.ByteBuffer):void");
    }

    public final void b() {
        if (this.d != 2) {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axlw axlwVar = (axlw) obj;
        return this.A == axlwVar.A && this.z == axlwVar.z && this.B == axlwVar.B && this.d == axlwVar.d && this.g == axlwVar.g && this.u == axlwVar.u && this.t == axlwVar.t && this.q == axlwVar.q && this.p == axlwVar.p && this.f140J == axlwVar.f140J && this.h == axlwVar.h && this.m == axlwVar.m && this.v == axlwVar.v && this.C == axlwVar.C && this.l == axlwVar.l && this.k == axlwVar.k && this.o == axlwVar.o && this.s == axlwVar.s && this.D == axlwVar.D && this.P == axlwVar.P && this.Q == axlwVar.Q && this.R == axlwVar.R && this.O == axlwVar.O && this.M == axlwVar.M && this.L == axlwVar.L && this.N == axlwVar.N && this.I == axlwVar.I && this.H == axlwVar.H && this.E == axlwVar.E && this.w == axlwVar.w && this.y == axlwVar.y && this.x == axlwVar.x && this.G == axlwVar.G && this.F == axlwVar.F && this.S == axlwVar.S && this.j == axlwVar.j && this.n == axlwVar.n && this.f == axlwVar.f && this.e == axlwVar.e && this.i == axlwVar.i && this.r == axlwVar.r && this.K == axlwVar.K && Arrays.equals(this.c, axlwVar.c);
    }

    public final int hashCode() {
        byte[] bArr = this.c;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.t) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + (this.D ? 1 : 0)) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.f140J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + (this.S ? 1 : 0);
    }

    @Override // defpackage.axlx
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioSpecificConfig{configBytes=");
        sb.append(ddy.a(this.c));
        sb.append(", audioObjectType=");
        sb.append(this.d);
        sb.append(" (");
        Map map = b;
        sb.append((String) map.get(Integer.valueOf(this.d)));
        sb.append("), samplingFrequencyIndex=");
        sb.append(this.e);
        sb.append(" (");
        Map map2 = a;
        sb.append(map2.get(Integer.valueOf(this.e)));
        sb.append("), samplingFrequency=");
        sb.append(this.f);
        sb.append(", channelConfiguration=");
        sb.append(this.g);
        if (this.h > 0) {
            sb.append(", extensionAudioObjectType=");
            sb.append(this.h);
            sb.append(" (");
            sb.append((String) map.get(Integer.valueOf(this.h)));
            sb.append("), sbrPresentFlag=");
            sb.append(this.i);
            sb.append(", psPresentFlag=");
            sb.append(this.j);
            sb.append(", extensionSamplingFrequencyIndex=");
            sb.append(this.k);
            sb.append(" (");
            sb.append(map2.get(Integer.valueOf(this.k)));
            sb.append("), extensionSamplingFrequency=");
            sb.append(this.l);
            sb.append(", extensionChannelConfiguration=");
            sb.append(this.m);
        }
        sb.append(", syncExtensionType=");
        sb.append(this.r);
        if (this.D) {
            sb.append(", frameLengthFlag=");
            sb.append(this.s);
            sb.append(", dependsOnCoreCoder=");
            sb.append(this.t);
            sb.append(", coreCoderDelay=");
            sb.append(this.u);
            sb.append(", extensionFlag=");
            sb.append(this.v);
            sb.append(", layerNr=");
            sb.append(this.w);
            sb.append(", numOfSubFrame=");
            sb.append(this.x);
            sb.append(", layer_length=");
            sb.append(this.y);
            sb.append(", aacSectionDataResilienceFlag=");
            sb.append(this.z);
            sb.append(", aacScalefactorDataResilienceFlag=");
            sb.append(this.A);
            sb.append(", aacSpectralDataResilienceFlag=");
            sb.append(this.B);
            sb.append(", extensionFlag3=");
            sb.append(this.C);
        }
        if (this.S) {
            sb.append(", isBaseLayer=");
            sb.append(this.E);
            sb.append(", paraMode=");
            sb.append(this.F);
            sb.append(", paraExtensionFlag=");
            sb.append(this.G);
            sb.append(", hvxcVarMode=");
            sb.append(this.H);
            sb.append(", hvxcRateMode=");
            sb.append(this.I);
            sb.append(", erHvxcExtensionFlag=");
            sb.append(this.f140J);
            sb.append(", var_ScalableFlag=");
            sb.append(this.K);
            sb.append(", hilnQuantMode=");
            sb.append(this.L);
            sb.append(", hilnMaxNumLine=");
            sb.append(this.M);
            sb.append(", hilnSampleRateCode=");
            sb.append(this.N);
            sb.append(", hilnFrameLength=");
            sb.append(this.O);
            sb.append(", hilnContMode=");
            sb.append(this.P);
            sb.append(", hilnEnhaLayer=");
            sb.append(this.Q);
            sb.append(", hilnEnhaQuantMode=");
            sb.append(this.R);
        }
        sb.append('}');
        return sb.toString();
    }
}
