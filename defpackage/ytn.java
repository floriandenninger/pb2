package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ytn implements axqr {
    private final azrw a;

    public ytn(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static ytn a(azrw azrwVar) {
        return new ytn(azrwVar);
    }

    public static apdq c(ynx ynxVar) {
        aone aoneVar;
        apdx a = yny.a(ynxVar.a());
        if ((a.b & 256) != 0) {
            apdr apdrVar = a.h;
            if (apdrVar == null) {
                apdrVar = apdr.a;
            }
            apdq apdqVar = apdrVar.b;
            if (apdqVar == null) {
                apdqVar = apdq.a;
            }
            aoneVar = apdqVar.toBuilder();
        } else {
            aoneVar = null;
        }
        if (aoneVar != null) {
            try {
                yun.c((apdq) aoneVar.build());
            } catch (Exception e) {
                zga.d("Invalid AndroidCrolleyConfig from server", e);
            }
            apdq apdqVar2 = (apdq) aoneVar.build();
            ayaw.k(apdqVar2);
            return apdqVar2;
        }
        aoneVar = apdq.a.createBuilder();
        aoneVar.copyOnWrite();
        apdq apdqVar3 = (apdq) aoneVar.instance;
        apdqVar3.b |= 1;
        apdqVar3.c = true;
        aoneVar.copyOnWrite();
        apdq apdqVar4 = (apdq) aoneVar.instance;
        apdqVar4.b |= 2;
        apdqVar4.d = true;
        aoneVar.copyOnWrite();
        apdq apdqVar5 = (apdq) aoneVar.instance;
        apdqVar5.b |= 4;
        apdqVar5.e = 0;
        aoneVar.copyOnWrite();
        apdq apdqVar6 = (apdq) aoneVar.instance;
        apdqVar6.b |= 8;
        apdqVar6.f = 1;
        aoneVar.copyOnWrite();
        apdq apdqVar7 = (apdq) aoneVar.instance;
        apdqVar7.b |= 16;
        apdqVar7.g = 4;
        aoneVar.copyOnWrite();
        apdq apdqVar8 = (apdq) aoneVar.instance;
        apdqVar8.b |= 32;
        apdqVar8.h = 4;
        aoneVar.copyOnWrite();
        apdq apdqVar9 = (apdq) aoneVar.instance;
        apdqVar9.b |= 64;
        apdqVar9.i = 4;
        aoneVar.copyOnWrite();
        apdq apdqVar10 = (apdq) aoneVar.instance;
        apdqVar10.b |= 256;
        apdqVar10.k = false;
        apdq apdqVar22 = (apdq) aoneVar.build();
        ayaw.k(apdqVar22);
        return apdqVar22;
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final apdq get() {
        return c((ynx) this.a.get());
    }
}
