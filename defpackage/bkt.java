package defpackage;

import android.util.Log;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bkt implements bih {
    private static final byte[] a = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final pms b;
    private int A;
    private int B;
    private boolean C;
    private bik D;
    private bjc[] E;
    private bjc[] F;
    private boolean G;
    private final List c;
    private final SparseArray d;
    private final pth e;
    private final pth f;
    private final pth g;
    private final byte[] h;
    private final pth i;
    private final ppf j;
    private final pth k;
    private final ArrayDeque l;
    private final ArrayDeque m;
    private final bjc n;
    private int o;
    private int p;
    private long q;
    private int r;
    private pth s;
    private long t;
    private int u;
    private long v;
    private long w;
    private long x;
    private bks y;
    private int z;

    static {
        pmr pmrVar = new pmr();
        pmrVar.k = "application/x-emsg";
        b = pmrVar.a();
    }

    public bkt() {
        this(null);
    }

    private static DrmInitData b(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            bkj bkjVar = (bkj) list.get(i);
            if (bkjVar.d == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bkjVar.a.a;
                bkx c = jf.c(bArr);
                UUID uuid = c == null ? null : c.a;
                if (uuid == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private final void c() {
        this.o = 0;
        this.r = 0;
    }

    private static void i(pth pthVar, int i, bkz bkzVar) {
        pthVar.G(i + 8);
        int e = bkk.e(pthVar.d());
        if ((e & 1) != 0) {
            throw pnr.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (e & 2) != 0;
        int l = pthVar.l();
        if (l == 0) {
            Arrays.fill(bkzVar.m, 0, bkzVar.e, false);
            return;
        }
        int i2 = bkzVar.e;
        if (l != i2) {
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(l);
            sb.append(" is different from fragment sample count");
            sb.append(i2);
            throw pnr.a(sb.toString(), null);
        }
        Arrays.fill(bkzVar.m, 0, l, z);
        bkzVar.b(pthVar.a());
        pth pthVar2 = bkzVar.n;
        pthVar.B(pthVar2.a, 0, pthVar2.c);
        bkzVar.n.G(0);
        bkzVar.o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0336  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j(long r46) {
        /*
            Method dump skipped, instructions count: 1830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkt.j(long):void");
    }

    private static void k(int i) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw pnr.a(sb.toString(), null);
    }

    private static final bkq l(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (bkq) sparseArray.valueAt(0);
        }
        bkq bkqVar = (bkq) sparseArray.get(i);
        pse.c(bkqVar);
        return bkqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public pjq a(pjq pjqVar) {
        return pjqVar;
    }

    @Override // defpackage.bih
    public final void d(bik bikVar) {
        int i;
        this.D = bikVar;
        c();
        bjc[] bjcVarArr = new bjc[2];
        this.E = bjcVarArr;
        bjc bjcVar = this.n;
        int i2 = 0;
        if (bjcVar != null) {
            bjcVarArr[0] = bjcVar;
            i = 1;
        } else {
            i = 0;
        }
        bjc[] bjcVarArr2 = (bjc[]) pts.ad(bjcVarArr, i);
        this.E = bjcVarArr2;
        for (bjc bjcVar2 : bjcVarArr2) {
            bjcVar2.rp(b);
        }
        this.F = new bjc[this.c.size()];
        int i3 = 100;
        while (i2 < this.F.length) {
            int i4 = i3 + 1;
            bjc n = this.D.n(i3, 3);
            n.rp((pms) this.c.get(i2));
            this.F[i2] = n;
            i2++;
            i3 = i4;
        }
    }

    @Override // defpackage.bih
    public final void e() {
    }

    @Override // defpackage.bih
    public final void f(long j, long j2) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            ((bks) this.d.valueAt(i)).d();
        }
        this.m.clear();
        this.u = 0;
        this.v = j2;
        this.l.clear();
        c();
    }

    @Override // defpackage.bih
    public final boolean g(bii biiVar) {
        return bky.a(biiVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:304:0x0091, code lost:
    
        if (r28.o != 3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0095, code lost:
    
        if (r2.j != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0097, code lost:
    
        r3 = r2.d.c[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x00a8, code lost:
    
        r28.z = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x00ae, code lost:
    
        if (r2.f >= r2.i) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x00b0, code lost:
    
        r1.m(r3);
        r1 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x00b7, code lost:
    
        if (r1 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x00ba, code lost:
    
        r3 = r2.b.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x00c0, code lost:
    
        if (r1 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00c2, code lost:
    
        r3.H(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x00cd, code lost:
    
        if (r2.b.c(r2.f) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x00cf, code lost:
    
        r3.H(r3.m() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x00dc, code lost:
    
        if (r2.e() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x00de, code lost:
    
        r28.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x00e0, code lost:
    
        r28.o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00e2, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x00eb, code lost:
    
        if (r2.d.h.g != 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x00ed, code lost:
    
        r28.z = r3 - 8;
        r1.m(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0102, code lost:
    
        if ("audio/ac4".equals(r2.d.h.f.n) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0104, code lost:
    
        r28.A = r2.a(r28.z, 7);
        defpackage.bhs.b(r28.z, r28.i);
        r2.a.t(r28.i, 7);
        r3 = r28.A + 7;
        r28.A = r3;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x012b, code lost:
    
        r28.z += r3;
        r28.o = 4;
        r28.B = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0122, code lost:
    
        r4 = 0;
        r3 = r2.a(r28.z, 0);
        r28.A = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x00a0, code lost:
    
        r3 = r2.b.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0135, code lost:
    
        r3 = r2.d;
        r4 = r3.h;
        r5 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x013d, code lost:
    
        if (r2.j != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x013f, code lost:
    
        r9 = r3.e[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x014e, code lost:
    
        r3 = r4.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0150, code lost:
    
        if (r3 != 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0152, code lost:
    
        r3 = r28.A;
        r4 = r28.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0156, code lost:
    
        if (r3 >= r4) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0158, code lost:
    
        r28.A += r5.e(r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0224, code lost:
    
        if (r2.j != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0226, code lost:
    
        r8 = r2.d.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0240, code lost:
    
        if (r2.f() == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0242, code lost:
    
        r21 = 1073741824 | r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x024a, code lost:
    
        r1 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x024e, code lost:
    
        if (r1 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0250, code lost:
    
        r24 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0257, code lost:
    
        r5.v(r9, r21, r28.z, 0, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x026a, code lost:
    
        if (r28.m.isEmpty() != false) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x026c, code lost:
    
        r1 = (defpackage.aeqp) r28.m.removeFirst();
        r28.u -= r1.b;
        r3 = r1.a + r9;
        r5 = r28.E;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0282, code lost:
    
        if (r8 >= r6) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0284, code lost:
    
        r5[r8].v(r3, 1, r1.b, r28.u, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x029e, code lost:
    
        if (r2.e() != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x02a0, code lost:
    
        r28.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x02a2, code lost:
    
        r28.o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0255, code lost:
    
        r24 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0248, code lost:
    
        r21 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0237, code lost:
    
        if (r2.b.k[r2.f] == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0239, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x023b, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0164, code lost:
    
        r11 = r28.f.a;
        r11[0] = 0;
        r11[1] = 0;
        r11[2] = 0;
        r6 = r3 + 1;
        r3 = 4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0179, code lost:
    
        if (r28.A >= r28.z) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x017b, code lost:
    
        r13 = r28.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x017d, code lost:
    
        if (r13 != 0) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x01cf, code lost:
    
        if (r28.C == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x01d1, code lost:
    
        r28.g.C(r13);
        r1.k(r28.g.a, 0, r28.B);
        r5.t(r28.g, r28.B);
        r13 = r28.B;
        r14 = r28.g;
        r14 = defpackage.ptb.b(r14.a, r14.c);
        r28.g.G("video/hevc".equals(r4.f.n) ? 1 : 0);
        r28.g.F(r14);
        defpackage.azd.b(r9, r28.g, r28.F);
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0214, code lost:
    
        r28.A += r13;
        r28.B -= r13;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x020f, code lost:
    
        r13 = r5.e(r1, r13, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x017f, code lost:
    
        r1.k(r11, r3, r6);
        r28.f.G(0);
        r13 = r28.f.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x018e, code lost:
    
        if (r13 <= 0) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0190, code lost:
    
        r28.B = r13 - 1;
        r28.e.G(0);
        r5.t(r28.e, 4);
        r5.t(r28.f, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x01a7, code lost:
    
        if (r28.F.length <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x01b3, code lost:
    
        if (defpackage.ptb.e(r4.f.n, r11[4]) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x01b5, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x01b8, code lost:
    
        r28.C = r13;
        r28.A += 5;
        r28.z += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x01b7, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x01cc, code lost:
    
        throw defpackage.pnr.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0146, code lost:
    
        r9 = r2.b.a(r2.f);
     */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0057 A[SYNTHETIC] */
    @Override // defpackage.bih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(defpackage.bii r29, defpackage.tfq r30) {
        /*
            Method dump skipped, instructions count: 1806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkt.h(bii, tfq):int");
    }

    public bkt(byte[] bArr) {
        this(Collections.emptyList(), null);
    }

    public bkt(List list, bjc bjcVar) {
        this.c = Collections.unmodifiableList(list);
        this.n = bjcVar;
        this.j = new ppf();
        this.k = new pth(16);
        this.e = new pth(ptb.a);
        this.f = new pth(5);
        this.g = new pth();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new pth(bArr);
        this.l = new ArrayDeque();
        this.m = new ArrayDeque();
        this.d = new SparseArray();
        this.w = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.D = bik.t;
        this.E = new bjc[0];
        this.F = new bjc[0];
    }
}
