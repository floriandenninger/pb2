package defpackage;

import android.util.Log;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class pdk implements pbz {
    private static final int a = pgz.c("seig");
    private static final byte[] b = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private final int c;
    private final pdo d;
    private final SparseArray e;
    private final pgx f;
    private final pgx g;
    private final pgx h;
    private final pgx i;
    private final byte[] j;
    private final Stack k;
    private int l;
    private int m;
    private long n;
    private int o;
    private pgx p;
    private long q;
    private pdj r;
    private int s;
    private int t;
    private int u;
    private pca v;
    private boolean w;

    public pdk() {
        this(0, null);
    }

    private static pbd c(List list) {
        int size = list.size();
        pbd pbdVar = null;
        for (int i = 0; i < size; i++) {
            pdb pdbVar = (pdb) list.get(i);
            if (pdbVar.aQ == pdc.X) {
                if (pbdVar == null) {
                    pbdVar = new pbd();
                }
                byte[] bArr = pdbVar.a.a;
                if (opn.q(bArr) == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    pbdVar.b(opn.q(bArr), new pbe("video/mp4", bArr));
                }
            }
        }
        return pbdVar;
    }

    private final void g() {
        this.l = 0;
        this.o = 0;
    }

    private static void h(pgx pgxVar, int i, pdq pdqVar) {
        pgxVar.z(i + 8);
        int e = pdc.e(pgxVar.c());
        if ((e & 1) != 0) {
            throw new oyo("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (e & 2) != 0;
        int j = pgxVar.j();
        int i2 = pdqVar.c;
        if (j != i2) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(j);
            sb.append(", ");
            sb.append(i2);
            throw new oyo(sb.toString());
        }
        Arrays.fill(pdqVar.i, 0, j, z);
        pdqVar.a(pgxVar.a());
        pgxVar.u(pdqVar.k.a, 0, pdqVar.j);
        pdqVar.k.z(0);
        pdqVar.l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:293:0x05b4, code lost:
    
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x05b8, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x035e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i(long r48) {
        /*
            Method dump skipped, instructions count: 1465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdk.i(long):void");
    }

    @Override // defpackage.pbz
    public final void a(pca pcaVar) {
        this.v = pcaVar;
        if (this.d != null) {
            pdj pdjVar = new pdj(pcaVar.pH(0));
            pdjVar.b(this.d, new pjk(0, 0, 0, 0));
            this.e.put(0, pdjVar);
            this.v.pJ();
        }
    }

    protected void b(pgx pgxVar) {
    }

    @Override // defpackage.pbz
    public final void d() {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((pdj) this.e.valueAt(i)).a();
        }
        this.k.clear();
        g();
    }

    @Override // defpackage.pbz
    public final boolean e(pbw pbwVar) {
        return pdn.a(pbwVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x0073, code lost:
    
        r2 = r25.r;
        r3 = r2.a;
        r4 = r3.d;
        r6 = r2.d;
        r25.s = r4[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0081, code lost:
    
        if (r3.h == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0083, code lost:
    
        r4 = r3.k;
        r10 = r3.o.a;
        r11 = r3.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x008b, code lost:
    
        if (r11 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x008e, code lost:
    
        r11 = r2.c.l[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0094, code lost:
    
        r10 = r11.a;
        r3 = r3.i[r6];
        r6 = r25.h;
        r11 = r6.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x009e, code lost:
    
        if (true == r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x00a0, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x00a4, code lost:
    
        r11[0] = (byte) (r12 | r10);
        r6.z(0);
        r2 = r2.b;
        r2.f(r25.h, 1);
        r2.f(r4, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x00b5, code lost:
    
        if (r3 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x00b7, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x00c9, code lost:
    
        r25.t = r10;
        r25.s += r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x00d3, code lost:
    
        r25.l = 4;
        r25.u = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x00d7, code lost:
    
        r2 = r25.r;
        r3 = r2.a;
        r4 = r2.c;
        r6 = r2.b;
        r2 = r2.d;
        r10 = r4.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x00e4, code lost:
    
        if (r10 != (-1)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x00e6, code lost:
    
        r9 = r25.t;
        r10 = r25.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x00ea, code lost:
    
        if (r9 >= r10) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x00ec, code lost:
    
        r25.t += r6.j(r26, r10 - r9, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x00f7, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x014a, code lost:
    
        r19 = (r3.f[r2] + r3.e[r2]) * 1000;
        r1 = r3.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x015a, code lost:
    
        if (true == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x015c, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x015d, code lost:
    
        r21 = r5 | (r3.g[r2] ? 1 : 0);
        r2 = r3.o.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0167, code lost:
    
        if (r1 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0169, code lost:
    
        r1 = r3.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x016b, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x016d, code lost:
    
        r1 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0176, code lost:
    
        r24 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x017b, code lost:
    
        r6.g(r19, r21, r22, 0, r24);
        r1 = r25.r;
        r2 = r1.d + 1;
        r1.d = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x018b, code lost:
    
        if (r2 != r3.c) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x018d, code lost:
    
        r25.r = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0190, code lost:
    
        r25.l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0193, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0170, code lost:
    
        r1 = r4.l[r2].b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0179, code lost:
    
        r24 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x00fa, code lost:
    
        r11 = r25.g.a;
        r11[0] = 0;
        r11[1] = 0;
        r11[2] = 0;
        r11 = 4 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0106, code lost:
    
        r12 = r25.t;
        r13 = r25.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x010a, code lost:
    
        if (r12 >= r13) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x010c, code lost:
    
        r12 = r25.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x010e, code lost:
    
        if (r12 != 0) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0139, code lost:
    
        r12 = r6.j(r26, r12, false);
        r25.t += r12;
        r25.u -= r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0110, code lost:
    
        r26.h(r25.g.a, r11, r10);
        r25.g.z(0);
        r25.u = r25.g.j();
        r25.f.z(0);
        r6.f(r25.f, 4);
        r25.t += 4;
        r25.s += r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0148, code lost:
    
        r22 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x00b9, code lost:
    
        r3 = r4.k();
        r4.A(-2);
        r3 = (r3 * 6) + 2;
        r2.f(r4, r3);
        r10 = (r10 + 1) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x00a2, code lost:
    
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x00d1, code lost:
    
        r25.t = 0;
     */
    @Override // defpackage.pbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(defpackage.pbw r26, defpackage.tfq r27) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdk.f(pbw, tfq):int");
    }

    public pdk(int i, pdo pdoVar) {
        this.d = pdoVar;
        this.c = i | (pdoVar != null ? 4 : 0);
        this.i = new pgx(16);
        this.f = new pgx(pgv.a);
        this.g = new pgx(4);
        this.h = new pgx(1);
        this.j = new byte[16];
        this.k = new Stack();
        this.e = new SparseArray();
        g();
    }
}
