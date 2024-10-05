package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class upd extends upc {
    public static final upd a = new upd();

    private upd() {
    }

    @Override // defpackage.upc
    public final /* synthetic */ aooy a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        aone createBuilder = babd.a.createBuilder();
        int e = (int) uou.e(healthStats, 50001);
        if (e != 0) {
            createBuilder.copyOnWrite();
            babd babdVar = (babd) createBuilder.instance;
            babdVar.b |= 1;
            babdVar.c = e;
        }
        int e2 = (int) uou.e(healthStats, 50002);
        if (e2 != 0) {
            createBuilder.copyOnWrite();
            babd babdVar2 = (babd) createBuilder.instance;
            babdVar2.b |= 2;
            babdVar2.d = e2;
        }
        if (str != null) {
            baaz h = uou.h(str);
            createBuilder.copyOnWrite();
            babd babdVar3 = (babd) createBuilder.instance;
            h.getClass();
            babdVar3.e = h;
            babdVar3.b |= 4;
        }
        babd babdVar4 = (babd) createBuilder.build();
        if (uou.o(babdVar4)) {
            return null;
        }
        return babdVar4;
    }

    @Override // defpackage.upc
    public final /* synthetic */ aooy b(aooy aooyVar, aooy aooyVar2) {
        int i;
        int i2;
        babd babdVar = (babd) aooyVar;
        babd babdVar2 = (babd) aooyVar2;
        if (babdVar == null || babdVar2 == null) {
            return babdVar;
        }
        aone createBuilder = babd.a.createBuilder();
        if ((babdVar.b & 1) != 0 && (i2 = babdVar.c - babdVar2.c) != 0) {
            createBuilder.copyOnWrite();
            babd babdVar3 = (babd) createBuilder.instance;
            babdVar3.b |= 1;
            babdVar3.c = i2;
        }
        if ((babdVar.b & 2) != 0 && (i = babdVar.d - babdVar2.d) != 0) {
            createBuilder.copyOnWrite();
            babd babdVar4 = (babd) createBuilder.instance;
            babdVar4.b |= 2;
            babdVar4.d = i;
        }
        baaz baazVar = babdVar.e;
        if (baazVar == null) {
            baazVar = baaz.a;
        }
        createBuilder.copyOnWrite();
        babd babdVar5 = (babd) createBuilder.instance;
        baazVar.getClass();
        babdVar5.e = baazVar;
        babdVar5.b |= 4;
        babd babdVar6 = (babd) createBuilder.build();
        if (uou.o(babdVar6)) {
            return null;
        }
        return babdVar6;
    }

    @Override // defpackage.upc
    public final /* bridge */ /* synthetic */ String c(aooy aooyVar) {
        baaz baazVar = ((babd) aooyVar).e;
        if (baazVar == null) {
            baazVar = baaz.a;
        }
        return baazVar.d;
    }
}
