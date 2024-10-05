package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uar {
    private final twn a;
    private final uaa b;
    private final uaj c;
    private final uak d;
    private final tzh e;

    public uar(twn twnVar, uaa uaaVar, uaj uajVar, uak uakVar, tzh tzhVar) {
        this.a = twnVar;
        this.b = uaaVar;
        this.c = uajVar;
        this.d = uakVar;
        this.e = tzhVar;
    }

    public final aojh a(String str, aokm aokmVar, aoko aokoVar) {
        aone createBuilder = aojn.a.createBuilder();
        try {
            aone createBuilder2 = aojm.a.createBuilder();
            long parseLong = Long.parseLong(this.a.b);
            createBuilder2.copyOnWrite();
            aojm aojmVar = (aojm) createBuilder2.instance;
            aojmVar.b |= 1;
            aojmVar.c = parseLong;
            String b = this.b.b();
            createBuilder2.copyOnWrite();
            aojm aojmVar2 = (aojm) createBuilder2.instance;
            b.getClass();
            aojmVar2.b |= 2;
            aojmVar2.d = b;
            aojm aojmVar3 = (aojm) createBuilder2.build();
            createBuilder.copyOnWrite();
            aojn aojnVar = (aojn) createBuilder.instance;
            aojmVar3.getClass();
            aojnVar.c = aojmVar3;
            aojnVar.b |= 1;
            aone createBuilder3 = aojh.a.createBuilder();
            String str2 = this.a.a;
            createBuilder3.copyOnWrite();
            aojh aojhVar = (aojh) createBuilder3.instance;
            str2.getClass();
            aojhVar.b |= 2;
            aojhVar.d = str2;
            aojt b2 = this.d.b();
            createBuilder3.copyOnWrite();
            aojh aojhVar2 = (aojh) createBuilder3.instance;
            b2.getClass();
            aojhVar2.e = b2;
            aojhVar2.b |= 4;
            aojr b3 = this.c.b();
            createBuilder3.copyOnWrite();
            aojh aojhVar3 = (aojh) createBuilder3.instance;
            b3.getClass();
            aojhVar3.f = b3;
            aojhVar3.b |= 8;
            createBuilder3.copyOnWrite();
            aojh aojhVar4 = (aojh) createBuilder3.instance;
            aojhVar4.c = aokmVar.l;
            aojhVar4.b |= 1;
            aojn aojnVar2 = (aojn) createBuilder.build();
            createBuilder3.copyOnWrite();
            aojh aojhVar5 = (aojh) createBuilder3.instance;
            aojnVar2.getClass();
            aojhVar5.g = aojnVar2;
            aojhVar5.b |= 16;
            createBuilder3.copyOnWrite();
            aojh aojhVar6 = (aojh) createBuilder3.instance;
            aokoVar.getClass();
            aojhVar6.h = aokoVar;
            aojhVar6.b |= 32;
            return (aojh) createBuilder3.build();
        } catch (uab e) {
            tzf c = this.e.c(24);
            ((tzj) c).l = str;
            c.i();
            throw e;
        }
    }
}
