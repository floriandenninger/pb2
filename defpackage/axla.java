package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axla extends axkx {
    public List d;
    public dey e;
    public List f;
    public List g;
    public List h;
    public axld i;
    public String j;
    public dfh k;
    private long[] l;
    private long[] m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axla(String str, dfm dfmVar, ddz... ddzVarArr) {
        super(str);
        int i;
        int i2;
        Iterator it;
        long j;
        Iterator it2;
        int i3;
        Iterator it3;
        dft dftVar;
        axla axlaVar = this;
        dfm dfmVar2 = dfmVar;
        axlaVar.m = new long[0];
        axlaVar.i = new axld();
        axlaVar.k = null;
        long j2 = dfmVar.n().a;
        axlaVar.d = new dgb(dfmVar2, ddzVarArr);
        dfa l = dfmVar.l().n().l();
        axlaVar.j = dfmVar.l().l().a;
        axlaVar.f = new ArrayList();
        axlaVar.g = new ArrayList();
        axlaVar.h = new ArrayList();
        axlaVar.f.addAll(l.r().b);
        if (l.m() != null) {
            axlaVar.g.addAll(l.m().a);
        }
        if (l.n() != null) {
            axlaVar.h.addAll(l.n().a);
        }
        if (l.q() != null) {
            axlaVar.m = l.q().a;
        }
        String str2 = "subs";
        axlaVar.k = (dfh) axnc.a(l, "subs");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((deb) dfmVar2.m).c().j(dfs.class));
        axlaVar.e = l.o();
        List j3 = dfmVar2.m.j(dfr.class);
        if (j3.size() > 0) {
            Iterator it4 = j3.iterator();
            while (it4.hasNext()) {
                Iterator it5 = ((dfr) it4.next()).j(dfu.class).iterator();
                while (it5.hasNext()) {
                    dfu dfuVar = (dfu) it5.next();
                    if (dfuVar.a == j2) {
                        if (axnc.b(((deb) dfmVar2.m).c(), "/moof/traf/subs").size() > 0) {
                            axlaVar.k = new dfh();
                        }
                        LinkedList linkedList = new LinkedList();
                        int size = arrayList.size();
                        int i4 = 0;
                        long j4 = 1;
                        while (i4 < size) {
                            Iterator it6 = ((dfs) arrayList.get(i4)).j(dfw.class).iterator();
                            while (true) {
                                i2 = i4 + 1;
                                if (it6.hasNext()) {
                                    dfw dfwVar = (dfw) it6.next();
                                    int i5 = i4;
                                    if (dfwVar.l().a == j2) {
                                        dfh dfhVar = (dfh) axnc.a(dfwVar, str2);
                                        if (dfhVar != null) {
                                            long j5 = j4 - 1;
                                            for (dfg dfgVar : dfhVar.a) {
                                                Iterator it7 = it6;
                                                dfg dfgVar2 = new dfg();
                                                Iterator it8 = it4;
                                                String str3 = str2;
                                                dfgVar2.b.addAll(dfgVar.b);
                                                if (j5 != 0) {
                                                    dfgVar2.a = j5 + dfgVar.a;
                                                    j5 = 0;
                                                } else {
                                                    dfgVar2.a = dfgVar.a;
                                                }
                                                axlaVar.k.a.add(dfgVar2);
                                                it6 = it7;
                                                it4 = it8;
                                                str2 = str3;
                                            }
                                        }
                                        Iterator it9 = it6;
                                        Iterator it10 = it4;
                                        String str4 = str2;
                                        Iterator it11 = dfwVar.j(dfz.class).iterator();
                                        while (it11.hasNext()) {
                                            dfz dfzVar = (dfz) it11.next();
                                            dfx l2 = ((dfw) dfzVar.j).l();
                                            Iterator it12 = dfzVar.c.iterator();
                                            boolean z = true;
                                            while (it12.hasNext()) {
                                                dfy dfyVar = (dfy) it12.next();
                                                if (!dfzVar.n()) {
                                                    it = it11;
                                                    j = j2;
                                                    it2 = it5;
                                                    i3 = size;
                                                    it3 = it12;
                                                    if ((l2.r() & 8) == 0) {
                                                        axlaVar.f.add(new dfk(1L, dfuVar.b));
                                                    } else {
                                                        axlaVar.f.add(new dfk(1L, l2.c));
                                                    }
                                                } else {
                                                    it = it11;
                                                    if (axlaVar.f.size() != 0) {
                                                        it2 = it5;
                                                        i3 = size;
                                                        it3 = it12;
                                                        if (((dfk) axlaVar.f.get(r2.size() - 1)).b != dfyVar.a) {
                                                            j = j2;
                                                        } else {
                                                            j = j2;
                                                            ((dfk) axlaVar.f.get(r1.size() - 1)).a++;
                                                        }
                                                    } else {
                                                        j = j2;
                                                        it2 = it5;
                                                        i3 = size;
                                                        it3 = it12;
                                                    }
                                                    axlaVar.f.add(new dfk(1L, dfyVar.a));
                                                }
                                                if (dfzVar.m()) {
                                                    if (axlaVar.g.size() != 0) {
                                                        List list = axlaVar.g;
                                                        if (((dee) list.get(list.size() - 1)).b == dfyVar.d) {
                                                            ((dee) axlaVar.g.get(r1.size() - 1)).a++;
                                                        }
                                                    }
                                                    axlaVar.g.add(new dee(1, awxt.g(dfyVar.d)));
                                                }
                                                if (dfzVar.o()) {
                                                    dftVar = dfyVar.c;
                                                } else if (z && (dfzVar.r() & 4) == 4) {
                                                    dftVar = dfzVar.b;
                                                } else {
                                                    dftVar = (l2.r() & 32) != 0 ? l2.e : dfuVar.d;
                                                }
                                                if (dftVar != null && !dftVar.a) {
                                                    linkedList.add(Long.valueOf(j4));
                                                }
                                                j4++;
                                                size = i3;
                                                it11 = it;
                                                it12 = it3;
                                                it5 = it2;
                                                j2 = j;
                                                z = false;
                                            }
                                        }
                                        i4 = i5;
                                        it6 = it9;
                                        it4 = it10;
                                        str2 = str4;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                            }
                            i4 = i2;
                        }
                        long j6 = j2;
                        Iterator it13 = it4;
                        String str5 = str2;
                        Iterator it14 = it5;
                        long[] jArr = axlaVar.m;
                        int length = jArr.length;
                        long[] jArr2 = new long[linkedList.size() + length];
                        axlaVar.m = jArr2;
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                        Iterator it15 = linkedList.iterator();
                        while (it15.hasNext()) {
                            axlaVar.m[length] = ((Long) it15.next()).longValue();
                            length++;
                        }
                        dfmVar2 = dfmVar;
                        it4 = it13;
                        str2 = str5;
                        it5 = it14;
                        j2 = j6;
                    } else {
                        dfmVar2 = dfmVar;
                    }
                }
                dfmVar2 = dfmVar;
            }
            long j7 = j2;
            new ArrayList();
            new ArrayList();
            int size2 = arrayList.size();
            int i6 = 0;
            while (i6 < size2) {
                Iterator it16 = ((dfs) arrayList.get(i6)).j(dfw.class).iterator();
                while (true) {
                    i = i6 + 1;
                    if (it16.hasNext()) {
                        dfw dfwVar2 = (dfw) it16.next();
                        if (dfwVar2.l().a == j7) {
                            List b = axnc.b(dfwVar2, "sgpd");
                            List b2 = axnc.b(dfwVar2, "sbgp");
                            Map map = axlaVar.c;
                            n(b, b2, map);
                            axlaVar.c = map;
                        }
                    }
                }
                i6 = i;
            }
        } else {
            List j8 = l.j(axmp.class);
            List j9 = l.j(axmr.class);
            Map map2 = axlaVar.c;
            n(j8, j9, map2);
            axlaVar.c = map2;
        }
        axlaVar.l = dfl.k(axlaVar.f);
        der m = dfmVar.l().m();
        dfn n = dfmVar.n();
        axld axldVar = axlaVar.i;
        axldVar.i = n.a;
        axldVar.d = m.a;
        axldVar.a = m.e;
        axldVar.c = m.b;
        axldVar.b = m.c;
        axldVar.g = n.g;
        axldVar.f = n.f;
        axldVar.j = n.b;
        axldVar.e = n.e;
        dek dekVar = (dek) axnc.a(dfmVar, "edts/elst");
        deu deuVar = (deu) axnc.a(dfmVar, "../mvhd");
        if (dekVar != null) {
            for (dej dejVar : dekVar.a) {
                List list2 = axlaVar.b;
                long j10 = dejVar.c;
                long j11 = m.c;
                double d = dejVar.d;
                double d2 = dejVar.b;
                double d3 = deuVar.c;
                Double.isNaN(d2);
                Double.isNaN(d3);
                list2.add(new axky(j10, j11, d, d2 / d3));
                axlaVar = this;
                m = m;
            }
        }
    }

    private static final void n(List list, List list2, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            axmp axmpVar = (axmp) it.next();
            Iterator it2 = list2.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                axmr axmrVar = (axmr) it2.next();
                if (axmrVar.a.equals(((axml) axmpVar.a.get(0)).a())) {
                    int i = 0;
                    for (axmq axmqVar : axmrVar.b) {
                        int i2 = axmqVar.b;
                        if (i2 > 0) {
                            axml axmlVar = (axml) axmpVar.a.get(i2 - 1);
                            long[] jArr = (long[]) map.get(axmlVar);
                            if (jArr == null) {
                                jArr = new long[0];
                            }
                            int g = awxt.g(axmqVar.a);
                            int length = jArr.length;
                            long[] jArr2 = new long[g + length];
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                            for (int i3 = 0; i3 < axmqVar.a; i3++) {
                                jArr2[jArr.length + i3] = i + i3;
                            }
                            map.put(axmlVar, jArr2);
                        }
                        i = (int) (i + axmqVar.a);
                    }
                    z = true;
                }
            }
            if (!z) {
                String a = ((axml) axmpVar.a.get(0)).a();
                StringBuilder sb = new StringBuilder(a.length() + 37);
                sb.append("Could not find SampleToGroupBox for ");
                sb.append(a);
                sb.append(".");
                throw new RuntimeException(sb.toString());
            }
        }
    }

    @Override // defpackage.axkx, defpackage.axlc
    public final dfh b() {
        return this.k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // defpackage.axkx, defpackage.axlc
    public final List d() {
        return this.g;
    }

    @Override // defpackage.axkx, defpackage.axlc
    public final List f() {
        return this.h;
    }

    @Override // defpackage.axkx, defpackage.axlc
    public final long[] h() {
        if (this.m.length == this.d.size()) {
            return null;
        }
        return this.m;
    }

    @Override // defpackage.axlc
    public final dey i() {
        return this.e;
    }

    @Override // defpackage.axlc
    public final axld j() {
        return this.i;
    }

    @Override // defpackage.axlc
    public final String k() {
        return this.j;
    }

    @Override // defpackage.axlc
    public final List l() {
        return this.d;
    }

    @Override // defpackage.axlc
    public final synchronized long[] m() {
        return this.l;
    }
}
