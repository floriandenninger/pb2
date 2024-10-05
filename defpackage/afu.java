package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afu extends agg {
    ArrayList a;
    private int b;

    public afu(afk afkVar, int i) {
        super(afkVar);
        afk afkVar2;
        this.a = new ArrayList();
        this.g = i;
        afk afkVar3 = this.d;
        afk n = afkVar3.n(i);
        while (true) {
            afk afkVar4 = n;
            afkVar2 = afkVar3;
            afkVar3 = afkVar4;
            if (afkVar3 == null) {
                break;
            } else {
                n = afkVar3.n(this.g);
            }
        }
        this.d = afkVar2;
        this.a.add(afkVar2.o(this.g));
        afk m = afkVar2.m(this.g);
        while (m != null) {
            this.a.add(m.o(this.g));
            m = m.m(this.g);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            agg aggVar = (agg) arrayList.get(i2);
            int i3 = this.g;
            if (i3 == 0) {
                aggVar.d.f = this;
            } else if (i3 == 1) {
                aggVar.d.g = this;
            }
        }
        if (this.g == 0 && ((afl) this.d.T).d && this.a.size() > 1) {
            this.d = ((agg) this.a.get(r6.size() - 1)).d;
        }
        this.b = this.g == 0 ? this.d.ai : this.d.aj;
    }

    private final afk g() {
        for (int i = 0; i < this.a.size(); i++) {
            afk afkVar = ((agg) this.a.get(i)).d;
            if (afkVar.ag != 8) {
                return afkVar;
            }
        }
        return null;
    }

    private final afk n() {
        afk afkVar;
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            afkVar = ((agg) this.a.get(size)).d;
        } while (afkVar.ag == 8);
        return afkVar;
    }

    @Override // defpackage.agg
    public final long a() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = j + r4.i.e + ((agg) this.a.get(i)).a() + r4.j.e;
        }
        return j;
    }

    @Override // defpackage.agg
    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((agg) arrayList.get(i)).b();
        }
        int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        afk afkVar = ((agg) this.a.get(0)).d;
        afk afkVar2 = ((agg) this.a.get(size2 - 1)).d;
        if (this.g == 0) {
            afj afjVar = afkVar.f45J;
            afj afjVar2 = afkVar2.L;
            afx l = l(afjVar, 0);
            int b = afjVar.b();
            afk g = g();
            if (g != null) {
                b = g.f45J.b();
            }
            if (l != null) {
                j(this.i, l, b);
            }
            afx l2 = l(afjVar2, 0);
            int b2 = afjVar2.b();
            afk n = n();
            if (n != null) {
                b2 = n.L.b();
            }
            if (l2 != null) {
                j(this.j, l2, -b2);
            }
        } else {
            afj afjVar3 = afkVar.K;
            afj afjVar4 = afkVar2.M;
            afx l3 = l(afjVar3, 1);
            int b3 = afjVar3.b();
            afk g2 = g();
            if (g2 != null) {
                b3 = g2.K.b();
            }
            if (l3 != null) {
                j(this.i, l3, b3);
            }
            afx l4 = l(afjVar4, 1);
            int b4 = afjVar4.b();
            afk n2 = n();
            if (n2 != null) {
                b4 = n2.M.b();
            }
            if (l4 != null) {
                j(this.j, l4, -b4);
            }
        }
        this.i.a = this;
        this.j.a = this;
    }

    @Override // defpackage.agg
    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((agg) this.a.get(i)).c();
        }
    }

    @Override // defpackage.agg
    public final void d() {
        this.e = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((agg) arrayList.get(i)).d();
        }
    }

    @Override // defpackage.agg
    public final boolean e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((agg) this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:287:0x03ce, code lost:
    
        r10 = r10 - r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    @Override // defpackage.agg, defpackage.afv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afu.f():void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.g == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            agg aggVar = (agg) arrayList.get(i);
            sb.append("<");
            sb.append(aggVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
