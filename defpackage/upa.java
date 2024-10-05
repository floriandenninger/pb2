package defpackage;

import android.os.health.HealthStats;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class upa extends upc {
    public static final upa a = new upa();

    private upa() {
    }

    @Override // defpackage.upc
    public final /* synthetic */ aooy a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        aone createBuilder = baba.a.createBuilder();
        createBuilder.bF(upd.a.d(uou.g(healthStats, 40001)));
        createBuilder.bG(uoz.a.d((healthStats == null || !healthStats.hasMeasurements(40002)) ? Collections.emptyMap() : healthStats.getMeasurements(40002)));
        if (str != null) {
            baaz h = uou.h(str);
            createBuilder.copyOnWrite();
            baba babaVar = (baba) createBuilder.instance;
            h.getClass();
            babaVar.e = h;
            babaVar.b |= 1;
        }
        baba babaVar2 = (baba) createBuilder.build();
        if (uou.m(babaVar2)) {
            return null;
        }
        return babaVar2;
    }

    @Override // defpackage.upc
    public final /* synthetic */ aooy b(aooy aooyVar, aooy aooyVar2) {
        baba babaVar = (baba) aooyVar;
        baba babaVar2 = (baba) aooyVar2;
        if (babaVar == null || babaVar2 == null) {
            return babaVar;
        }
        aone createBuilder = baba.a.createBuilder();
        createBuilder.bF(upd.a.e(babaVar.c, babaVar2.c));
        createBuilder.bG(uoz.a.e(babaVar.d, babaVar2.d));
        baaz baazVar = babaVar.e;
        if (baazVar == null) {
            baazVar = baaz.a;
        }
        createBuilder.copyOnWrite();
        baba babaVar3 = (baba) createBuilder.instance;
        baazVar.getClass();
        babaVar3.e = baazVar;
        babaVar3.b |= 1;
        baba babaVar4 = (baba) createBuilder.build();
        if (uou.m(babaVar4)) {
            return null;
        }
        return babaVar4;
    }

    @Override // defpackage.upc
    public final /* bridge */ /* synthetic */ String c(aooy aooyVar) {
        baaz baazVar = ((baba) aooyVar).e;
        if (baazVar == null) {
            baazVar = baaz.a;
        }
        return baazVar.d;
    }
}
