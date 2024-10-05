package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afl extends afr {
    public int ar;
    public int as;
    public int c;
    public final aft a = new aft(this);
    public final afw b = new afw(this);
    public agm aG = null;
    public boolean d = false;
    public final afb aq = new afb();
    public int at = 0;
    public int au = 0;
    public afi[] av = new afi[4];
    public afi[] aw = new afi[4];
    public int ax = 257;
    public boolean ay = false;
    public boolean az = false;
    public WeakReference aA = null;
    public WeakReference aB = null;
    public WeakReference aC = null;
    public WeakReference aD = null;
    final HashSet aE = new HashSet();
    public final afs aF = new afs();

    public static void X(afk afkVar, agm agmVar, afs afsVar) {
        int i;
        int i2;
        if (agmVar == null) {
            return;
        }
        if (afkVar.ag == 8 || (afkVar instanceof afn) || (afkVar instanceof afh)) {
            afsVar.c = 0;
            afsVar.d = 0;
            return;
        }
        afsVar.i = afkVar.N();
        afsVar.j = afkVar.O();
        afsVar.a = afkVar.j();
        afsVar.b = afkVar.h();
        afsVar.g = false;
        afsVar.h = 0;
        boolean z = afsVar.i == 3;
        boolean z2 = afsVar.j == 3;
        boolean z3 = z && afkVar.W > 0.0f;
        boolean z4 = z2 && afkVar.W > 0.0f;
        if (z && afkVar.G(0) && afkVar.s == 0 && !z3) {
            afsVar.i = 2;
            if (z2 && afkVar.t == 0) {
                afsVar.i = 1;
            }
            z = false;
        }
        if (z2 && afkVar.G(1) && afkVar.t == 0 && !z4) {
            afsVar.j = 2;
            if (z && afkVar.s == 0) {
                afsVar.j = 1;
            }
            z2 = false;
        }
        if (afkVar.e()) {
            afsVar.i = 1;
            z = false;
        }
        if (afkVar.f()) {
            afsVar.j = 1;
            z2 = false;
        }
        if (z3) {
            if (afkVar.u[0] == 4) {
                afsVar.i = 1;
            } else if (!z2) {
                if (afsVar.j == 1) {
                    i2 = afsVar.b;
                } else {
                    afsVar.i = 2;
                    agmVar.a(afkVar, afsVar);
                    i2 = afsVar.d;
                }
                afsVar.i = 1;
                afsVar.a = (int) (afkVar.W * i2);
            }
        }
        if (z4) {
            if (afkVar.u[1] == 4) {
                afsVar.j = 1;
            } else if (!z) {
                if (afsVar.i == 1) {
                    i = afsVar.a;
                } else {
                    afsVar.j = 2;
                    agmVar.a(afkVar, afsVar);
                    i = afsVar.c;
                }
                afsVar.j = 1;
                if (afkVar.X != -1) {
                    afsVar.b = (int) (afkVar.W * i);
                } else {
                    afsVar.b = (int) (i / afkVar.W);
                }
            }
        }
        agmVar.a(afkVar, afsVar);
        afkVar.D(afsVar.c);
        afkVar.y(afsVar.d);
        afkVar.F = afsVar.f;
        afkVar.v(afsVar.e);
        afsVar.h = 0;
        boolean z5 = afsVar.g;
    }

    private final void Z(afj afjVar, aff affVar) {
        this.aq.g(affVar, this.aq.b(afjVar), 0, 5);
    }

    private final void aa(afj afjVar, aff affVar) {
        this.aq.g(this.aq.b(afjVar), affVar, 0, 5);
    }

    private final void ab() {
        this.at = 0;
        this.au = 0;
    }

    @Override // defpackage.afk
    public final void E(boolean z, boolean z2) {
        super.E(z, z2);
        int size = this.aH.size();
        for (int i = 0; i < size; i++) {
            ((afk) this.aH.get(i)).E(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0626 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0978 A[LOOP:14: B:244:0x0976->B:245:0x0978, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x09fe  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0a5a  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x05b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:701:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x05d3  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    @Override // defpackage.afr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T() {
        /*
            Method dump skipped, instructions count: 2666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afl.T():void");
    }

    public final void U(int i) {
        this.ax = i;
        afb.a = W(512);
    }

    public final boolean V(boolean z, int i) {
        boolean z2;
        boolean z3;
        afw afwVar = this.b;
        boolean z4 = false;
        int M = afwVar.a.M(0);
        int M2 = afwVar.a.M(1);
        int k = afwVar.a.k();
        int l = afwVar.a.l();
        if (z) {
            if (M != 2) {
                if (M2 == 2) {
                    M2 = 2;
                }
            }
            ArrayList arrayList = afwVar.e;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z3 = true;
                    break;
                }
                agg aggVar = (agg) arrayList.get(i2);
                if (aggVar.g == i && !aggVar.e()) {
                    z3 = false;
                    break;
                }
                i2++;
            }
            if (i == 0) {
                if (z3 && M == 2) {
                    afwVar.a.Q(1);
                    afl aflVar = afwVar.a;
                    aflVar.D(afwVar.a(aflVar, 0));
                    afl aflVar2 = afwVar.a;
                    aflVar2.h.f.c(aflVar2.j());
                }
            } else if (z3 && M2 == 2) {
                afwVar.a.R(1);
                afl aflVar3 = afwVar.a;
                aflVar3.y(afwVar.a(aflVar3, 1));
                afl aflVar4 = afwVar.a;
                aflVar4.i.f.c(aflVar4.h());
            }
        }
        if (i == 0) {
            afl aflVar5 = afwVar.a;
            int i3 = aflVar5.ap[0];
            if (i3 == 1 || i3 == 4) {
                int j = aflVar5.j() + k;
                afwVar.a.h.j.c(j);
                afwVar.a.h.f.c(j - k);
                z2 = true;
            }
            z2 = false;
        } else {
            afl aflVar6 = afwVar.a;
            int i4 = aflVar6.ap[1];
            if (i4 == 1 || i4 == 4) {
                int h = aflVar6.h() + l;
                afwVar.a.i.j.c(h);
                afwVar.a.i.f.c(h - l);
                z2 = true;
            }
            z2 = false;
        }
        afwVar.c();
        ArrayList arrayList2 = afwVar.e;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            agg aggVar2 = (agg) arrayList2.get(i5);
            if (aggVar2.g == i && (aggVar2.d != afwVar.a || aggVar2.h)) {
                aggVar2.c();
            }
        }
        ArrayList arrayList3 = afwVar.e;
        int size3 = arrayList3.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                z4 = true;
                break;
            }
            agg aggVar3 = (agg) arrayList3.get(i6);
            if (aggVar3.g == i && ((z2 || aggVar3.d != afwVar.a) && (!aggVar3.i.i || !aggVar3.j.i || (!(aggVar3 instanceof afu) && !aggVar3.f.i)))) {
                break;
            }
            i6++;
        }
        afwVar.a.Q(M);
        afwVar.a.R(M2);
        return z4;
    }

    public final boolean W(int i) {
        return (this.ax & i) == i;
    }

    public final void c() {
        this.b.b = true;
    }

    @Override // defpackage.afr, defpackage.afk
    public final void s() {
        this.aq.k();
        this.ar = 0;
        this.as = 0;
        super.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(afk afkVar, int i) {
        if (i != 0) {
            int i2 = this.au;
            afi[] afiVarArr = this.av;
            int length = afiVarArr.length;
            if (i2 + 1 >= length) {
                this.av = (afi[]) Arrays.copyOf(afiVarArr, length + length);
            }
            this.av[this.au] = new afi(afkVar, 1, this.d);
            this.au++;
            return;
        }
        int i3 = this.at;
        afi[] afiVarArr2 = this.aw;
        int length2 = afiVarArr2.length;
        if (i3 + 1 >= length2) {
            this.aw = (afi[]) Arrays.copyOf(afiVarArr2, length2 + length2);
        }
        this.aw[this.at] = new afi(afkVar, 0, this.d);
        this.at++;
    }
}
