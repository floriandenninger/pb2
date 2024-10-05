package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zop {
    public final awav a;
    public final asht b;

    private zop(awav awavVar, asht ashtVar) {
        this.a = awavVar;
        this.b = ashtVar;
    }

    public static zop a(acra acraVar, String str) {
        awav i = acraVar.i(str, acsb.c(27608));
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = asir.a.createBuilder();
        createBuilder2.copyOnWrite();
        asir asirVar = (asir) createBuilder2.instance;
        str.getClass();
        asirVar.b |= 1;
        asirVar.c = str;
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        asir asirVar2 = (asir) createBuilder2.build();
        asirVar2.getClass();
        ashtVar.g = asirVar2;
        ashtVar.b |= 8;
        return new zop(i, (asht) createBuilder.build());
    }
}
