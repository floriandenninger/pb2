package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afw {
    public final afl a;
    public final afl d;
    final ArrayList f;
    public agm g;
    private final afs h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList e = new ArrayList();

    public afw(afl aflVar) {
        new ArrayList();
        this.g = null;
        this.h = new afs();
        this.f = new ArrayList();
        this.a = aflVar;
        this.d = aflVar;
    }

    private final void e(agg aggVar, int i, ArrayList arrayList) {
        for (afv afvVar : aggVar.i.j) {
            if (afvVar instanceof afx) {
                g((afx) afvVar, i, aggVar.j, arrayList, null);
            } else if (afvVar instanceof agg) {
                g(((agg) afvVar).i, i, aggVar.j, arrayList, null);
            }
        }
        for (afv afvVar2 : aggVar.j.j) {
            if (afvVar2 instanceof afx) {
                g((afx) afvVar2, i, aggVar.i, arrayList, null);
            } else if (afvVar2 instanceof agg) {
                g(((agg) afvVar2).j, i, aggVar.i, arrayList, null);
            }
        }
        if (i == 1) {
            for (afv afvVar3 : ((age) aggVar).a.j) {
                if (afvVar3 instanceof afx) {
                    g((afx) afvVar3, 1, null, arrayList, null);
                }
            }
        }
    }

    private final void f(afk afkVar, int i, int i2, int i3, int i4) {
        afs afsVar = this.h;
        afsVar.i = i;
        afsVar.j = i3;
        afsVar.a = i2;
        afsVar.b = i4;
        this.g.a(afkVar, afsVar);
        afkVar.D(this.h.c);
        afkVar.y(this.h.d);
        afs afsVar2 = this.h;
        afkVar.F = afsVar2.f;
        afkVar.v(afsVar2.e);
    }

    private final void g(afx afxVar, int i, afx afxVar2, ArrayList arrayList, agd agdVar) {
        agg aggVar = afxVar.d;
        if (aggVar.e == null) {
            afl aflVar = this.a;
            if (aggVar == aflVar.h || aggVar == aflVar.i) {
                return;
            }
            if (agdVar == null) {
                agdVar = new agd(aggVar);
                arrayList.add(agdVar);
            }
            aggVar.e = agdVar;
            agdVar.c.add(aggVar);
            for (afv afvVar : aggVar.i.j) {
                if (afvVar instanceof afx) {
                    g((afx) afvVar, i, afxVar2, arrayList, agdVar);
                }
            }
            for (afv afvVar2 : aggVar.j.j) {
                if (afvVar2 instanceof afx) {
                    g((afx) afvVar2, i, afxVar2, arrayList, agdVar);
                }
            }
            if (i == 1 && (aggVar instanceof age)) {
                for (afv afvVar3 : ((age) aggVar).a.j) {
                    if (afvVar3 instanceof afx) {
                        g((afx) afvVar3, 1, afxVar2, arrayList, agdVar);
                    }
                }
            }
            Iterator it = aggVar.i.k.iterator();
            while (it.hasNext()) {
                g((afx) it.next(), i, afxVar2, arrayList, agdVar);
            }
            Iterator it2 = aggVar.j.k.iterator();
            while (it2.hasNext()) {
                g((afx) it2.next(), i, afxVar2, arrayList, agdVar);
            }
            if (i == 1 && (aggVar instanceof age)) {
                Iterator it3 = ((age) aggVar).a.k.iterator();
                while (it3.hasNext()) {
                    g((afx) it3.next(), 1, afxVar2, arrayList, agdVar);
                }
            }
        }
    }

    public final int a(afl aflVar, int i) {
        long a;
        afw afwVar = this;
        afl aflVar2 = aflVar;
        int size = afwVar.f.size();
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        while (i2 < size) {
            agd agdVar = (agd) afwVar.f.get(i2);
            agg aggVar = agdVar.b;
            if (!(aggVar instanceof afu) ? !(i != 0 ? (aggVar instanceof age) : (aggVar instanceof agc)) : ((afu) aggVar).g != i) {
                afx afxVar = i == 0 ? aflVar2.h.i : aflVar2.i.i;
                afx afxVar2 = i == 0 ? aflVar2.h.j : aflVar2.i.j;
                boolean contains = aggVar.i.k.contains(afxVar);
                boolean contains2 = agdVar.b.j.k.contains(afxVar2);
                long a2 = agdVar.b.a();
                if (contains && contains2) {
                    long b = agdVar.b(agdVar.b.i, j);
                    long a3 = agdVar.a(agdVar.b.j, j);
                    long j3 = b - a2;
                    agg aggVar2 = agdVar.b;
                    int i3 = aggVar2.j.e;
                    if (j3 >= (-i3)) {
                        j3 += i3;
                    }
                    long j4 = aggVar2.i.e;
                    long j5 = ((-a3) - a2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    afk afkVar = aggVar2.d;
                    float f = (float) ((i == 0 ? afkVar.ad : afkVar.ae) > 0.0f ? (((float) j5) / r5) + (((float) j3) / (1.0f - r5)) : 0L);
                    a = (j4 + ((((f * r5) + 0.5f) + a2) + ((f * (1.0f - r5)) + 0.5f))) - i3;
                } else if (contains) {
                    a = Math.max(agdVar.b(agdVar.b.i, r0.e), agdVar.b.i.e + a2);
                } else if (contains2) {
                    a = Math.max(-agdVar.a(agdVar.b.j, r0.e), (-agdVar.b.j.e) + a2);
                } else {
                    a = (r0.i.e + agdVar.b.a()) - agdVar.b.j.e;
                }
            } else {
                a = j;
            }
            j2 = Math.max(j2, a);
            i2++;
            afwVar = this;
            aflVar2 = aflVar;
            j = 0;
        }
        return (int) j2;
    }

    public final void b() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.d.h.d();
        this.d.i.d();
        arrayList.add(this.d.h);
        arrayList.add(this.d.i);
        ArrayList arrayList2 = this.d.aH;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            afk afkVar = (afk) arrayList2.get(i);
            if (afkVar instanceof afn) {
                arrayList.add(new aga(afkVar));
            } else {
                if (afkVar.I()) {
                    if (afkVar.f == null) {
                        afkVar.f = new afu(afkVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(afkVar.f);
                } else {
                    arrayList.add(afkVar.h);
                }
                if (afkVar.J()) {
                    if (afkVar.g == null) {
                        afkVar.g = new afu(afkVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(afkVar.g);
                } else {
                    arrayList.add(afkVar.i);
                }
                if (afkVar instanceof afo) {
                    arrayList.add(new agb(afkVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((agg) arrayList.get(i2)).d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            agg aggVar = (agg) arrayList.get(i3);
            if (aggVar.d != this.d) {
                aggVar.b();
            }
        }
        this.f.clear();
        agd.a = 0;
        e(this.a.h, 0, this.f);
        e(this.a.i, 1, this.f);
        this.b = false;
    }

    public final void c() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        afy afyVar;
        ArrayList arrayList = this.a.aH;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            afk afkVar = (afk) arrayList.get(i3);
            if (!afkVar.e) {
                int[] iArr = afkVar.ap;
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = afkVar.s;
                int i7 = afkVar.t;
                if (i4 == 2) {
                    i = i4;
                    z = true;
                } else if (i4 == 3) {
                    z = i6 == 1;
                    i = 3;
                } else {
                    i = i4;
                    z = false;
                }
                if (i5 == 2) {
                    i2 = i5;
                    z2 = true;
                } else if (i5 == 3) {
                    z2 = i7 == 1;
                    i2 = 3;
                } else {
                    i2 = i5;
                    z2 = false;
                }
                afy afyVar2 = afkVar.h.f;
                boolean z3 = afyVar2.i;
                afy afyVar3 = afkVar.i.f;
                boolean z4 = afyVar3.i;
                if (z3 && z4) {
                    f(afkVar, 1, afyVar2.f, 1, afyVar3.f);
                    afkVar.e = true;
                } else if (z3 && z2) {
                    f(afkVar, 1, afyVar2.f, 2, afyVar3.f);
                    if (i2 == 3) {
                        afkVar.i.f.m = afkVar.h();
                    } else {
                        afkVar.i.f.c(afkVar.h());
                        afkVar.e = true;
                    }
                } else if (z4 && z) {
                    f(afkVar, 2, afyVar2.f, 1, afyVar3.f);
                    if (i == 3) {
                        afkVar.h.f.m = afkVar.j();
                    } else {
                        afkVar.h.f.c(afkVar.j());
                        afkVar.e = true;
                    }
                }
                if (afkVar.e && (afyVar = afkVar.i.b) != null) {
                    afyVar.c(afkVar.aa);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.afl r18) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afw.d(afl):void");
    }
}
