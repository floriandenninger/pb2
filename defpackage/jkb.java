package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jkb extends jhg {
    @Override // defpackage.jhg
    protected final amsx a(agsn agsnVar) {
        String n = fhe.n(awiq.b, "downloads_library");
        n.getClass();
        amkq.O(!n.isEmpty(), "key cannot be empty");
        aone createBuilder = awiq.a.createBuilder();
        createBuilder.copyOnWrite();
        awiq awiqVar = (awiq) createBuilder.instance;
        awiqVar.c |= 1;
        awiqVar.d = n;
        awin awinVar = new awin(createBuilder);
        String i = fhe.i();
        aone aoneVar = awinVar.a;
        aoneVar.copyOnWrite();
        awiq awiqVar2 = (awiq) aoneVar.instance;
        i.getClass();
        awiqVar2.c |= 4;
        awiqVar2.e = i;
        return amsx.r(awinVar);
    }
}
