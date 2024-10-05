package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eow implements ypd {
    public final axpg a;
    public final afsy b;
    public final aaea c;
    public epz d = epz.UNKNOWN;
    public final aadw e;
    private final axpg f;
    private final azrs g;
    private final wkk h;
    private final Executor i;
    private final boolean j;

    /* JADX WARN: Multi-variable type inference failed */
    public eow(axpg axpgVar, axpg axpgVar2, final axpg axpgVar3, aaea aaeaVar, aadw aadwVar, afsy afsyVar, Executor executor, final ayqi ayqiVar, final ypa ypaVar, axzg axzgVar, wkk wkkVar, byte[] bArr) {
        Boolean bool;
        this.a = axpgVar;
        this.f = axpgVar2;
        this.c = aaeaVar;
        this.e = aadwVar;
        this.b = afsyVar;
        this.h = wkkVar;
        this.i = executor;
        this.g = azrh.aN(afsyVar.c().b()).aT();
        aqvj aqvjVar = axzgVar.b.b().C;
        aqvjVar = aqvjVar == null ? aqvj.a : aqvjVar;
        if (aqvjVar.a(45357308L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45357308L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45357308L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        this.j = bool.booleanValue();
        if (evr.az(aadwVar)) {
            executor.execute(new Runnable() { // from class: eoq
                @Override // java.lang.Runnable
                public final void run() {
                    eow.this.h(axpgVar3, ayqiVar, ypaVar);
                }
            });
        } else {
            axpgVar.get();
            axpgVar2.get();
            h(axpgVar3, ayqiVar, ypaVar);
        }
        o();
    }

    public static boolean k(arfd arfdVar, boolean z) {
        aswb aswbVar = arfdVar.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.ab && !z;
    }

    private final void o() {
        if (this.j) {
            final eok b = b();
            ynm.i(wbs.b(this.b.c(), this.h, this.i), new ynl() { // from class: eor
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    eow eowVar = eow.this;
                    eok eokVar = b;
                    if (!((Boolean) obj).booleanValue() || eokVar.i) {
                        return;
                    }
                    eowVar.d(true).Q();
                }
            });
        }
    }

    public final eok a(eok eokVar) {
        if (eokVar == null || eokVar.i || !wbs.d(this.b.c())) {
            return eokVar;
        }
        aone builder = eokVar.toBuilder();
        builder.copyOnWrite();
        eok eokVar2 = (eok) builder.instance;
        eokVar2.b |= 1;
        eokVar2.c = true;
        return (eok) builder.build();
    }

    public final eok b() {
        eok eokVar = (eok) ((ywr) this.a.get()).c();
        String b = this.b.c().b();
        Map unmodifiableMap = Collections.unmodifiableMap(((eom) ((ywr) this.f.get()).c()).b);
        if (unmodifiableMap.containsKey(b) && unmodifiableMap.get(b) != null) {
            eokVar = (eok) unmodifiableMap.get(b);
        }
        return a(eokVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy c(final amml ammlVar) {
        return ((ywr) this.f.get()).b(new amml() { // from class: eos
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                eok eokVar;
                eow eowVar = eow.this;
                amml ammlVar2 = ammlVar;
                eom eomVar = (eom) obj;
                String b = eowVar.b.c().b();
                Map unmodifiableMap = Collections.unmodifiableMap(eomVar.b);
                if (!unmodifiableMap.containsKey(b) || unmodifiableMap.get(b) == null) {
                    eokVar = (eok) ((ywr) eowVar.a.get()).c();
                } else {
                    eokVar = (eok) unmodifiableMap.get(b);
                }
                aone builder = eomVar.toBuilder();
                String b2 = eowVar.b.c().b();
                aone builder2 = eokVar.toBuilder();
                builder2.copyOnWrite();
                eok eokVar2 = (eok) builder2.instance;
                eokVar2.b |= 64;
                eokVar2.i = true;
                eok eokVar3 = (eok) ammlVar2.apply((eok) builder2.build());
                eokVar3.getClass();
                builder.copyOnWrite();
                eom eomVar2 = (eom) builder.instance;
                aoot aootVar = eomVar2.b;
                if (!aootVar.b) {
                    eomVar2.b = aootVar.a();
                }
                eomVar2.b.put(b2, eokVar3);
                return (eom) builder.build();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayph d(boolean z) {
        anhy c = c(new eou(z, 1));
        ayph C = wbs.O(c).q(eoo.a).C();
        ynm.m(c, new egw(6));
        return C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayph e(final boolean z, final long j) {
        anhy c = c(new amml() { // from class: eot
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                boolean z2 = z;
                long j2 = j;
                aone builder = ((eok) obj).toBuilder();
                builder.copyOnWrite();
                eok eokVar = (eok) builder.instance;
                eokVar.b |= 32;
                eokVar.h = z2;
                builder.copyOnWrite();
                eok eokVar2 = (eok) builder.instance;
                eokVar2.b |= 16;
                eokVar2.g = j2;
                return (eok) builder.build();
            }
        });
        ayph D = wbs.O(c).D(eng.d);
        ynm.m(c, new egw(6));
        return D;
    }

    public final aypy g() {
        return aypy.o(((ywr) this.a.get()).d().U(), ((ywr) this.f.get()).d().U(), this.g, new ayrt() { // from class: eop
            @Override // defpackage.ayrt
            public final Object a(Object obj, Object obj2, Object obj3) {
                eow eowVar = eow.this;
                eok eokVar = (eok) obj;
                String str = (String) obj3;
                Map unmodifiableMap = Collections.unmodifiableMap(((eom) obj2).b);
                if (!unmodifiableMap.containsKey(str) || unmodifiableMap.get(str) == null) {
                    return eowVar.a(eokVar);
                }
                return eowVar.a((eok) unmodifiableMap.get(str));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(axpg axpgVar, ayqi ayqiVar, ypa ypaVar) {
        ypaVar.g(this);
        if (evr.aA(this.e)) {
            ((eqa) axpgVar.get()).a().ab(ayqiVar).ax(new ayrs() { // from class: eon
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    eow eowVar = eow.this;
                    epz epzVar = (epz) obj;
                    if (eowVar.d == epzVar || epzVar == epz.UNKNOWN || !evr.aA(eowVar.e)) {
                        return;
                    }
                    if (epzVar.f || !eowVar.l()) {
                        if (epzVar.f && !eowVar.l()) {
                            eowVar.n(eowVar.m());
                        }
                    } else {
                        eowVar.d(false).Q();
                    }
                    eowVar.d = epzVar;
                }
            });
        }
        if (evr.az(this.e)) {
            j();
        }
    }

    public final boolean i() {
        return k(this.c.a(), this.b.c().g());
    }

    public final boolean j() {
        return i() && b().c;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            this.g.c(this.b.c().b());
            o();
            return null;
        }
        if (i == 1) {
            this.g.c(this.b.c().b());
            o();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean l() {
        return j() && evr.aA(this.e) && b().j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        return b().f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(boolean z) {
        ynm.m(c(new eou(z, 0)), new egw(6));
    }
}
