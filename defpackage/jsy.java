package defpackage;

import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jsy implements Consumer {
    public final /* synthetic */ aong a;
    private final /* synthetic */ int b;

    public /* synthetic */ jsy(aong aongVar, int i) {
        this.b = i;
        this.a = aongVar;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            aong aongVar = this.a;
            atzr atzrVar = (atzr) obj;
            aone createBuilder = aseo.a.createBuilder();
            createBuilder.copyOnWrite();
            aseo aseoVar = (aseo) createBuilder.instance;
            atzrVar.getClass();
            aseoVar.c = atzrVar;
            aseoVar.b = 78882851;
            aongVar.copyOnWrite();
            asfc asfcVar = (asfc) aongVar.instance;
            aseo aseoVar2 = (aseo) createBuilder.build();
            asfc asfcVar2 = asfc.a;
            aseoVar2.getClass();
            asfcVar.f = aseoVar2;
            asfcVar.b |= 32;
            return;
        }
        aong aongVar2 = this.a;
        aqyg aqygVar = (aqyg) obj;
        aone createBuilder2 = aubr.a.createBuilder();
        aone createBuilder3 = atdn.a.createBuilder();
        aone createBuilder4 = atdo.a.createBuilder();
        createBuilder4.copyOnWrite();
        atdo atdoVar = (atdo) createBuilder4.instance;
        atdoVar.c = 2;
        atdoVar.b |= 1;
        createBuilder3.copyOnWrite();
        atdn atdnVar = (atdn) createBuilder3.instance;
        atdo atdoVar2 = (atdo) createBuilder4.build();
        atdoVar2.getClass();
        atdnVar.g = atdoVar2;
        atdnVar.b |= 16;
        aone createBuilder5 = atdq.a.createBuilder();
        aone createBuilder6 = atdp.a.createBuilder();
        createBuilder6.copyOnWrite();
        atdp atdpVar = (atdp) createBuilder6.instance;
        aqygVar.getClass();
        atdpVar.c = aqygVar;
        atdpVar.b |= 1;
        createBuilder5.copyOnWrite();
        atdq atdqVar = (atdq) createBuilder5.instance;
        atdp atdpVar2 = (atdp) createBuilder6.build();
        atdpVar2.getClass();
        atdqVar.c = atdpVar2;
        atdqVar.b |= 1;
        createBuilder3.copyOnWrite();
        atdn atdnVar2 = (atdn) createBuilder3.instance;
        atdq atdqVar2 = (atdq) createBuilder5.build();
        atdqVar2.getClass();
        atdnVar2.f = atdqVar2;
        atdnVar2.b |= 2;
        atdn atdnVar3 = (atdn) createBuilder3.build();
        createBuilder2.copyOnWrite();
        aubr aubrVar = (aubr) createBuilder2.instance;
        atdnVar3.getClass();
        aubrVar.g = atdnVar3;
        aubrVar.b |= 512;
        aongVar2.cz(createBuilder2);
    }
}
