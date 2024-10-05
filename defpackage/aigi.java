package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aigi extends aifx {
    @Override // defpackage.aifx
    public final /* bridge */ /* synthetic */ owi a(Object obj) {
        auev auevVar = (auev) obj;
        aone createBuilder = owi.a.createBuilder();
        String str = auevVar.e;
        createBuilder.copyOnWrite();
        owi owiVar = (owi) createBuilder.instance;
        str.getClass();
        owiVar.b |= 1;
        owiVar.c = str;
        String str2 = auevVar.f;
        createBuilder.copyOnWrite();
        owi owiVar2 = (owi) createBuilder.instance;
        str2.getClass();
        owiVar2.b |= 2;
        owiVar2.e = str2;
        int i = auevVar.g;
        createBuilder.copyOnWrite();
        owi owiVar3 = (owi) createBuilder.instance;
        owiVar3.b |= 4;
        owiVar3.f = i;
        String str3 = auevVar.h;
        createBuilder.copyOnWrite();
        owi owiVar4 = (owi) createBuilder.instance;
        str3.getClass();
        owiVar4.b |= 512;
        owiVar4.m = str3;
        createBuilder.copyOnWrite();
        owi owiVar5 = (owi) createBuilder.instance;
        owiVar5.b |= 32;
        owiVar5.i = false;
        long millis = TimeUnit.SECONDS.toMillis(auevVar.l);
        createBuilder.copyOnWrite();
        owi owiVar6 = (owi) createBuilder.instance;
        owiVar6.b |= 256;
        owiVar6.l = millis;
        createBuilder.copyOnWrite();
        owi owiVar7 = (owi) createBuilder.instance;
        owiVar7.b |= 2048;
        owiVar7.o = true;
        if ((auevVar.c & 32) != 0) {
            atsn atsnVar = auevVar.i;
            if (atsnVar == null) {
                atsnVar = atsn.a;
            }
            if ((atsnVar.b & 2) != 0) {
                atsn atsnVar2 = auevVar.i;
                if (atsnVar2 == null) {
                    atsnVar2 = atsn.a;
                }
                atsl atslVar = atsnVar2.d;
                if (atslVar == null) {
                    atslVar = atsl.a;
                }
                createBuilder.copyOnWrite();
                owi owiVar8 = (owi) createBuilder.instance;
                atslVar.getClass();
                owiVar8.s = atslVar;
                owiVar8.b |= 262144;
            }
            atsn atsnVar3 = auevVar.i;
            if (atsnVar3 == null) {
                atsnVar3 = atsn.a;
            }
            if ((atsnVar3.b & 1) != 0) {
                atsn atsnVar4 = auevVar.i;
                if (atsnVar4 == null) {
                    atsnVar4 = atsn.a;
                }
                atsk atskVar = atsnVar4.c;
                if (atskVar == null) {
                    atskVar = atsk.a;
                }
                createBuilder.copyOnWrite();
                owi owiVar9 = (owi) createBuilder.instance;
                atskVar.getClass();
                owiVar9.r = atskVar;
                owiVar9.b |= 65536;
            }
        }
        if ((auevVar.c & 64) != 0) {
            awdk awdkVar = auevVar.j;
            if (awdkVar == null) {
                awdkVar = awdk.a;
            }
            createBuilder.copyOnWrite();
            owi owiVar10 = (owi) createBuilder.instance;
            awdkVar.getClass();
            owiVar10.A = awdkVar;
            owiVar10.b |= 268435456;
        }
        return (owi) createBuilder.build();
    }

    @Override // defpackage.aiga
    public final aomu b() {
        return auev.b;
    }

    @Override // defpackage.aifx
    public final /* synthetic */ String c(Object obj) {
        return ((auev) obj).f;
    }

    @Override // defpackage.aifx
    public final /* synthetic */ String d(Object obj) {
        return ((auev) obj).e;
    }

    @Override // defpackage.aifx
    public final /* synthetic */ boolean e(Object obj, Object obj2) {
        return amkq.b((auev) obj, (auev) obj2);
    }
}
