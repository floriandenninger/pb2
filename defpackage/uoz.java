package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uoz extends upc {
    public static final uoz a = new uoz();

    private uoz() {
    }

    @Override // defpackage.upc
    public final /* bridge */ /* synthetic */ aooy a(String str, Object obj) {
        int intValue = ((Long) obj).intValue();
        if (intValue == 0) {
            return null;
        }
        aone createBuilder = baay.a.createBuilder();
        createBuilder.copyOnWrite();
        baay baayVar = (baay) createBuilder.instance;
        baayVar.b |= 1;
        baayVar.c = intValue;
        if (str != null) {
            baaz h = uou.h(str);
            createBuilder.copyOnWrite();
            baay baayVar2 = (baay) createBuilder.instance;
            h.getClass();
            baayVar2.d = h;
            baayVar2.b |= 2;
        }
        return (baay) createBuilder.build();
    }

    @Override // defpackage.upc
    public final /* synthetic */ aooy b(aooy aooyVar, aooy aooyVar2) {
        baay baayVar = (baay) aooyVar;
        baay baayVar2 = (baay) aooyVar2;
        if (baayVar == null || baayVar2 == null) {
            return baayVar;
        }
        if ((baayVar.b & 1) != 0) {
            aone createBuilder = baay.a.createBuilder();
            baaz baazVar = baayVar.d;
            if (baazVar == null) {
                baazVar = baaz.a;
            }
            createBuilder.copyOnWrite();
            baay baayVar3 = (baay) createBuilder.instance;
            baazVar.getClass();
            baayVar3.d = baazVar;
            baayVar3.b |= 2;
            int i = baayVar.c - baayVar2.c;
            if (i != 0) {
                createBuilder.copyOnWrite();
                baay baayVar4 = (baay) createBuilder.instance;
                baayVar4.b |= 1;
                baayVar4.c = i;
                return (baay) createBuilder.build();
            }
        }
        return null;
    }

    @Override // defpackage.upc
    public final /* bridge */ /* synthetic */ String c(aooy aooyVar) {
        baaz baazVar = ((baay) aooyVar).d;
        if (baazVar == null) {
            baazVar = baaz.a;
        }
        return baazVar.d;
    }
}
