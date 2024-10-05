package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zjn {
    final /* synthetic */ zjo a;
    public final aone b;
    private final long c;
    private boolean d = false;

    public zjn(zjo zjoVar, String str) {
        this.a = zjoVar;
        this.c = zjoVar.a.d();
        aone createBuilder = aqia.a.createBuilder();
        int a = zjo.a(str);
        createBuilder.copyOnWrite();
        aqia aqiaVar = (aqia) createBuilder.instance;
        aqiaVar.b |= 128;
        aqiaVar.f = a;
        int b = zjo.b(str);
        createBuilder.copyOnWrite();
        aqia aqiaVar2 = (aqia) createBuilder.instance;
        aqiaVar2.b |= 256;
        aqiaVar2.g = b;
        this.b = createBuilder;
    }

    public final void a() {
        amkq.N(!this.d);
        acpl acplVar = this.a.b;
        arpn a = arpp.a();
        aone aoneVar = this.b;
        long d = this.a.a.d();
        long j = this.c;
        aoneVar.copyOnWrite();
        aqia aqiaVar = (aqia) aoneVar.instance;
        aqia aqiaVar2 = aqia.a;
        aqiaVar.b |= 32;
        aqiaVar.d = (int) (d - j);
        aqia aqiaVar3 = (aqia) aoneVar.build();
        a.copyOnWrite();
        ((arpp) a.instance).cn(aqiaVar3);
        acplVar.c((arpp) a.build());
        this.d = true;
    }
}
