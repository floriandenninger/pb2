package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class joo implements agoy {
    private final aais a;
    private final shf b;

    public joo(aais aaisVar, shf shfVar) {
        this.a = aaisVar;
        this.b = shfVar;
    }

    @Override // defpackage.agoy
    public final agox a(atpq atpqVar) {
        return agox.a;
    }

    @Override // defpackage.agoy
    public final anhy b(afsx afsxVar, atpq atpqVar) {
        String g = aalt.g(atpqVar.d);
        if (g.isEmpty()) {
            return anaf.O(agou.c);
        }
        int bU = anaf.bU(atpqVar.c);
        if (bU == 0) {
            bU = 1;
        }
        if (bU - 1 == 1) {
            aair a = this.a.a(afsxVar);
            aalc c = a.c();
            String z = fhe.z(g);
            z.getClass();
            amkq.O(!z.isEmpty(), "key cannot be empty");
            aone createBuilder = asxo.a.createBuilder();
            createBuilder.copyOnWrite();
            asxo asxoVar = (asxo) createBuilder.instance;
            asxoVar.c = 1 | asxoVar.c;
            asxoVar.d = z;
            asxl asxlVar = new asxl(createBuilder);
            Long valueOf = Long.valueOf(this.b.c());
            aone aoneVar = asxlVar.a;
            long longValue = valueOf.longValue();
            aoneVar.copyOnWrite();
            asxo asxoVar2 = (asxo) aoneVar.instance;
            asxoVar2.c |= 8;
            asxoVar2.f = longValue;
            String s = fhe.s(g);
            aone aoneVar2 = asxlVar.a;
            aoneVar2.copyOnWrite();
            asxo asxoVar3 = (asxo) aoneVar2.instance;
            s.getClass();
            asxoVar3.c |= 4;
            asxoVar3.e = s;
            c.d(asxlVar.a(a));
            return aney.h(anfq.h(anht.q(wbs.N(c.b())), icu.r, angq.a), Throwable.class, icu.q, angq.a);
        }
        Object[] objArr = new Object[2];
        int bU2 = anaf.bU(atpqVar.c);
        if (bU2 == 0) {
            bU2 = 1;
        }
        objArr[0] = Integer.valueOf(bU2 - 1);
        objArr[1] = 262;
        zga.e("Could not handle action: %s for type %s", objArr);
        return anaf.O(agou.c);
    }

    @Override // defpackage.agoy
    public final anhy c(afsx afsxVar, amru amruVar) {
        return anaf.O(amru.q());
    }
}
