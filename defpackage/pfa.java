package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pfa implements pbz {
    public static final long a = pgz.c("AC-3");
    public static final long b = pgz.c("EAC3");
    public static final long c = pgz.c("HEVC");
    public int g;
    private pca k;
    public final peu d = new peu();
    private final pgx h = new pgx(940);
    private final pgw i = new pgw(new byte[3]);
    final SparseArray e = new SparseArray();
    final SparseBooleanArray f = new SparseBooleanArray();
    private final SparseIntArray j = new SparseIntArray();

    public pfa() {
        b();
    }

    private final void b() {
        this.f.clear();
        this.e.clear();
        this.e.put(0, new pew(this));
        this.g = 8192;
    }

    @Override // defpackage.pbz
    public final void a(pca pcaVar) {
        this.k = pcaVar;
        pcaVar.pK(pcm.f);
    }

    @Override // defpackage.pbz
    public final void d() {
        this.d.b();
        this.h.v();
        this.j.clear();
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r2 = r2 + 1;
     */
    @Override // defpackage.pbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.pbw r7) {
        /*
            r6 = this;
            pgx r0 = r6.h
            byte[] r0 = r0.a
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.g(r0, r1, r2)
            r2 = 0
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L27
            r3 = 0
        L10:
            r4 = 5
            if (r3 != r4) goto L18
            r7.j(r2)
            r7 = 1
            return r7
        L18:
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L24
            int r2 = r2 + 1
            goto Lb
        L24:
            int r3 = r3 + 1
            goto L10
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfa.e(pbw):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    @Override // defpackage.pbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(defpackage.pbw r10, defpackage.tfq r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfa.f(pbw, tfq):int");
    }
}
