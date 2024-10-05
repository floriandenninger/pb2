package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aihj implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final azrw h;
    private final azrw i;

    public aihj(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
        this.g = azrwVar7;
        this.h = azrwVar8;
        this.i = azrwVar9;
    }

    public static aihj b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9) {
        return new aihj(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aihi get() {
        return new aihi(((zgk) this.a).get(), (aihs) this.b.get(), (aijg) this.c.get(), ((aijd) this.d).get(), (aihc) this.e.get(), ((aiis) this.f).get(), (aaea) this.g.get(), (aifk) this.h.get(), (Executor) this.i.get());
    }
}
