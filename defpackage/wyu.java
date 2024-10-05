package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wyu {
    private final boolean a;
    private final aaea b;

    public wyu(aaea aaeaVar, shf shfVar, wng wngVar) {
        this.b = aaeaVar;
        this.a = new Random(shfVar.c()).nextFloat() < wngVar.a();
    }

    public static apbj a(xgh xghVar, boolean z, boolean z2) {
        aone g = g(xghVar);
        if (z2) {
            aone createBuilder = apbi.a.createBuilder();
            String str = xghVar.a;
            createBuilder.copyOnWrite();
            apbi apbiVar = (apbi) createBuilder.instance;
            apbiVar.b |= 1;
            apbiVar.c = str;
            amru amruVar = xghVar.d;
            if (((amvj) amruVar).c > 0) {
                apbk b = b((xgx) amruVar.get(0));
                createBuilder.copyOnWrite();
                apbi apbiVar2 = (apbi) createBuilder.instance;
                b.getClass();
                apbiVar2.e = b;
                apbiVar2.b |= 4;
            }
            amru amruVar2 = xghVar.e;
            int i = ((amvj) amruVar2).c;
            for (int i2 = 0; i2 < i; i2++) {
                apbk b2 = b((xgx) amruVar2.get(i2));
                createBuilder.copyOnWrite();
                apbi apbiVar3 = (apbi) createBuilder.instance;
                b2.getClass();
                aony aonyVar = apbiVar3.f;
                if (!aonyVar.c()) {
                    apbiVar3.f = aonm.mutableCopy(aonyVar);
                }
                apbiVar3.f.add(b2);
            }
            amru amruVar3 = xghVar.f;
            int i3 = ((amvj) amruVar3).c;
            for (int i4 = 0; i4 < i3; i4++) {
                apbk b3 = b((xgx) amruVar3.get(i4));
                createBuilder.copyOnWrite();
                apbi apbiVar4 = (apbi) createBuilder.instance;
                b3.getClass();
                aony aonyVar2 = apbiVar4.g;
                if (!aonyVar2.c()) {
                    apbiVar4.g = aonm.mutableCopy(aonyVar2);
                }
                apbiVar4.g.add(b3);
            }
            createBuilder.copyOnWrite();
            apbi apbiVar5 = (apbi) createBuilder.instance;
            apbiVar5.b |= 2;
            apbiVar5.d = z;
            apbi apbiVar6 = (apbi) createBuilder.build();
            g.copyOnWrite();
            apbj apbjVar = (apbj) g.instance;
            apbj apbjVar2 = apbj.a;
            apbiVar6.getClass();
            apbjVar.f = apbiVar6;
            apbjVar.b |= 8;
        }
        return (apbj) g.build();
    }

    public static apbk b(xgx xgxVar) {
        return e(xgxVar, apbk.a.createBuilder());
    }

    public static apbk e(xgx xgxVar, aone aoneVar) {
        apah b = xgxVar.b();
        aoneVar.copyOnWrite();
        apbk apbkVar = (apbk) aoneVar.instance;
        apbk apbkVar2 = apbk.a;
        apbkVar.e = b.af;
        apbkVar.b |= 1;
        if (xgxVar.d()) {
            aoneVar.copyOnWrite();
            apbk apbkVar3 = (apbk) aoneVar.instance;
            apbkVar3.b |= 16;
            apbkVar3.g = true;
        }
        boolean z = xgxVar instanceof xew;
        if (z || (xgxVar instanceof xgi)) {
            aone createBuilder = apbl.a.createBuilder();
            if (z) {
                String a = ((xew) xgxVar).a();
                createBuilder.copyOnWrite();
                apbl apblVar = (apbl) createBuilder.instance;
                apblVar.b = 2;
                apblVar.c = a;
            }
            if (xgxVar instanceof xgi) {
                String e = ((xgi) xgxVar).e();
                createBuilder.copyOnWrite();
                apbl apblVar2 = (apbl) createBuilder.instance;
                apblVar2.b = 1;
                apblVar2.c = e;
            }
            apbl apblVar3 = (apbl) createBuilder.build();
            aoneVar.copyOnWrite();
            apbk apbkVar4 = (apbk) aoneVar.instance;
            apblVar3.getClass();
            apbkVar4.d = apblVar3;
            apbkVar4.c = 4;
        }
        return (apbk) aoneVar.build();
    }

    public static aone f(apac apacVar, int i, amsx amsxVar) {
        aone createBuilder = apba.a.createBuilder();
        if (apacVar == null) {
            apacVar = apac.LAYOUT_TYPE_UNSPECIFIED;
        }
        createBuilder.copyOnWrite();
        apba apbaVar = (apba) createBuilder.instance;
        apbaVar.c = apacVar.aB;
        apbaVar.b |= 1;
        apab apabVar = (apab) wyl.b.get(Integer.valueOf(i));
        createBuilder.copyOnWrite();
        apba apbaVar2 = (apba) createBuilder.instance;
        apbaVar2.e = apabVar.f;
        apbaVar2.b |= 4;
        amxd listIterator = amsxVar.listIterator();
        while (listIterator.hasNext()) {
            apah b = ((xgx) listIterator.next()).b();
            createBuilder.copyOnWrite();
            apba apbaVar3 = (apba) createBuilder.instance;
            aonu aonuVar = apbaVar3.f;
            if (!aonuVar.c()) {
                apbaVar3.f = aonm.mutableCopy(aonuVar);
            }
            apbaVar3.f.g(b.af);
        }
        return createBuilder;
    }

    private static aone g(xgh xghVar) {
        aone createBuilder = apbj.a.createBuilder();
        apae c = xghVar.c();
        createBuilder.copyOnWrite();
        apbj apbjVar = (apbj) createBuilder.instance;
        apbjVar.c = c.r;
        apbjVar.b |= 1;
        apab apabVar = (apab) wyl.b.get(Integer.valueOf(xghVar.c));
        createBuilder.copyOnWrite();
        apbj apbjVar2 = (apbj) createBuilder.instance;
        apbjVar2.g = apabVar.f;
        apbjVar2.b |= 32;
        if (!xghVar.d.isEmpty()) {
            apah b = apah.b(b((xgx) xghVar.d.get(0)).e);
            if (b == null) {
                b = apah.TRIGGER_TYPE_UNSPECIFIED;
            }
            createBuilder.copyOnWrite();
            apbj apbjVar3 = (apbj) createBuilder.instance;
            apbjVar3.d = b.af;
            apbjVar3.b |= 2;
        }
        if (xghVar.a() != 1) {
            int a = xghVar.a();
            createBuilder.copyOnWrite();
            apbj apbjVar4 = (apbj) createBuilder.instance;
            apbjVar4.b |= 4;
            apbjVar4.e = a;
        }
        return createBuilder;
    }

    public final ashd c(xgh xghVar, String str, apac apacVar, int i, aowz aowzVar) {
        boolean d = d();
        aone createBuilder = ashd.a.createBuilder();
        if (aowzVar != null && (aowzVar.b & 1) != 0) {
            aomf aomfVar = aowzVar.c;
            createBuilder.copyOnWrite();
            ashd ashdVar = (ashd) createBuilder.instance;
            aomfVar.getClass();
            ashdVar.b |= 1024;
            ashdVar.f = aomfVar;
        }
        aone createBuilder2 = apai.a.createBuilder();
        aone g = g(xghVar);
        if (d) {
            aone createBuilder3 = apbi.a.createBuilder();
            String str2 = xghVar.a;
            createBuilder3.copyOnWrite();
            apbi apbiVar = (apbi) createBuilder3.instance;
            apbiVar.b |= 1;
            apbiVar.c = str2;
            createBuilder3.copyOnWrite();
            apbi apbiVar2 = (apbi) createBuilder3.instance;
            apbiVar2.b |= 2;
            apbiVar2.d = false;
            apbi apbiVar3 = (apbi) createBuilder3.build();
            g.copyOnWrite();
            apbj apbjVar = (apbj) g.instance;
            apbj apbjVar2 = apbj.a;
            apbiVar3.getClass();
            apbjVar.f = apbiVar3;
            apbjVar.b |= 8;
        }
        apbj apbjVar3 = (apbj) g.build();
        createBuilder2.copyOnWrite();
        apai apaiVar = (apai) createBuilder2.instance;
        apbjVar3.getClass();
        apaiVar.d = apbjVar3;
        apaiVar.b |= 2;
        aone f = f(apacVar, i, amvs.a);
        if (d) {
            aone createBuilder4 = apaz.a.createBuilder();
            createBuilder4.copyOnWrite();
            apaz apazVar = (apaz) createBuilder4.instance;
            str.getClass();
            apazVar.b |= 1;
            apazVar.c = str;
            apaz apazVar2 = (apaz) createBuilder4.build();
            f.copyOnWrite();
            apba apbaVar = (apba) f.instance;
            apba apbaVar2 = apba.a;
            apazVar2.getClass();
            apbaVar.d = apazVar2;
            apbaVar.b |= 2;
        }
        apba apbaVar3 = (apba) f.build();
        createBuilder2.copyOnWrite();
        apai apaiVar2 = (apai) createBuilder2.instance;
        apbaVar3.getClass();
        apaiVar2.e = apbaVar3;
        apaiVar2.b |= 4;
        apai apaiVar3 = (apai) createBuilder2.build();
        createBuilder.copyOnWrite();
        ashd ashdVar2 = (ashd) createBuilder.instance;
        apaiVar3.getClass();
        ashdVar2.e = apaiVar3;
        ashdVar2.b |= 512;
        return (ashd) createBuilder.build();
    }

    public final boolean d() {
        if (this.a) {
            return true;
        }
        apbs k = wbs.k(this.b);
        return k != null && k.c;
    }
}
