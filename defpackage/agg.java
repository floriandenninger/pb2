package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class agg implements afv {
    public int c;
    public afk d;
    agd e;
    protected int k;
    public final afy f = new afy(this);
    public int g = 0;
    public boolean h = false;
    public final afx i = new afx(this);
    public final afx j = new afx(this);
    protected int l = 1;

    public agg(afk afkVar) {
        this.d = afkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void j(afx afxVar, afx afxVar2, int i) {
        afxVar.k.add(afxVar2);
        afxVar.e = i;
        afxVar2.j.add(afxVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final afx k(afj afjVar) {
        afj afjVar2 = afjVar.e;
        if (afjVar2 == null) {
            return null;
        }
        afk afkVar = afjVar2.d;
        int i = afjVar2.i - 1;
        if (i == 1) {
            return afkVar.h.i;
        }
        if (i == 2) {
            return afkVar.i.i;
        }
        if (i == 3) {
            return afkVar.h.j;
        }
        if (i == 4) {
            return afkVar.i.j;
        }
        if (i != 5) {
            return null;
        }
        return afkVar.i.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final afx l(afj afjVar, int i) {
        afj afjVar2 = afjVar.e;
        if (afjVar2 == null) {
            return null;
        }
        afk afkVar = afjVar2.d;
        agg aggVar = i == 0 ? afkVar.h : afkVar.i;
        int i2 = afjVar2.i - 1;
        if (i2 == 1 || i2 == 2) {
            return aggVar.i;
        }
        if (i2 == 3 || i2 == 4) {
            return aggVar.j;
        }
        return null;
    }

    public long a() {
        if (this.f.i) {
            return r0.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override // defpackage.afv
    public void f() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int h(int i, int i2) {
        if (i2 == 0) {
            afk afkVar = this.d;
            int i3 = afkVar.w;
            int max = Math.max(afkVar.v, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            return max == i ? i : max;
        }
        afk afkVar2 = this.d;
        int i4 = afkVar2.z;
        int max2 = Math.max(afkVar2.y, i);
        if (i4 > 0) {
            max2 = Math.min(i4, i);
        }
        return max2 == i ? i : max2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(afx afxVar, afx afxVar2, int i, afy afyVar) {
        afxVar.k.add(afxVar2);
        afxVar.k.add(this.f);
        afxVar.g = i;
        afxVar.h = afyVar;
        afxVar2.j.add(afxVar);
        afyVar.j.add(afxVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.c == 3) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [agc] */
    /* JADX WARN: Type inference failed for: r8v2, types: [agg] */
    /* JADX WARN: Type inference failed for: r8v4, types: [age] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.afj r12, defpackage.afj r13, int r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agg.m(afj, afj, int):void");
    }
}
