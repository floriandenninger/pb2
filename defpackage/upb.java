package defpackage;

import android.os.health.HealthStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class upb extends upc {
    public static final upb a = new upb();

    private upb() {
    }

    @Override // defpackage.upc
    public final /* synthetic */ aooy a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        aone createBuilder = babc.a.createBuilder();
        long e = uou.e(healthStats, 30001);
        if (e != 0) {
            createBuilder.copyOnWrite();
            babc babcVar = (babc) createBuilder.instance;
            babcVar.b |= 1;
            babcVar.c = e;
        }
        long e2 = uou.e(healthStats, 30002);
        if (e2 != 0) {
            createBuilder.copyOnWrite();
            babc babcVar2 = (babc) createBuilder.instance;
            babcVar2.b |= 2;
            babcVar2.d = e2;
        }
        long e3 = uou.e(healthStats, 30003);
        if (e3 != 0) {
            createBuilder.copyOnWrite();
            babc babcVar3 = (babc) createBuilder.instance;
            babcVar3.b |= 4;
            babcVar3.e = e3;
        }
        long e4 = uou.e(healthStats, 30004);
        if (e4 != 0) {
            createBuilder.copyOnWrite();
            babc babcVar4 = (babc) createBuilder.instance;
            babcVar4.b |= 8;
            babcVar4.f = e4;
        }
        long e5 = uou.e(healthStats, 30005);
        if (e5 != 0) {
            createBuilder.copyOnWrite();
            babc babcVar5 = (babc) createBuilder.instance;
            babcVar5.b |= 16;
            babcVar5.g = e5;
        }
        long e6 = uou.e(healthStats, 30006);
        if (e6 != 0) {
            createBuilder.copyOnWrite();
            babc babcVar6 = (babc) createBuilder.instance;
            babcVar6.b |= 32;
            babcVar6.h = e6;
        }
        if (str != null) {
            baaz h = uou.h(str);
            createBuilder.copyOnWrite();
            babc babcVar7 = (babc) createBuilder.instance;
            h.getClass();
            babcVar7.i = h;
            babcVar7.b |= 64;
        }
        babc babcVar8 = (babc) createBuilder.build();
        if (uou.n(babcVar8)) {
            return null;
        }
        return babcVar8;
    }

    @Override // defpackage.upc
    public final /* synthetic */ aooy b(aooy aooyVar, aooy aooyVar2) {
        babc babcVar = (babc) aooyVar;
        babc babcVar2 = (babc) aooyVar2;
        if (babcVar == null || babcVar2 == null) {
            return babcVar;
        }
        aone createBuilder = babc.a.createBuilder();
        if ((babcVar.b & 1) != 0) {
            long j = babcVar.c - babcVar2.c;
            if (j != 0) {
                createBuilder.copyOnWrite();
                babc babcVar3 = (babc) createBuilder.instance;
                babcVar3.b |= 1;
                babcVar3.c = j;
            }
        }
        if ((babcVar.b & 2) != 0) {
            long j2 = babcVar.d - babcVar2.d;
            if (j2 != 0) {
                createBuilder.copyOnWrite();
                babc babcVar4 = (babc) createBuilder.instance;
                babcVar4.b |= 2;
                babcVar4.d = j2;
            }
        }
        if ((babcVar.b & 4) != 0) {
            long j3 = babcVar.e - babcVar2.e;
            if (j3 != 0) {
                createBuilder.copyOnWrite();
                babc babcVar5 = (babc) createBuilder.instance;
                babcVar5.b |= 4;
                babcVar5.e = j3;
            }
        }
        if ((babcVar.b & 8) != 0) {
            long j4 = babcVar.f - babcVar2.f;
            if (j4 != 0) {
                createBuilder.copyOnWrite();
                babc babcVar6 = (babc) createBuilder.instance;
                babcVar6.b |= 8;
                babcVar6.f = j4;
            }
        }
        if ((babcVar.b & 16) != 0) {
            long j5 = babcVar.g - babcVar2.g;
            if (j5 != 0) {
                createBuilder.copyOnWrite();
                babc babcVar7 = (babc) createBuilder.instance;
                babcVar7.b |= 16;
                babcVar7.g = j5;
            }
        }
        if ((babcVar.b & 32) != 0) {
            long j6 = babcVar.h - babcVar2.h;
            if (j6 != 0) {
                createBuilder.copyOnWrite();
                babc babcVar8 = (babc) createBuilder.instance;
                babcVar8.b |= 32;
                babcVar8.h = j6;
            }
        }
        baaz baazVar = babcVar.i;
        if (baazVar == null) {
            baazVar = baaz.a;
        }
        createBuilder.copyOnWrite();
        babc babcVar9 = (babc) createBuilder.instance;
        baazVar.getClass();
        babcVar9.i = baazVar;
        babcVar9.b |= 64;
        babc babcVar10 = (babc) createBuilder.build();
        if (uou.n(babcVar10)) {
            return null;
        }
        return babcVar10;
    }

    @Override // defpackage.upc
    public final /* bridge */ /* synthetic */ String c(aooy aooyVar) {
        baaz baazVar = ((babc) aooyVar).i;
        if (baazVar == null) {
            baazVar = baaz.a;
        }
        return baazVar.d;
    }
}
