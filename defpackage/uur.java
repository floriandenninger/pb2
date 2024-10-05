package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uur implements uus {
    private final /* synthetic */ int a;

    public uur(int i) {
        this.a = i;
    }

    @Override // defpackage.uus
    public final /* synthetic */ String a(aoox aooxVar) {
        int i = this.a;
        if (i == 0) {
            return ((baaw) ((aone) aooxVar).instance).f;
        }
        aonm aonmVar = ((aone) aooxVar).instance;
        return i != 1 ? ((baby) aonmVar).c : ((bact) aonmVar).o;
    }

    @Override // defpackage.uus
    public final /* synthetic */ String b(aoox aooxVar) {
        int i = this.a;
        if (i == 0) {
            return ((baaw) ((aone) aooxVar).instance).e;
        }
        aonm aonmVar = ((aone) aooxVar).instance;
        return i != 1 ? ((baby) aonmVar).e : ((bact) aonmVar).e;
    }

    @Override // defpackage.uus
    public final /* synthetic */ void d(aoox aooxVar) {
        int i = this.a;
        if (i == 0) {
            aone aoneVar = (aone) aooxVar;
            aoneVar.copyOnWrite();
            baaw baawVar = (baaw) aoneVar.instance;
            baaw baawVar2 = baaw.a;
            baawVar.b &= -5;
            baawVar.e = baaw.a.e;
            return;
        }
        if (i == 1) {
            aone aoneVar2 = (aone) aooxVar;
            aoneVar2.copyOnWrite();
            bact bactVar = (bact) aoneVar2.instance;
            bact bactVar2 = bact.a;
            bactVar.b &= -5;
            bactVar.e = bact.a.e;
            return;
        }
        aone aoneVar3 = (aone) aooxVar;
        aoneVar3.copyOnWrite();
        baby babyVar = (baby) aoneVar3.instance;
        baby babyVar2 = baby.a;
        babyVar.b &= -5;
        babyVar.e = baby.a.e;
    }

    @Override // defpackage.uus
    public final /* synthetic */ void c(aoox aooxVar, Long l) {
        int i = this.a;
        if (i == 0) {
            if (l == null) {
                aone aoneVar = (aone) aooxVar;
                aoneVar.copyOnWrite();
                baaw baawVar = (baaw) aoneVar.instance;
                baaw baawVar2 = baaw.a;
                baawVar.b &= -3;
                baawVar.d = 0L;
                return;
            }
            long longValue = l.longValue();
            aone aoneVar2 = (aone) aooxVar;
            aoneVar2.copyOnWrite();
            baaw baawVar3 = (baaw) aoneVar2.instance;
            baaw baawVar4 = baaw.a;
            baawVar3.b |= 2;
            baawVar3.d = longValue;
            return;
        }
        if (i != 1) {
            if (l == null) {
                aone aoneVar3 = (aone) aooxVar;
                aoneVar3.copyOnWrite();
                baby babyVar = (baby) aoneVar3.instance;
                baby babyVar2 = baby.a;
                babyVar.b &= -3;
                babyVar.d = 0L;
                return;
            }
            long longValue2 = l.longValue();
            aone aoneVar4 = (aone) aooxVar;
            aoneVar4.copyOnWrite();
            baby babyVar3 = (baby) aoneVar4.instance;
            baby babyVar4 = baby.a;
            babyVar3.b |= 2;
            babyVar3.d = longValue2;
            return;
        }
        if (l == null) {
            aone aoneVar5 = (aone) aooxVar;
            aoneVar5.copyOnWrite();
            bact bactVar = (bact) aoneVar5.instance;
            bact bactVar2 = bact.a;
            bactVar.b &= -3;
            bactVar.d = 0L;
            return;
        }
        long longValue3 = l.longValue();
        aone aoneVar6 = (aone) aooxVar;
        aoneVar6.copyOnWrite();
        bact bactVar3 = (bact) aoneVar6.instance;
        bact bactVar4 = bact.a;
        bactVar3.b |= 2;
        bactVar3.d = longValue3;
    }
}
