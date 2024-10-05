package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bcc implements bbp, bbo {
    public final bbp[] a;
    private bbo d;
    private asj e;
    private final ArrayList c = new ArrayList();
    private bda g = ayt.c(new bda[0]);
    private final IdentityHashMap b = new IdentityHashMap();
    private bbp[] f = new bbp[0];

    public bcc(long[] jArr, bbp... bbpVarArr) {
        this.a = bbpVarArr;
        for (int i = 0; i < bbpVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.a[i] = new bca(bbpVarArr[i], j);
            }
        }
    }

    @Override // defpackage.bbp
    public final long a(long j, poi poiVar) {
        bbp[] bbpVarArr = this.f;
        return (bbpVarArr.length > 0 ? bbpVarArr[0] : this.a[0]).a(j, poiVar);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final long c() {
        return this.g.c();
    }

    @Override // defpackage.bbp
    public final long d() {
        long j = -9223372036854775807L;
        for (bbp bbpVar : this.f) {
            long d = bbpVar.d();
            if (d != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (bbp bbpVar2 : this.f) {
                        if (bbpVar2 == bbpVar) {
                            break;
                        }
                        if (bbpVar2.e(d) != d) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = d;
                } else if (d != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && bbpVar.e(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // defpackage.bbp
    public final long e(long j) {
        long e = this.f[0].e(j);
        int i = 1;
        while (true) {
            bbp[] bbpVarArr = this.f;
            if (i >= bbpVarArr.length) {
                return e;
            }
            if (bbpVarArr[i].e(e) != e) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // defpackage.bbp
    public final long f(bel[] belVarArr, boolean[] zArr, bcy[] bcyVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = belVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = belVarArr.length;
            if (i >= length) {
                break;
            }
            bcy bcyVar = bcyVarArr[i];
            Integer num = bcyVar == null ? null : (Integer) this.b.get(bcyVar);
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            bel belVar = belVarArr[i];
            if (belVar != null) {
                asi e = belVar.e();
                int i2 = 0;
                while (true) {
                    bbp[] bbpVarArr = this.a;
                    if (i2 >= bbpVarArr.length) {
                        break;
                    }
                    if (bbpVarArr[i2].g().a(e) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        this.b.clear();
        bcy[] bcyVarArr2 = new bcy[length];
        bcy[] bcyVarArr3 = new bcy[length];
        bel[] belVarArr2 = new bel[length];
        ArrayList arrayList = new ArrayList(this.a.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.a.length) {
            for (int i4 = 0; i4 < belVarArr.length; i4++) {
                bcyVarArr3[i4] = iArr[i4] == i3 ? bcyVarArr[i4] : null;
                belVarArr2[i4] = iArr2[i4] == i3 ? belVarArr[i4] : null;
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            bcy[] bcyVarArr4 = bcyVarArr3;
            bel[] belVarArr3 = belVarArr2;
            long f = this.a[i3].f(belVarArr2, zArr, bcyVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = f;
            } else if (f != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < belVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    bcy bcyVar2 = bcyVarArr4[i6];
                    pse.c(bcyVar2);
                    bcyVarArr2[i6] = bcyVarArr4[i6];
                    this.b.put(bcyVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    pse.g(bcyVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.a[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            bcyVarArr3 = bcyVarArr4;
            belVarArr2 = belVarArr3;
        }
        System.arraycopy(bcyVarArr2, 0, bcyVarArr, 0, length);
        bbp[] bbpVarArr2 = (bbp[]) arrayList.toArray(new bbp[0]);
        this.f = bbpVarArr2;
        this.g = ayt.c(bbpVarArr2);
        return j2;
    }

    @Override // defpackage.bbp
    public final asj g() {
        asj asjVar = this.e;
        pse.c(asjVar);
        return asjVar;
    }

    @Override // defpackage.bbp
    public final void h(long j, boolean z) {
        for (bbp bbpVar : this.f) {
            bbpVar.h(j, z);
        }
    }

    @Override // defpackage.bbp
    public final void i() {
        for (bbp bbpVar : this.a) {
            bbpVar.i();
        }
    }

    @Override // defpackage.bcz
    public final /* bridge */ /* synthetic */ void j(bda bdaVar) {
        bbo bboVar = this.d;
        pse.c(bboVar);
        bboVar.j(this);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final long jJ() {
        return this.g.jJ();
    }

    @Override // defpackage.bbo
    public final void k(bbp bbpVar) {
        this.c.remove(bbpVar);
        if (this.c.isEmpty()) {
            int i = 0;
            for (bbp bbpVar2 : this.a) {
                i += bbpVar2.g().b;
            }
            asi[] asiVarArr = new asi[i];
            int i2 = 0;
            for (bbp bbpVar3 : this.a) {
                asj g = bbpVar3.g();
                int i3 = g.b;
                int i4 = 0;
                while (i4 < i3) {
                    asiVarArr[i2] = g.b(i4);
                    i4++;
                    i2++;
                }
            }
            this.e = new asj(asiVarArr);
            bbo bboVar = this.d;
            pse.c(bboVar);
            bboVar.k(this);
        }
    }

    @Override // defpackage.bbp
    public final void l(bbo bboVar, long j) {
        this.d = bboVar;
        Collections.addAll(this.c, this.a);
        for (bbp bbpVar : this.a) {
            bbpVar.l(this, j);
        }
    }

    @Override // defpackage.bbp, defpackage.bda
    public final void m(long j) {
        this.g.m(j);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final boolean o(long j) {
        if (!this.c.isEmpty()) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                ((bbp) this.c.get(i)).o(j);
            }
            return false;
        }
        return this.g.o(j);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final boolean p() {
        return this.g.p();
    }
}
