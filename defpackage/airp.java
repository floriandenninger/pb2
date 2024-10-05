package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class airp implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;

    public airp(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
    }

    public static airn b(shf shfVar, Executor executor, afhz afhzVar, airi airiVar, aaea aaeaVar, ScheduledExecutorService scheduledExecutorService) {
        return new airn(shfVar, executor, afhzVar, airiVar, aaeaVar, scheduledExecutorService);
    }

    public static airp c(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new airp(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final airn get() {
        return b((shf) this.a.get(), (Executor) this.b.get(), (afhz) this.c.get(), ((airj) this.d).get(), (aaea) this.e.get(), (ScheduledExecutorService) this.f.get());
    }
}
