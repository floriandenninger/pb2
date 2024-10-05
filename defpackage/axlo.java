package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axlo extends axkx {
    static final Map d;
    public static final Map e;
    axld f;
    dey g;
    long[] h;
    axln i;
    int j;
    long k;
    long l;
    public axkv m;
    private List n;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put(1, "AAC Main");
        hashMap.put(2, "AAC LC (Low Complexity)");
        hashMap.put(3, "AAC SSR (Scalable Sample Rate)");
        hashMap.put(4, "AAC LTP (Long Term Prediction)");
        hashMap.put(5, "SBR (Spectral Band Replication)");
        hashMap.put(6, "AAC Scalable");
        hashMap.put(7, "TwinVQ");
        hashMap.put(8, "CELP (Code Excited Linear Prediction)");
        hashMap.put(9, "HXVC (Harmonic Vector eXcitation Coding)");
        hashMap.put(10, "Reserved");
        hashMap.put(11, "Reserved");
        hashMap.put(12, "TTSI (Text-To-Speech Interface)");
        hashMap.put(13, "Main Synthesis");
        hashMap.put(14, "Wavetable Synthesis");
        hashMap.put(15, "General MIDI");
        hashMap.put(16, "Algorithmic Synthesis and Audio Effects");
        hashMap.put(17, "ER (Error Resilient) AAC LC");
        hashMap.put(18, "Reserved");
        hashMap.put(19, "ER AAC LTP");
        hashMap.put(20, "ER AAC Scalable");
        hashMap.put(21, "ER TwinVQ");
        hashMap.put(22, "ER BSAC (Bit-Sliced Arithmetic Coding)");
        hashMap.put(23, "ER AAC LD (Low Delay)");
        hashMap.put(24, "ER CELP");
        hashMap.put(25, "ER HVXC");
        hashMap.put(26, "ER HILN (Harmonic and Individual Lines plus Noise)");
        hashMap.put(27, "ER Parametric");
        hashMap.put(28, "SSC (SinuSoidal Coding)");
        hashMap.put(29, "PS (Parametric Stereo)");
        hashMap.put(30, "MPEG Surround");
        hashMap.put(31, "(Escape value)");
        hashMap.put(32, "Layer-1");
        hashMap.put(33, "Layer-2");
        hashMap.put(34, "Layer-3");
        hashMap.put(35, "DST (Direct Stream Transfer)");
        hashMap.put(36, "ALS (Audio Lossless)");
        hashMap.put(37, "SLS (Scalable LosslesS)");
        hashMap.put(38, "SLS non-core");
        hashMap.put(39, "ER AAC ELD (Enhanced Low Delay)");
        hashMap.put(40, "SMR (Symbolic Music Representation) Simple");
        hashMap.put(41, "SMR Main");
        hashMap.put(42, "USAC (Unified Speech and Audio Coding) (no SBR)");
        hashMap.put(43, "SAOC (Spatial Audio Object Coding)");
        hashMap.put(44, "LD MPEG Surround");
        hashMap.put(45, "USAC");
        HashMap hashMap2 = new HashMap();
        e = hashMap2;
        hashMap2.put(96000, 0);
        hashMap2.put(88200, 1);
        hashMap2.put(64000, 2);
        hashMap2.put(48000, 3);
        hashMap2.put(44100, 4);
        hashMap2.put(32000, 5);
        hashMap2.put(24000, 6);
        hashMap2.put(22050, 7);
        hashMap2.put(16000, 8);
        hashMap2.put(12000, 9);
        hashMap2.put(11025, 10);
        hashMap2.put(8000, 11);
        hashMap2.put(0, 96000);
        hashMap2.put(1, 88200);
        hashMap2.put(2, 64000);
        hashMap2.put(3, 48000);
        hashMap2.put(4, 44100);
        hashMap2.put(5, 32000);
        hashMap2.put(6, 24000);
        hashMap2.put(7, 22050);
        hashMap2.put(8, 16000);
        hashMap2.put(9, 12000);
        hashMap2.put(10, 11025);
        hashMap2.put(11, 8000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00af, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b1, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b3, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e1, code lost:
    
        r17.i = r0;
        r0 = r0.c;
        java.lang.Double.isNaN(r0);
        r0 = r0 / 1024.0d;
        r3 = r17.n.size();
        java.lang.Double.isNaN(r3);
        r3 = r3 / r0;
        r7 = new java.util.LinkedList();
        r8 = r17.n.iterator();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0104, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0109, code lost:
    
        if (r8.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x010b, code lost:
    
        r12 = (int) ((defpackage.axlb) r8.next()).a();
        r10 = r10 + r12;
        r7.add(java.lang.Integer.valueOf(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0126, code lost:
    
        if (r7.size() <= r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0128, code lost:
    
        r7.pop();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0131, code lost:
    
        if (r7.size() != ((int) r0)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0133, code lost:
    
        r12 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x013b, code lost:
    
        if (r12.hasNext() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x013d, code lost:
    
        r13 = r13 + ((java.lang.Integer) r12.next()).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0149, code lost:
    
        r12 = r13;
        java.lang.Double.isNaN(r12);
        r14 = r7.size();
        java.lang.Double.isNaN(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0161, code lost:
    
        if ((((r12 * 8.0d) / r14) * r0) <= r17.k) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0163, code lost:
    
        r17.k = (int) r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0168, code lost:
    
        java.lang.Double.isNaN(r10 * 8);
        r17.l = (int) (r0 / r3);
        r17.j = 1536;
        r17.g = new defpackage.dey();
        r0 = new defpackage.dge("mp4a");
        r3 = r17.i.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x018b, code lost:
    
        if (r3 != 7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x018d, code lost:
    
        r0.b = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0194, code lost:
    
        r0.d = r1.c;
        ((defpackage.dgc) r0).a = 1;
        r0.c = 16;
        r1 = new defpackage.axlv();
        r2 = new defpackage.axmc();
        r2.a = 0;
        r3 = new defpackage.axmi();
        r3.b();
        r2.k = r3;
        r3 = new defpackage.axlz();
        r3.a = 64;
        r3.b = 5;
        r3.d = r17.j;
        r3.e = r17.k;
        r3.f = r17.l;
        r4 = new defpackage.axlw();
        r4.d = 2;
        r5 = r17.i;
        r4.e = r5.a;
        r4.g = r5.d;
        r3.h = r4;
        r2.j = r3;
        r3 = r2.d();
        r1.a = r2;
        ((defpackage.axlu) r1).b = r3;
        r0.w(r1);
        r17.g.w(r0);
        r17.f.d = new java.util.Date();
        r17.f.c = new java.util.Date();
        r0 = r17.f;
        r0.a = "eng";
        r0.h = 1.0f;
        r0.b = r17.i.c;
        r0 = new long[r17.n.size()];
        r17.h = r0;
        java.util.Arrays.fill(r0, 1024L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0224, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0192, code lost:
    
        r0.b = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ad, code lost:
    
        if (r10 == null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public axlo(defpackage.axkv r18) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlo.<init>(axkv):void");
    }

    @Override // defpackage.axkx, defpackage.axlc
    public final dfh b() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.axkx, defpackage.axlc
    public final List d() {
        return null;
    }

    @Override // defpackage.axkx, defpackage.axlc
    public final List f() {
        return null;
    }

    @Override // defpackage.axkx, defpackage.axlc
    public final long[] h() {
        return null;
    }

    @Override // defpackage.axlc
    public final dey i() {
        return this.g;
    }

    @Override // defpackage.axlc
    public final axld j() {
        return this.f;
    }

    @Override // defpackage.axlc
    public final String k() {
        return "soun";
    }

    @Override // defpackage.axlc
    public final List l() {
        return this.n;
    }

    @Override // defpackage.axlc
    public final long[] m() {
        return this.h;
    }

    public final String toString() {
        axln axlnVar = this.i;
        int i = axlnVar.c;
        int i2 = axlnVar.d;
        StringBuilder sb = new StringBuilder(63);
        sb.append("AACTrackImpl{sampleRate=");
        sb.append(i);
        sb.append(", channelconfig=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
