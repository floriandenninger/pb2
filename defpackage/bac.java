package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bac extends ple {
    private static final byte[] a = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final MediaCodec.BufferInfo A;
    private final long[] B;
    private final long[] C;
    private final long[] D;
    private pms E;
    private pms F;
    private ayh G;
    private ayh H;
    private MediaCrypto I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f143J;
    private float K;
    private boolean L;
    private float M;
    private ArrayDeque N;
    private bab O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private azu W;
    private long X;
    private int Y;
    private int Z;
    private ByteBuffer aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private int ah;
    private int ai;
    private int aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private long an;
    private long ao;
    private boolean ap;
    private boolean aq;
    private long ar;
    private int as;
    private final azx b;
    private final bae c;
    public float d;
    public azy e;
    public pms f;
    public MediaFormat g;
    public baa h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public plp n;
    protected auj o;
    public long p;
    private final float q;
    private final asw u;
    private final asw v;
    private final asw w;
    private final azt x;
    private final ptp y;
    private final ArrayList z;

    public bac(int i, azx azxVar, bae baeVar, float f) {
        super(i);
        this.b = azxVar;
        pse.c(baeVar);
        this.c = baeVar;
        this.q = f;
        this.u = asw.a();
        this.v = new asw(0);
        this.w = new asw(2);
        azt aztVar = new azt();
        this.x = aztVar;
        this.y = new ptp();
        this.z = new ArrayList();
        this.A = new MediaCodec.BufferInfo();
        this.d = 1.0f;
        this.K = 1.0f;
        this.B = new long[10];
        this.C = new long[10];
        this.D = new long[10];
        this.ar = -9223372036854775807L;
        this.p = -9223372036854775807L;
        aztVar.b(0);
        aztVar.b.order(ByteOrder.nativeOrder());
        this.M = -1.0f;
        this.P = 0;
        this.ah = 0;
        this.Y = -1;
        this.Z = -1;
        this.X = -9223372036854775807L;
        this.an = -9223372036854775807L;
        this.ao = -9223372036854775807L;
        this.ai = 0;
        this.aj = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean R(pms pmsVar) {
        int i = pmsVar.G;
        return i == 0 || i == 2;
    }

    private final void V() {
        L();
        I();
    }

    private final void W() {
        this.Y = -1;
        this.v.b = null;
    }

    private final void X() {
        this.Z = -1;
        this.aa = null;
    }

    private final void Y(ayh ayhVar) {
        arv.b(this.G, ayhVar);
        this.G = ayhVar;
    }

    private final void Z(ayh ayhVar) {
        arv.b(this.H, ayhVar);
        this.H = ayhVar;
    }

    private final boolean aC() {
        return this.Z >= 0;
    }

    private final boolean aD(int i) {
        pmt al = al();
        this.u.clear();
        int af = af(al, this.u, i | 4);
        if (af == -5) {
            g(al);
            return true;
        }
        if (af != -4 || !this.u.isEndOfStream()) {
            return false;
        }
        this.ap = true;
        U();
        return false;
    }

    private static final ayz aE(ayh ayhVar) {
        return (ayz) ayhVar.b();
    }

    private final void aa() {
        try {
            this.I.setMediaDrmSession(aE(this.H).c);
            Y(this.H);
            this.ai = 0;
            this.aj = 0;
        } catch (MediaCryptoException e) {
            throw aj(e, this.E, 6006);
        }
    }

    private final boolean ab() {
        if (this.ak) {
            this.ai = 1;
            if (this.R) {
                this.aj = 3;
                return false;
            }
            this.aj = 2;
        } else {
            aa();
        }
        return true;
    }

    private final boolean ac() {
        azy azyVar = this.e;
        if (azyVar == null || this.ai == 2 || this.ap) {
            return false;
        }
        if (this.Y < 0) {
            int a2 = azyVar.a();
            this.Y = a2;
            if (a2 < 0) {
                return false;
            }
            this.v.b = this.e.e(a2);
            this.v.clear();
        }
        if (this.ai == 1) {
            if (!this.V) {
                this.al = true;
                this.e.n(this.Y, 0, 0L, 4);
                W();
            }
            this.ai = 2;
            return false;
        }
        if (this.T) {
            this.T = false;
            this.v.b.put(a);
            this.e.n(this.Y, 38, 0L, 0);
            W();
            this.ak = true;
            return true;
        }
        if (this.ah == 1) {
            for (int i = 0; i < this.f.p.size(); i++) {
                this.v.b.put((byte[]) this.f.p.get(i));
            }
            this.ah = 2;
        }
        int position = this.v.b.position();
        pmt al = al();
        try {
            int af = af(al, this.v, 0);
            if (ax()) {
                this.ao = this.an;
            }
            if (af == -3) {
                return false;
            }
            if (af == -5) {
                if (this.ah == 2) {
                    this.v.clear();
                    this.ah = 1;
                }
                g(al);
                return true;
            }
            if (this.v.isEndOfStream()) {
                if (this.ah == 2) {
                    this.v.clear();
                    this.ah = 1;
                }
                this.ap = true;
                if (!this.ak) {
                    U();
                    return false;
                }
                try {
                    if (!this.V) {
                        this.al = true;
                        this.e.n(this.Y, 0, 0L, 4);
                        W();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw aj(e, this.E, plh.b(e.getErrorCode()));
                }
            }
            if (this.ak || this.v.isKeyFrame()) {
                boolean d = this.v.d();
                if (d) {
                    ass assVar = this.v.a;
                    if (position != 0) {
                        if (assVar.d == null) {
                            assVar.d = new int[1];
                            assVar.i.numBytesOfClearData = assVar.d;
                        }
                        int[] iArr = assVar.d;
                        iArr[0] = iArr[0] + position;
                    }
                }
                asw aswVar = this.v;
                long j = aswVar.d;
                azu azuVar = this.W;
                if (azuVar != null) {
                    pms pmsVar = this.E;
                    if (azuVar.b == 0) {
                        azuVar.a = j;
                    }
                    if (!azuVar.c) {
                        ByteBuffer byteBuffer = aswVar.b;
                        pse.c(byteBuffer);
                        int i2 = 0;
                        for (int i3 = 0; i3 < 4; i3++) {
                            i2 = (i2 << 8) | (byteBuffer.get(i3) & 255);
                        }
                        int c = biw.c(i2);
                        if (c == -1) {
                            azuVar.c = true;
                            azuVar.b = 0L;
                            azuVar.a = aswVar.d;
                            Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                            j = aswVar.d;
                        } else {
                            long a3 = azuVar.a(pmsVar.B);
                            azuVar.b += c;
                            j = a3;
                        }
                    }
                    this.an = Math.max(this.an, this.W.a(this.E.B));
                }
                long j2 = j;
                if (this.v.isDecodeOnly()) {
                    this.z.add(Long.valueOf(j2));
                }
                if (this.aq) {
                    this.y.e(j2, this.E);
                    this.aq = false;
                }
                this.an = Math.max(this.an, j2);
                this.v.c();
                if (this.v.hasSupplementalData()) {
                    H(this.v);
                }
                A(this.v);
                try {
                    if (d) {
                        this.e.o(this.Y, this.v.a, j2);
                    } else {
                        this.e.n(this.Y, this.v.b.limit(), j2, 0);
                    }
                    W();
                    this.ak = true;
                    this.ah = 0;
                    this.o.c++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw aj(e2, this.E, plh.b(e2.getErrorCode()));
                }
            }
            this.v.clear();
            if (this.ah == 2) {
                this.ah = 1;
            }
            return true;
        } catch (asv e3) {
            v(e3);
            aD(0);
            q();
            return true;
        }
    }

    private final void f() {
        this.af = false;
        this.x.clear();
        this.w.clear();
        this.ae = false;
        this.ad = false;
    }

    private final void h() {
        if (!this.ak) {
            V();
        } else {
            this.ai = 1;
            this.aj = 3;
        }
    }

    private final void q() {
        try {
            this.e.g();
        } finally {
            M();
        }
    }

    protected void A(asw aswVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ple
    public void B() {
        try {
            f();
            L();
        } finally {
            Z(null);
        }
    }

    protected void C() {
    }

    protected abstract boolean D(long j, long j2, azy azyVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, pms pmsVar);

    protected boolean E(pms pmsVar) {
        return false;
    }

    @Override // defpackage.ple, defpackage.pof
    public final int F() {
        return 8;
    }

    protected azz G(Throwable th, baa baaVar) {
        return new azz(th, baaVar);
    }

    protected void H(asw aswVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026e A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:59:0x0155, B:62:0x016c, B:65:0x0174, B:67:0x0180, B:68:0x0183, B:70:0x018d, B:72:0x0191, B:73:0x01a7, B:75:0x01bb, B:77:0x01c3, B:79:0x01cd, B:81:0x01d7, B:83:0x01e1, B:86:0x022e, B:88:0x0236, B:91:0x0241, B:93:0x0247, B:97:0x0253, B:99:0x025b, B:102:0x0266, B:104:0x026e, B:108:0x02a7, B:110:0x02af, B:113:0x02ba, B:115:0x02bc, B:117:0x02c6, B:118:0x02cd, B:120:0x02d2, B:121:0x02db, B:124:0x0279, B:126:0x027d, B:128:0x0285, B:130:0x028d, B:132:0x0297, B:134:0x02a1, B:141:0x01ed, B:143:0x01f3, B:145:0x01fb, B:147:0x0203, B:149:0x020d, B:151:0x0217, B:153:0x0221, B:157:0x01a1, B:159:0x0160), top: B:58:0x0155, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02af A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:59:0x0155, B:62:0x016c, B:65:0x0174, B:67:0x0180, B:68:0x0183, B:70:0x018d, B:72:0x0191, B:73:0x01a7, B:75:0x01bb, B:77:0x01c3, B:79:0x01cd, B:81:0x01d7, B:83:0x01e1, B:86:0x022e, B:88:0x0236, B:91:0x0241, B:93:0x0247, B:97:0x0253, B:99:0x025b, B:102:0x0266, B:104:0x026e, B:108:0x02a7, B:110:0x02af, B:113:0x02ba, B:115:0x02bc, B:117:0x02c6, B:118:0x02cd, B:120:0x02d2, B:121:0x02db, B:124:0x0279, B:126:0x027d, B:128:0x0285, B:130:0x028d, B:132:0x0297, B:134:0x02a1, B:141:0x01ed, B:143:0x01f3, B:145:0x01fb, B:147:0x0203, B:149:0x020d, B:151:0x0217, B:153:0x0221, B:157:0x01a1, B:159:0x0160), top: B:58:0x0155, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c6 A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:59:0x0155, B:62:0x016c, B:65:0x0174, B:67:0x0180, B:68:0x0183, B:70:0x018d, B:72:0x0191, B:73:0x01a7, B:75:0x01bb, B:77:0x01c3, B:79:0x01cd, B:81:0x01d7, B:83:0x01e1, B:86:0x022e, B:88:0x0236, B:91:0x0241, B:93:0x0247, B:97:0x0253, B:99:0x025b, B:102:0x0266, B:104:0x026e, B:108:0x02a7, B:110:0x02af, B:113:0x02ba, B:115:0x02bc, B:117:0x02c6, B:118:0x02cd, B:120:0x02d2, B:121:0x02db, B:124:0x0279, B:126:0x027d, B:128:0x0285, B:130:0x028d, B:132:0x0297, B:134:0x02a1, B:141:0x01ed, B:143:0x01f3, B:145:0x01fb, B:147:0x0203, B:149:0x020d, B:151:0x0217, B:153:0x0221, B:157:0x01a1, B:159:0x0160), top: B:58:0x0155, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d2 A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:59:0x0155, B:62:0x016c, B:65:0x0174, B:67:0x0180, B:68:0x0183, B:70:0x018d, B:72:0x0191, B:73:0x01a7, B:75:0x01bb, B:77:0x01c3, B:79:0x01cd, B:81:0x01d7, B:83:0x01e1, B:86:0x022e, B:88:0x0236, B:91:0x0241, B:93:0x0247, B:97:0x0253, B:99:0x025b, B:102:0x0266, B:104:0x026e, B:108:0x02a7, B:110:0x02af, B:113:0x02ba, B:115:0x02bc, B:117:0x02c6, B:118:0x02cd, B:120:0x02d2, B:121:0x02db, B:124:0x0279, B:126:0x027d, B:128:0x0285, B:130:0x028d, B:132:0x0297, B:134:0x02a1, B:141:0x01ed, B:143:0x01f3, B:145:0x01fb, B:147:0x0203, B:149:0x020d, B:151:0x0217, B:153:0x0221, B:157:0x01a1, B:159:0x0160), top: B:58:0x0155, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bac.I():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void J(long j) {
        while (true) {
            int i = this.as;
            if (i == 0 || j < this.D[0]) {
                return;
            }
            long[] jArr = this.B;
            this.ar = jArr[0];
            this.p = this.C[0];
            int i2 = i - 1;
            this.as = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.C;
            System.arraycopy(jArr2, 1, jArr2, 0, this.as);
            long[] jArr3 = this.D;
            System.arraycopy(jArr3, 1, jArr3, 0, this.as);
            z();
        }
    }

    @Override // defpackage.ple
    protected final void K(pms[] pmsVarArr, long j, long j2) {
        if (this.p == -9223372036854775807L) {
            pse.g(this.ar == -9223372036854775807L);
            this.ar = j;
            this.p = j2;
            return;
        }
        int i = this.as;
        if (i == 10) {
            long j3 = this.C[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.as = i + 1;
        }
        long[] jArr = this.B;
        int i2 = this.as - 1;
        jArr[i2] = j;
        this.C[i2] = j2;
        this.D[i2] = this.an;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L() {
        try {
            azy azyVar = this.e;
            if (azyVar != null) {
                azyVar.h();
                this.o.b++;
                x(this.h.a);
            }
            this.e = null;
            try {
                MediaCrypto mediaCrypto = this.I;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.e = null;
            try {
                MediaCrypto mediaCrypto2 = this.I;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M() {
        W();
        X();
        this.X = -9223372036854775807L;
        this.al = false;
        this.ak = false;
        this.T = false;
        this.U = false;
        this.ab = false;
        this.ac = false;
        this.z.clear();
        this.an = -9223372036854775807L;
        this.ao = -9223372036854775807L;
        azu azuVar = this.W;
        if (azuVar != null) {
            azuVar.a = 0L;
            azuVar.b = 0L;
            azuVar.c = false;
        }
        this.ai = 0;
        this.aj = 0;
        this.ah = this.ag ? 1 : 0;
    }

    protected final void N() {
        M();
        this.n = null;
        this.W = null;
        this.N = null;
        this.h = null;
        this.f = null;
        this.g = null;
        this.L = false;
        this.am = false;
        this.M = -1.0f;
        this.P = 0;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.V = false;
        this.ag = false;
        this.ah = 0;
        this.f143J = false;
    }

    @Override // defpackage.ple, defpackage.poe
    public void O(float f, float f2) {
        this.d = f;
        this.K = f2;
        S(this.f);
    }

    protected boolean Q(baa baaVar) {
        return true;
    }

    public final boolean S(pms pmsVar) {
        if (pts.a >= 23 && this.e != null && this.aj != 3 && this.s != 0) {
            float b = b(this.K, pmsVar, aA());
            float f = this.M;
            if (f == b) {
                return true;
            }
            if (b == -1.0f) {
                h();
                return false;
            }
            if (f == -1.0f && b <= this.q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", b);
            this.e.k(bundle);
            this.M = b;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void T() {
        if (P()) {
            I();
        }
    }

    @Override // defpackage.pof
    public final int a(pms pmsVar) {
        try {
            return c(this.c, pmsVar);
        } catch (baj e) {
            throw aj(e, pmsVar, 4002);
        }
    }

    protected float b(float f, pms pmsVar, pms[] pmsVarArr) {
        throw null;
    }

    protected abstract int c(bae baeVar, pms pmsVar);

    protected auk e(baa baaVar, pms pmsVar, pms pmsVar2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r2 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        if (ab() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c5, code lost:
    
        if (ab() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d9, code lost:
    
        if (ab() == false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.auk g(defpackage.pmt r13) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bac.g(pmt):auk");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ple
    public void k() {
        this.E = null;
        this.ar = -9223372036854775807L;
        this.p = -9223372036854775807L;
        this.as = 0;
        P();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ple
    public void l(boolean z, boolean z2) {
        this.o = new auj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ple
    public void m(long j, boolean z) {
        this.ap = false;
        this.i = false;
        this.j = false;
        if (this.ad) {
            this.x.clear();
            this.w.clear();
            this.ae = false;
        } else {
            T();
        }
        if (this.y.a() > 0) {
            this.aq = true;
        }
        this.y.f();
        int i = this.as;
        if (i != 0) {
            int i2 = i - 1;
            this.p = this.C[i2];
            this.ar = this.B[i2];
            this.as = 0;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.poe
    public final void p(long r22, long r24) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bac.p(long, long):void");
    }

    @Override // defpackage.poe
    public boolean r() {
        return this.i;
    }

    @Override // defpackage.poe
    public boolean s() {
        if (this.E != null) {
            if (az() || aC()) {
                return true;
            }
            if (this.X != -9223372036854775807L && SystemClock.elapsedRealtime() < this.X) {
                return true;
            }
        }
        return false;
    }

    protected abstract azw t(baa baaVar, pms pmsVar, MediaCrypto mediaCrypto, float f);

    protected abstract List u(bae baeVar, pms pmsVar, boolean z);

    protected void v(Exception exc) {
        throw null;
    }

    protected void w(String str, long j, long j2) {
        throw null;
    }

    protected void x(String str) {
        throw null;
    }

    protected void y(pms pmsVar, MediaFormat mediaFormat) {
        throw null;
    }

    protected void z() {
    }

    protected final boolean P() {
        if (this.e == null) {
            return false;
        }
        if (this.aj != 3 && ((!this.Q || this.am) && (!this.R || !this.al))) {
            q();
            return false;
        }
        L();
        return true;
    }

    private final void U() {
        int i = this.aj;
        if (i == 1) {
            q();
            return;
        }
        if (i == 2) {
            q();
            aa();
        } else if (i == 3) {
            V();
        } else {
            this.i = true;
            C();
        }
    }
}
