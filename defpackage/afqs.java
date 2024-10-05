package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afqs implements afqm {
    private final atvs a;

    public afqs(int i, List list) {
        aone createBuilder = atvs.a.createBuilder();
        createBuilder.copyOnWrite();
        atvs atvsVar = (atvs) createBuilder.instance;
        atvsVar.b |= 1;
        atvsVar.c = i;
        createBuilder.copyOnWrite();
        atvs atvsVar2 = (atvs) createBuilder.instance;
        aonu aonuVar = atvsVar2.d;
        if (!aonuVar.c()) {
            atvsVar2.d = aonm.mutableCopy(aonuVar);
        }
        aolo.addAll((Iterable) list, (List) atvsVar2.d);
        createBuilder.copyOnWrite();
        atvs atvsVar3 = (atvs) createBuilder.instance;
        atvsVar3.b |= 2;
        atvsVar3.e = 60;
        createBuilder.copyOnWrite();
        atvs atvsVar4 = (atvs) createBuilder.instance;
        atvsVar4.b |= 4;
        atvsVar4.f = true;
        this.a = (atvs) createBuilder.build();
    }

    @Override // defpackage.afqm
    public final int a() {
        return this.a.c;
    }

    @Override // defpackage.afqm
    public final int b() {
        return this.a.e;
    }

    @Override // defpackage.afqm
    public final List c() {
        return this.a.d;
    }

    @Override // defpackage.afqm
    public final boolean d() {
        return this.a.f;
    }

    public afqs(atvs atvsVar) {
        atvsVar.getClass();
        this.a = atvsVar;
    }
}
